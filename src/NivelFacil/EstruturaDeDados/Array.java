package NivelFacil.EstruturaDeDados;

public class Array {

    public static void main(String[] args) {

        /*
         * Arrays são do tipo referencia
         * 
         */
        // String inicializa como NULL
        String[] ninja = new String[6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi hatake";
        ninja[5] = "Leco Oliveira";

        //Redeclarar
        ninja = new String[6];
        System.out.println(ninja[5]);

        // Percorrer o Array inteiro atravez do FOR
        for (int i = 0; i < 6; i++) {

            System.out.println(ninja[i]);

        }

        // Int inicializam com 0
        int[] idade = new int[2];
        System.out.println(idade[1]);

        // Boolean inicializam com FALSE
        boolean[] verdadeiroOuFalso = new boolean[2];
        System.out.println(verdadeiroOuFalso[1]);

        // Double inicializam com 0.0
        double[] flutuante = new double[2];
        System.out.println(flutuante[1]);

    }
}
