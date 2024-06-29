//신규 아이디 추천
function solution(new_id) {
    var ans;
//1. tolowercase()
    var chk = new_id.toLowerCase();
//2. .replace(/[^\W-.]/g,""); //-,.도 제거
    chk = chk.replace(/[^\w-.]/g,"");
//3. .. -> .
    chk = chk.replace(/\.{2,}/g,".")
//4. 첫,마지막 인덱스 . -> 제거
    let arr = chk.split('');
    if(arr[0]==="."){
        arr[0]="";
    }
    if(arr[arr.length-1]==="."){
        arr[arr.length-1]="";
    }
    chk = arr.join("");
//5. 빈 문자열 ->"a"
    if(chk.length===0){
        chk="a";
    }
//6. 길이가 16이상이면 첫 15문자만 살리기 / 제거후 마지막에 . 남았을시 삭제 slice
    if(chk.length>=16){
        chk= chk.slice(0,15);
        if(chk[14]==="."){
            arr = chk.split("");
            arr[14]="";
            chk = arr.join("");
        }
    }
//7. 2자 이하면 마지막 문자를 3이 될 때 까지 반복
    if(chk.length===1){
        chk+=chk[0];
    }
    if(chk.length===2){
        chk+=chk[1];
    }
    ans=chk;
    return ans;
}



