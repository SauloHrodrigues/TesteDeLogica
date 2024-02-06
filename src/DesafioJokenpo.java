import java.util.Random;
import java.util.Scanner;

public class DesafioJokenpo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();
        Integer numeroGerado = aleatorio.nextInt(3);
        final Integer pedra=0;
        final Integer papel=1;
        final Integer tesoura=2;
        Integer escolhaUsuario;
        System.out.println("Jogo JOKENPO - Pedra, papel ou tesoura");
        System.out.println();

        System.out.println("1 - Pedra   ");
        System.out.println("2 - Papel   ");
        System.out.println("3 - Tesoura ");
        System.out.print("Escolha uma das opções: ");
        escolhaUsuario=(input.nextInt())-1;

        if (escolhaUsuario == numeroGerado){
            System.out.println("Parabéns! Você venceu este computatador.");
        }else{
            if (escolhaUsuario<0 ||escolhaUsuario>2){
                System.out.println("Opção INVÁLIDA!!");
            }else{
                if(numeroGerado == pedra){
                    System.out.println("O computador jogou PEDRA!");
                }
                if(numeroGerado == papel){
                    System.out.println("O computador jogou PAPEL!");
                }
                if(numeroGerado == tesoura){
                    System.out.println("O computador jogou TESOURA!");
                }
            }
        }
        input.close();
    }
}