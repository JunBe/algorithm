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
    str = input[0].split(''); //배열로 바뀐다.

    str.forEach((val,index) =>{
        if(val===val.toUpperCase()){ //대문자
            str[index]=val.toLowerCase();
        }else{
            str[index]=val.toUpperCase();
        }
    })
    
    console.log(str.join(""));
});