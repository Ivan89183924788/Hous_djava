//class CounterBad{
//    int count=0;
//    //Обычный метод никакой синхронизации
//    void increment(){
//        int tmp=count;
//        try{
//            Thread.sleep(2);
//        }catch (InterruptedException e){
//    }
//        count=tmp+1;}
//}
//
//public class Metody_Sinhron {
//    public static void main(String[] args) throws InterruptedException {
//        CounterBad counter=new CounterBad();
//        int threadCount=20;
//        Thread[] threads=new Thread[threadCount];
//
//        System.out.println("[main] Запускаем "+threadCount+" потоков на обычный increment...");
//        for(int i=0;i<threadCount;i++){
//            threads[i]=new Thread(()->{
//                for(int j=0;j<50;j++){
//                    counter.increment();
//                }
//            });
//            threads[i].start();
//        }
//        for(Thread t:threads){t.join();}
//        System.out.println("[main] Итого count(без sinchronized): "+ counter.count);
//        System.out.println("Ожидалось: "+(threadCount*50));
//
//    }
//}

//class CounterGood{
//    int count=0;
//
//    synchronized void increment() {
//        int tmp = count;
//        try {
//            Thread.sleep(2);
//        } catch (InterruptedException e) {
//        }
//        count=tmp+1;
//        //Можно вывести,какой поток и когда зашел -но порядок строк остается
//    }
//}
//
//public class Metody_Sinhron {
//    public static void main(String[] args) throws InterruptedException {
//        CounterGood counter=new CounterGood();
//        int threadCount=20;
//        Thread[] threads=new Thread[threadCount];
//
//        System.out.println("[main] запускаем "+threadCount+" потоков в synchronized.increment...");
//        for(int i=0;i<threadCount;i++){
//            threads[i]=new Thread(()->{
//                for(int j=0;j<50;j++){
//                    counter.increment();
//                }
//            });
//            threads[i].start();
//        }
//        for(Thread t:threads){
//            t.join();
//        }
//        System.out.println("[main] Итого count(с synchronized): "+counter.count);
//        System.out.println("Ожидалось: "+threadCount*50);
//    }
//}


////если нужно защитить общее состояние для всех обьектов(например глобальный счетсчиек обьектов)
////используют (static sinchronazed)
//
//class GlobalStats{
//    static int totalRequests=0;
//
//    //static sinchronized: блокировка по классу GlobalStats.class
//    public static synchronized void registerRequest(){
//        totalRequests++;
//        //чтобы увидеть ,какой поток ты сделал нужно вывести имя потока
//        System.out.println("[registerRequest] Поток "+ Thread.currentThread().getName()+
//                " увеличить totalRequest до "+ totalRequests);
//    }
//}
//
//public class Metody_Sinhron {
//    public static void main(String[] args) throws InterruptedException{
//        System.out.println("[main] Запускаем 5 потоков на registerRequest...");
//        for(int i=0;i<5;i++){
//            Thread t=new Thread(()->GlobalStats.registerRequest());
//            t.setName("Worker-"+5*i);
//            t.start();
//        }
//        Thread.sleep(300);//Даем время завершиться
//        System.out.println("[main] Финальный totalRequest: "+GlobalStats.totalRequests);
//    }
//}

//class Door{
//    synchronized void openAndStayInside() throws InterruptedException{
//        String name=Thread.currentThread().getName();
//        System.out.println("["+name+"] Открыл дверь и зашел внутрь.");
//        Thread.sleep(1500);//Сидит дома 1.5 секунды
//        System.out.println("["+name+ "] Вышел из комнаты.");
//    }
//}
//
//public class Metody_Sinhron{
//    public static void main (String[] args) throws InterruptedException{
//        Door door=new Door();
//        Thread t1=new Thread(()->{
//            try{door.openAndStayInside();}catch (Exception e){
//        }},"Thread-1");
//
//        Thread t2=new Thread(()->{
//            try{door.openAndStayInside();}catch (Exception e){
//        }},"Thread-2");
//
//        Thread t3=new Thread(()->{
//            try{door.openAndStayInside();}catch (Exception e){
//        }},"Thread-3");
//
//        t1.start();
//        Thread.sleep(200);
//
//        t2.start();
//        Thread.sleep(200);
//
//        t3.start();
//        t1.join();t2.join();t3.join();
//
//    }
//}

//public class Metody_Sinhron {
//    public static void main (String[] args)throws InterruptedException{
//
//       Thread t1=new Thread(()->{
//           System.out.println("[t1] Старт");
//           try {
//               Thread.sleep(1500);
//           }catch (InterruptedException e){
//       }
//           System.out.println("[t1] Финиш");
//       },"Thread-1");
//
//
//       Thread t2=new Thread(()->{
//           System.out.println("[t2] Старт");
//           try {
//               Thread.sleep(500);
//           }catch (InterruptedException e){
//       }
//           System.out.println("[t2] Финиш");
//       },"Thread-2");
//
//       t1.start();
//       t2.start();
//
//        System.out.println("[main] Вызвал join для t1...");
//        t1.join();
//
//        System.out.println("[main] t1 завершился, теперь ждем t2...");
//        t2.join();
//        System.out.println("[main] Оба потока завершенны - продолжаем.");
//
//    }
//}


//public class Metody_Sinhron {
//    public static void sayHello(String name){
//        System.out.println("Привет, "+ name +"!");
//        System.out.println("Метод sayHello завершается");
//    }
//
//    public static void main(String[] args){
//        System.out.println("[main] Вызываем seyHello..." );
//        sayHello("Анна");
//        System.out.println("[main] После вызова sayHello -продолжаем работу");
//    }
//}


//public class Metody_Sinhron {
//    public static int calculateTotal(int a,int b,int c){
//        System.out.println(" [calculateTotal] Считаем сумму...");
//        int sum=a+b+c;
//        System.out.println("[calculateTotal] Сумма =" +sum);
//        return sum;
//    }
//    public static void main(String[] args){
//        System.out.println("[main] Начинаем расчет...");
//        int total=calculateTotal(10,20,30);
//        System.out.println("[maim] Получили total="+ total);
//        System.out.println("[main] можно использовать total в других вычислениях");
//    }
//}

//public class Metody_Sinhron{
//    public static void validate(String data){
//        System.out.println(" [validate] Проверяем данные: "+ data);
//    }
//    public static void saveToDataBase(String data){
//        System.out.println("[saveToDataBase] Сохраняем " + data);
//    }
//    public static void notifyUser(String data){
//        System.out.println("[notifyUser] Уведомляем пользователя о : "+ data);
//    }
//    public static void processOrder(String orderId){
//        System.out.println("[processeOrder] Обрабатываем заказ: " +orderId);
//        validate(orderId);
//        saveToDataBase(orderId);
//        notifyUser(orderId);
//        System.out.println("[processeOrder] Обработка заказа завершена.");
//    }
//    public static void main(String[] args){
//        System.out.println("[main] Запускаем обработку заказа...");
//        processOrder("ORD-123");
//        System.out.println("[main] Все готово,можно обрабатывать следующий заказ");
//    }
//}

//public class Metody_Sinhron {
//    public static void heavyTask()throws InterruptedException{
//        System.out.println(" [heavyTask] Начинаем тяжелую задачу...");
//        Thread.sleep(5000);
//        System.out.println("[heavyTask] Тяжелая задача завершена.");
//    }
//    public static void main(String[] args) throws InterruptedException{
//        System.out.println("[main] После вызова heavyTask");
//        heavyTask();
//        System.out.println("После heavyTask - продолжаем.");
//    }
//}




//25
//public class Metody_Sinhron {
//    public static void main(String[] args){
//        String adminEmail="superadmin@mail.ru";
//        System.out.println("[main] Хотим создать организацию для: "+adminEmail);
//        OrgService.crateOrganization("Luna Org",adminEmail);
//        System.out.println("[main] Продолжаем работу(например дальше можно ");
//    }
//}