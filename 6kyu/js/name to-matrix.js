// Given a name, turn that name into a perfect square matrix (nested array with the amount of arrays equivalent to the length of each array).

// You will need to add periods (.) to the end of the name if necessary, to turn it into a matrix.

// If the name has a length of 0, return "name must be at least one letter"

// Examples
// "Bill" ==> [ ["B", "i"],
//              ["l", "l"] ]

// "Frank" ==> [ ["F", "r", "a"],
//               ["n", "k", "."],
//               [".", ".", "."]


// solution

function matrixfy(str) {
    if(str.length === 0)  return "name must be at least one letter";
      let n = Math.ceil(Math.sqrt(str.length));
      console.log(n)
      
    let padding = str.padEnd(n*n, '.')
    
      const matrix = []
      
      for(let i=0; i<n; i++){
        const row = [];
        
        
        for(let j=0; j<n; j++){
          row.push(padding[i*n+j])
        }
        matrix.push(row)
      }
      return matrix;
}