//3진법 뒤집기
function solution(n) {
    var answer = 0;
    let nThree="";
    while(n>0){
        nThree+=n%3;
        n=Math.floor(n/3);
    }
    nThree= nThree.split("").reverse();
    for(let i=0; i<nThree.length; i++){
        answer+=(Number(nThree[i])*Math.pow(3,i));
    }
    return answer;
}
