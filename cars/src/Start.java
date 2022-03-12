import java.util.Scanner;

public class Start {
    public static void main (String[] args){

        Scanner in = new Scanner (System.in);

        Vehicle BMW = new Vehicle();
        Vehicle Audi = new Vehicle("R8", 540, 320);

        System.out.print("Введите модель: ");
        String m = in.next();
        BMW.setModel(m);

        System.out.print("Введите мощность: ");
        int p = in.nextInt();
        BMW.setPower(p);

        System.out.print("Введите скорость: ");
        int s = in.nextInt();
        BMW.setSpeed(s);

        System.out.println();

        System.out.println("BMW:");

        BMW.getModel();
        BMW.getPower();
        BMW.getSpeed();

        System.out.println("Audi:");

        Audi.getModel();
        Audi.getPower();
        Audi.getSpeed();
    }
}
