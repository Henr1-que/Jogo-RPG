package SistemaProduto.dominio;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()){
            System.out.println("Nome invalido");
        }
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            System.out.println("Preço invalido");

            return;
        }
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade invalida");
            this.quantidade = quantidade;
        }

    }



    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public double calcularValorEstoque() {
      return  getPreco() * getQuantidade();
    }




    public void dadosProduto(){
        System.out.printf("""
                Produto %s
                Preço:R$ %.2f
                Quantidade: %d
                Valor Total estoque: R$ %.2f
                
                """,this.nome,this.preco,this.quantidade, calcularValorEstoque());
    }


    public void adicionarEstoque(int quantidade){
        if (quantidade <= 0){
            return;
        }
        this.quantidade += quantidade;
    }
}




