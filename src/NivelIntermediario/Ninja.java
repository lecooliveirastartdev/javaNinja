public class Ninja {

   String nome; 
   String nivelDeDificuldade;
   String statusDaMissao;
   String missao;
   String aldeia;
   int idade;
   // Metodo mostrar informações 
   
   // Metodo STRING
   public String EuSouUmNinja() {
      return "Oi Eu sou um ninja";
   }
   // Metodo INT
   public int anosParaSeTornarHokagem(int idadeMinimaParaSerHokage){
    return idadeMinimaParaSerHokage - idade;
   }
// POLIMORFISMO Metodo GERAL
   public void habilidadeEspecial() {
System.out.println("Meu nome é " + nome + " e esse e o meu atque especial ");




   }
   public void habikidadeEspecial() {
      System.out.println("Meu nome é " + nome + " e esse e o meu atque especial ");
   }
}
