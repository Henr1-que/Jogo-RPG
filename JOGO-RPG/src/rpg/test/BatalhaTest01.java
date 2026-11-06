package rpg.test;

import rpg.dominio.Batalha;
import rpg.dominio.heroi;
import rpg.dominio.monstro;

public class BatalhaTest01 {
    public static void main(String[] args) {
        heroi heroi = new heroi();

        heroi.nome = "Henrique";
        heroi.vida = 100;
        heroi.ataque = 15;
        heroi.defesa = 5;

        monstro monstro = new monstro();

        monstro.nome = "Goblin";
        monstro.vida = 30;
        monstro.ataque = 4;
        monstro.defesa = 1;

        Batalha Batalha = new Batalha();

        while(heroi.estaVivo() && monstro.estaVivo()){
            Batalha.executarTurno(heroi,monstro);

            if(heroi.estaVivo()){
                System.out.println("Heroi venceu a batalha");
            }else{
                System.out.println("Heroi foi derrotado");
            }
        }
    }
}
