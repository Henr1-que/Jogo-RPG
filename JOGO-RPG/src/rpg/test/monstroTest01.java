package rpg.test;

import rpg.dominio.monstro;

public class monstroTest01 {
    public static void main(String[] args) {
        monstro Goblin = new monstro();
        monstro Esqueleto = new monstro();
        monstro GuardiaoSombrio  = new monstro();

        Goblin.nome = "Goblin";
        Goblin.vida = 30;
        Goblin.ataque = 6;
        Goblin.defesa = 1;
        String goblinEstaVivo = Goblin.estaVivo() ? "Vivo" : "Morto";

        Esqueleto.nome = "Esqueleto";
        Esqueleto.vida = 0;
        Esqueleto.ataque = 9;
        Esqueleto.defesa = 2;
        String esqueletoEstaVivo = Esqueleto.estaVivo() ? "Vivo" : "Morto";

        GuardiaoSombrio.nome = "Guardião Sombrio";
        GuardiaoSombrio.vida = 75;
        GuardiaoSombrio.ataque = 12;
        GuardiaoSombrio.defesa = 3;
//ex 06
        System.out.printf("""
                 Monstro %s
                 
                 [Vida] - %d
                 [Ataque] - %d
                 [Defesa] - %d
                 [Status] - %s
                """,Goblin.nome,Goblin.vida,Goblin.ataque,Goblin.defesa,goblinEstaVivo);
        System.out.println("---------------------------------------------------");
        System.out.printf("""
                 Monstro %s
                 
                 [Vida] - %d
                 [Ataque] - %d
                 [Defesa] - %d
                 [Status] - %s
                """,Esqueleto.nome,Esqueleto.vida,Esqueleto.ataque,Esqueleto.defesa, esqueletoEstaVivo);
        System.out.println("---------------------------------------------------");
        System.out.printf("""
                 Monstro %s
                 
                 [Vida] - %d
                 [Ataque] - %d
                 [Defesa] - %d
                """,GuardiaoSombrio.nome,GuardiaoSombrio.vida,GuardiaoSombrio.ataque,GuardiaoSombrio.defesa);

    }
}
