const cansum=(arr,sum)=>{
    
if(sum<0) return false;
if(sum===0) return true;

for(num in arr){
   
   if(cansum(arr,sum-num)===true) return true;
}

return false;

}

console.log(cansum([5,7,3,4],7));