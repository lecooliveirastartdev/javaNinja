public class Missoes {

    private String nome;
    private RankDeMissoes rank;

    // Metodo publico para mostrar mais informações
    public void exibirDetalhes() {
        System.out.println("A Missao " + nome + "Rank: " +
                rank + "Descrição " + rank.getDescricao() + "Dificuldade: " + rank.getDificuldade() );
    }

    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }

}
