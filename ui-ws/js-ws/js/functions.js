
function biggest(num1, num2, num3){
    if(num1 > num2 && num1 > num3)
        return num1;
    else if(num2>num3)
        return num2;
    else
        return num3;
}

add = (num1,num2)=>num1 + num2;


function perform(num1,num2,fun){
    return fun(num1,num2);
}

res = perform(4,10,(num1,num2)=>num1 + num2);
console.log("Result :",res);

function factorial(num){

        if(num == 0 || num == 1)
             return 1;
        
         return num * factorial(--num);
}

console.log("Factorial of : 5",factorial(5));



