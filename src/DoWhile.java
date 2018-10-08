import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int value;
       do{
           System.out.println("Введите 5");
           value = scanner.nextInt();
       } while(value!=5);

            System.out.println("Вы ввели 5");
    }

    }

//while - сначала проверяет усовия, а потом проверяет инструкции
//do while - сначала выполняет инструкции, а потом выполняет уловия
// - цикл do while гарантирует хотя бы однократное выполнение того, что написано в цикле

//System.out.println("Введите 5");
//            int value = scanner.nextInt();
//            while (value!=5) {
//                System.out.println("Введите 5");
//                value = scanner.nextInt();
//            }