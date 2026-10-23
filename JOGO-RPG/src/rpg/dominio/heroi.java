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

    public boolean estaVivo(){
        return vida > 0;
    }
    public int calcularAtaqueTotal(){
        if (inventario == null || inventario.armaEquipada == null){
            return ataque;
        }
        return ataque + inventario.armaEquipada.bonusAtaque;
    }
}
