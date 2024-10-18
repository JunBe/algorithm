//엘리스 트랙 매칭
// Run by Node.js
const readline = require('readline');

(async () => {
	let rl = readline.createInterface({ input: process.stdin });
	const arr = [];
	for await (const line of rl) {
		arr.push(line);
	}
	arr[1]=arr[1].split(" ");
	// console.log(arr); // ['5',"I A I S S", "S"]
	//N명
	//친구, 트랙 (Cloud, SW, IOT, AI)
	//헬로빗과 같은 트랙을 지원하는 친구들은 총 몇명인지 출력
	solution(arr[0],arr);
	rl.close();
	process.exit();
})();

function solution(n,arr){
	
	let count=0;
	for(let i=0; i<n; i++){
		if(arr[1][i]===arr[2]){
			count++;
		}
	}
	console.log(count);
}
