//두 개 뽑아서 더하기
function solution(numbers) {
    var answer = [];
    let arr=[];
    for(let i=0; i<numbers.length; i++){
        for(let j=i+1; j<numbers.length; j++){
            arr.push(numbers[i]+numbers[j]);
        }
    }
    arr.sort((a,b)=>a-b);
    
    var set = new Set(arr);
    for(const item of set){
        answer.push(item);
    }
    //answer = [...set] 이게 더 쉬운방법!
    
    return answer;
}