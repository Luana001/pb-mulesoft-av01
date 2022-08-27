package com.mycompany.exercico_8_avaliacao;

import java.util.Scanner;

public class Exercico_8_avaliacao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int acertos = 0, erros = 0;
        
        String[] perguntas = {"Em que ano a empressa foi criada?",
                               "Onde fica a nossa sede?", 
                               "Quais os estados que estamos presentes?",                        
                               "Nossa empresa é famosa pelos nossos?"};
        
        String [] [] alternativas = { {"a. 1945", "b. 1953", "c. 1962", "d. 1948"},
                                      {"a. São Paulo", "b. Curitiba", "c. Rio de Janeiro", "d. Vitória"},
                                      {"a. SP, RJ e SC", "b. SP, MG e ES", "c. RS, PR e SC", "d. RJ, BA e MT"},
                                      {"a. Bombons", "b. Chocolates", "c. Donuts", "d. Bolos"} };    
 
        String [] respostasCorretas = {"b", "c", "a", "c"};
       
        System.out.println("Bem vindo ao jogo de perguntas e respostas da nossa empresa!");
        System.out.println("Qual é o seu nome?");
        String jogador = teclado.next();
        System.out.println("Ok " + jogador + ", vamos começar!");
        for(int i=0; i<4; i++){
            System.out.println("\n" + perguntas[i]);
            for(int j=0; j<4; j++) {
                System.out.println(alternativas[i][j]); 
            }
            String resposta = teclado.next();
            if(respostasCorretas[i].equals(resposta)){
                System.out.println("Parabéns, você acertou!");
                acertos++;
            } else {
                System.out.println("Sinto muito você errou, a resposta correta era " + respostasCorretas[i]);
                erros++;
            }  
        }
        
        System.out.println("\nJogador: " + jogador + "\nAcertos: " + acertos + "\nErros: " + erros);
    }
}
