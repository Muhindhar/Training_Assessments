import promptsync from 'prompt-sync';
const prompt = promptsync();
let a: number = Number(prompt("enter the number 1: "));
let b: number = Number(prompt("enter the number 2: "));
if (Number.isInteger(a) && Number.isInteger(b)){
    console.log("add: ",a+b);
    console.log("sub: ",a-b);
    console.log("multiplication: ",a*b);
    if(b==0){
        console.log("no division by zero ");
    }
    else{
        console.log("div: ",a/b);
    }
}
else {
    console.log("enter correct number");
}