let numbers = [2, 5, 12, 13, 15, 18, 22];
//ここに答えを実装してください。↓↓↓

function isEven() {  
    for(let i = 0; i < numbers.length; i ++){
        if(numbers[i] % 2 != 0){
            continue;
        }
        console.log(numbers[i] + 'は偶数です');
    }
}
isEven();

class Car{
    constructor(gas,number){
        this.gas = gas;
        this.number = number;
    }
    getNumGas() {
        console.log(`ガソリンは${this.gas}です。ナンバーは${this.number}です。`);
    }
}

let car = new Car('ハイオク',1234);
car.getNumGas();

