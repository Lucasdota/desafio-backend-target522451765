<h1 align=center>
  Desafio Backend Target
</h1>

## Linguagem Utilizada
Este projeto foi desenvolvido em **Java**.

## Intruções


### Exercício 1: Cálculo da Soma
Dado o trecho de código abaixo:
```java
int INDICE = 13, SOMA = 0, K = 0;
while (K < INDICE) {
    K = K + 1;
    SOMA = SOMA + K;
}
System.out.println(SOMA);
```
**Pergunta**: Ao final do processamento, qual será o valor da variável SOMA?

### Exercício 2: Sequência de Fibonacci
Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
- Receba um número como entrada (pode ser informado pelo usuário ou definido no código).
- Calcule a sequência de Fibonacci e retorne uma mensagem informando se o número informado pertence ou não à sequência.

### Exercício 3: Faturamento Diário
Dado um vetor que armazena o valor de faturamento diário de uma distribuidora, desenvolva um programa que calcule e retorne:
- O menor valor de faturamento ocorrido em um dia do mês;
- O maior valor de faturamento ocorrido em um dia do mês;
- Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

### Exercício 4: Percentual de Faturamento por Estado
Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
- SP – R$67.836,43
- RJ – R$36.678,66
- MG – R$29.229,88
- ES – R$27.165,48
- Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.  

### Exercício 5: Inversão de String
Desenvolva um programa que inverta os caracteres de uma string.

**Importante**:
- Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código.
- Evite usar funções prontas, como, por exemplo, reverse.

## Como executar a aplicação

Para executar a aplicação, basta rodar o arquivo Main.java.

## Resultados
```bash
Exercício 01 (Soma):
Resposta do exercício 01: SOMA = 91

Exercício 02 (Fibonacci):
Digite um número para verificar se pertence à sequência de Fibonacci: 21
21 pertence à sequência de Fibonacci.

Exercício 03 (Faturamento diário):
Menor valor de faturamento: 373.78
Maior valor de faturamento: 48924.24
Número de dias com faturamento acima da média: 10

Exercício 04 (Faturamento mensal):
Faturamento percentual por estado:
RJ: R$36678.66 (20.29%)
MG: R$29229.88 (16.17%)
SP: R$67836.43 (37.53%)
ES: R$27165.48 (15.03%)
Outros: R$19849.53 (10.98%)

Exercício 05 (Inverter string):
Digite uma string para inverter: brasil
String invertida: lisarb
```
