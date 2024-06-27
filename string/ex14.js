//qrcode
function solution(q, r, code) {
    var answer = '';
    //q = 3, r = 1
    for(let i=0;i<code.length; i++){
        if(i%q==r){
            answer+=code[i];
        }
    }
    return answer;
}