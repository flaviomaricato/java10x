package Condicoes;

public class IfEElse {
    public static void main(String[] args) {

        /*
        * IF e ELSE - condições
        * Else IF
        * Objetivo: Passar o ninja de nível de acordo com o número de missões
         */

        // Ninja Naruto
        String nome = "Naruto Uzumaki";
        String rank;

        int idade = 10;
        boolean hokage = false;
        short numeroDeMissoes = 9;

        // se (condição) { faça isso }
        if (numeroDeMissoes ==  10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennim");
        }

    }
}
