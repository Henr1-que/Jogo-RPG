package SistemaProduto.test;

import SistemaProduto.dominio.Produto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto produto01 = new Produto();
        Produto produto02 = new Produto();


        produto01.setNome("Teclado");
        produto01.setPreco(150);
        produto01.setQuantidade(5);
        produto01.adicionarEstoque(50);

        produto02.setNome("Mouse");
        produto02.setPreco(80);
        produto02.setQuantidade(10);
        produto02.adicionarEstoque(60);

        produto01.dadosProduto();
        produto02.dadosProduto();
    }
}
