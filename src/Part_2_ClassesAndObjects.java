public class Part_2_ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Рома";
        person1.age = 50;
        Person person2 = new Person();
        person2.name = "Павел";
        person2.age = 20;
        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("Первому человеку до пенсии: "+year1+" лет");
        System.out.println("Второму человеку до пенсии: "+year2+" лет");

    }
}

class Person{
    String name;
    int age;

    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }

    void speak(){
        for(int i = 0; i<3; i++){
        System.out.println("Меня зовут "+ name +", мне "+age+" лет");}
    }
    void sayHello(){
        System.out.println("Привет!!!");
    }
}



//Метод - представиться человеку




//public class Part_2_ClassesAndObjects {
//    public static void main(String[] args) {
//        Person person1 = new Person();  //переменную
////тип данных PERSON, переменная person1 типа Person -- и мы эту переменную типа Person ссылаем на новый обьект класса Person
//        // у этой переменной может быть имя и возраст
//        person1.name = "Рома";
//        person1.age = 50;
//        System.out.println("Меня зовут "+person1.name +","+ "мне "+ person1.age+" лет");
//        Person person2 = new Person();
//        person2.name = "Павел";
//        person2.age = 20;
//        System.out.println("Меня зовут "+person2.name +","+ "мне "+ person2.age+" лет");
//    }
//}
////эти два человека созданы из класса Person, эти два человека являются обьектами класса Person;
//
//class Person{
//    String name;
//    int age;
//}
//
//
////class Person{
//// у класса могут быть
////1. Данные (поля класса) (у класса ЧЕЛОВЕК есть набор данных: возраст, вес, имя, цвет глаз )
////2. Методы класса (действия, которые он может совершать) (говорить, ходить, бугать)
//// }
//
////Публичный класс - это главный класс в джава файле. может быть только 1
////имя публ класса должно соотв имени джава файла
//
////Вспоиогательных классов может быть саолько угодно
//
//// Класс - это шаблон, это общее понятие
////Класс - это тип данных, который мы сами создали
////Пример:
////      Класс: человек (homo sapiens)
////       Обьект: человек Рома (ростю вес возраст)























