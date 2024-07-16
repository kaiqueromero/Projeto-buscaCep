import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner answer = new Scanner(System.in);
        String cep = "";

        try{
            System.out.println("Qual o cep que deseja procurar? " + "\n (Digite um valor válido de 8 Digitos)");
            cep = answer.nextLine();
            SearchCep searchCep = new SearchCep();
            Address newAddress = searchCep.searchAddress(cep);
            FileGenerator fileGenerator = new FileGenerator();
            fileGenerator.saveJson(newAddress);
            System.out.println(newAddress);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação ");
        }
    }
}
