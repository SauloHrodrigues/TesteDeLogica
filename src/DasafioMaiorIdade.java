import java.util.Scanner;

public class DasafioMaiorIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer idade;
        String nome;
        System.out.println("Verificador de maior idade.");

        System.out.print("Digite seu nome: ");
        nome= input.nextLine();
        System.out.print("Digite sua idade: ");
        idade = input.nextInt();
        input.close();

        if (idade >= 18){
            System.out.print(nome+" você é maior de idade!");
        }else{
            System.out.println(nome +" você é menor de idade!");
        }
    }
}
