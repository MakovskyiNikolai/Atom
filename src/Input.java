import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("введите что-нибудь ");
        //String string = s.nextLine();
        int x = s.nextInt();
        System.out.println("вы ввели "+x);
    }
}
