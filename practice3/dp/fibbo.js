const fibbo=(n,memo={})=>{
    if(n in memo){
        return fibbo(n);
    }
    if(n<=1){
        return 1;
    }
    result=fibbo(n-1)+fibbo(n-2);
    return result;
}

console.log(fibbo(45));