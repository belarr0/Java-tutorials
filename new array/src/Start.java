import java.util.Scanner;

public class Start {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        int q, nums;

        System.out.print("Розмір масиву: ");
        q = in.nextInt();
        int [] arr = new int[q];

        for (int i = 0; i < q; i++){
            System.out.print(i + 1 + ": ");
            nums = in.nextInt();
            arr[i] = nums;
        }
    }
}
