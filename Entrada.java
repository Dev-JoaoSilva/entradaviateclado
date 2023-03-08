import java.util.Scanner;
public class Entrada{
    public static void main(String[] args) {
        int idade;
        String nomecompleto;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        nomecompleto = leia.nextLine();

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        idade = entrada.nextInt();
        System.out.println("A idade de "+ nomecompleto +" é de " +idade +" anos.");

        leia.close();
        entrada.close();

    }
}