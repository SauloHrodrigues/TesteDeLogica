import java.util.Scanner;

public class AcerteNumero {
    public static void main(String[] args) {
        Integer numero=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        while (numero != 10){
            numero = input.nextInt();
            if(numero==10){
                System.out.println("Parabéns! Você acertou!!!!");
                break;
            }else{
                System.out.println();
                System.out.print("Numero incorreto! Digite outro número: ");
            }

        }

        input.close();

    }
}