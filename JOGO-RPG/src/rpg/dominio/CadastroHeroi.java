package rpg.dominio;

//ex 22
public class CadastroHeroi {
    public void cadastrar(heroi heroi,String nome,int vidaMaxima, int ataque, int defesa){
        heroi.nome = nome;
        heroi.vida = vidaMaxima;
        heroi.nivel = 1;
        heroi.ataque = ataque;
        heroi.defesa = defesa;

        heroi.experiencia = 0;
        heroi.ouro = 30;
        heroi.inventario.quantidadePocoes = 2;
    }
}
