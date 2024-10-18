//대소문자 바꿔서 입력하기
const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = [line];
}).on('close',function(){
    str = input[0];
    newStr = "";
    for(let i=0; i<str.length; i++){
        if('a'<=str.charAt(i)&&str.charAt(i)<='z'){
            newStr+=str.charAt(i).toUpperCase();
        }else{
            newStr+=str.charAt(i).toLowerCase();
        }
    }
    console.log(newStr);
});