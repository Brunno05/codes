// Exercício 1
console.log("olá, mundo!");

// Exercício 2
let idade = 21;
let nome = "Bruno"
let num1 = 5;
let num2 = 10;
 
 
console.log("olá, mundo! Meu nome é " + nome + " e tenho " + idade + " anos!");
 
// Exercício 3
console.log("Temos os números " + num1 + " e " + num2 +
    ". Vamos fazer a soma, subtração, multiplicação entre eles!");
 
console.log("A soma é: " + (num1 + num2));
console.log("A subtração é: " + (num1 - num2));
console.log("A multiplicação é: " + (num1 * num2));
console.log("A divisão é: " + (num1 / num2));
 
// Exercício 4
let nota1 = Number(prompt("Digite primeira nota:"))
let nota2 = Number(prompt("Digite segunda nota:"))
let nota3 = Number(prompt("Digite terceira nota:"))
 
let media = (nota1 + nota2 + nota3) / 3;
 
if (media >= 7) {
    console.log("Sua média foi: " + media +
        ". Parabéns! Você foi aprovado!");
} else {
    console.log("Sua média foi: " + media +
        ". Que pena! Você foi reprovado, se esforçe mais na próxima...");
}
 
// Exercício 5
let numero = Number(prompt("Digite um número aleatório ( par ou ímpar ): "));
 
if (numero % 2 === 0) {
    console.log("O número " + numero + " é Par!");
} else {
    console.log("O número " + numero + " é Ímpar!");
}
 
// Exercício 6
let idade_user = Number(prompt("Digite sua idade!"));
 
if (idade_user >= 18) {
    console.log("Maior de idade!");
} else {
    console.log("Menor de idade!");
}
 
// Exercício 7
function calculadora(a, b, operacao) {
    operacao = operacao.toLowerCase();
 
    if (operacao === "soma") {
        return a + b;
 
    } else if (operacao === "subtracao") {
        return a - b;
 
    } else if (operacao === "divisao") {
        if (b === 0) {
            return "Divisão impossível!"
        } else {
            return a / b;
        }
 
    } else if (operacao === "multiplicacao") {
        return a * b;
    } else {
        return "Operação inválida"
    }
}
 
let valor1 = Number(prompt("Digite o primeiro valor da calculadora!"));
let valor2 = Number(prompt("Digite o segundo valor da calculadora!"));
 
let opera = prompt("Digite sua operação (sem acentos)");
 
let resultado = calculadora(valor1, valor2, opera);
 
console.log("Você escolheu a operação: " + opera + ". Seu resultado é: " + resultado);
 
// Exercício 8
let nome_user = prompt("Digite seu nome: ");
 
let nome_menor = nome_user.toLowerCase();
let nome_maior = nome_user.toUpperCase();
let quant_letras = nome_user.length;
 
console.log("Seu nome em minúsculo fica: " + nome_menor);
console.log("Seu nome em maiúsculo fica: " + nome_maior);
console.log("Seu nome tem: " + quant_letras + " letras!");
 
// Exercício 9
let contagem = Number(prompt("Digite um número para começar a contagem regressiva: "));
 
for(let i = contagem; i >= 1; i--){
    console.log(i);
}
 
// Exercício 10
let tabu = Number(prompt("Digite um número para saber sua tabuada:"));
 
for(let i = 1; i <= 10; i++){
    console.log(tabu+ " X " +i+ " = " +(tabu*i));
}
 
// Exercício 11
let nomes = ["Bruno","Marcelo","Cleber","José","Marcos"];
 
for(let i = 0; i < nomes.length; i++){
    console.log(nomes[i]);
}
 
// Exercício 12
function calcular_temperatura (a){
    return (a * 9) / 5 + 32;
}
 
let temp = Number(prompt("Digite a temperatura em celsius: "));
let resultado_t = calcular_temperatura(temp);
 
console.log("Sua temperatura em Fahrenheit é: " + resultado_t + " °F");
 
// Exercício 13
let carro = {
    marca: "Toyota",
    modelo: "Corolla",
    ano: 2020
};
 
console.log("Carro da marca " + carro.marca + ", do modelo " + carro.modelo + " e do ano de " + carro.ano);
 
// Exercício 14
function maiorNumero (a,b){
    if (a > b){
        return a;
    } else{
        return b;
    }
}
 
let n1 = Number(prompt("Digite o primeiro número"));
let n2 = Number(prompt("Digite o segundo número"));
 
let result = maiorNumero(n1,n2);
 
console.log("Resultado de maior número: " + result);
 
// Exercício 15
let v = 1;
 
while (v <= 10 ){
    console.log(v);
    v++;
}
 
// Exercício 17
function inverter_letra(texto){
    let inv = "";
 
    for (let i = texto.length - 1; i >= 0; i--){
        inv += texto[i];
    }
    return inv;
}
 
let text = prompt("Qual texto quer inverter?");
let text_inv = inverter_letra(text);
console.log("Seu texto " + text + " ,invertido, fica assim: " + text_inv);
 