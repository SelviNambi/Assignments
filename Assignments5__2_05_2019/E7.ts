import * as re from 'readline'
// Counting the number of vowels and displaying repeating vowels
var input = re.createInterface({
    input : process.stdin , output : process.stdout 
});

input.question("Enter a string" , (count: any) => {

    var x = 0;
    var count_a = 0, count_e = 0 , count_i = 0 , count_o = 0  , count_u = 0 , count1 = 0;
    for( var i in count)
    {
    
    if(count[i] == 'a' || count[i] == 'A')
    { 
        count_a ++;
        
        
    }
    if( count[i] == 'e' || count[i] == 'E' )
    {
        count_e ++;

    }
    if( count[i] == 'i' || count[i] == 'I')
    {
        count_i ++ ;

    }
    if( count[i] == 'o' || count[i] == 'O')
    {
        count_o ++;

    }
    if( count[i] == 'u' || count[i] == 'U')
    {
        count_u ++;

    }
    // else
    //     count1 ++;
    }
    console.log("count of \" A \" is " +count_a);
    console.log("count of \" E \" is " +count_e);
    console.log("count of \" I \" is " +count_i);
    console.log("count of \" O \" is " +count_o);
    console.log("count of \" U \" is " +count_u);
    // console.log("Number of consonants and special characters are" +count1);
     
    input.close();
});