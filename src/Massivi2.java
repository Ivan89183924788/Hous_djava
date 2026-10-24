import java.util.*;

//class Person{
//    private String name;
//
//    public Person(String name){
//        this.name=name;
//    }
//    @Override
//    public String toString(){
//        return "Person name='" + name+ "'";
//    }
//}
//
//public class Massivi2 {
//    public static void main(String[] args){
//        Person[] person={
//                new Person("Alice"),
//                new Person("Sergey"),
//                new Person("Kirril"),
//                new Person("Alena"),
//                new Person("Marina")
//        };
//        System.out.println(Arrays.toString(person));
//    }
//}


//public class Massivi2 {
//    public static void main(String[] args){
//        String[] fruits={"Яблоко","Банан","Апельсин","Киви"};
//
//        System.out.println("=== Массив строк (обычный цикл) ===");
//        for (int i=1;i< fruits.length;i++){
//            System.out.println(i + ". " + fruits[i]);
//        }
//
//        System.out.println("=== Массив строк (foreach) ===");
//        int index=1;
//        for (String fruit:fruits){
//            System.out.println(index++ + ". " + fruit);
//        }
//    }
//}

//public class Massivi2 {
//    public static void main(String[] args){
//        List<String> colors=new ArrayList<>();
//        colors.add("Зеленый");
//        colors.add("Оражевый");
//        colors.add("Красный");
//        colors.add("Фиолетовый");
//        colors.add("Синий");
//        colors.add("Голубой");
//
//        colors.add(1,"Розовый");
//
//        System.out.println("=== Список цветов ===");
//        System.out.println("Размер: " + colors.size());
//        System.out.println("Элемент по индексу: " + colors.get(4));
//
//        System.out.println("\nВсе элементы: ");
//        for (String color:colors){
//            System.out.println("- " + color);
//        }
//
//        colors.remove("Зеленый");
//        colors.remove(4);
//        System.out.println("\nПосле удаления 'зеленый '"+colors);
//    }
//}
//
//class Person{
//    private String name;
//    private int  age;
//
//    public Person(String name,int age){
//        this.name=name;
//        this.age=age;
//    }
//    @Override
//    public String toString(){
//        return "Person (name='"+ name +"',age="+ age +")";
//    }
//
//}
//public class Massivi2 {
//    public static void main(String[] args){
//        Person[] person={
//            new Person("Roma",23),
//            new Person("Alica",22),
//            new Person("Irina",21),
//            new Person("Katya",20),
//            new Person("Vica",19),
//            new Person("Galina",18),
//        };
//        System.out.println("=== Массив обьектов Person === ");
//        for(Person p:person){
//            System.out.println(p);
//        }
//    }
//}

//class Product{
//    private String name;
//    private double price;
//
//    public Product(String name,double price){
//        this.name=name;
//        this.price=price;
//    }
//    public double getPrice(){return price;}
//    public String getName(){return name;}
//
//    @Override
//    public String toString(){
//        return name + " (" +price+ " руб.)";
//    }
//}
//
//public class Massivi2 {
//    public static void main(String[] args){
//        List<Product> products=new ArrayList<>();
//        products.add(new Product("Хлеб",123));
//        products.add(new Product("Масло",244));
//        products.add(new Product("Помидоры",300));
//        products.add(new Product("Рис",140));
//        products.add(new Product("Лапша",200));
//        products.add(new Product("Батон",69));
//        products.add(new Product("Мороженное",150));
//
//        System.out.println("=== Все товары ===");
//        for (Product p:products){
//            System.out.println(p);
//        }
//
//        System.out.println("=== Все товары дешевле 150 ===");
//        for (Product p:products){
//            if (p.getPrice()<150){
//                System.out.println(p.getName() + " - " + p.getPrice());
//            }
//
//        }
//    }
//}

//
//public class Massivi2 {
//    public static void main(String[] args){
//        String[] arr={"один","два","три"};
//
//        List<String> listNew=Arrays.asList(arr);
//        System.out.println("Array.asLIst(arr): " +listNew);
//        List<String> mutantList=new ArrayList<>(Arrays.asList(arr));
//        mutantList.add("четыре");
//        mutantList.add("пять");
//        System.out.println("Изменяемый массив: " + mutantList);
//
//        String[] backToArray=mutantList.toArray(new String[0]);
//        System.out.println("Обратно в массив: " + Arrays.toString(backToArray));
//    }
//}

//class Student{
//    String name;
//    int ocenka;
//
//    Student(String name,int ocenka){
//        this.name=name;
//        this.ocenka=ocenka;
//    }
//    @Override
//    public String toString(){
//        return name + " (оценка: " + ocenka + ")";
//    }
//}
//
//public class Massivi2 {
//    public static void main(String[] args){
//        List<Student> students=new ArrayList<>();
//        students.add(new Student("Andrey",3));
//        students.add(new Student("Alexey",4));
//        students.add(new Student("Victor",5));
//        students.add(new Student("Anna",5));
//        students.add(new Student("Olesya",4));
//
//        System.out.println("До сортировки:" + students);
//
//        Collections.sort(students, Comparator.comparing(s->s.ocenka));
//        System.out.println("По оценке: " + students);
//
//        Collections.sort(students, Comparator.comparing(s->s.name));
//        System.out.println("По имени: " + students);
//    }
//}

//public class Massivi2{
//    public static void main(String[] args){
//        List<String> fruits=new ArrayList<>();
//        fruits.add("Яблоко");
//        fruits.add("Груша");
//        fruits.add("Апельсин");
//        fruits.add("Банан");
//        fruits.add("Киви");
//        fruits.add("Слива");
//
//        System.out.println("=== Начальный список ===");
//        System.out.println(fruits);
//
//        fruits.add(1,"Арахис");
//        System.out.println("После вставки на позицию: " + fruits);
//
//        fruits.remove("Банан");
//        fruits.remove(3);
//        System.out.println("После удаления по названию и позиции:" + fruits);
//
//        Collections.sort(fruits);
//        System.out.println("После сортировки: " + fruits);
//
//        StringBuilder sb=new StringBuilder();
//        for(int i=0;i<fruits.size();i++){
//            sb.append(fruits.get(i));
//            if(i<fruits.size()-1){
//                sb.append(", ");
//            }
//        }
//        System.out.println("Обьедененная строка: " + sb);
//    }
//}

//public class Massivi2 {
//    public static void main(String[] args){
//        String[] cities={"Москва","Екатеринбург","Казань","Санкт-Петербург","Краснодар"};
//        for (int i=0;i< cities.length;i++){
//            System.out.println(i + ":" + cities[i]);
//        }
//        boolean hasKazan=false;
//        for(String city:cities){
//            if(city.equals("Казань")){
//                hasKazan=true;
//                break;
//            }
//        }
//        System.out.println("\nЕсть ли казань? " + hasKazan);
//
//        int indexEkaterinburg=-1;
//        for (int i=0;i< cities.length;i++){
//            if(cities[i].equals("Екатеринбург")){
//                indexEkaterinburg=i;
//                break;
//            }
//        }
//        System.out.println("Индекс Екатеринбурга:" + indexEkaterinburg);
//
//        if(indexEkaterinburg!=-1){
//            cities[indexEkaterinburg]="Екб";
//        }
//        System.out.println("После замены Екатеринбурга: " + Arrays.toString(cities));
//
//        System.out.println("Города больше длиной 7 букв");
//        for (String city:cities){
//            if(city.length()>7){
//                System.out.println("- " + city);
//            }
//        }
//    }
//}

//class Employee{
//    String name;
//    int age;
//    double salary;
//
//    Employee(String name,int age,double salary){
//        this.name=name;
//        this.age=age;
//        this.salary=salary;
//    }
//    @Override
//    public String toString(){
//        return name + " (возраст: " + age + " ,зарплата: "+ salary + ")";
//    }
////}
//
//public class Massivi2 {
//    public static void main(String[] args){
//        Employee[] staff={
//                new Employee("Борис",34,34044.44),
//                new Employee("Алексей",32,133340.44),
//                new Employee("Иван",24,233340.44),
//                new Employee("Константин",44,40333.44),
//                new Employee("Виктор",54,333340.44),
//                new Employee("Галина",26,44430.44),
//        };
//        System.out.println("=== Все сотрудники");
//        for(Employee p:staff){
//            System.out.println(p);
//        }
//        Employee found=null;
//        for(Employee e:staff){
//            if(e.equals("Борис")){
//                found=e;
//                break;
//            }
//        }
//        System.out.println("\nНайден Борис?"+(found!=null?found:"не найден"));
//
//        System.out.println("Сотрудники с зарплатой более 100000");
//        for(Employee e:staff){
//            if(e.salary>100000){
//                System.out.println("- " + e);
//            }
//        }
//        double sumSalary=0;
//        for(Employee e:staff){
//            sumSalary+= e.salary;
//        }
//        double sredSalary=sumSalary/staff.length;
//        System.out.printf("Средняя зарплата: %.2f%n",sredSalary);
//    }
//}

//
//class Book{
//    String title;
//    String author;
//    int year;
//
//    Book(String title,String author,int year){
//        this.title=title;
//        this.author=author;
//        this.year=year;
//    }
//    @Override
//    public String toString(){
//        return "\""+title+"\" ("+author+", " + year+ ")";
//    }
//}
//
//public class Massivi2 {
//    public static void main(String[] args){
//        List<Book> libraty=new ArrayList<>();
//        libraty.add(new Book("Война и мир","Толстой",1869));
//        libraty.add(new Book("Преступление и наказание","Достоевский",1866));
//        libraty.add(new Book("Мастер и Маргарита","Булгаков",1967));
//        libraty.add(new Book("1984","Оруэлл",1949));
//
//        System.out.println("=== Библиотека ===");
//        libraty.sort(Comparator.comparingInt(b->b.year));
//        System.out.println("\nПо году издания: ");
//        libraty.forEach(System.out::println);
//
//        libraty.sort(Comparator.comparing(b->b.author));
//        System.out.println("\nПо автору: ");
//        libraty.forEach(System.out::println);
//
//        libraty.sort(Comparator.comparing(b->b.title));
//        System.out.println("\nПо названию");
//        libraty.forEach(System.out::println);
//
//        libraty.removeIf(b->b.year<1900);
//        System.out.println("\nПосле удаления книг до 1900 года: ");
//        libraty.forEach(System.out::println);
//    }
//}

//class Order{
//    String customer;
//    double amount;
//
//    Order(String customer,double amount){
//        this.customer=customer;
//        this.amount=amount;
//    }
//    @Override
//    public String toString(){
//        return customer + ":" + amount;
//    }
//}

//public  class Massivi2 {
//    public static void main(String[] args){
//        List<Order> orders=new ArrayList<>();
//        orders.add(new Order("Alice",2400));
//        orders.add(new Order("Vctor",5400));
//        orders.add(new Order("Andrey",6700));
//        orders.add(new Order("Genadiy",8900));
//        orders.add(new Order("Katya",2900));
//
//        System.out.println("=== Заказы ===");
//        orders.forEach(System.out::println);
//
//        double total=0;
//        for(Order p:orders){
//            total+=p.amount;
//        }
//        System.out.printf("Общая сумма покупок: %.2f%n",total);
//
//        double max=Double.MIN_VALUE;
//        double min=Double.MAX_VALUE;
//        Order minOrder=null;
//        Order maxOrder=null;
//
//        for(Order o:orders){
//            if (o.amount<min){
//                min=o.amount;
//                minOrder=o;
//            }
//            if(o.amount>max){
//                max=o.amount;
//                maxOrder=o;
//            }
//        }
//        System.out.printf("Минимальный заказ: %s(%.2f)%n",minOrder.customer,min);
//        System.out.printf("Максиальный заказ: %s(%.2f)%n",maxOrder.customer,max);
//
//        double sred=total/orders.size();
//        System.out.printf("Средний чек: (%.2f)%n",sred);
//
//    }
//}


//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//class Person {
//    String name;
//    int age;
//    Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//    @Override
//    public String toString() {
//        return name + " (" + age + ")";
//    }
//}
//
//public class Massivi2 {
//    public static void main(String[] args) {
//        // Массив
//        Person[] arrayPeople = {
//                new Person("Alice", 25),
//                new Person("Bob", 30)
//        };
//        System.out.println("Массив: " + Arrays.toString(arrayPeople));
//
//        // Список: пустой + add
//        List<Person> listPeople = new ArrayList<>();
//        listPeople.add(new Person("Charlie", 28));
//        listPeople.add(new Person("Diana", 32));
//
//        // Список: из массива
//        List<Person> fromArray = new ArrayList<>(Arrays.asList(arrayPeople));
//        fromArray.add(new Person("Eve", 27));
//
//        System.out.println("Список (add): " + listPeople);
//        System.out.println("Список (из массива): " + fromArray);
//    }
//}

