public class Arrays {
    public static void main(String[] args) {
        int number = 10;                    //примитивный тип данных
        int[]numbers = new int[5];          //numbers -->[массив]     // создаем целочисленный массив//пеерменную numbers ссылаем на новый обькт класса массив, который имеет размер 5
        for (int i = 0; i<numbers.length; i++){
            numbers[i] = i*10;
        }
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();
         int[] numbers1 = {1,2,3};                        //можно приинициз таким образом
         for(int i = 0; i<numbers1.length; i++){
             System.out.println(numbers1[i]);
         }
    }
}






//  в JAVA существует 2 типа данных
 //   ПРИМИТИВНЫЕ
//ССЫЛОЧНЫЕ


//public class Arrays {
//    public static void main(String[] args) {
//        int number = 10; //примитивный тип данных
//        //char character = 'a'; //примитивный тип данных
//        //String s = "Hello"; //ссылочный тип данных///Класс String (множество строк), s - имя переменной, "Hello" - обьект класса String
//       // String s1 = new String("Hello1"); //ссылочный тип данных///
//    }
//}



// System.out.println(numbers[0]);  //0,1,2,3,4
//        System.out.println(numbers[4]);

//можно проинициализировть значения массива построчно
      //  numbers[0] = 10;
      //  numbers[1] = 20;