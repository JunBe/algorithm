//문자열 내 p와 y의 개수
function solution(s){
    var answer = true;
    s=s.toLowerCase();
    let p=0;
    let y=0;
    for(let i=0 ;i<s.length; i++){
        if(s[i]==='p'){
            p++;
        }else if(s[i]==='y'){
            y++;
        }
    }
    p===y ? answer=true : answer=false ;

    return answer;
}