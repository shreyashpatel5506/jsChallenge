/* For a given large number (num), write a function which returns the number with the second half of digits changed to 0.

 In cases where the number has an odd number of digits, the middle digit onwards should be changed to 0.

 Example:

 192827764920 --> 192827000000

 938473 --> 938000

 2837743 --> 2830000 */

 /*Broowser js ke liye ae 
let number = prompt("Enter a number:-");
let numArr = number.split("").map(Number);

let n = numArr.length;
if (!n % 2 == 0) {
  for (let i = Math.floor(n / 2); i < n; i++) {
    numArr[i] = 0;
  }
} else {
  for (let i = Math.floor(n / 2) + 1; i < n; i++) {
    numArr[i] = 0;
  }
}

let newNum = numArr.join("");
console.log(newNum);
*/

//node js me

import readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter a number: ', (answer) => {
  let number = answer;
  let numArr = number.split("").map(Number);
  let n = numArr.length;
  let mid = Math.floor(n / 2);
  for (let i = mid + (n % 2); i < n; i++) {
    numArr[i] = 0;
  }
  let newNum = numArr.join("");
  console.log(newNum);
  rl.close();
});