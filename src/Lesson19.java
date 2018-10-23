public class Lesson19 {
    public static void main(String[] args) {

        Human h1 = new Human("Bob",40);
        Human h2 = new Human("Tom",30);
        Human.description = "Nice";
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        Human h3 = new Human("Rob",50)
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();                         // мы обращаемся к статическим переменным класса через название класса.переменная, потому что статическая переменная одинаковая для всех обьектов.
        h3.printNumberOfPeople();

    }
}

class Human {
    private String name;
    private int age;

    private int countPeople;

    public static String description;                           //- статическа переменная description типа String  - она будт общей для всех обьектов класса Human

    public Human(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void printNumberOfPeople(){
        System.out.println("Number of people is "+countPeople);
    }

}



/*переменные и методы класса - они обозначаются ключевым словом static
статический метод может работать только со статическими переменными,
 но статический метод не можнт работать с переменными обьекта (у кадого они свои),
 а статич метод один на класс и общий на все обьекты.

 мы используем стат методы в том случае, если нам не нужно создавать обьект класса, для того чтобы восп этим методом

MAth - класс, который аккумулирует в себе все методы, которые связаны с математикой - коллеция статических методов


*/




////конструкторы это специальные методы, которые вызываются при создании нового обьекта
//// конструктор при вызове этого метода - конструирует обьект, т.е. он инициализирует поля обьектаб его аттирибуты
//
//
//public class Lesson19 {
//    public static void main(String[] args) {
//        Human human1 = new Human("Bob", 15);
//           }
//}
//
//class Human {         // если мы не создаем конструктор в классе сами, то он там лежит по умолчанию (путой контруктор)
//    private String name;   //предполагаемый конструктор инициализировал бы поля name и age
//    private int age;
//
//    public Human() {
//        System.out.println("Привет из первого конструктора");               // при создании класса HUMAN будет вызываться этот конструктор
//    }
//                                                                 //создадим свой конструктор, который будет принимать на ход имя и возраст
//    public Human(String name){
//        System.out.println("Привет из второго конструктора");
//        this.name = name;
//    }
//                                //конструктор, который будет сразу назвначать имя и возраст
//    public Human(String name, int age){
//        System.out.println("Привет из третьего конструктора");
//        this.name = name;
//        this.age = age;
//    }
//
//    public void setName(String name) {this.name = name;}
//    public void setAge(int age){this.age = age;}
//}




//class Human {
// public Human() {
//    }
//
//при создании обьекта выполняется конструктов, который ничего не выполняет, никаках присваиваний, никакой логики
//конструктор отличается от обычного метода тем, что у него нету возвращаемого значения
//имя конструктора всегда должно совпадать с именем класса


//Перегрузка методов - в одним классе в JAVA мы можем иметь несколько методов с одинковым назвванием
//до тех пор пока у них разные параметры,
//JAVA определяет какой метод вызывать, руководствуясь тем, какие мы параметры передаем, в момент вызова метода
// т.е. мы передаем паарметр строковый  - оно ызывает метод строковый
// а если пустые скобки - не передаем никаких параметров - то другой метод







//public class Lesson19  {
//    public static void main(String[] args) {
//        Human human1 = new Human();
//        human1.setAge(18);
//        human1.setName("Tom");
//        human1.getInfo();
//    }
//}
//class Human{
//    String name;
//    int age;
//
//    public void setName(String name){  //в параметрах имя переменной может быть любое
//        this.name = name;                  //SCOPE - область видения пеерменной. в пределаах своих фигурных скобок
//    }
//    public void setAge(int аge){
//        this.age = аge;                    //теперь эта переменная относиться только к параметрам метода
//    }
//    public String getName(){
//        return name;
//    }
//    public int getAge(){
//        return age;
//    }
//    public void getInfo(){
//        System.out.println(name+","+age);
//    }
//}
//
//
////чтобы отличить пеерменую класса/обьекта от переменной метода  - this
//// чтобы внутри метода в классе обратиться к пеерменным класса нужно написать this.имя аттрибута класса,имя поля, к которому мы хотим обратиться.
//// this - вызывает обьетк внутри класса
//
////поле/аттрибут - синонимы
//
////this нужен, чтобы присваивать полю/аттрибуту класса значения переменной, поступившей в параметры метода



