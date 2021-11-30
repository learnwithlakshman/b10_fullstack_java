$(function(){
    
    let players = [];
    let roles   = new Set();
    let teamNames = new Set();
    
    fetch('/js/ipldata.json').then(json=>json.json()).then(res=>{
          
          initData(res);
    })
    
    function initData(res){
        players = res;
        players.map(p=>p.role).forEach(e=>{
            roles.add(e);
        })
        roles.add("all")
        players.map(p=>p.team).forEach(e=>{
            teamNames.add(e);
        })
       
        teamNames.add("all")
        
        let str = `<select type="text" class="form-control" id="teamName">`
        str +=`<option value=''>Select Team name</option>`;
        teamNames.forEach(t=>{
            str += `<option value=${t}>${t}</option>`;
        })
        str += `</select>`;
        $("#teamSelectId").html(str);
        
        let roleStr = `<select type="text" class="form-control" id="roleName">`
        roleStr +=`<option value=''>Select Role name</option>`;
        roles.forEach(t=>{
            roleStr += `<option value=${t}>${t}</option>`;
        })
        roleStr += `</select>`;
        $("#roleSelectId").html(roleStr);
        
    }
    
    $('body').on('change', '#teamName', function() {
          viewPlayers();
    });
 
  
    
   $('body').on('change', '#roleName',()=>{
         viewPlayers(); 
    })
    
    function viewPlayers(){
        
           let teamName = $("#teamName").val();
           let roleName = $("#roleName").val();
           let plist = [];
        
           console.log("Role ",roleName,"Team ",teamName);
           if(teamName !== "" && roleName !== ""){
              if(teamName === "all" && roleName=== "all"){
                   plist = players;
              }
              if(teamName !== "all" && roleName === "all"){
                  plist = players.filter(p=>p.team == teamName);
              }
               
              if(teamName !== "all" && roleName !== "all"){
                  plist = players.filter(p=>p.team === teamName && p.role.includes(roleName));
              }
             if(teamName === "all" && roleName !== "all"){
                 
                 plist = players.filter(p=>p.role.includes(roleName));
             }
             showPlayerDetails(plist);
           }
    }
    
    function  showPlayerDetails(plist){
        
        let str =`<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Name</th>
      <th scope="col">Role</th>
      <th scope="col">Team</th>
      <th scope="col">Price</th>
    </tr>
  </thead>
`
        str +=`<tbody>`
    
    for(let i=0;i<plist.length;i++){        
    str +=`<tr>
      <th scope="row">${i+1}</th>
      <td>${plist[i].name}</td>
      <td>${plist[i].role}</td>
      <td>${plist[i].team}</td>
        <td>${plist[i].price}</td>
    </tr>
    `
    }
    str +=`
  </tbody>
  </table>`
  $("#playerDataId").html(str);
  }
    
    
    
    // Load the Visualization API and the corechart package.
google.charts.load('current', {'packages':['corechart']});

// Set a callback to run when the Google Visualization API is loaded.

 google.charts.setOnLoadCallback(drawPieChart);

 google.charts.setOnLoadCallback(drawColumnChart);

 function drawColumnChart() {
          
          fetch('/js/ipldata.json').then(json=>json.json()).then(res=>{
            let map = new Map();
          
             var data = new google.visualization.DataTable();
        data.addColumn('string', 'Team');
        data.addColumn('number', 'Amount');
       

              res.forEach(p=>{
                  if(map.get(p.team)){
                     map.set(p.team,map.get(p.team) + p.price);
                   
                  }else{
                      map.set(p.team,p.price)
                      
                  }
              })
              let arr = [];
              map.forEach((v,k)=>{
                  arr.push([k,v]);
              });
              console.log(arr);
              data.addRows(arr);
               var options = {'title':'Team Amount Spend In (INR)',
                       'width':500,
                       'height':330};

        // Instantiate and draw our chart, passing in some options.
        var chart = new google.visualization.ColumnChart(document.getElementById('chartData_1'));
        chart.draw(data, options);
          
       
          })
        // Create the data table.
       
        // Set chart options
       
      }
    
function drawPieChart() {
          
          fetch('/js/ipldata.json').then(json=>json.json()).then(res=>{
        
            let map = new Map();
             var data = new google.visualization.DataTable();
        data.addColumn('string', 'Team');
        data.addColumn('number', 'Count');
       

              res.forEach(p=>{
                  if(map.get(p.team)){
                   
                      map.set(p.team,map.get(p.team)+1);
                  }else{
                      map.set(p.team,1)
                      
                  }
              })
              let arr = [];
              map.forEach((v,k)=>{
                  arr.push([k,v]);
              });
              console.log(arr);
              data.addRows(arr);
               var options = {'title':'Player count by team',
                       'width':500,
                       'height':330};

        // Instantiate and draw our chart, passing in some options.
        var chart = new google.visualization.PieChart(document.getElementById('chartData_2'));
        chart.draw(data, options);
        google.visualization.events.addListener(chart, 'select', ()=>{
          var selectedItem = chart.getSelection()[0];
          if (selectedItem) {
            let team = data.getValue(selectedItem.row, 0);
            console.log("Selected team :",team)
              $("#teamName").val(team).attr("selected","selected");
              $("#roleName").val("all").attr("selected","selected");
              viewPlayers();
          }
        });
       
       
          })
        // Create the data table.
       
        // Set chart options
    
       
       
      }

     
})