static void main(){
    Scanner scan = new Scanner (System.in);
            float num1, num2, outronumero;
            double resultado = 0;
    int opcao;
    int resto;

    do {
        IO.print("""
                Escolha a opção da operação conforme a baixo:
                1-Soma
                2-Subtração
                3-Multiplicação
                4-Divisão e resto
                5-Potência
                0-Sair
                Opção:\s""");
        opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                IO.print("Insira o primeiro número: ");
                num1 = scan.nextInt();
                IO.print("Insira o segundo número: ");
                num2 = scan.nextInt();
                resultado = num1 + num2;
                IO.println("O resultado é: " + resultado);
                break;
            case 2:
                IO.print("Insira o primeiro número: ");
                num1 = scan.nextInt();
                IO.print("Insira o segundo número: ");
                num2 = scan.nextInt();
                resultado = num1 - num2;
                IO.println("O resultado é: " + resultado);
                break;
            case 3:
                IO.print("Insira o primeiro número: ");
                num1 = scan.nextInt();
                IO.print("Insira o segundo número: ");
                num2 = scan.nextInt();
                resultado = num1 * num2;
                IO.println("O resultado é: " + resultado);
                break;
            case 4:
                IO.print("Insira o primeiro número: ");
                num1 = scan.nextInt();
                IO.print("Insira o segundo número: ");
                num2 = scan.nextInt();
                resultado = num1 / num2;
                resto = (int) (num1 % num2);
                IO.println("O resultado é: " + resultado);
                IO.println("O resto é: " + resto);
                break;
            case 5:
                IO.print("base: ");
                num1 = scan.nextInt();
                IO.print("expoente: ");
                num2 = scan.nextInt();
                resultado = (float) Math.pow(num1, num2);
                IO.println("O resultado é: " + resultado);
                break;
            case 0:
                IO.println("Obrigado por usar nossa calculadora. Volte sempre!");
                break;
            default:

        }
    } while (opcao != 0);

}


