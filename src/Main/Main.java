package Main;

import Entities.Carrinho;
import Entities.Produto;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto(01, "Memoria Ram 8Gb", (float) 250.00);
        Produto produto2 = new Produto(02, "Placa Vídeo Radeon Rx5500", (float) 1300.00);
        Produto produto3 = new Produto(03, "Processador Ryzen 5 3600", (float) 1500.00);

        Carrinho.insereItem(produto1);
        Carrinho.insereItem(produto2);
        Carrinho.insereItem(produto3);

        Carrinho carrinho = new Carrinho(1000, Carrinho.itensCarrinho);


        System.out.println(carrinho);
        System.out.println(Carrinho.itensCarrinho);
    }
}
