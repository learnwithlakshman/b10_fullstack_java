function showDate(){
    document.getElementById('idDate').innerHTML=`<h3> Today date and time :${new Date()}</h3>`;
}

function showTable() {
    let strNum = document.querySelector("#num").value;
    if (strNum.trim().length > 0) {
        let num = Number.parseInt(strNum);
        let str = "";
        for (let i = 1; i <= 10; i++) {
            str += `${num} * ${i} = ${ num * i}<br/>`
        }
        document.querySelector("#idShowTable").innerHTML = str;
    }else{
        document.querySelector("#idShowTable").innerHTML = "";
    }
}

