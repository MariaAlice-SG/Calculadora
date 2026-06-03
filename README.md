Calculadora Java
Descrição

Este projeto é uma calculadora simples desenvolvida em Java que permite ao usuário realizar operações matemáticas básicas através de um menu interativo no terminal.

Funcionalidades
Soma
Subtração
Multiplicação
Divisão
Cálculo do resto da divisão
Potenciação
Encerramento do programa
Como funciona

Ao executar o programa, um menu é exibido com as opções disponíveis:

1 - Soma
2 - Subtração
3 - Multiplicação
4 - Divisão e resto
5 - Potência
0 - Sair

O usuário escolhe uma operação, informa os valores necessários e o resultado é exibido na tela. O menu continua sendo apresentado até que a opção 0 seja selecionada.

Estrutura do Código
Variáveis Principais
Variável	Tipo	Descrição
num1	float	Primeiro número informado
num2	float	Segundo número informado
resultado	double	Armazena o resultado da operação
opcao	int	Opção escolhida no menu
resto	int	Resto da divisão
Operações Implementadas
Soma

Realiza a adição entre dois números.

Subtração

Realiza a diferença entre dois números.

Multiplicação

Realiza o produto entre dois números.

Divisão e Resto

Calcula:

O quociente da divisão;
O resto da divisão utilizando o operador %.
Potência

Calcula uma potência utilizando o método:

Math.pow(base, expoente)
Requisitos
Java JDK 17 ou superior
IDE Java (IntelliJ IDEA, Eclipse, NetBeans ou VS Code)
Como Executar
Clone o repositório:
git clone <url-do-repositorio>
Entre na pasta do projeto:
cd calculadora-java
Compile o programa:
javac Main.java
Execute:
java Main
Exemplo de Uso
Escolha a opção da operação conforme abaixo:
1-Soma
2-Subtração
3-Multiplicação
4-Divisão e resto
5-Potência
0-Sair
Opção: 1

Insira o primeiro número: 10
Insira o segundo número: 5

O resultado é: 15.0
Melhorias Futuras
Tratamento de divisão por zero.
Validação de entrada do usuário.
Suporte para números decimais usando nextFloat().
Interface gráfica com Swing ou JavaFX.
Histórico de operações realizadas.
Autor

Desenvolvido como projeto de estudo em Java para prática de estruturas de repetição, seleção e operações matemáticas.
