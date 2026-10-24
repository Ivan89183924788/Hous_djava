//class Base{
//    public final void greet(){
//        System.out.println("Привет из Base!");
//    }
//}
//
//class Derived extends Base{
////если раскоментировать эту строку ошибка компиляцииии
////    @Override
////    public void greet(){
////        System.out.println("Нельзя переопределять final метод");
////    }
//}
//
//public class Metody_final {
//    public static void main(String[] args){
//        Base b=new Derived();
//        b.greet();
//    }
//}



////23
//public class Metody_final {
//    public static void main(String[] args){
//        Calculator calc=new Calculator();
//        int sum=calc.add(34,56);
//        System.out.println("Сумма: "+sum);
//        int product=calc.multiply(32,77);
//        System.out.println("Произведение: "+product);
//    }
//}

//class Animal{
//    public void makeSound(){
//        System.out.println("Какой то звук");
//    }
//    //final нельзя переопределить,всегда будет одно и то же поведение
//    public final void sleep(){
//        System.out.println("Животное спит...");
//    }
//}
//
//class Dog extends Animal{
//    @Override
//    public void makeSound(){
//        System.out.println("Гав-гав!");
//    }
//    //Нельзя переопределить sleep() - ошибка компиляции,если попробовать
//
//}
//public class Metody_final {
//    public static void main(String[] args){
//        Animal a=new Dog();
//        a.makeSound();
//        a.sleep();
//    }
//}


////final - параметры нельзя(нельзя переназначить внутри метода)
//
//public class Metody_final {
//    public static void process(final int x,final String text){
//        //x=10 //Ошибка нельзя переназначить final-переменую
//        //text="new", Ошибка
//        System.out.println("x= "+x);
//        System.out.println("text= "+ text);
//    }
//    public static void main(String[] args){
//        process(45,"Привет");
//    }
//}



////24
//public class Metody_final {
//    public static void main(String[] args){
//        ImmunatablePoint p=new ImmunatablePoint(23,45);
//        System.out.println(p.describe());
//        System.out.println("X= "+p.getX());;
//        System.out.println("Y= "+p.getY());;
//    }
//}

//class Person{
//    String name;
//    Person(String name){
//        this.name=name;
//    }
//}
//
//public class Metody_final {
//    public static void reassingNormal(Person p){
//        System.out.println("[reassingNormal] до переназначения: p.name= " + p.name);
//        p=new Person("Другой человек");
//        System.out.println("[main] После переназначения: p.name="+ p.name);
//    }
//    public static void reassignFinal(final Person p){
//        System.out.println(" [reassignFinal] Внутри метода: p.name="+ p.name);
//        //p=new Person("Нельзя");
//        // Ошибка компиляции: нельзя присвоить новое значениe final ссылке
//    }
//
//    public static void main(String[] args){
//        Person original=new Person("Иван");
//        System.out.println("[main] до вызова: original.name=" +original.name);
//
//        reassingNormal(original);
//        System.out.println("[main] После reassingNormal: original.name="+original.name);
//        //Оригинал остался одним и тем же обьектом :Иван
//
//        reassignFinal(original);
//
//        System.out.println("[main] После reassignFinal:original.name="+original.name);
//    }
//}

////Можно менять поля обьекта даже при final параметре
//
//class Counter{
//    int value;
//    Counter(int value){
//        this.value=value;
//    }
//}
//public class Metody_final {
//    public static void modifyFields(final Counter c){
//        c.value=444;
//        System.out.println("[mofifyField] c.value= "+ c.value);
//    }
//
//    public static void main(String[] args){
//       Counter counter=new Counter(0);
//        System.out.println("[main] До:counter.value="+ counter.value);
//        modifyFields(counter);
//        System.out.println("[main] После: counter.value="+counter.value);
//    }
//}

//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Metody_final {
//    //final защащает от случайной ссылки на коллекцию
//    public static void processList(final List<String> list){
//        if(list==null || list.isEmpty()) {
//            //list=new ArrayList<>();//Нельзя final
//            System.out.println("[processList] Список пуст ли null нечего не делаем");
//            return;
//        }
//        list.add("Обработано");
//        list.add("Обработано");
//        list.add("Обработано");
//        System.out.println("[processList]Теперь список:"+list);
//    }
//    public static void main(String[] args){
//        List <String> data=new ArrayList<>();
//        data.add("Иван");
//        data.add("Иван");
//        data.add("Иван");
//        data.add("Иван");
//
//        System.out.println("[main] До: "+data);
//        processList(data);
//        System.out.println("[main] После: "+data);
//    }
//}

//public class Metody_final {
//    public static void demoLocalVars(){
//        int x=10;
//        x=20;
//        x=x+45;
//
//        String s="Привет";
//        s="Пока";//OK
//
//        System.out.println("X="+x);
//        System.out.println("s="+s);
//    }
//    public static void main (String[] args){
//        demoLocalVars();
//    }
//}
