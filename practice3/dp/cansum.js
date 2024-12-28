const cansum=(arr,sum,memo={})=>{
if(sum in memo) return memo[sum];
if(sum<0) return false;
if(sum===0) return true;

for(num of arr){
   
   if(cansum(arr,sum-num,memo)===true) return memo[sum-num]=true;
}

return memo[sum]=false;

}

console.log(cansum([7,14],300));