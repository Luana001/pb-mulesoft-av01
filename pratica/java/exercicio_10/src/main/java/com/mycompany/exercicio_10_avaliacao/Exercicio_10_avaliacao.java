package com.mycompany.exercicio_10_avaliacao;
import java.util.Scanner;

public class Exercicio_10_avaliacao {
    
    public static double calculaBonus(double salario) {
        double bonus = 0;
        if(salario <= 1000){
            bonus = 0.2;
        } else if (salario > 1000 && salario < 2000) {
            bonus = 0.1;    
        } else if (salario >= 2000){
            bonus = -0.1;
        }
        return bonus * salario;
    }
    
    public static double calculaSalarioLiquido(double salario, double bonificacao) {
        return  salario + bonificacao;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Qual a quantidade de funcionários que serão cadastrados?");
        int quant = teclado.nextInt();
        String[] funcionarios = new String [quant];
        double[][]salarios = new double [quant][3];
        
        for(int i=0; i<quant; i++) {
            System.out.println("\nQual o nome do funcionário?");
            funcionarios[i]= teclado.next();
            System.out.println("Qual o salário do " + funcionarios[i] + "?");
            double salario = teclado.nextDouble();
            salarios[i][0] = salario; 
            // salarios[i][0] = teclado.nextDouble();
            double bonus = calculaBonus(salario);
            salarios[i][1] = bonus;
            //salarios[i][1] = calculaBonus(salarios[i][0]);
            double salarioLiquido = calculaSalarioLiquido(salario, bonus);
            salarios[i][2]= salarioLiquido;
            //salarios[i][2] = calculaSalarioLiquido(salarios[i][1]);
        }
        
        System.out.println("\nResultado do cálculo do bônus:");
        for(int i=0; i<quant; i++) {
            System.out.println("\nFuncionário " + funcionarios[i]);
            System.out.println("Salário: " + salarios[i][0]);
            if(salarios[i][1]>0){
                System.out.println("Bônus: " + salarios[i][1]);
            } else if (salarios[i][1]<0) {
                salarios[i][1] = salarios[i][1] * (-1);
                System.out.println("Desconto: " + salarios[i][1]);
            }
            System.out.println("Salário Líquido: " + salarios[i][2]);
        }
        
    }
}
