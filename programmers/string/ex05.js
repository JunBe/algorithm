//특수문자 출력하기
const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.on('close', function () {
    console.log(`!@#$%^&*(\\'"<>?:;`); //백틱을 사용하더라도 '\'를 출력하려면 '\\'와 같이 써 줘야함
});