package rpg.dominio;

public class Batalha {
    public void atacarComHeroi(heroi heroi,monstro monstro){

        if(heroi.estaVivo() || !monstro.estaVivo()){
            System.out.println("Não é possivel realizar o ataque");
            return;
        }


        int dano = heroi.calcularDano(monstro.defesa);


        monstro.receberDano(dano);


        System.out.println(heroi.nome + " atacou" + monstro.nome);
        System.out.println("Dano causado" + dano);
        System.out.println("Vida restante do monstro" + monstro.vida);
    }

    // ex 25
    public void atacarComMonstro(monstro monstro, heroi heroi){


        if(!monstro.estaVivo() || !heroi.estaVivo()){
            System.out.println("nao esta vivo");
            return;
        }
        int dano = monstro.calcularDano(heroi.defesa);

        heroi.receberDano(dano);
        System.out.println(heroi.nome + " atacou" + monstro.nome);
        System.out.println("Dano causado" + dano);
        System.out.println("Vida restante do monstro" + monstro.vida);

    }


    public void executarTurno(heroi heroi ,monstro monstro) {








        if(!heroi.estaVivo() || !monstro.estaVivo()){
            System.out.println("não é possivel iniciar o turno");
            return;
        }

        System.out.println("======Novo Turno =========");

        atacarComHeroi(heroi,monstro);

        if(monstro.estaVivo()){
            atacarComMonstro(monstro, heroi);
        }

        System.out.println("Vida do heroi " + heroi.vida);
        System.out.println("Vida do monstro" + monstro.vida);
    }










}





