//문자열 겹쳐쓰기
function solution(my_string, overwrite_string, s) {
    var answer = '';
    for(let i=0; i<my_string.length; i++){
        if(i>=s && i<overwrite_string.length+s){
            answer+=overwrite_string[i-s];
        }else{
            answer+=my_string[i];
        }
    }
    return answer;
}