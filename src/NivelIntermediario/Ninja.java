public abstract class Ninja implements estrategiaDeBatalhaNinja {

   // TODO: incluir 2 novos atributos: numerosDemissoesConcluidas, Rank
   // TODO: Rank: Genim, Chuunin, Jounin, Hokage

   String nome;
   String aldeia;
   int idade;
   int numerosDemissoesConcluidas;
   String rank;

   public Ninja() {

   }

   // TODO: Sobre carga dos construtores os novos atributos
   // Sobrecargas de metodos voce nao precisa redeclarar o construtor so os novos
   // atributos
   // AJUSTAR SE FOR PRECISO LEMBRETE
   public Ninja(String nome, String nivelDeDificuldade, String statusDaMissao, String missao, String aldeia,
         int idade) {
      this.nome = nome;
      this.idade = idade;
      this.aldeia = aldeia;

   }

   // Metodo mostrar informações

   // Metodo STRING
   public String EuSouUmNinja() {
      return "Oi Eu sou um ninja";

   }

   public Ninja(String nome, String aldeia, int idade, int numerosDemissoesConcluidas, String rank) {
      this.numerosDemissoesConcluidas = numerosDemissoesConcluidas;
      this.rank = rank;
   }

   // Metodo INT
   public int anosParaSeTornarHokagem(int idadeMinimaParaSerHokage) {
      return idadeMinimaParaSerHokage - idade;

   }

   // POLIMORFISMO Metodo GERAL
   public void habilidadeEspecial() {
      System.out.println("Meu nome é " + nome + " e esse e o meu atque especial ");

   }

   // Metodo GERAL: Todos os ninjas vão ver
   public void habikidadeEspecial() {
      System.out.println("Meu nome é " + nome + " e esse e o meu atque especial ");

   }

   // Metodo ABSTRATO - SERÁ obrigatório em todas as CLASSES
   @Override
   public abstract void estrategiaDeBatalhaNinja();

   // inteligencia de combate - Metodo PADRAO
   public void inteligenciaDeCombate() {

   }

   // Inteligencia de combate - sobrecarga de metodo
   
   public void inteligenciaDeCombate(int qi) {

      if (qi > 150) {
         System.out.println("Seu QI é: " + " e você é um genio");
      } else if (qi >= 130) {
         System.out.println("Seu QI é: " + " e você é um promissor");
      } else {
         System.out.println("Seu QI é: " + " e você é um genio");
      }
   }

   

}
