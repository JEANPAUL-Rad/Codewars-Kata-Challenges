// If we write out the digits of "60" as English words we get "sixzero"; the number of letters in "sixzero" is seven.
//  The number of letters in "seven" is five. The number of letters in "five" is four. The number of letters in "four" is four: we have reached a
// stable equilibrium.

// Note: for integers larger than 9, write out the names of each digit in a single word (instead of the proper name of the number
// in English). For example, write 12 as "onetwo" (instead of twelve), and 999 as "nineninenine" (instead of nine hundred and ninety-nine).

// For any integer between 0 and 999, return an array showing the path from that integer to a stable equilibrium:

// Examples
// numbersOfLetters(60) --> ["sixzero", "seven", "five", "four"]
// numbersOfLetters(1) --> ["one", "three", "five", "four"]

// solution

  const Digits = ['zero','one','two','three','four','five','six','seven','eight','nine'];
  
  const convertToWords = n => String(n).split('').map(d => Digits[+d]).join('');
  
  function findLetters(n){
     let output = []
   for(let word = convertToWords(n); ;word = convertToWords(word.length)){
     output.push(word)
     if (word === 'four') break;
      
     
   }
   return output;
  }
 
  
console.log(findLetters(1));
  
//output: ["one", "three", "five", "four"]