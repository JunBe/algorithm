//문자열 다루기 기본
function solution(s) {
    var answer = false;
    if((s.length===4 || s.length===6)){
        for(let i=0; i<s.length; i++){
            if(+s[i] >=0){
                answer=true;
            }else{
                return false;
            }
        }
    }
    return answer;
}