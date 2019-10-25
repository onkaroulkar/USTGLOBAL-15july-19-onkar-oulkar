console.log("*******fibonaccii*************");
function fibonacci(n){
 var first=0;
 var second=1;
 var next=0;
for(var c=0;c<n;c++)
{
   next=first+second;
  first=second;
  second=next;
  console.log(next);
}
}

fibonacci(15);