package rpg.dominio;

public class ImpressoraRPG {
    public void imprimirHeroi(heroi heroi){
        System.out.printf("""
                Heroi: %d
                Vida: %d
                Ataque:%d
                Defesa: %d
                Nivel:%d
                Ouro: %d
                
                
                """,heroi.nome,heroi.vida,heroi.ataque,heroi.defesa,heroi.nivel,heroi.ouro);
    }
    public void imprimirMonteiro(monstro monstro){
        System.out.printf("""
                Info
                
                Monstro:%s
                Vida: %d
                Ataque:%d
                Defesa:%d
                """,monstro.nome,monstro.vida,monstro.ataque,monstro.defesa);
    }
}
