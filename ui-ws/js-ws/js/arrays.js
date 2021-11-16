
const numId = document.querySelector("#num1");

numId.addEventListener('keyup',(event)=>{
       event.preventDefault();
       if(event.keyCode == 13){
             n = event.target.value;
             let arr = generatePrime(n);
             document.querySelector("#result").value = arr;
       }

})

function generatePrime(N){
    let arr = [];
    let i = 2;
    while(true){
        
        if(isPrime(i)){
            arr.push(i);
        }
        i++;
        if(arr.length == N)
            break;
    }
    return arr;
}
function isPrime(num){
    if(num < 0)
    return false;
    if(num % 2 == 0 && num != 2){
        for(let i=2;i<=num/2;i++){
            if(num % i == 0){
                return false;
            }
        }
    }
    return true;
}
// TODO CRUD

let todos = []

const todo = document.querySelector("#todo");
const todoResId = document.querySelector("#todoResId");
showTodos();
todo.addEventListener('keyup',(event)=>{
    if(event.keyCode == 13){
          t = event.target.value;
          if(t.trim().length > 0){
                todos.push(t);
                showTodos();
                todo.value="";
          }
    }

})

function showTodos(){
        let str = "";
        if(todos.length == 0){
            str = "<p>No TODOs are added yet, please add your todos....";
        }else{
            str = "<table style='width:100%'>";
            todos.forEach(ele=>{
                str += `<tr><td style="width: 80%;">${ele}</td><td style="width: 10%;"><i class="fa fa-edit"></i></td><td style="width: 10%;"><i class="fa fa-trash" onclick="deleteTodo('${ele}')"></i></td></tr>`;
            })
            str += "</table>";
        }
        todoResId.innerHTML = str;
}

function deleteTodo(ele){
    index = todos.indexOf(ele);
    if(index != -1){
        todos.splice(index,1);
        showTodos();
    }
}