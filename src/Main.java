import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Calculadora c = new Calculadora();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        c.n1 = sc.nextInt();
        System.out.println("Digite outro número inteiro: ");
        c.n2 = sc.nextInt();
        c.Somar();
    }
}