//없는 숫자 더하기
function solution(numbers) {
    var answer = 45;
    for(let x of numbers){
        answer-=x;
    }
    
    return answer;
}