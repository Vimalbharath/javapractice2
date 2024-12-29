const fibbo=(n)=>{
    const table=Array(n+1).fill(0);
    table[1]=1;
    for(let i=0;i<=table.length;i++){
        if(table[i+1]<table.length) table[i+1]+=table[i];
        if(table[i+2]<table.length) table[i+2]+=table[i];
    }
    return table[n];
}

console.log(fibbo(8));