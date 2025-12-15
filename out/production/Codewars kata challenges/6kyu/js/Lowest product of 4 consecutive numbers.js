// Create a function that receives a string consists of only digit characters ('0' to '9'), and returns the lowest product of 4 consecutive digits within that string.

// This should only work if the number has 4 digits or more. If not, return "Number is too small" instead.

// Example
// "123456789" --> 24    // 1*2*3*4
// "35" --> "Number is too small"

// solution

const lowestProduct = (input)=>{
  
if(input.length < 4) return "Number is too small";
  let smallproduct = Infinity;
  for(let i =0; i<=input.length -4;i++){
    let digits = input.slice(i,i+4).split('').map(Number);
    let multiply  =  digits.reduce((a,b)=>a*b,1)
    if (multiply  < smallproduct) smallproduct = multiply ;
  }
  return smallproduct
}
