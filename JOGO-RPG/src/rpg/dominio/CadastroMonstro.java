package rpg.dominio;

public class CadastroMonstro {
    public void cadastrar(monstro monstro,String nome,int vida, int ataque, int defesa, int exeperiencia,int ouro ){
        monstro.nome = nome;
        monstro.vida = vida;
        monstro.nivel = 1;
        monstro.ataque = ataque;
        monstro.defesa = defesa;
        monstro.experienciaRecompensa = exeperiencia;
        monstro.ouroRecompensa = ouro;
    }
}
