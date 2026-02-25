import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        
        Hokages Hiruzen = new Hokages( 45);
        System.out.println(Hiruzen.idade);

        Hokages Minato = new Hokages("Minato namikaze", 32, false);
        System.out.println(Minato.VivoOuNao + Minato.nome + Minato.idade);

        
    }

   
    

}
