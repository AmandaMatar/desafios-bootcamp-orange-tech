package desafios;

import java.util.Scanner;

public class ImoveisDisponiveis {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String array[] = new String[3];

        array = frase.split("\\/");

        System.out.print("Imovel: ");

        System.out.print(array[0]+" ");

        System.out.print("R$"+array[1]+" ");

        System.out.print(array[2]);

    }

}   

