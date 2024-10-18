//이상한 문자 만들기
function solution(s) {
    var answer = '';
    arr=s.split(" ");
    for(let i=0; i<arr.length; i++){
        for(let j=0; j<arr[i].length; j++){
            console.log(arr[i][j].toUpperCase());
            j%2===0 ? answer+=arr[i][j].toUpperCase() : answer+=arr[i][j].toLowerCase();
        }
        if(i===arr.length-1) break;
        answer+=" "
    }
    return answer;
}