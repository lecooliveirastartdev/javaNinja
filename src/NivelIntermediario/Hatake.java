public class Hatake extends Ninja implements ShariganInterface, AmbuInterface {

    // metodo Ambu METODO INTERFACE
     public void ninjaDeElite(){
        System.out.println(nome+ ": Eu sou um nija de elite");
     }

    // Metodo Sharigan Ativado METODO DA INTERFACE
    public void sharinganAtivado() {
        System.out.println("Eu sou " + ", e meu sharigan esta ativado ");
    }

    public void boasVindas() {
        System.out.println(nome + " Eu sou um Hataki ");
    }

    // TENHO QUE VER ISSO
    @Override
    public void estrategiaDeBatalhaNinja() {

    }

}
