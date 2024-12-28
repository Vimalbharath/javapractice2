const grid=(row,col,memo={})=>{
    const key=row+','+col;
    if(key in memo) return memo[key]
    if(row==1||col===1) return 1;
    memo[key]= grid(row-1,col,memo)+grid(row,col-1,memo);
    return memo[key];
}

console.log(grid(18,18))  