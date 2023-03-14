import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadesConsoantes = 0;

        int count = 0;

        do {
            System.out.println("Digite uma letra: ");
            String letra = sc.next();

            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {

                consoantes[count] = letra;
                quantidadesConsoantes++;
            }
            count++;
        } while (count < consoantes.length);

        System.out.print("Consoantes: ");
        for(String consoante : consoantes){
            if(consoante !=  null){
                System.out.print(consoante + " ");
            }
        }
        System.out.println("\nQuantidade de consoantes: " + quantidadesConsoantes);
        System.out.println("\nQuantidade de lenght: " + consoantes.length);
    }
}
