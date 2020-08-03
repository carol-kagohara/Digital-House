function calcular () {

    var operacao = document.getElementById('operacao').value;

    var num1 = document.getElementById('num1').value;

    var num2 = document.getElementById('num2').value;

    num1 = parseFloat(num1);
    num2 = parseFloat(num2);

    switch(operacao) {

        case '1':
            resultado = num1 - num2;
            break;

        case '2':
            resultado = num1 + num2;
            break;

        case '3':
            resultado = num1 * num2;
            break;

        case '4':
            resultado = num1 / num2;
            break;

        default:
            alert("Escolha uma operação válida");
                
    }

    document.getElementById('resultado').value = resultado;

}