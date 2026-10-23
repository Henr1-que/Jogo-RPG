package rpg.test;

import rpg.dominio.Pocao;

public class PocaoTest01 {
    public static void main(String[] args) {
        Pocao pocaoPequena = new Pocao();
        Pocao pocaoGrande = new Pocao();

        pocaoPequena.nome = "Poção pequena";
        pocaoPequena.pontosCura = 20;
        pocaoPequena.preco = 10;

        pocaoGrande.nome = "Poção Grande";
        pocaoGrande.pontosCura = 50;
        pocaoGrande.preco = 25;

        System.out.printf("""
                %s
                [Pontos Cura] - %d
                [Preço] - %f
                """,pocaoPequena.nome,pocaoPequena.pontosCura, pocaoPequena.preco);
        System.out.println("---------------------------------------");
        System.out.printf("""
                %s
                [Pontos Cura]
                [Preço]
                """,pocaoGrande.nome, pocaoGrande.pontosCura,pocaoGrande.preco);
    }
}
