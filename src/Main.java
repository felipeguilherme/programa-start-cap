import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner leitor = new Scanner(System.in);
//        Pessoa objetoPessoa = new Pessoa(90f, 1.80f);
//
////        System.out.println("Digite o peso: ");
////        objetoPessoa.setPeso(leitor.nextFloat());
////        System.out.println("Digite a altura: ");
////        objetoPessoa.setAltura(leitor.nextFloat());
////
//        System.out.println("Seu IMC é: " +objetoPessoa.calcularIMC());
//    }
//}

public class Main{
    public static void main(String[]args){

        Invoice inv = new Invoice(1, "Mousepad", -10, 50.0f);
        System.out.println("Valor total = "+inv.getInvoiceAmount());

    }}