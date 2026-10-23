package rpg.test;

import rpg.dominio.Arma;
import rpg.dominio.Inventario;
import rpg.dominio.heroi;

public class InventarioTest01 {
    public static void main(String[] args) {
        heroi heroi = new heroi();
        heroi.nome = "Henrique";
        heroi.vida = 100;
        heroi.ataque = 15;

        Inventario inventario = new Inventario();
        inventario.quantidadePocoes = 3;

        Arma espada = new Arma();
        espada.nome = "Espada de ferro";
        espada.bonusAtaque = 8;
        espada.preco = 150;

        inventario.armaEquipada = espada;
        heroi.inventario = inventario;

        System.out.printf("""
                Héroi %s
                
                [Arma] - %s
                [Bônus Ataque] %d+
                [Poçoes] %d und
                """,heroi.nome,heroi.inventario.armaEquipada.nome,heroi.inventario.armaEquipada.bonusAtaque, heroi.inventario.quantidadePocoes );
    }
}
