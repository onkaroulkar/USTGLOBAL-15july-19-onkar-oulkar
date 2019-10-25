document.getElementById('unam1').style.visibility="hidden";
document.getElementById('pass1').style.visibility="hidden";
 function validateform(){
 let formData = document.forms[0];
 let subb=document.forms[0];
 //console.log(formData);
 //console.log(formData.uname.value);
var userName = formData.uname.value;

if(userName.length>4){
    console.log('Success');
    formData.uname.style.border='none';
   document.getElementById('unam1').style.visibility="hidden";
}
else
{
    formData.uname.style.border='2px solid red';
    subb.sub.disabled=true;   
    document.getElementById('unam1').style.visibility="visible";
}
}

function validatepass(){
    let formData = document.forms[0];
let pasw= document.forms[0];
let subb=document.forms[0];
var userName = formData.uname.value;
if(pasw.password.value === 0){
    pasw.password.style.border='2px solid red';
    document.getElementById('pass1').style.visibility="hidden"

}
else if(pasw.password.value.length >= 8){
    console.log('Sucess');
    pasw.password.style.border='2px solid white';
    document.getElementById('pass1').style.visibility="hidden"
}
else{
    pasw.password.style.border='2px solid red';
    subb.sub.disabled=true;
    document.getElementById('pass1').style.visibility="Visible";
    
}

if(userName.length>4 && pasw.password.value.length >= 8)
{
     
     subb.sub.disabled=false;
    // document.getElementById('sub').disabled = 'false';
}

}