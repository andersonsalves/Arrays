package br.com.anderson.app;

/**
 *
 * @author Anderson Silva
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Carro[] carros = new Carro[4];

        carros[0] = new Carro();
        carros[0].anoDeFabricacao = 2011;

        System.out.println("Ano fabricacao: " + carros[0].anoDeFabricacao);

        int[] notas = new int[4];
        notas[0] = 10;
        notas[1] = 5;
        notas[2] = 8;
        notas[3] = 9;

        System.out.println("\nNota do primeiro aluno: " + notas[0]);

        System.out.println("\nTamanho do array: " + notas.length + "\n");
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Posicao[" + i + "]=" + notas[i]);
        }
    }
}
