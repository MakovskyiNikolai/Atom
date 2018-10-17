import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        String age = scanner.nextLine();
        switch (age){
            case "ноль" :
                System.out.println("ты родился");
                break;
            case "семь" :
                System.out.println("ты пошел в школу");
                break;
            case "восемьнадцать" :
                System.out.println("ты закончил школу");
                break;
            default:
                System.out.println("ни одно из пред усл не подошло");
        }

    }
}




// ----используется в том случае, когда есть много условий которые мы должны перебрать
//if(age==10){
//            System.out.println("ты учишься в школе");
//        } else if(age==18){
//            System.out.println("ты закочил школу");

//public class Switch {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите возраст");
//        int age = scanner.nextInt();
//        switch (age){
//            case 0 :
//                System.out.println("ты родился");
//                break;
//            case 7 :
//                System.out.println("ты пошел в школу");
//                break;
//            case 18 :
//                System.out.println("ты закончил школу");
//                break;
//            default:
//                System.out.println("ни одно из пред усл не подошло");
//        }
//
//    }
//}