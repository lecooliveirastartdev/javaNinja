public class Uzumaki extends Ninja {

    public Uzumaki(){
        super();

    }
    



    public Uzumaki(String nome, String nivelDeDificuldade, String statusDaMissao, String missao, String aldeia,
            int idade) {
        super(nome, nivelDeDificuldade, statusDaMissao, missao, aldeia, idade);
    }




    public void ModoSabioAtivaçao(){
        System.out.println("Meu e: " + nome + ", E eu Ativei o modo sabio! ");
    }
    @Override
    public void habikidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e este é meu ataque Uzumaki ");

    }
    // Metodo abstrato obrigatorio que veio da classe NINJA
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Esta e minha estrategia de batalha ");
    }


}
