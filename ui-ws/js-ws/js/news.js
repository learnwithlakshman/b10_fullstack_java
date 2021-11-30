const countryCodes = [
    {"code":"in","name":"India"},
    {"code":"ca","name":"Canada"},
    {"code":"us","name":"USA"},
    {"code":"sg","name":"Singapore"}
];

const categories = ['business','health','sports','technology'];

const apiKey = '5c636a468a90465aa7cab199265d7299'
const url = `https://newsapi.org/v2/top-headlines?apiKey=${apiKey}`;

const countryId = document.querySelector("#countryId");
const categoryId = document.querySelector("#categoryId");

let str = "<select class='form-control' id='countryCode' onchange='getNews()'>"
countryCodes.forEach(ele=>{
    str += `<option value=${ele.code}>${ele.name}</Option>`;
})
str += "</select>"
countryId.innerHTML = str;

let cstr = "<select class='form-control' id='category' onchange='getNews()'>"
categories.forEach(ele=>{
    cstr += `<option value=${ele}>${ele.toUpperCase()}</Option>`;
})
cstr += "</select>"
categoryId.innerHTML = cstr;
getNews();

function getNews(){
     let code = document.querySelector("#countryCode").value;
     let category = document.querySelector("#category").value;
     const api = `${url}&country=${code}&category=${category}`;
     fetch(api).then(json=>json.json()).then(res=>{
            viewNewsItems(res)
     })   
}

function viewNewsItems(items){
   let articles = items.articles;
   let newsItems = [];
   for(let i=0;i<articles.length;i++){
       let data = articles[i];
       let item = {"title":data.title,"urlToImage":data.urlToImage,"content":data.content};
       newsItems.push(item);
   }

   let str = '';

   newsItems.forEach(i=>{
       str += `<div class="card mt-2">
       <img src="${i.urlToImage}" class="card-img-top" alt="...">
       <div class="card-body">
         <h5 class="card-title">${i.title}</h5>
         <p class="card-text">${i.content}</p>
         <a href="#" class="btn btn-primary">Go somewhere</a>
       </div>
     </div>`
   })
   document.querySelector("#newsId").innerHTML = str;

}