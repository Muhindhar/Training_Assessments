import PromptSync from "prompt-sync";
const prompt =PromptSync();

function rev(a:number):number{
    let rev=0;
    while(a>0){
        let digit = a%10;
        rev=rev*10+digit;
        a=Math.floor(a/10);
    }
    return rev;
}       
let inp:number = Number(prompt("Ente the 5 digit number :"));
if(inp.toString().length==5){
    console.log("reverse : ",rev(inp));
}
else{
    console.log("enter the valid number");
}
