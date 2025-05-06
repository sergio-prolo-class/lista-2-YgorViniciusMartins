[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/KKrNRA9P)

# Lista 2

---

## Informações do aluno
**Instituição:** Instituto Federal de Santa Catarina - Câmpus São Jośe  
**Aluno:** Ygor Vinicius Martins                                        
**Semestre:** 2025/1    
**Componente Curricular:** Programação orientada a objetos (POO)        
**Curso:** Engenharia de Telecomunicações

---

## Sobre este repositório:

Este repositório tem como objetivo realizar a atividada proposta pelo docente, tal tarefa gira em torno da construção
de um programa que tem como objetivo apresentar na tela um tabuleiro de batalha naval completo. Para este desafio,
foi utilizado a programação orientada a objetos, sendo que para este programa foram modeladas uma classe para o tabuleiro
e outra classe para os navios.  

---

## Como executar:  

Para executar o program, digite no terminal

> ./gradlew run

Caso o terminal informe que a permissão negada basta inserir no terminal:

> chmod +x gradlew

Após isso, o ./gradlew run deve funcionar normalmente

---

## Biblioteca algs:  

Como este programa tem como objetivo exibir este tabuleiro na tela para o usuário, utilizou-se a biblioteca algs, mais especificadamente
a classe Draw que esta porta. A classe Draw é responável por criar a janela e também por desenhar os nossos objetos nela.  

---

## Grade:  

A classe grade tem como objetivo representar o tabuleiro de batalha naval, esta é responável por moldar o tamanho do tabuleiro, tal como
sua legende para cada posição do tabuleiro.  

*new Grade(int linhas, int colunas, int x_orig, int y_orig):* Método construtor da classe, em outras palavras, cria a grade (se falhar, cria uma grade 10x10 na origem)   
*boolean setLinhas(int linhas):* Seta a quantide de linhas (não aceita números não positivos)  
*boolean setColunas (int colunas):* Seta a quantide de colunas (não aceita números não positivos)  
*boolean setXOrig(int x_orig):* Seta a posição x de origem de criação da grade (não aceita números não positivos)  
*boolean setYOrig(int y_orig):* Seta a posição y de origem de criação da grade (não aceita números não positivos)  
*int getLinhas():* Obtém a quantidade de linhas da grade  
*int getColunas():* Obtém a quantidade de colunas da grade  
*int getX_orig():* Obtém a posição x de origem de criação da grade  
*int getY_orig():* Obtém a posição y de origem de criação da grade  
*void desenhar(Draw draw):* Desenha a grade na tela

---

## Navio:  

A classe navio tem como objetivo representar os navios que serão colocados no tabuleiro, tal classe porta dados como o tamanho do navio,
sua direção e sua posição de origem.

*new Navio(int tamanho, int x, int y, String orientacao):* Método construtor do navio, em outra palavras, cria o navio (se falhar, cria navio inutilizável)  
*boolean setTamanho(int tamanho):* Seta o tamanho do navio (não aceita números não positivos)  
*boolean setX(int x):* Seta a posição x de origem (Não aceita números não positivos)  
*boolean setY(int y):* Seta a posição y de origem (Não aceita números não positivos)  
*boolean setOrientacao(String orientacao):* Seta a orientação do navio na grade  
*void desenhar(Draw draw):* Desenha o navio na grade  

### Observação  

No programa a grade 10x10, inicia na posiçã 1 e vai até a posição 10, sendo assim, a posição no canto inferior esquerdo é de 1,1.
Enquanto a posição do canto superior direito é a posição 10,10