import java.util.Scanner;

public class Ex3_MaiorEMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior =0;



        int count = 0;

    do{
        System.out.println("Numero: ");
        numero = scan.nextInt();
        count = count + 1;

        if (numero > maior) maior = numero;

    }while(count < 5);

        System.out.println("Maior:" + maior);
    }




}
