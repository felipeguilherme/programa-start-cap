import java.util.Scanner;

public class seSera {

    public void testandoIF (){
        Scanner scanner = new Scanner(System.in);
        int numeroDigitado;

        System.out.println("Digite 1 ou 2: ");
        numeroDigitado = scanner.nextInt();

        if (numeroDigitado == 1){
            System.out.println("Você digitou 1!");
        } else if (numeroDigitado == 2) {
            System.out.println("Você digitou 2!");
        } else {
            System.out.println("Sua opção foi inválida, digite novamente: ");

        }



    }

}
