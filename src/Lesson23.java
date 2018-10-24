public class Lesson23 {
    public static void main(String[] args) {
        System.out.printf("String %.2f \n",45.322663);
        System.out.printf("String %.2f \n",45.32);
        System.out.printf("String %.2f \n",45.3372536345);
         }
}


/*
System.out.println  - с переносом на новую строку
System.out.print  - без переноса на новую строку
System.out.printf - метод для форматирования строки
System.out.printf("String %10d", 1440);   //%s - туда куда должна попасть пеерменнная типа string
%s  - буквы
%d - цифры
System.out.printf("This is a string, %d", 10);   -- This is a string, 10
System.out.printf("String %10d", 1440);  - ШИРИНА В 10 СИМВОЛОВ       String       1440
\n - перенос строки на сделующую линию

public class Lesson23 {
    public static void main(String[] args) {
        System.out.printf("String %10d \n",532);
        System.out.printf("String %10d \n",5);
        System.out.printf("String %10d \n",100000);
        System.out.printf("String %10d \n",1000000000);
    }
}
String        532
String          5
String     100000
String 1000000000

public class Lesson23 {
    public static void main(String[] args) {
        System.out.printf("String %d \n",532);
        System.out.printf("String %d \n",5);
        System.out.printf("String %d \n",100000);
        System.out.printf("String %d \n",1000000000);
    }
}
String 532
String 5
String 100000
String 1000000000

числа в итоге справа стоят
public class Lesson23 {
    public static void main(String[] args) {
        System.out.printf("String %-10d \n",532);
        System.out.printf("String %-10d \n",5);
        System.out.printf("String %-10d \n",100000);
        System.out.printf("String %-10d \n",1000000000);
    }
}
String 532
String 5
String 100000
String 1000000000

чтоб после запятой было только 2 числа, форматирует и округляет
%.2f
public class Lesson23 {
    public static void main(String[] args) {
        System.out.printf("String %.2f \n",45.322663);
        System.out.printf("String %.2f \n",45.32);
        System.out.printf("String %.2f \n",45.3372536345);
         }
}
String 45.32
String 45.32
String 45.34
 */




/*

1
public class Lesson23 {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = " my";
        String string3 = " friend";
        String stringAll = string1+string2+string3;
        System.out.println(stringAll);
*/

/*
2
public class Lesson23 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString()); //- метод to string у класса string bulder/ -
        sb.append(" my");    //мы можем не зоздавая новых обьктов к этому обьекту stringbulder конкатинировать сколько угодно строкб для этого нужно вызвать на обьекте класса string builder метод append и в паарметрах этого емтода мы пишем строку которую мы хотим конкатинирвоать уже к имеющейся
        sb.append(" friend");
        System.out.println(sb.toString());
    }
}
 */
/*
3
если много мужно прибавлять слов, конкатинировать, и скорость стражать не будет,
то использовать STRINGBUILDER
public class Lesson23 {
    public static void main(String[] args) {
     StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my");
        sb.append(" friend");
        System.out.println(sb.toString());
    }
}
 */
/*

4
сократить код можно
public class Lesson23 {
    public static void main(String[] args) {
     StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" friend");
        System.out.println(sb.toString());
    }
}
 */









/*в Java существует 2 типа обьектов
 mutable - изменяемые
 immutable - неизменяемые

тип данных String - immutable - неизменяемый
обьекты класса StringBuilder - mutable ------------------------------------------------------------


мы вызвали метод toUpperCase на обьекте класса String Hello, и этот метод вернул новую строку,
котору мы поместили в переменную на место этого обьекта.
теперь на этот обьетк класса String на слове Hello никакая пеерменная не ссылается,
теперь эту переменую мы мсослали на новый обькт класса Stringб которая возвратила
метод to UpperCase.


 */