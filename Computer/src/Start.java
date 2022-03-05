import java.util.Scanner;

public class Start {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        Computer windows = new Computer();

        //System.out.print("Memory: ");
        //int m = in.nextInt();
        windows.setMemory(1000);

        System.out.print("Cpu: ");
        int c = in.nextInt();
        windows.setCpu(c);

        System.out.print("Name: ");
        String n = in.next();
        windows.setName(n);

        windows.getMemory();
        windows.getCpu();
        windows.getName();
    }
}
