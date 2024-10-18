//합 계산기
const readline = require('readline');
let rl = readline.createInterface({
	input: process.stdin,
	output: process.stdout,
});
let input=[];
let total=0;
rl.on('line', (line) => {
	input.push(line);
});

rl.on('close', () => {
	for(let i=1; i<=Number(input[0]); i++){
		let arr = input[i].split(" ");
		let num1 = Number(arr[0]);
		let num2 = Number(arr[2]);
		switch(arr[1]){
			case "+":
				total += num1+num2;
				break;
			case "-":
				total += num1-num2;
				break;
			case "*":
				total += num1*num2
				break;
			case "/":
				total += Math.floor(num1/num2);
				break;
		}
		
	}
	
		console.log(total);
})