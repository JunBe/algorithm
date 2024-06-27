//자연수 뒤집어 배열로 만들기 다른 풀이
function solution(n) {
    var answer = [];
    do{
        answer.push(n%10);
        n=Math.floor(n/10);
    }while(n>0);
    return answer;
}