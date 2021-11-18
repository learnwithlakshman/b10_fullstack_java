const regionId = document.querySelector("#regionId");
const countryId = document.querySelector("#countryId");



fetch('https://restcountries.com/v2/all')
.then(r=>r.json()).then(data=>{
    regionNames = new Set();
    data.forEach(element => {
        regionNames.add(element.region);
        showRegionNames(regionNames);
    });
})

function showRegionNames(regionNames){
    let  str = `<select id='regionName' class='form-control' name='region' onchange="showContryInfo()">
    <option value="">Select Region</option>`;
    regionNames.forEach(ele=>{
        str += `<option value=${ele}>${ele}</option>`
    })
    str +=`<option value="all">All</option>`
    str +=`</select>`;
    regionId.innerHTML = str;
}

function showContryInfo(){

        let region = document.querySelector("#regionName").value;
      
        if(region !== ""){
            
                if(region === "all"){
                    fetch('https://restcountries.com/v3.1/all')
                    .then(r=>r.json()).then(data=>{
                        showCountryDataInfo(data,region);
                    })
                }else{
                    fetch(`https://restcountries.com/v3.1/region/${region}`)
                    .then(r=>r.json()).then(data=>{
                        showCountryDataInfo(data,region);
                    })
                }
        }
}

function showCountryDataInfo(countryData,region){
      
        console.log(countryData);
        let countryList = [];
        countryData.forEach(ele=>{
            let country = {"name":ele.name.common,"official":ele.name.official,"population":ele.population,"flag":ele.flags.svg};
            countryList.push(country);
        })

        let country = getMaxPopulatedCountryName(countryList);
        cname = country.name;
        ccount = countryList.length;
        cpcount = country.population;
        let str =`<div class='mt-1 mb-1 py-1 text-white bg-success text-center'>Total Counries in region ${region} is <strong>${ccount}</strong> and Most populated country <strong>${cname}</strong> and population is <strong>${cpcount}</strong></div>`
        str += `<table class='table table-striped '>`;
    
        str += `<thead><tr><th>Name</th><th>Official</th><th>Population</th><th>Flag</th></tr></thead>`;
        str += `<tbody>`;
        countryList.forEach(c=>{
            str += `<tr><td>${c.name}</td><td>${c.official}</td><td>${c.population}</td>
            <td><img src=${c.flag} width=50px; height=30px;></td></tr>`;
            
        })
    
        str +=`</tbody></table>`;
        countryId.innerHTML = str;

}

function getMaxPopulatedCountryName(countryList){

            let max = countryList[0].population;
            let index = 0;

            for(let i=1;i<countryList.length;i++){
                    if(max < countryList[i].population){
                        max = countryList[i].population;
                        index = i;
                    }
            }
            return countryList[index];
}