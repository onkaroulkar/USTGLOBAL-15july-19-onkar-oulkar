

console.log('***********is Array*************');
var a = [10,20,30,40];
console.log(Array.isArray(a));


console.log('************for Each************')
var b = [20,30,40,50];
b.forEach(function(value,index){
    console.log(value);
})

console.log('**********includes()**********');
var c=b.includes(40,1);
console.log(c);


console.log('************pushitems************');
b.push(60);
console.log(b);


console.log('************PoPitems**************');
b.pop();
console.log(b);


console.log('*************Unshift Items*********');
b.unshift(5);
console.log(b);


console.log('***********shiftitems**************');
b.shift();
console.log(b);


console.log('****************splice**************');
var d=[20,30,40,50,60];
d.splice(2,0,41,42,43);
console.log(d);


console.log('*****************Slice***************');
var e=d.slice(2,5);
console.log(e);

console.log('**************Join*******************');
var f=d.join("-");
console.log(f);


console.log('***************indexOf***************');
var g = d.indexOf(42,2);
console.log(g);

console.log('****************Map********************');

var h = d.map(function(value,index){
     return value+10;
});
console.log(h);

var i = h.filter(function(value,index){
  return value > 40;
});
console.log(i);