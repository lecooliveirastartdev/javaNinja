import java.util.List;

public class BolsaGenerica<T> {
    private List<T> equipamentos;

    public BolsaGenerica(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    // Colocar equipamentos genericos
    public void AdicionarEquipamentos(T equipamentoGenerico){
        equipamentos.add(equipamentoGenerico);


    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "Bolsa de equipamentos " + equipamentos.toString() + "]";
    }

    



}
