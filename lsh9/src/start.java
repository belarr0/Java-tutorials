import java.util.Scanner;

public class start {
    public static void main (String[] args){
        Computer apple = new Computer(/*1000, 1500, "MacBook10"*/);

        /*
        apple.cpu = 2500;
        apple.memory = 1000;
        apple.name = "MacBook10";

        apple.isCpu();

        Computer deal = new Computer();
        deal.cpu = 4300;
        deal.isCpu();

        Computer deal = apple;
        apple.memory = 1500;
        deal.isMemory();
         */


        Scanner in = new Scanner(System.in);    //пример ввода данных для Class

        System.out.print("Memory: ");
        int m = in.nextInt();
        apple.setMemory(m);

        System.out.print("Cpu: ");
        int c = in.nextInt();
        apple.setCpu(c);

        System.out.print("Name: ");
        String n = in.next();
        apple.setName(n);

        System.out.println();

        //apple.setMemory(100);     //назначение значения для Memory

        apple.getMemory();
        apple.getCpu();
        apple.getName();

    }
}
