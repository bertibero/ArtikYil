import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir yıl giriniz :");
        year = input.nextInt();

        if (year%100 == 0) {
            if (year % 100 == 0) {
                System.out.println(year + "artık yıldır.");
            }else {
                System.out.println(year + "artık yıl değildir.");
            }
        }else{
            if (year%4 == 0){
            System.out.println(year + "artık yıldır.");
        }else{
            System.out.println(year + "artık yıl değildir.");
            }
        }
    }
}