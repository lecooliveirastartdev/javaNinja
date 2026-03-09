import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {

    /*
     * LIST nao sao estaticas elas podem aumentar ou diminuir
     * .add -> ADICIONA | 
     * .remove -> REMOVE | 
     * .set -> TROCAR | 
     * .size -> VER TAMANO |
     * List
     * lis
     */

    // Inicializar nosso array
    private List<T> ferramentas;

    // Construtor
    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }

    // Colocar ferramenta na nossa lista
    public void adicionarFerramenta(T ferramenta) {
        ferramentas.add(ferramenta);
    }

    // Mostrar a nossa lista de ferramenta
    public void mostrarFerramentas() {
        for (T ferramenta : ferramentas) {
            System.out.println(ferramenta);

        }

    }

}
