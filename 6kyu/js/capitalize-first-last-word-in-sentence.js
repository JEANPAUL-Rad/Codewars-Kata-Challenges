// Write a function capitalizeChar that takes a sentence as an argument. 
// The function should return a new sentence where for each word, if the length of the word is 6, 
// the last character is capitalized. If the length of the word is 5, 
// the first character is capitalized. For all other word lengths, the word is left as is.
// capitalizeChar("Hello world from the cosmos")
// // "Hello World from the cosmoS"


// capitalizeChar("I love JavaScript programminG")
// // "I love JavaScript programminG"

// capitalizeChar("Exploration of the Cosmos is fascinating")
// // "Exploration of the CosmoS is fascinatinG"


function capitalizeChar(sentence){
  
  let out = sentence.split(' ')
 
  for(let i=0; i<out.length; i++){
    
    
    if(out[i].length === 5){
     out[i] =  out[i][0].toUpperCase() + out[i].slice(1);
      
    }else if(out[i].length === 6) {
      out[i] = out[i].slice(0, -1) + out[i][out[i].length - 1].toUpperCase();
      
    }else{
        out[i]=out[i]
    }
  }
  return out.join(' ');
}

console.log(capitalizeChar("hello world from the cosmos"))