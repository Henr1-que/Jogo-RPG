package rpg.test;

import rpg.dominio.Arma;

//ex 06
public class ArmaTest01 {
    public static void main(String[] args) {
        Arma EspadaMadeira = new Arma();
        Arma EspadaFerro = new Arma();

       EspadaMadeira.nome = "Espada de Madeira";
       EspadaMadeira.bonusAtaque = 2;
       EspadaMadeira.preco = 50;

       EspadaFerro.nome = "Espada De Ferro";
       EspadaFerro.bonusAtaque = 8;
       EspadaFerro.preco = 200;

       System.out.printf("""
                %s
                [BonusAtaque] - %d
                [Preco] - %f
                """, EspadaMadeira.nome,EspadaMadeira.bonusAtaque,EspadaMadeira.preco);
        System.out.println("-------------------------------------");
        System.out.printf("""
                %s
                [BonusAtaque] - %d
                [Preco] - %f
                """, EspadaFerro.nome,EspadaFerro.bonusAtaque,EspadaFerro.preco);
    }
}
