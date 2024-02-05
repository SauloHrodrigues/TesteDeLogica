import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("Gerando dez números Aleatórios ");
        Random aleatorio = new Random();
        Integer numeroGerado;
        Integer numeroMaior=0;
        Integer numeroMenor=100;
        for(int i=0;i<10;i++){
            numeroGerado = aleatorio.nextInt(101);
            System.out.print(numeroGerado +", ");
            if(numeroGerado>numeroMaior){
                numeroMaior=numeroGerado;
            }
            if (numeroGerado<numeroMenor){
                numeroMenor = numeroGerado;
            }
        }
        System.out.println();
        System.out.println("O maior número foi: "+numeroMaior);
        System.out.println("O menor número foi: "+numeroMenor);
    }
}
