public class Break_Continue {
    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++) {
            if (i%2==0) {
                continue;
            }
            System.out.println("это нечетное число "+i);
        }
    }
}



        //break - используется доля немедленного выхода их цикла
    //break внутри цикла - немедленно его обрывает обрывает

//        int i = 0;
//        while(true){
//            if(i==15){
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("мы вышли из цикла");
//    }
//}