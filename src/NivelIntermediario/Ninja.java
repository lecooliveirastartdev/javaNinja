public abstract class Ninja {

   private String nome; // CAIXA PRIVADA
   private String aldeia;
   private int idade;
   private int numerosDemissoesConcluidas;
   private double altura = 2.10;

   public Ninja() {

   }

   public Ninja(String nome, String aldeia, int idade, int numerosDemissoesConcluidas, double altura) {
      this.nome = nome;
      this.aldeia = aldeia;
      this.idade = idade;
      this.numerosDemissoesConcluidas = numerosDemissoesConcluidas;
      this.altura = altura;
   }

   // Tirar dados ou mostrar para o usuario eu uso o GET + NOME DA VARIAVEL
   public String getNome() { // CAIXA PUBLICA TIRAR
      return nome;
   }

   // Receber dados "VALORES"
   public void setNome(String nome) { // CAIXA PUBLICA COLOCAR
      this.nome = nome;
   }

   public String getAldeia() {
      return aldeia;
   }

   public void setAldeia(String aldeia) {
      this.aldeia = aldeia;
   }

   public int getIdade() {
      return idade;
   }

   public void setIdade(int idade) {
      this.idade = idade;
   }

   public int getNumerosDemissoesConcluidas() {
      return numerosDemissoesConcluidas;
   }

   public void setNumerosDemissoesConcluidas(int numerosDemissoesConcluidas) {
      this.numerosDemissoesConcluidas = numerosDemissoesConcluidas;
   }

   public double getAltura() {
      return altura;
   }

   public void setAltura(double altura) {
      this.altura = altura;
   }

}
