# Jogo de Adivinhação

Jogo de terminal em Java no qual o usuário possui dez tentativas para descobrir um número aleatório entre 1 e 100.

## Como funciona

- O programa sorteia um número entre 1 e 100.
- Cada palpite recebe uma dica informando se o número secreto é maior ou menor.
- Entradas que não sejam números inteiros são rejeitadas sem consumir uma tentativa.
- A partida termina com o acerto ou após dez tentativas.

## Requisitos

- JDK 17 ou superior

## Executar

```bash
javac -d out src/Jogo.java
java -cp out Jogo
```

## Conceitos praticados

- Estruturas de repetição e decisão
- Entrada de dados com `Scanner`
- Geração de números aleatórios
- Validação básica de entrada
