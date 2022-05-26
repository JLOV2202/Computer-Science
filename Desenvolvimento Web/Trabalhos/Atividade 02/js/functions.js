function atividade01 () {

    var n1 = parseInt(window.prompt("Informe o primeiro número."));
    var n2 = parseInt(window.prompt("Informe o segundo número."));

    document.getElementById("exit").innerHTML = (n1 > n2 ? "Maior: " + n1 + "<br>Menor: " + n2 : "Maior: " + n2 + "<br>Menor: " + n1);
}

function atividade02 () {

    var gen = String(window.prompt("Informe seu gênero.\n(M)asculino\n(F)eminino.\n")).toLowerCase();
    var hgt = parseInt(window.prompt("Informe sua altura em centímetros.\nEx: 1,70m = 170cm.\n"));
    var wgt = 0;

    if (gen == "m") {
        wgt = ((72.7 * (hgt/100)) - 58).toFixed(2);
    } 
    else if (gen == "f") {
        wgt = ((62.1 * (hgt/100)) - 44.7).toFixed(2);
    } 
    else {
        alert("Ocorreu um Erro!")
    }

    if (gen == "m" || gen == "f") document.getElementById("exit").innerHTML = "Seu peso ideal é: " + wgt + "Kg!";

}

function atividade03 () {

    var n1 = parseInt(window.prompt("Informe o primeiro valor."));
    var n2 = parseInt(window.prompt("Informe o segundo valor."));
    var n3 = parseInt(window.prompt("Informe o terceiro valor."));

    document.getElementById("exit").innerHTML = "O menor valor é " + (n1 < n2 && n1 < n3 ? n1 : n2 < n1 && n2 < n3 ? n2 : n3 );

}

function atividade04 () {

    var num = parseInt(window.prompt("Informe um número inteiro."));

    document.getElementById("exit").innerHTML = (num >= 0 ? (num%2 == 0 ? "Este número é par!" : "Este número é ímpar!") : "Número negativo! <br> Seu valor absoluto é: " + Math.abs(num));

}

function atividade05 () {

    var num = parseInt(window.prompt("Informe um número inteiro."));

    document.getElementById("exit").innerHTML = (num%2 == 0 && num%3 == 0 ? "Este número é divisível por 2 e 3!" : (num%2 == 0 ? "Este número é divisível por 2 apenas!" : (num%3 == 0 ? "Este número é divisível por 3 apenas!" : "Este número não é divisível por 2 e 3!")))

}

function atividade06 () {

    var num = parseInt(window.prompt("Informe um número inteiro."));

    document.getElementById("exit").innerHTML = (num%2 == 0 && num%7 == 0 ? "Este número é divisível por 2 e 7!" : (num%2 == 0 ? "Este número é divisível por 2 apenas!" : (num%7 == 0 ? "Este número é divisível por 7 apenas!" : "Este número não é divisível por 2 e 7!")))
    
}

function atividade07 () {

    var num = parseInt(window.prompt("Informe um número inteiro."));
    var msg;

    switch (num) {
        case 1:
            msg = "Domingo";
            break;
        case 2:
            msg = "Segunda";
            break;
        case 3:
            msg = "Terça";
            break;
        case 4:
            msg = "Quarta";
            break;
        case 5:
            msg = "Quinta";
            break;
        case 6:
            msg = "Sexta";
            break;
        case 7:
            msg = "Sábado";
            break;
        default:
            msg = "Valor Inválido!"
    }

    document.getElementById("exit").innerHTML = msg;

}

function atividade08 () {
    
    var sum = 0;

    for (var i = 1; i < 21; i++){
        if (i%2 == 0) sum += i;
    }

    document.getElementById("exit").innerHTML = "O somatórios dos valores pares entre 1 e 20 é " + sum;

}

function atividade09 () {

    var num = parseInt(window.prompt("Informe um número inteiro."));
    var msg = "";

    for (var i = 1; i < 11; i++) msg += num + " X " + i + " = " + num*i + "<br>";

    document.getElementById("exit").innerHTML = msg;
    
}

function atividade10 () {
    
    var num = parseInt(window.prompt("Informe um número inteiro positivo."));
    var msg = num + "! = ";
    var fat = 1;

    for (var i = num; i > 0; i--){
        msg += (i + (i != 1 ? " x " : " = "));
        fat = fat*i;
    } 

    document.getElementById("exit").innerHTML =  (num >= 0 ? msg + fat : "Erro! Valor inválido!");

}