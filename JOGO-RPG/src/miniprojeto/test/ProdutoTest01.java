package miniprojeto.test;

import miniprojeto.dominio.Produto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto produto01 = new Produto();
        Produto produto02 = new Produto();

        produto01.setNome("Teclado");
        produto01.setPreco(150.00);
        produto01.setQuantidade(5);

        produto02.setNome("Mouse");
        produto02.setPreco(80.00);
        produto02.setQuantidade(10);

        produto01.getNome();
        produto01.getPreco();
        produto01.getQuantidade();

        produto02.getNome();
        produto02.getPreco();
        produto02.getQuantidade();
    }
}
