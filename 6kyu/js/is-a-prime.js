// Is a Prime?
// Just your usual prime kata.. with some unknown restrictions.. Good luck!

// This kata requires a lot of guess work so try and try again. :)

// Note: You may not have any loops

// some test cases on this codewars kata
//  Test.assertEquals(isPrime('optimusprime'),true,'A prime is present');
//     Test.assertEquals(isPrime('11'),true,'A prime is present');
//     Test.assertEquals(isPrime('4'),false,'No prime has been found');
//     Test.assertEquals(isPrime('starPrime'),true,'A prime is present');
//     Test.assertEquals(isPrime('11aagghh4'),true,'A prime is present');

//solution


function isPrime(str) {
  if(/prime/i.test(str)) return true;
  let num = str.match(/\d+/g) || [];
  
  return num.some(n=> checkPrime(Number(n)))
  
}

function checkPrime(n, i=2){
  if(n< 2 ) return false;
  if(i * i > n) return true
  if(i % n ===0) return false;
  return checkPrime(n, i + 1);
}



console.log(isPrime("11optimusprim")); 
