//시저 암호
function solution(s, n) {
    let ans ="";
    for(let i=0; i<s.length; i++){
        let c = s[i].charCodeAt();
        if(65<=c && c<=90){
            c += n;
            if(c>90){
                c-=26;
            }
        }else if(97<=c && c<= 122){
            c += n;
            if(c>122){
                c-=26;
            }
        }
        ans+=String.fromCharCode(c);
    }
    console.log(ans);
    return ans;
    // return [...s].map(val => String.fromCharCode(val.charCodeAt()+n)).join("");
}