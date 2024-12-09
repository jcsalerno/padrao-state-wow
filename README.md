# Projeto Druida - Padrão State em Java

Este projeto é uma implementação do **Padrão State** utilizando Java. O código demonstra como o padrão pode ser usado para modelar o comportamento de um **Druida** no contexto do jogo **World of Warcraft**.

## O que o código faz

O código simula as diferentes formas que um Druida pode assumir dentro do jogo:

1. **FormaTank**: O Druida assume a forma de **Tank**, onde seu papel é defender o grupo e atrair os inimigos.
2. **FormaDps**: O Druida assume a forma de **DPS**, com foco em causar dano ao inimigo.
3. **FormaHealer**: O Druida assume a forma de **Healer**, curando os aliados e mantendo o grupo saudável.

O **Padrão State** foi utilizado para permitir que o Druida altere seu comportamento de acordo com a forma que ele escolhe assumir, sem que seja necessário reescrever o código para cada tipo de ação. Em vez disso, a ação é delegada à implementação da interface `EstadoForma`, que define o comportamento para cada forma.

## Como funciona

A interface `EstadoForma` define o método `executarAcao()`, que é implementado pelas classes **FormaTank**, **FormaDps** e **FormaHealer**. Cada forma tem um comportamento específico quando o método `executarAcao()` é chamado, refletindo as ações que o Druida pode realizar.

A classe `Druida` mantém uma referência à interface `EstadoForma` e permite a troca entre as diferentes formas, alterando o comportamento do Druida dinamicamente.

## Fluxo de Execução

No código, a classe `Druida` pode alternar entre as formas ao chamar o método `definirForma()`, passando a forma desejada (como **FormaTank**, **FormaDps**, ou **FormaHealer**). Quando o método `realizarAcao()` é chamado, o Druida executa a ação correspondente à forma atual.