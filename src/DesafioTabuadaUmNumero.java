import java.util.Scanner;

public class DesafioTabuadaUmNumero {
    public static void main(String[] args) {
        Integer tabuada;
        Scanner input = new Scanner(System.in);
        System.out.println("Tabuada de um Número");
        System.out.println();
        System.out.print("Digite a tabuada desejada: ");
        tabuada = input.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.print(tabuada + "x"+i +"="+tabuada*i + ", ");
        }
        input.close();
    }
}