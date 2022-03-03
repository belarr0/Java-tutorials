import java.io.IOException;
import java.util.Scanner;

public class start {

    public static void main (String[] args) throws IOException {

        /*
        char ch, answer = 'S';
        System.out.println("Какую букву я загадал ? "); //продолжает текст со следующей строки
        System.out.print("Попытайтесь её угадать: ");   //продолжает текст с этой строки

        ch = (char)System.in.read();

        if (ch == answer) {
            System.out.println("Поздравляю, ты угадал");
        }else if(ch > answer){
            System.out.println("Перестарался ;)");
        }else{
            System.out.println("Не угадал");
        }
         */

        int month;

        System.out.print("Введите номер месяца: ");

        Scanner in = new Scanner(System.in);
        month = in.nextInt();

        String monthString;

        switch (month) {
            case 1:
                monthString = "Январь";
                break;
            case 2:
                monthString = "Февраль";
                break;
            case 3:
                monthString = "Март";
                break;
            case 4:
                monthString = "Апрель";
                break;
            case 5:
                monthString = "Май";
                break;
            case 6:
                monthString = "Июнь";
                break;
            case 7:
                monthString = "Июль";
                break;
            case 8:
                monthString = "Август";
                break;
            case 9:
                monthString = "Сентябрь";
                break;
            case 10:
                monthString = "Октябрь";
                break;
            case 11:
                monthString = "Ноябрь";
                break;
            case 12:
                monthString = "Декабрь";
                break;
            default: monthString = "Ошибка";
            break;
        }

        System.out.printf("Ваш месяц: %s", monthString);
    }

}
