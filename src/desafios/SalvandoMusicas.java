package desafios;

import java.util.Scanner;

public class SalvandoMusicas {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            String arquivoDoPc = leitor.next();

            if(arquivoDoPc.endsWith(".mp3")) {
                System.out.print("Salvar");
            } else { arquivoDoPc.endsWith(".png || .rar");
                System.out.print("Deletar");
            }
        }
}
