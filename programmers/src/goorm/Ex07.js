//진법 변환
// Run by Node.js
const readline = require('readline');

(async () => {
	let rl = readline.createInterface({ input: process.stdin });
	let arr=[];
	for await (const line of rl) {
		arr=line.split(" ");
		rl.close();
	}
	for(let i=2; i<=16; i++){
		let num = parseInt(arr[0]).toString(i).toUpperCase();
		if(arr[1]===num){ //ff
			console.log(i);
			break;
		}
	}
	
	process.exit();
})();
