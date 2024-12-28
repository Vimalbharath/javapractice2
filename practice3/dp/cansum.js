const cansum=(arr,sum)=>{
    
if(sum<0) return false;
if(sum===0) return true;

for(num in arr){
   
   return cansum(arr,sum-num);
}

return false;

}

console.log(cansum([5,2,3,4],7));