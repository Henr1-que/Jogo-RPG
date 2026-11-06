package rpg.test;

import rpg.dominio.Jogo;
import rpg.dominio.heroi;

public class JogoTest01 {
   public static void main(String[] args) {
       //ex 01
       Jogo jogo = new Jogo();
       jogo.titulo = "A jornada de eldoria";

       heroi heroi01 = new heroi();
       heroi01.nome = "Henrique";
       heroi01.vida = 15;

       String estaVivo = heroi01.estaVivo() ? "Vivo" : "Morte";
        System.out.printf("""
               Bem-vindo ao RPG: %s
        
                Jogador [%s]
                [Status] %s
                [Vida] %d
               """, jogo.titulo,heroi01.nome,estaVivo,heroi01.vida);
    }
}
