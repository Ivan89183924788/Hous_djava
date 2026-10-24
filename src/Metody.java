//public class Metody {
//    public static int sum(int a,int b){
//        return a+b;
//    }
//    public static void main(String[] args){
//        int result=sum(5,7);
//        System.out.println("Сумма: "+ result);
//
//    }
//}

//public class Metody{
//    public static void printGreeting(String name){
//        System.out.println("Привет,"+name+"!");
//    }
//    public static void main(String[] args){
//        printGreeting("Анна");
//        printGreeting("Борис");
//    }
//}

//public class Metody {
//    public static String makeReport(String item,int count){
//        return "Товар: "+item+",количество "+ count+".";
//    }
//    public static void main(String[] args){
//        String report=makeReport("Яблоко",4);
//        System.out.println(report);
//        System.out.println(makeReport("Банан",6));
//    }
//}


//public class Metody {
//    private String name;
//    private int age;
//
//    public Metody(String name,int age){
//        this.name=name;
//        this.age=age;
//    }
//    public void selebrateBirthday(){
//        age++;
//        System.out.println(name+" празднует день рождения!Теперь ему "+age+" лет.");
//    }
//
//    public int getAge() {
//        return age;
//    }
//    public static void main(String[] args){
//        Metody s=new Metody("Иван",23);
//        System.out.println("Возраст до дня рождения: "+ s.getAge());
//        s.selebrateBirthday();
//        System.out.println("Возраст Ивана(после):" +s.getAge());
//    }
//}

//public class Metody {
//    public static boolean isAdult(int age){
//        return age>=18;
//    }
//    public static void main(String[] args){
//        int age1=17;
//        int age2=23;
//        System.out.println("Возраст "+age1+"-совершеннолетний "+isAdult(age1));
//        System.out.println("Возраст "+age2+"-совершеннолетний "+isAdult(age2));
//
//        if(isAdult(age1)){
//            System.out.println("Можно голосовать!");
//        }
//        else {
//            System.out.println("Нельзя голосовать!");
//        }
//    }
//}

//public class Metody {
//    public static double divide(double a,double b){
//        if (b==0){
//            System.out.println("Делить на 0 нельзя!");
//            return Double.NaN;
//        }
//        return a/b;
//    }
//
//    public static void main(String[] args){
//        double r1=divide(12,4);
//        double r2=divide(123,0);
//
//        System.out.println("Результат 1: "+r1);
//        System.out.println("Результат 2: "+r2);
//    }
//}

//public class Metody {
//    public static void sayHi(){
//        System.out.println("[sayHi] Привет!");
//    }
//
//    public static int sum(int a,int b){
//        System.out.println("  [sum] Считаем : " +a+ "+"+b);
//        return a+b;
//    }
//
//    public static double sum(double a,double b){
//        System.out.println("  [sum(double)] Считаем: "+ a+ "+" +b);
//        return a+b;
//    }
//
//    public static void main(String[] args){
//        sayHi();
//        int r1=sum(23,55);
//        System.out.println("[main] sum(int,int)= "+r1);
//
//        double r2=sum(23.433,55.442);
//        System.out.println("[main] sum(int,int)= "+r2);
//    }
//}

//class Counter{
//    public int getValue() {
//        return value;
//    }
//
//    private int value=0;
//
//    public void increment(){
//        value++;
//        System.out.println(" [increment] Новое значение: "+ value);
//    }
//
//    public static String format(int v){
//        return "Значение: "+v;
//    }
//}
//
//public class Metody {
//    public static void main(String[] args){
//        Counter c1=new Counter();
//        c1.increment();
//        c1.increment();
//
//        String s=Counter.format(c1.getValue());
//        System.out.println("[main] "+s);
//    }
//}

//public class Metody {
//    public static int divide(int a, int b) throws ArithmeticException{
//        if(b==0){
//            throw new ArithmeticException("Деление на ноль!");
//        }
//        System.out.println(" [divide] "+a + "/"+ b+"="+(a/b));
//        return a/b;
//    }
//
//    public static void main(String[] args){
//        try{
//            int r1=divide(234,3);
//            System.out.println("[main] Результат: "+ r1);
//            int r2=divide(234,0);
//            System.out.println("[main] Этот не выполнится ");
//        } catch (ArithmeticException e) {
//            System.out.println("[main] Поймали ошибку: "+ e.getMessage());
//        }
//
//    }
//}
//
//public class Metody {
//    public static int sumAll(int...nums){
//        int total=0;
//        System.out.println(" [sumAll] Складываем: ");
//        for(int n:nums){
//            total+=n;
//            System.out.println(n+" ");
//        }
//        System.out.println();
//        return total;
//    }
//
//    public static void main(String[] args){
//        int s1=sumAll(1,2,3,4,5);
//        int s2=sumAll(44,66,3322);
//        int s3=sumAll(54,66,457,786);
//        System.out.println("[main] s1="+s1+ ",s2="+s2+ ",s3="+s3);
//    }
//}

//
//import java.util.Locale;
//
//public class Metody {
//    public static void main(String[] args){
//        String email="Superadmin@mail.ru";
//
//        System.out.println(" [toLowerCase] "+email.toLowerCase());
//        System.out.println(" [toApperCase] "+email.toUpperCase());
//        System.out.println("[contains] Содержит 'admin' ? "+email.toLowerCase().contains("admin"));
//        System.out.println("[startwith] начинается с 'super' ? "+email.startsWith("Super"));
//        System.out.println("[endwith] аканчивается с 'ru' ? "+email.endsWith("ru"));
//        System.out.println("[substring] часть строки: "+ email.substring(0,9));
//        System.out.println("[replace] заменим на '@' на '_': " +email.replace('@','_'));
//    }
//}


//import java.util.*;
//
//public class Metody {
//    public static void main(String[] args){
//        List<String> roles=new ArrayList<>();
//        roles.add("Admin");
//        roles.add("Superadmin");
//        roles.add("User");
//        roles.add("Friend");
//        roles.add("Brather");
//
//        System.out.println(" [List] roles:"+ roles);
//        System.out.println("[List] contains 'admin' ? "+ roles.contains("Admin"));
//        System.out.println("[List] index of 'user': "+roles.indexOf("User"));
//
//        Set<String> uniqueRoles=new HashSet<>(roles);
//        uniqueRoles.add("Admin");
//        uniqueRoles.add("wwAdmin");
//        System.out.println(" [set] uniqueRoles: "+uniqueRoles);
//
//        Map<String,Integer> roleCounts=new HashMap<>();
//        roleCounts.put("Admin",10);
//        roleCounts.put("User",5);
//        System.out.println(" [Map] roleCounts: "+ roleCounts);
//        System.out.println("[Map] get 'admin': "+ roleCounts.get("Admin"));

//    }
//}

//import java.util.*;
//import java.util.stream.*;
//
//public class Metody {
//    public static void main(String[] args){
//        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
//
//        List<Integer> even=numbers.stream()
//                .filter(n->n%2==0)
//                .collect(Collectors.toList());
//
//        Optional<Integer> max=numbers.stream().max(Integer::compareTo);
//
//        long count=numbers.stream().filter(n->n>3).count();
//
//        System.out.println("[Stream] четные:" +even);
//        System.out.println("[Stream] максимум: "+max.orElse(-1));
//        System.out.println("[Stream] чисел>3: "+count);
//
//    }
//}

//public class Metody {
//    public static void main(String[] args){
//        System.out.println("[Math] max(34,56)="+Math.max(34,56));
//        System.out.println("[Math] min(34,56)="+Math.min(34,56));
//        System.out.println("[Math] pow(34,56)="+Math.pow(3,8));
//        System.out.println("[Math] sqrt(56)="+Math.sqrt(56));
//        int count=5;
//        for (int i=0;i<count;i++){
//            int rand=(int)(Math.random()*100);
//            System.out.println(rand+" ");
//        }
//        System.out.println();
//
//    }
//}
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
//
//public class Metody {
//    public static void main(String[] args){
//        LocalDateTime now=LocalDateTime.now();
//        LocalDate today=LocalDate.now();
//        LocalTime time=LocalTime.now();
//
//        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//        String formatted=now.format(formatter);
//
//        LocalDateTime future=now.plusDays(7);
//
//        System.out.println("[LocalDateTime] сейчас: "+now);
//        System.out.println("LocalDate] сегодня: "+today);
//        System.out.println("[LocalTime] время: "+ time);
//        System.out.println("[format] отформатированно: "+formatted);
//        System.out.println("[plusDays] через 7 дней: "+future);
//    }
//}
//
//import java.util.Scanner;
//
//public class Metody {
//    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("[input] Введите имя: ");
//        String name=scanner.nextLine();
//
//        System.out.println("[input] Введите возраст: ");
//        int age=scanner.nextInt();
//
//        System.out.println(" [read] Имя: "+ name + ",возраст: "+age);
//        scanner.close();
//
//    }
//}

//public class Metody {
//    public static boolean isValidEmail(String email){
//        System.out.println("[isValidEmail] Проверяем: "+email);
//        if(email==null || email.isEmpty()){
//            return false;
//        }
//        int atIndex=email.indexOf('@');
//        int dotIndex=email.lastIndexOf('.');
//        boolean hasAt=atIndex>0;
//        boolean hasDot=dotIndex>atIndex+1 && dotIndex<email.length()-1;
//        return hasAt && hasDot;
//    }
//
//    public static void main(String[] args){
//        String[] emails={"superadmin@mail.ru","bad-email",null,"user@favorit"};
//        for(String s:emails){
//            boolean ok=isValidEmail(s);
//            System.out.println("[main] email='"+s+"'-> valid? "+ok);
//        }
//    }
//}

//import java.util.Locale;
//
//public class Metody {
//    public static String normalizeRole(String role){
//        System.out.println(" [normalizedRole] Входная роль: '"+role+ "'");
//        if(role==null){
//            return null;
//        }
//        String normalized=role.trim().toLowerCase();
//        System.out.println("[normalizedRole] Нормализованная: '"+ normalized+"'");
//        return normalized;
//    }
//    public static boolean isAllowedRole(String role){
//        String norm=normalizeRole(role);
//        return "admin".equals (norm) || "superadmin".equals(norm) || "user".equals(norm);
//    }
//    public static void main(String[] args){
//        String[] roles={"Admin","SUPERADMIN","invalid",null};
//        for(String s:roles){
//            System.out.println("[main] role='"+s+"'-> allowed "+isAllowedRole(s));
//        }
//    }
//}

import java.util.Locale;
import java.util.Random;

public class Metody {
    private static final Random RANDOM=new Random();

    public static String generateName(){
        String[] first={"Ivan","Maria","Alex","Olga","Dmitriy"};
        String[] last={"Petrov","Sidorova","Volkov","Morozova","Kuznecov"};
        return first[RANDOM.nextInt(first.length)]+" "+last[RANDOM.nextInt(last.length)];
    }
    public static String generateEmail(String name){
        String clean=name.toLowerCase().replaceAll(" ",".");
        return clean+"@test.local";
    }
    public static String generateRole(){
        String[] roles={"user","admin","superadmin"};
        return roles[RANDOM.nextInt(roles.length)];
    }
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            String name=generateName();
            String email=generateEmail(name);
            String role=generateRole();

            System.out.printf("[seed] #%d: name='%s', email='%s' ,role='%s'%n", i+1,name,email,role);
        }
    }

}