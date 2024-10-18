//문자열 내림차순으로 배열하기
function solution(s) {
    return s.split("").sort((a,b)=>(a.charCodeAt()-b.charCodeAt()) * -1).join("");
    //reverse로 하면 더 쉬움!
}