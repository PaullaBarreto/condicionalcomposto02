package ProvaPrimeiroPrograma;

import java.util.Scanner;

public class ProvaPrimeiroPrograma {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        String nome;
        double peso;
        double litros;
        double quantidade_ideal;
        double quantidade_resultado;

        //O nome do funcionário
        System.out.println("Entre com seu nome: ");
        nome = teclado.nextLine();

        //O peso atual dele em kg;
        System.out.println("Informe seu peso atual em Kg: ");
        peso = teclado.nextDouble();

        //A quantidade de água já ingerida no dia, em litros.
        System.out.println("Entre com a quantidade de água ingerida hoje, em litros: ");
        litros = teclado.nextDouble();

        //A quantidade ideal de água, em litros, 
        //considerando a fórmula descrita no texto 2, de 35 ml de água por quilo por dia
        quantidade_ideal = Math.round ((peso * 35) / 1000);

        //A quantidade a ingerir, subtraindo a quantidade já ingerida da quantidade ideal a ingerir por dia;
        quantidade_resultado = quantidade_ideal - litros;

        //O nome do funcionário
        System.out.println("Informe seu nome: " + nome);
        //O peso do funcionário
        System.out.println("Informe seu peso: " + peso);
        //A quantidade de água ingerida;
        System.out.println("Informe a quantidade de água ingerida: " + litros + "L");

        //Se a quantidade a ingerir seja negativa, 
        //imprimir a mensagem “Parabéns, você atingiu a meta de hidratação diária”;
        if (quantidade_resultado <= 0) {
            System.out.println("Parabéns!!! Você atingiu a meta de hidratação diária!");            
               
        }   
        //Caso contrário, se quantidade a ingerir seja zero ou positiva, 
        //imprimir a mensagem “Continue focado em se hidratar por hoje, ainda faltam [x] litros! Você consegue!”
        else {
            System.out.println("Continue focado em se hidratar por hoje, ainda faltam " + quantidade_resultado + 
            " litros! você consegue!");
        }
        teclado.close();

        }
}