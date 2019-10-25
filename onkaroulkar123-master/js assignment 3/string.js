var a=['hello','hii','what','why'];
/* length */
console.log('***************Length***************');
console.log(a.length);

console.log('***************toLower**************');
var b = 'vikas';
var c=b.toLowerCase();
console.log(c);

console.log('***************toUpper**************');
/* var b = 'vikas'; */
var d=b.toUpperCase();
console.log(d);

/* CharAt */
console.log('****************charAt**************');
console.log(d.charAt(2));

/* indexOf(searchElement,FromIndex) */
console.log('***************indexOf***************');
var e = d.indexOf('K', 1);
console.log(e);

/* Concat(String) */
console.log('***************Concat******************');
var f = c.concat('prasad');
console.log(f);

/* Includes(search string,start position) */
console.log('**************Includes*****************');
var g=f.includes('p',1);
console.log(g);

/* Replace(search value,replace value) */
console.log('**************Replace******************');
console.log(f.replace('p','q'));

/* split(seperator,limit) */
console.log('***************split********************');
console.log(f.split('k',3));

/* Substring(start,length) */
console.log('************substring*********************');
var h = f.substr("s",2);
console.log(h);

/* search(Value) */
console.log("***************Search**********************");
var i=f.search("i");
console.log(i);

/* trim() */
console.log("****************trim***********************");
var j='             vikas';
console.log(j.trim());