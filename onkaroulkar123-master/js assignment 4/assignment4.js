let tableelement = document.createElement('table');
let tr1 = document.createElement('tr');
let tr1d1 = document.createElement('th');
tr1d1.textContent='Name';

let tr1d2 = document.createElement('th');
tr1d2.textContent='roll no';

let tr1d3 = document.createElement('th');
tr1d3.textContent='branch';

let tr2 = document.createElement('tr');
let tr2d1 = document.createElement('td');
tr2d1.textContent='Vikas';

let tr2d2 = document.createElement('td');
tr2d2.textContent='1022';

let tr2d3 = document.createElement('td');
tr2d3.textContent='IT';


let tr3 = document.createElement('tr');
let tr3d1 = document.createElement('td');
tr3d1.textContent='Onkar';

let tr3d2 = document.createElement('td');
tr3d2.textContent='1033';

let tr3d3 = document.createElement('td');
tr3d3.textContent='entc';


let tr4 = document.createElement('tr');
let tr4d1 = document.createElement('td');
tr4d1.textContent='Nikhil';

let tr4d2 = document.createElement('td');
tr4d2.textContent='1044';

let tr4d3 = document.createElement('td');
tr4d3.textContent='entc';


let tr5 = document.createElement('tr');
let tr5d1 = document.createElement('td');
tr5d1.textContent='Sunil';

let tr5d2 = document.createElement('td');
tr5d2.textContent='1055';

let tr5d3 = document.createElement('td');
tr5d3.textContent='civil';

let tr6 = document.createElement('tr');
let tr6d1 = document.createElement('td');
tr6d1.textContent='Vipin';

let tr6d2 = document.createElement('td');
tr6d2.textContent='1066';

let tr6d3 = document.createElement('td');
tr6d3.textContent='IT';





tr1.appendChild(tr1d1);
tr1.appendChild(tr1d2);
tr1.appendChild(tr1d3);

tr2.appendChild(tr2d1);
tr2.appendChild(tr2d2);
tr2.appendChild(tr2d3);


tr3.appendChild(tr3d1);
tr3.appendChild(tr3d2);
tr3.appendChild(tr3d3);


tr4.appendChild(tr4d1);
tr4.appendChild(tr4d2);
tr4.appendChild(tr4d3);


tr5.appendChild(tr5d1);
tr5.appendChild(tr5d2);
tr5.appendChild(tr5d3);


tr6.appendChild(tr6d1);
tr6.appendChild(tr6d2);
tr6.appendChild(tr6d3);


tableelement.appendChild(tr1);
tableelement.appendChild(tr2);
tableelement.appendChild(tr3);
tableelement.appendChild(tr4);
tableelement.appendChild(tr5);
tableelement.appendChild(tr6);

console.log(tableelement);
document.body.appendChild(tableelement);

console.log("===================ol==========================")


let orderedlist = document.createElement('ol');
let li1 = document.createElement('li');
li1.textContent = 'cricket';

let li2 = document.createElement('li');
li2.textContent = 'football';

let li3 = document.createElement('li');
li3.textContent = 'hockey';

let li4= document.createElement('li');
li4.textContent = 'chess';

let li5 = document.createElement('li');
li5.textContent = 'Tennis';

orderedlist.appendChild(li1);
orderedlist.appendChild(li2);
orderedlist.appendChild(li3);
orderedlist.appendChild(li4);
orderedlist.appendChild(li5);

console.log(orderedlist);
document.body.appendChild(orderedlist);

console.log("===================ul==========================")


let unorderedlist = document.createElement('ul');
let l1 = document.createElement('li');
l1.textContent = 'cricket';

let l2 = document.createElement('li');
l2.textContent = 'football';

let l3 = document.createElement('li');
l3.textContent = 'hockey';

let l4= document.createElement('li');
l4.textContent = 'chess';

let l5 = document.createElement('li');
l5.textContent = 'Tennis';

unorderedlist.appendChild(l1);
unorderedlist.appendChild(l2);
unorderedlist.appendChild(l3);
unorderedlist.appendChild(l4);
unorderedlist.appendChild(l5);

console.log(unorderedlist);
document.body.appendChild(unorderedlist);

console.log("===================form==========================")

let formelement = document.createElement('form');
let divisionelement = document.createElement('div');
let lb = document.createElement('label');
lb.textContent = 'Name: ';
let inp = document.createElement('input');
inp.textContent = '  ';
let br = document.createElement('br');

let lb1 = document.createElement('label');
lb1.textContent = 'Age: ';
let inp1 = document.createElement('input');
inp1.textContent = '  ';
let br1 = document.createElement('br');


let lb2 = document.createElement('label');
lb2.textContent = 'DOB: ';
let inp2 = document.createElement('input');
inp2.textContent = '  ';


divisionelement.appendChild(lb);
divisionelement.appendChild(inp);
divisionelement.appendChild(br);

divisionelement.appendChild(lb1);
divisionelement.appendChild(inp1);
divisionelement.appendChild(br1);


divisionelement.appendChild(lb2);
divisionelement.appendChild(inp2);


formelement.appendChild(divisionelement);

console.log(formelement);
document.body.appendChild(formelement);