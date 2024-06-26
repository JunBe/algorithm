//문자열 돌리기
const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input;

rl.on('line', function (line) {
    input = line; //"abcde"
}).on('close',function(){
    for(let i=0; i<input.length;i++){
        console.log(input[i]); //자바스크립트는 charAt안쓰고 그냥 인덱스로 접근해도 된다.
    }
    
});