import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Ninja> listDeNinjas = new LinkedList<Ninja>();

        // Adicionar os ninjas a minha Linked List
        System.out.println("-----------LISTA ATUALIZADA-01-------------");

        listDeNinjas.add(new Ninja("Naruto Uzumaki ", 19, "Komoha "));
        listDeNinjas.add(new Ninja("Sasuke Uchiha  ", 18, "Komoha"));
        listDeNinjas.add(new Ninja("Sakura Haruno ", 17, "Vila da folha"));
        listDeNinjas.add(new Ninja("Kakashi Hatake ", 31, "Komoha "));
        listDeNinjas.add(new Ninja("Gaara ", 17, "Vila da folha"));
        listDeNinjas.add(new Ninja("Shikamary Nara ", 17, "Vila da folha"));
        listDeNinjas.add(new Ninja("Temari ", 18, "Area "));

        // Listar os ninjas da minha Linked List
        // Complexidade o(n)
        for (Ninja ninja : listDeNinjas) {
            System.out.println(ninja);
        }

        System.out.println("-----------LISTA ATUALIZADA-02-------------");
        // Adicionar o ninja ao inico da lista
        listDeNinjas.addFirst(new Ninja("Boruto Uzumaki ", 9, "Komoha"));

        for (Ninja ninja : listDeNinjas) {
            System.out.println(ninja);
        }

        System.out.println("-----------LISTA ATUALIZADA-03-------------");
        listDeNinjas.removeFirst();
        for (Ninja ninja : listDeNinjas) {
            System.out.println(ninja);
        }

        System.out.println("-----------LISTA ATUALIZADA-04-------------");
        // Procurar um nija por indice
        Ninja localizarNinja = listDeNinjas.get(3);
        System.out.println(localizarNinja);

    }

}
