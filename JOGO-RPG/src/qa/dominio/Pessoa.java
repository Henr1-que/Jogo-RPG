package qa.dominio;

public class Pessoa {
    public String nome;
    public int idade;

// set
// get

    public void setNome(String nome){
      if(nome.trim().isEmpty() || nome == null){
          return;
      }
        this.nome = nome;
    }
    public void setIdade (int idade){
        if(idade<0 || idade > 128){
            System.out.println("Idade Invalida!");
            return;
        }
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}
