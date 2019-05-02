import * as readline from 'readline';


let valFromRuntime = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });
  

//Checks whether input is in the tuple or not
var student : [ string , string ];
student =["xx","aaa"];

valFromRuntime.question('Please enter a value ', (value) => {
    var res;
     if(value == student[0])
            console.log("Value found.." +student[0]);
    else if(value == student[1])
            console.log("Value found.." +student[1]);
    else
        console.log("Value not found...");
               
            
        valFromRuntime.close();
        
        
  });


