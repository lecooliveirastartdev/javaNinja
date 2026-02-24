public class Uchiha extends Ninja {

    String habikidadeEspecial;

    // Metodo Habilidade Especial
    public void mostraHabilidadeEspecial() {
        System.out.println("Habilidade Especial ");
    }

    // Metodo Sharigan Ativado
    public void sharinganAtivado() {
        System.out.println("Eu sou " + ", e meu sharigan esta ativado ");
    }

    public void nivelDeDificuldade() {
        System.out.println(" Este e meu nivel de dificuldade ");

    }

    public void statusDaMissao() {
        System.out.println("Este e meu status da missão ");
    }

    public void mostrarInfoformaçes() {
        System.out.println("Teste ");
    }

    // Sobrescrever Metodo
    @Override
    public void habikidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e este é meu ataque Uchiha ");

    }

}
