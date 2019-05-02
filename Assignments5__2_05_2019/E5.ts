import * as re from 'readline';
//finding sum of digits in a number

var read = re.createInterface({
    input: process.stdin , output: process.stdout 
})


read.question(("Enter a number"), (x) => {
    var val = parseInt(x); 
    var sum = 0;
    while(val != 0)
    {
        var res = val %10;
        val  = Math.floor(val/10);
        sum +=res;
    }
    console.log(sum);
    read.close();
});