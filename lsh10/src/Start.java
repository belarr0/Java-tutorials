import java.util.Locale;

public class Start {

    public static void main (String[] args){
        String str1 = new String("World");
        String[] str2 = {"Hello", "World", "people"};
        //String str2 = "world";
        //String str3 = str1 + str2;
        //String str3 = str2.substring(0, 3);   //выбирает от нулевого до второго символа (индекса)
        //String str3 = str2.toUpperCase();   //делает все буквы заглавными
        //int str3 = str2.length();   //считает количество символов в строке

        //System.out.println(str1.equals(str2));  //equals сравнивает значение стоки str1 и str2
        //System.out.println(str1.equalsIgnoreCase(str2));    //тоже самое сравнение с игнорированием заглавных и маленьких символов
        //System.out.println(str2[2]);    //выбор елемента массива
        System.out.println(args[0] + " " + args[1]);
    }
}
