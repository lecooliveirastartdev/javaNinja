public class Hokages extends Ninja {

   public boolean VivoOuNao;
   
   //All args Constructor
      public Hokages (String nome,int idade,boolean VivoOuNao){
   
       this.nome = nome;
       this.idade = idade;
       this.VivoOuNao = VivoOuNao;

   }

    public Hokages(int idade) {
        this.idade = idade;
    }

    public Hokages(String nome) {
        this.nome = nome;
    }

    // Metodo abstrato obrigatorio que veio da classe NINJA
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Esta e minha estrategia de batalha ");
    }

}


