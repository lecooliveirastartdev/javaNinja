public abstract class Ninja implements estrategiaDeBatalhaNinja {

   String nome;
   String aldeia;
   int idade;

   public Ninja() {

   }

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
   public abstract void estrategiaDeBatalhaNinja();

}
