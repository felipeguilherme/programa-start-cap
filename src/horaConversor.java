import java.util.Scanner;

public class horaConversor {

   public void converterHoraParaMinuto (){
       Scanner scanner = new Scanner(System.in);

        int minuto, hora;

        System.out.println("Qual a quantidade de horas: ");
        hora = scanner.nextInt();

        minuto = hora * 60;

        System.out.println(hora+ " hora(s) é equivalente a " + minuto + " minutos");


}
}
