package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados não primitivos: String, Array, Class, enum
        * Objetivo: Criar um ninja e atribuir métodos a ele
         */
        String nome = "Naruto Uzumaki";
        String nomeToUpperCase = nome.toUpperCase();
        System.out.println("nome = " + nomeToUpperCase);
        
        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaToLowerCase = aldeia.toLowerCase();
        System.out.println("aldeiaToLowerCase = " + aldeiaToLowerCase);
    }
}
