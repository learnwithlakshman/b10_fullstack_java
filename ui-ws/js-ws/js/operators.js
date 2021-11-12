const sumId = document.querySelector("#sum");
const subId = document.querySelector("#sub");
const mulId = document.querySelector("#mul");


sumId.addEventListener('click',function(event){
    event.preventDefault();
    showResult("+")
});
mulId.addEventListener('click',function(event){
  
});
subId.addEventListener('click',function(event){
  
});

function showResult(ope){
    let num1 = Number.parseInt(document.querySelector("#num1").value);
    let num2 = Number.parseInt(document.querySelector("#num2").value);
    //Logic

    let resId = document.querySelector("#result");
    resId.value = res;
}
// EMI Calculator 

const calculateEMIId = document.querySelector("#calculateEMI");

calculateEMIId.addEventListener('click',function(event){
        event.preventDefault();
        //Logic
        
        
})

function convertTo(){
      //Logic
}