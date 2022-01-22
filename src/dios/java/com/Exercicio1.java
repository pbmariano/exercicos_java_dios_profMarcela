package dios.java.com;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] agrs) {
        Scanner scan = new Scanner(System.in);
        double nota;
  do {
      System.out.println("informe uma nota entre 0 e 10:  ");
      nota = scan.nextInt();

    }while(nota < 0 ||  nota > 10);
}
}
