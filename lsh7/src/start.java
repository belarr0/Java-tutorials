import java.io.IOException; //System.in.read();

public class start {

    public static void main (String[] args){

        /*
    for (int i = 0; i < 5;i++){
        System.out.println("Итерация = " + i);
    }
     */

        int count =0;

        /*
        while (count < 10){
            System.out.println(count);
            count++;
            }
         */

        /*
        do {
            System.out.println(count);
            count++;
        }while (count < 10);
         */

        while (count < 10){
            count++;
            if ((count%2) != 0) continue;   //continue - возвращает в начало цикла. Также существует 'break' он прекращает цикл.
                System.out.println(count);
        }
    }
}
