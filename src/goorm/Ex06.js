//G 세포
// Run by Node.js
const readline = require('readline');

(async () => {
	let rl = readline.createInterface({ input: process.stdin });
	let N;
	for await (const line of rl) {
		N=Number(line); // 크기 N인 G세포
		rl.close();
	}
	//g-g 합체 
	//크기 N인 G 세포 필요
	solution(N);
	// console.log() // 1.크기가 1인 G세포 개수 2. 분열이 일어나야하는 시간 오름차순
	process.exit();
})();

function solution(N){
	let count=1;
	let n=0;
	let arr=[];
	while(N!==0){
		if(count*2 > N){
			arr.push(n);
			n=0;
			N-=count;
			count=1;
		}else{ //분열
			count*=2;
			n++;
		}
	}
	console.log(arr.length)
	arr = arr.sort((a,b) => a-b).join(" ");
	console.log(arr);
}
