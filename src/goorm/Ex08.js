//부등호 표시하기
// Run by Node.js
const readline = require('readline');

(async () => {
	let rl = readline.createInterface({ input: process.stdin });
	let arr= [];
	for await (const line of rl) {
		arr=line.split(" ");
		rl.close();
	}
	// console.log(arr);
	solution(arr);
	process.exit();
})();

function solution(arr){
	let ab;
	let bc;
	let a= Number(arr[0]);
	let b= Number(arr[1]);
	let c = Number(arr[2]);
	
	if(a>b){
		ab=">"
	}else if(a<b){
		ab="<"
	}else{
		ab="=="
	}
	
	if(b>c){
		bc=">"
	}else if(b<c){
		bc="<"
	}else{
		bc="=="
	}
	
	console.log(arr[0]+ab+arr[1]+bc+arr[2]);
}