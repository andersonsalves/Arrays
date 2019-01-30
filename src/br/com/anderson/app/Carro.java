package br.com.anderson.app;

/**
 *
 * @author Anderson Silva
 */
public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoDeFabricacao;
    boolean biCombustivel;

    /**
     * 
     */
    void ligar() {
        
        if (modelo != null) {
            System.out.println("Ligando o carro: " + modelo);
        }
    }
}
