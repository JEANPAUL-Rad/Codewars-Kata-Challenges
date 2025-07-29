// Implement a function that receives two IPv4 addresses, and returns the number of addresses between them (including the first one, excluding the last one).

// All inputs will be valid IPv4 addresses in the form of strings. The last address will always be greater than the first one.

// Examples
// * With input "10.0.0.0", "10.0.0.50"  => return   50
// * With input "10.0.0.0", "10.0.1.0"   => return  256
// * With input "20.0.0.10", "20.0.1.0"  => return  246

// solution

function ipToNumber(ip) {
  const parts = ip.split('.').map(Number); 
  return (
    parts[0] * 256 ** 3 +
    parts[1] * 256 ** 2 +
    parts[2] * 256 +
    parts[3]
  );
}

function ipsBetween(start, end) {
  const startNum = ipToNumber(start);
  const endNum = ipToNumber(end);
  return endNum - startNum;
}