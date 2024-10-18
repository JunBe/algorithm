//k번째 수
function solution(array, commands) {
    var answer = [];
    
    for(let i=0 ;i<commands.length; i++){
        let arr = [];
        for(let j=0; j<array.length; j++){
            // commands[i][0],commands[i][1]
            if(j >= commands[i][0]-1 && j<= commands[i][1]-1){
                arr.push(array[j]);
            }
        }
        //정렬
        arr = arr.sort((a,b) => a-b);
        //푸시
        answer.push(arr[commands[i][2]-1]);
    }
    return answer;
}