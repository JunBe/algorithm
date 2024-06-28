//숫자 문자열과 영단어 다른 풀이
function solution(s) {
    const number =["zero","one","two","three","four","five","six","seven","eight","nine"];
    let arr;
    for(let i = 0 ; i<number.length; i++){
        arr=s.split(number[i]);
        s=arr.join(i);
    }
    return +s;
}