import * as readline from 'readline';

//Factorial of Number
let valFromRuntime = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });
  
  valFromRuntime.question('Please enter a number ', (a) => {
    var x: number ;
    var res = 1;
    for( x =1; x<= +a; x++)
    {
        res = res * x;    
    }
    
    valFromRuntime.close();
    console.log(res);
  });