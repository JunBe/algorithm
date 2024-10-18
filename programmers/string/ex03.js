//문자열 반복해서 출력하기
const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = line.split(' ');
    rl.close();
}).on('close', function () {
    str = input[0];
    n = Number(input[1]);
    let newStr="";
    for(let i = 0; i<n; i++){
        newStr+=str;
    }
    console.log(newStr);
});