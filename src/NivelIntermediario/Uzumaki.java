public class Uzumaki extends Ninja {

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
