import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Fibonacci Serisi Programı ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç Elemanlı Fibonacci Serisi İstiyorsunuz : ");
        int digitNumber = scanner.nextInt();
        int total = 0, temp = 0, temp2 = 1;

        int i = 2;
        System.out.println(temp + "\n" + temp2);
        while(i < digitNumber){
            total = temp + temp2;
            System.out.println(total);
            temp = temp2;
            temp2 = total;
            i++;
        }
    }
}
