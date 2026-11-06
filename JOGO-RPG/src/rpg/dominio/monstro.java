package rpg.dominio;

public class monstro {
    public String nome;
    public int vida;
    public int ataque;
    public int defesa;
    public int nivel;
    public int ouroRecompensa;
    public int experienciaRecompensa;

    public boolean estaVivo(){
        return vida > 0;
    }
    //ex 15

    public int calcularDano (int defesaHeroi){
      int dano = ataque - defesaHeroi;
      if(dano<1){
          return 1;
      }
      return dano;
    }
    //ex 17

    public void receberDano(int dano){
        if(dano < 0){
            return;
        }
        vida -= dano;
        if(vida < 0){
            vida = 0;
        }
    }

    //ex 20

    public String gerarResumo(){
        return String.format("""
                nome:%s
                vida:%f
                ataque:%d
                defesa:%d
                """,nome,vida,ataque,defesa);
    }
}


