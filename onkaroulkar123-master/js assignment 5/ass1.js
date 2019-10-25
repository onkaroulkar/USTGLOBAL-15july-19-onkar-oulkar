function getdata(){
  let data = document.forms[0];
  let  username = data.name.value;
  console.log(username);
  let passwd = data.pass.value;
  console.log(passwd);
  table1(username,passwd);
}

funtion table1(a,b){
 let tableElement= document.createElement('table');
 let tr1= document.createElement('tr');
 let trd1= document.createElement('td');
 trd1.textContent="user name";
 

}