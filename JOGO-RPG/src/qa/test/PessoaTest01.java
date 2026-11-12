package qa.test;

import qa.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
       pessoa.setNome("Henrique");
       pessoa.setIdade(18);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
