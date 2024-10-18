//자연수 뒤집어 배열로 만들기
function solution(n) {
    var answer = [...String(n)].reverse();
    for(let i=0; i<answer.length; i++){
        answer[i]=Number(answer[i]);
    }
    return answer;
}