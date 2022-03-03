import java.util.Scanner;

public class start {

    public static void main (String[] args){

        String name;
        int age;

        Scanner in = new Scanner(System.in);

        System.out.print("Ваше имя: ");
        name = in.next();

        System.out.print("Ваше возраст: ");
        age = in.nextInt();

        System.out.printf("Ваше имя: %s\nВаш возраст: %d", name, age);
    }
}
