package com.mycompany.exercicio_9_avaliacao;

import java.util.Date;
import java.util.Scanner;

public class Exercicio_9_avaliacao {
    
    public static class User {
        String userNome = "Luana";
        String userSenha = "123abc";
        
        public boolean Verifica(String nome, String senha) {
            if(this.userNome.equals(nome) && this.userSenha.equals(senha)) {
                return true;
            }
            return false;
        }
    }
    
    public static double descobreHorario(String data){
        char[] hora = new char[5];
       
        int j=0;
        for(int i=0; i<data.length(); i++) {
            char c = data.charAt(i);
            
            if(Character.isDigit(c) && i > 10 && i < 16 || c == ':' && i > 10 && i < 16) {
                hora[j] = c;
                j++;
            }
        }
        String horario = String.valueOf(hora);
        return Double.parseDouble(horario.replace(':', '.'));
        
    } 
        

    public static void main(String[] args) {
        String[] mensagens = { "Bom dia, você se logou ao nosso sistema.",
                               "Boa tarde, você se logou ao nosso sistema.",
                               "Boa noite, você se logou ao nosso sistema.",
                               "Boa madrugada, você se logou ao nosso sistema." };

       Date relogio = new Date();
       String data = relogio.toString();
       double hora = descobreHorario(data);
       
       Scanner teclado = new Scanner(System.in);
       System.out.println("Digite seu usuario: ");
       String nome = teclado.nextLine();
       System.out.println("Digite sua senha: " );
       String senha = teclado.nextLine();
       
        User usuario = new User();       
        if(usuario.Verifica(nome, senha)) {
            if(hora >= 6 && hora < 12){
                System.out.println(mensagens[0]);
            } else if ( hora >= 12 && hora < 18) {
                System.out.println(mensagens[1]);
            } else if ( hora >= 18 && hora < 24) {
                System.out.println(mensagens[2]);
            } else if ( hora >= 0 && hora < 6) {
                System.out.println(mensagens[3]);
            }
       } else {
           System.out.println("Usuário e/ou senha incorretos");
       }
       
    }    
}
