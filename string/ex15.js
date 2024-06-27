//중복 문자 제거
function solution(my_string) {
    var answer = '';
    let set = new Set([...my_string]);
    for(let item of set){
        answer+=item;
    }
    return answer;
}