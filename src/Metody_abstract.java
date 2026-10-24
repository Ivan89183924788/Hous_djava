//abstract class Animal{
//    private String name;
//
//    public Animal(String name){
//        this.name=name;
//    }
//    public abstract void makeSound();
//
//    public void intrduse(){
//        System.out.println("Я - "+name);
//    }
//}
//
//class Dog extends Animal{
//    public Dog(String name){
//        super(name);
//    }
//    @Override
//    public void makeSound(){
//        System.out.println("Гав-гав");
//    }
//}
//
//class Cat extends Animal{
//    public Cat(String name){
//        super(name);
//    }
//    @Override
//    public void makeSound(){
//        System.out.println("Мяу-мяу!");
//    }
//}
//
//class Parrot extends Animal{
//    public Parrot(String name){
//        super(name);
//    }
//    @Override
//    public void makeSound(){
//        System.out.println("Привет!");
//    }
//}
//
//
//public class Metody_abstract {
//    public static void main(String[] args){
//        Animal dog=new Dog("Жук");
//        Animal cat=new Cat("Гоблин");
//        Animal parrot=new Parrot("Кеша");
//
//        dog.intrduse();
//        dog.makeSound();
//        System.out.println();
//
//        cat.intrduse();
//        cat.makeSound();
//        System.out.println();
//
//        parrot.intrduse();
//        parrot.makeSound();
//    }
//}


//abstract class Vehicle{
//    protected String brand;
//    public Vehicle(String brand){
//        this.brand=brand;
//    }
//    public abstract void startEngine();
//    public abstract void stopEngine();
//    public abstract int getMaxSpeed();
//
//    public void describe(){
//        System.out.println(brand+" готов к поездке,макс.скорость: "+getMaxSpeed()+" км в час." );
//
//    }
//}
//
//class Car extends Vehicle{
//    public Car(String brand){
//        super(brand);
//    }
//
//    @Override
//    public void startEngine(){
//        System.out.println("Автомобиль завелся: р-р-р");
//    }
//    @Override
//    public void stopEngine(){
//        System.out.println("Автомобиль заглушен");
//    }
//    @Override
//    public int getMaxSpeed(){
//        return 200;
//    }
//}
//class ByCycle extends Vehicle{
//    public ByCycle(String brand){
//        super(brand);
//    }
//    @Override
//    public void startEngine(){
//        System.out.println("Велосипед: двигатель не требууется");
//    }
//    @Override
//    public void stopEngine(){
//        System.out.println("Велосипед остановился без двигателя");
//    }
//    @Override
//    public int getMaxSpeed(){
//        return 40;
//    }
//}
//class MotoCycle extends Vehicle{
//    public MotoCycle(String brand){
//        super(brand);
//    }
//    @Override
//    public void startEngine(){
//        System.out.println("Мотцикл завелся");
//    }
//    @Override
//    public void stopEngine(){
//        System.out.println("Мотоцикл остановился");
//    }
//    @Override
//    public int getMaxSpeed(){
//        return 280;
//    }
//}
//
//public class Metody_abstract {
//    public static void main(String[] args){
//        Vehicle car=new Car("Toyota");
//        Vehicle byCycle=new ByCycle("Byke");
//        Vehicle moto=new MotoCycle("Motocross");
//
//        car.startEngine();
//        car.describe();
//        car.stopEngine();
//        System.out.println();
//
//        byCycle.startEngine();
//        byCycle.describe();
//        byCycle.stopEngine();
//        System.out.println();
//
//        moto.startEngine();
//        moto.describe();
//        moto.stopEngine();
//    }
//}

//import org.w3c.dom.ls.LSOutput;
//
//abstract class Shape{
//    protected String name;
//    public Shape(String name){
//        this.name=name;
//    }
//
//    public abstract double area();
//
//    public void printInfo(){
//        System.out.println(name+ ",площадь: "+area());
//    }
//}
//
//class Rectangle extends Shape{
//    private double width;
//    private double height;
//
//    public Rectangle(String name,double width,double height){
//        super(name);
//        this.width=width;
//        this.height=height;
//
//    }
//    @Override
//    public double area(){
//        return width*height;
//    }
//}
//
//class Circle extends Shape{
//    private double radius;
//
//    public Circle(String name,double radius){
//        super(name);
//        this.radius=radius;
//    }
//    @Override
//    public double area(){
//        return Math.PI*radius;
//    }
//}
//
//class Triangle extends Shape{
//    private double a;
//    private double b;
//    private double c;
//
//    public Triangle(String name,double a,double b,double c){
//        super(name);
//        this.a=a;
//        this.b=b;
//        this.c=c;
//    }
//    @Override
//    public double area(){
//        double p=(a+b+c)/2.0;
//        double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
//        return area;
//    }
//}
//
//public class Metody_abstract {
//    public static void main(String[] args){
//        Shape rect=new Rectangle("Прямоугольник",4,5);
//        Shape circule=new Circle("Круг",44);
//        Shape triangle=new Triangle("Треугольник",4,5,3);
//
//        rect.printInfo();
//        circule.printInfo();
//        triangle.printInfo();
//    }
//}

//abstract class Cook{
//    protected String name;
//
//    public Cook(String name){
//        this.name=name;
//    }
//
//    public abstract void prepareDish();
//    public abstract void serveDish();
//
//    public void work(){
//        System.out.println(name +" приступил к работе.");
//        prepareDish();
//        serveDish();
//        System.out.println(name+ " завершил смену.\n");
//    }
//}
//
//abstract class BasicCook extends Cook{
//    public BasicCook(String name){
//        super(name);;
//    }
//    @Override
//    public void prepareDish(){
//        System.out.println("["+name+"]  Нарезал ингредиенты, приготовил блюдо.");
//    }
//}
//
//class Chef extends BasicCook{
//    public Chef(String name){
//        super(name);
//    }
//    @Override
//    public void serveDish(){
//        System.out.println("["+name+"] красиво оформил блюда.");
//    }
//}
//
//public class Metody_abstract {
//    public static void main(String[] args){
//        Cook chef1=new Chef("Анна");
//        Cook chef2=new Chef("Сергей");
//
//        chef1.work();
//        chef2.work();
//
//        System.out.println("Попытка создать BasicCook приведет к ошибке.");
//    }
//}