//public class Class1 {
//    String name;
//    int age;
//
//    public Class1(String name,int age){
//        this.name=name;
//        this.age=age;
//    }
//
//    public void meow(){
//        System.out.println(name+" говорит: мяу! Мне "+age +" лет.");
//    }
//    public static void main(String[] args){
//        Class1 barsik=new Class1("Барсик",3);
//        Class1 murka=new Class1("Мурка",5);
//
//        barsik.meow();
//        murka.meow();
//    }
//}

//
//public class Class1 {
//    private static int total = 0;
//
//    public Class1() {
//        total++;
//        System.out.println("Создан обьект №" + total);
//    }
//
//    public static int getTotal(){
//        return total;
//    }
//    public static void main(String[] args){
//        new Class1();
//        new Class1();
//        new Class1();
//        new Class1();
//
//        System.out.println("Всего создано обьектов: "+Class1.getTotal());
//    }
//
//}
//
//abstract class Animal{
//    protected String name;
//
//    public Animal(String name){
//        this.name=name;
//    }
//
//    public abstract void makeSound();
//
//    public void info(){
//        System.out.println("Животное: "+ name);
//    }
//}
//
//class Dog extends Animal{
//    public Dog(String name){
//        super(name);
//    }
//    @Override
//    public void makeSound(){
//        System.out.println(name+ " гавкает:Гав-гав!");
//    }
//}
//
//class CatExt extends Animal{
//    public CatExt(String name){
//        super(name);
//    }
//    @Override
//    public void makeSound(){
//        System.out.println(name+" мяукает: Мяу!");
//    }
//}
//
//public class Class1 {
//    public static void main(String[] args){
//        Animal dog=new Dog("Бобик");
//        Animal cat=new CatExt("Пушок");
//
//        dog.info();
//        dog.makeSound();
//
//        cat.info();
//        cat.makeSound();
//    }
//}


//interface Flyable{
//    void fly();
//}
//
//class Bird implements Flyable{
//    private String name;
//
//    public Bird(String name){
//        this.name=name;
//    }
//
//    @Override
//    public void fly(){
//        System.out.println(name+" летит высоко-высоко!");
//    }
//}
//
//public class Class1 {
//    public static void main(String[] args){
//        Flyable bird=new Bird("Голубь");
//        bird.fly();
//    }
//}

//public class Class1 {
//    private int secret=42;
//
//    class Inner{
//        void showSecret(){
//            System.out.println("Секрет из Class1:"+ secret);
//        }
//    }
//    public void useInner(){
//        Inner inner=new Inner();
//        inner.showSecret();
//    }
//
//    public static void main(String[] args){
//        Class1 class1=new Class1();
//        class1.useInner();
//    }
//}

//public class Class1 {
//    static class StaticInner{
//        void sayHello(){
//            System.out.println("Привет, я статический класс.");
//        }
//    }
//    public static void main(String[] args){
//        Class1.StaticInner obj=new Class1.StaticInner();
//        obj.sayHello();
//    }
//}

