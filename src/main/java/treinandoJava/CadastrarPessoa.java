package treinandoJava;

public class CadastrarPessoa {
  // estado de um objeto
  int idade;
  String nome;
  String nacionalidade;
  String natural;
  String profissao;
  String time;
  String sexo;
  String logradouro;
  int numeroLogradouro;

  // comportamento de um objeto
  public CadastrarPessoa(int idade, String nome, String nacionalidade, String natural, String profissao, String time,
      String sexo, String logradouro, int numeroLogradouro) {

    this.nome = nome;
    this.idade = idade;
    this.nacionalidade = nacionalidade;
    this.natural = natural;
    this.profissao = profissao;
    this.time = time;
    this.sexo = sexo;
    this.logradouro = logradouro;
    this.numeroLogradouro = numeroLogradouro;
  }

  // método principal
  public static void main(String[] args) {
    // cria um novo objeto Pessoa
    CadastrarPessoa alexandre = new CadastrarPessoa(31, "Alexandre", "Brasileiro", "São Paulo", "QA", "Palmeiras", "M",
        "Rua a direita", 88);
    CadastrarPessoa joao = new CadastrarPessoa(25, "João", "Brasileiro", "São Paulo", "Dev", "Corinthians", "M",
        "Rua a esquerda", 1);
    CadastrarPessoa ana = new CadastrarPessoa(40, "Ana", "Brasileiro", "São Paulo", "PO", "São Paulo", "F",
        "Rua no centro", 5);
    


    // imprimir dados cadastrados
    // Pessoa um
    System.out.println("\n======================================================");
    System.out.println(alexandre.nome + " seu cadastro foi realizado com sucesso!");
    System.out.println("\nDados cadastratados:");
    System.out.println("\nIdade: " + alexandre.idade + " anos");
    System.out.println("Nacionalidade: " + alexandre.nacionalidade);
    System.out.println("Natural: " + alexandre.natural);
    System.out.println("Profissão: " + alexandre.profissao);
    System.out.println("Time: " + alexandre.time);
    System.out.println("Sexo: " + alexandre.sexo);
    System.out.println("Endereço: " + alexandre.logradouro);
    System.out.println("Número: " + alexandre.numeroLogradouro);

    // Pessoa dois
    System.out.println("\n======================================================");
    System.out.println(joao.nome + " seu cadastro foi realizado com sucesso!");
    System.out.println("\nDados cadastratados:");
    System.out.println("\nIdade: " + joao.idade + " anos");
    System.out.println("Nacionalidade: " + joao.nacionalidade);
    System.out.println("Natural: " + joao.natural);
    System.out.println("Profissão: " + joao.profissao);
    System.out.println("Time: " + joao.time);
    System.out.println("Sexo: " + joao.sexo);
    System.out.println("Endereço: " + joao.logradouro);
    System.out.println("Número: " + joao.numeroLogradouro);

    // Pessoa tres
    System.out.println("\n======================================================");
    System.out.println(ana.nome + " seu cadastro foi realizado com sucesso!");
    System.out.println("\nDados cadastratados:");
    System.out.println("\nIdade: " + ana.idade + " anos");
    System.out.println("Nacionalidade: " + ana.nacionalidade);
    System.out.println("Natural: " + ana.natural);
    System.out.println("Profissão: " + ana.profissao);
    System.out.println("Time: " + ana.time);
    System.out.println("Sexo: " + ana.sexo);
    System.out.println("Endereço: " + ana.logradouro);
    System.out.println("Número: " + ana.numeroLogradouro);
  }

  
  public Integer alexandre(int alexandre) {
  	// TODO Auto-generated method stub
  	return alexandre;
  }
  
  


}
