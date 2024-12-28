const grid=(row,col)=>{
    if(row==1||col===1) return 1;
    return grid(row-1,col)+grid(row,col-1);
}

console.log(grid(18,18))  