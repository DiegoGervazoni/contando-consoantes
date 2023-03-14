import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] consoantes = new String[6]; //transforma o array em um objeto
        int quantidadesConsoantes = 0; //inicializa a qtd de consoantes

        int count = 0; //inicializa o contador em zero

        do {
            System.out.println("Digite uma letra: "); //pede ao usuario a insercao de letras
            String letra = sc.next(); //faz a leitura da letra que o usuario insere

            //esse if, utiliza o igual/ignorar o tamanhoDaLetra
            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {

                consoantes[count] = letra;
                quantidadesConsoantes++; //faz a iteração
            }
            count++; //contador que iterar o do while
        } while (count < consoantes.length); //encerra quando o tamanho da consoante for menor que o inserido no array

        System.out.print("Consoantes: ");

        //agora sera utilizado o forEach
        for(String consoante : consoantes){ //transforma os consoantes em consoante
            if(consoante !=  null){ //se a consoante for diferente de null, imprime
                System.out.print(consoante + " ");
            }
        }
        System.out.println("\nQuantidade de consoantes: " + quantidadesConsoantes);
        System.out.println("\nQuantidade de lenght: " + consoantes.length);
    }
}
