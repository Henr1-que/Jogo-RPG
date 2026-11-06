package rpg.dominio;
//ex 02
public class heroi {
    public String nome;
    public int vida;
    public int vidaMaxima;
    public int ataque;
    public int defesa;
    public int nivel;
    public int experiencia;
    public int ouro;
    public Inventario inventario;

    public boolean estaVivo() {
        return vida > 0;
    }

    // ex 13
    public int calcularAtaqueTotal() {
        if (inventario == null || inventario.armaEquipada == null) {
            return ataque;
        }
        return ataque + inventario.armaEquipada.bonusAtaque;
    }
    //ex 14

    public int calcularDano(int defesaInimigo) {
        int dano = calcularAtaqueTotal() - defesaInimigo;
        if (dano < 1) {
            return 1;
        }
        return dano;

    };
    //ex 16
    public void receberDano(int dano) {
        if (dano < 0) {
            return;
        }
        if (vida > 0) {
            return;
        }
        // dano 1000
        // vida 100
        vida -= dano;
        if (vida < 0) {
            vida = 0;
        }
    }
    //ex 18
    public void curar(int pontosDeCura){
        if(pontosDeCura < 0){
            return;
        }

        vida += pontosDeCura;

        if(vida> vidaMaxima){
            vida = vidaMaxima;
     }
    }

    //ex 19
    public String gerarResumo(){
        //nome, a vida,o ataque total,a defesa e o nivel do personagem
        return "Heroi" + nome + "tem" + vida + "de vida é:" + calcularAtaqueTotal() +
             "ataque total,em busca da vitoria! sua defesa é" + defesa + "e nivel personagem =";
    }
}