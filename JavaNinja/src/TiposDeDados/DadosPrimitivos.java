package TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {

        /*
        * Dados primitivos - int, double, float, char, boolean, short.
        * Objetivo da aula: Criar um ninja - Naruto -
        **/

        int idade  = 17; // Valor máximo: 2 147 483 647
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 20147483649L; // Valor máximo: 9,223,372,036,854,775,807

        // sout e soutv
        System.out.println(idade);
        System.out.println(saldoBancario);
        System.out.println("saldoBancario = " + saldoBancario);
    }
}