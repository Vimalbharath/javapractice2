const fibbo=(n,memo={})=>{
    if(n in memo){
        return memo[n];
    }
    if(n<=1){
        return 1;
    }
    memo[n]=fibbo(n-1,memo)+fibbo(n-2,memo);
    return memo[n];
}

console.log(fibbo(45));