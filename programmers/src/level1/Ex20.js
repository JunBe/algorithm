//체육복
function solution(n, lost, reserve) {
    var answer = n;
    
    reserve.sort();
    lost.sort();
    
    for(let i=0; i<reserve.length; i++){
        for(let j=0; j<lost.length; j++){
            if(reserve[i]===lost[j]){
                reserve[i]=-1;
                lost[j]=-1;
            }
        }
    }
    
    for(let i=0; i<reserve.length; i++){
        for(let j=0; j<lost.length; j++){
            if(reserve[i]-1 === lost[j]){
                reserve[i]=-1;
                lost[j]=-1;
            }else if(reserve[i]+1 ===lost[j]){
                reserve[i]=-1;
                lost[j]=-1;
            }
        }
    }
    
    for(let x of lost){
        if(x!==-1){
            answer--;
        }
    }
    
    
    return answer;
}