//키패드 누르기
function solution(numbers, hand) {
    var answer = '';
    let keypad = [[3,1],[0,0],[0,1],[0,2],[1,0],[1,1],[1,2],[2,0],[2,1],[2,2]];
    let L=[3,0];
    let R=[3,2];
    for(let x of numbers){
        if(x===1||x===4||x===7){
            answer+="L";
            L=keypad[x];
        }else if(x===3||x===6||x===9){
            answer+="R";
            R=keypad[x];
        }else{
            if(Math.abs(keypad[x][0]-R[0])+Math.abs(keypad[x][1]-R[1])<Math.abs(keypad[x][0]-L[0])+Math.abs(keypad[x][1]-L[1])){
                answer+="R";
                R=keypad[x];
            }else if(Math.abs(keypad[x][0]-R[0])+Math.abs(keypad[x][1]-R[1])>Math.abs(keypad[x][0]-L[0])+Math.abs(keypad[x][1]-L[1])){
                answer+="L";
                L=keypad[x];
            }else{
                if(hand==="right"){
                    answer+="R";
                    R=keypad[x];
                }else{
                    answer+="L";
                    L=keypad[x];
                }
            }
        }
        
    }
    
    return answer;
    //거리가 같다면 자기 손 잡이가 더 우선순위
}