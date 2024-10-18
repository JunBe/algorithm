//절약
// Run by Node.js
const readline = require('readline');

let total =0;
let result ="success";
(async () => {
	let rl = readline.createInterface({ input: process.stdin });
	const lines = [];
	for await (const line of rl) {
		lines.push(line);
	}
    
    rl.close();
	// console.log(lines);
	const N = lines[0];
	for(let i=1; i<=N; i++){
		const [chk,numStr] = lines[i].split(' ');
		const num= parseInt(numStr);
		
		if(chk==="in"){
			total+=num;
		}else{
			total-=num;
		}
		
		if(total<0){
			result="fail";
		}
	}
	console.log(result);
	process.exit();
})();
