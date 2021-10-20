let number = 1;
while (number <= 100){
    if (number % 3 == 0 && number % 5 == 0){
        console.log('FizzBuzz!!');
        number ++;
    }
    if(number %3 == 0){
        console.log('Fizz!');
        number ++;
    }
    if (number % 5 == 0){
        console.log('Buzz!');
        number ++;
    }
   
    console.log(number);
    number ++;

}
