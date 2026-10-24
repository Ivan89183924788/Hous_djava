import java.awt.*;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.function.Consumer;


//public class Main {
//    public static void main(String[] args){
//        //1.Обычный массив примитивов
//        System.out.println("1.Обычный массив примитивов");
//       int[] intArray={1,2,3,4,5,6,7};
//        System.out.println("Массив int: " + Arrays.toString(intArray));
//
//        //2.Массив обьектов(String)
//        System.out.println("2.Массив обьектов(String)");
//        String[] stringArray={"Яблоко","Банан","Апельсин","Персик"};
//        System.out.println("Массив String: " + Arrays.toString(stringArray));
//
//        //3.Двумерный массив(matrix)
//        System.out.println("3.Двумерный массив(matrix)");
//        int[][] matrix={
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        for(int[] row :matrix){
//            System.out.println("Двумерный массив: " + Arrays.toString(matrix));
//            System.out.println("Двумерный массив: " + Arrays.toString(row));
//            System.out.println("Двумерный массив: " + Arrays.toString(row));
//        }
//
//        //4.ArrayList(Динамический массив)
//        System.out.println("4.ArrayList(Динамический массив)");
//        List<Integer> list=new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        System.out.println("ArrayList: " + list);
//
//        //5.List из строк (неизменяемый)
//        System.out.println("5.List из строк (неизменяемый)");
//        List<String> listString=List.of("киви","слива","орех","алыча");
//        System.out.println("ListString: " + listString);
//
//        //6.Преобразование из массива в List
//        System.out.println("6.Преобразование из массива в List");
//        List<String> fromArray=Arrays.asList(stringArray);
//        System.out.println("Из массива в List: " + fromArray);
//
//        //7.Вывод через цикл по индексам(для массива)
//        System.out.println("7.Вывод через цикл по индексам(для массива)");
//        for(int a=0;a<intArray.length;a++){
//            System.out.println(intArray[a] + " ");
//        }
//        System.out.println();
//
//        //8.Вывод ArrayList  через foreach
//        System.out.println("8.Вывод ArrayList  через foreach");
//        for (Integer value: list){
//            System.out.println( value+ " ");
//        }
//        System.out.println();
//
//        //9.Вывод только некоторых элементов(четные числа)
//        System.out.println("9.Вывод только некоторых элементов(четные числа)");
//        for(int value:intArray){
//            if (value%2==0){
//                System.out.println(value +" ");
//            }
//        }
//        System.out.println();
//
//        //10.Вывод матрицы без скобок
//        System.out.println("10.Вывод матрицы без скобок");
//        for (int[] row:matrix){
//            for (int x:row){
//                System.out.println("%3d " + x );
//            }
//            System.out.println();
//        }
//    }
//}


//1
//public class Main {
//    public static void main(String[] args){
//        Devilerable document=new Document(2.5,"ул.Пушкина,234 ");
//        Devilerable foodOrder=new FoodOrder(4.5,"ул.Ленина,345 ");
//        Devilerable packageItem=new Package(3.5,"ул.Вишневая,23 ");
//
//        DeliveryService<Devilerable,CourierDelivery> service=new DeliveryService<>();
//        DeliveryService<Devilerable,PostDelivery> service1=new DeliveryService<>();
//        DeliveryService<Devilerable,DroneDelivery> service2=new DeliveryService<>();
//
//        service.executeDelivery(document,new CourierDelivery());
//        service1.executeDelivery(foodOrder,new PostDelivery());
//        service2.executeDelivery(packageItem,new DroneDelivery());
//
//    }
//}


//2
//public class Main {
//    public static void main(String[] args) {
//        new ShopUI().run();
//    }
//}


//3 Работа с рекордом
//public class Main {
//    public static void main(String[] args){
//        Person person=new Person("Aboba",14);
//        System.out.println(person.getName());
//        PersonTest personTest=new PersonTest("Aboba1",23);
//        System.out.println(personTest.name());
//        personTest.printPerson();
//        System.out.println(personTest.hashCode());
//    }
//}


//Класс обертка, это обьект который хранит в себе значение примитива,
//Будучи сам обьектом Integer=int, у каждого примитива свой класс обертка
//У класса обертки есть методы а у примитива нет
//public class Main {
//    public static void main(String[] args) throws IOException {
//       int age=10;
//       Integer age1=13;
//       Integer age2=33;
//       System.out.println(age1.toString());
//       System.out.println(age2.toString());
//    }
//}

//public class Main {
//    public static void main(String[] args) throws IOException {
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        int x=7;
//        Integer num=111;
//        //Автораспаковка распоковать обьект достать из него примитив
//        x=num;
//        //Автоупаковка в класс Integer упоковать примитив int
//        num=x+5;
//        System.out.println(num);
//    }
//}
//
//public class Main {
//public static void summa(Integer num1,Integer num2){
//    System.out.println(num1+num2);
//}
//    public static void main(String[] args) throws IOException {
//        int number=5;
//        int number1=5;
//        summa(number1,number);
//    }
//}


////Upcasting (восходящее приведение)    // Downcasting: Animal -> Dog (явно, с риском)
//class Animal {
//    void speak() {
//        System.out.println("Какой-то звук");
//    }
//}
//
//class Dog extends Animal {
//    @Override
//    void speak() {
//        System.out.println("Гав-гав!");
//    }
//
//    void fetch() {
//        System.out.println("Приношу палку");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Dog dog = new Dog();
//
//        // Upcasting: Dog -> Animal (автоматически, безопасно)
//        Animal animal = dog;
//
//        System.out.println("=== Upcasting ===");
//        System.out.println("Тип переменной: " + animal.getClass().getSimpleName()); // Dog
//        animal.speak(); // Вызовется Dog.speak() → "Гав-гав!"
//        Animal animal1 = new Dog(); // Upcasting
//
//        // Downcasting: Animal -> Dog (явно, с риском)
//        Dog dog1 = (Dog) animal;
//
//        System.out.println("\n=== Downcasting (успешно) ===");
//        dog.speak();   // Работает: "Гав-гав!"
//        dog.fetch();   // Теперь можно: "Приношу палку"
//
//        // animal.fetch(); // ОШИБКА: у типа Animal нет метода fetch()
//
//    }
//}


// //Итераторы могут пройтись по всем значениям коллекции
// //даже  если у коллекции нет номера
//public class Main {
//    public static void main(String[] args) {
//        Set<String> set=new HashSet<String>();
//        set.add("Mama");
//        set.add("Mila");
//        set.add("Ramu");
//        set.add("Doma");
//
//        Iterator<String> iterator= set.iterator();
//
//        while (iterator.hasNext()){
//            String text= iterator.next();
//            System.out.println(text);
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        ArrayList<Integer> lottery=new ArrayList<>(100);
//        for(int i=1;i<=100;i++){
//            lottery.add(i);
//        }
//        Collections.shuffle(lottery);
//        System.out.println("Внимание из барабанна появится первые 10 чисел");
//
//        for(int i=0;i<10;i++){
//            System.out.println(lottery.get(i));
//        }
//    }
//}


//public class Main {
//    public static void main(String[] args){
//        String mercury=new String("Меркурий");
//        String venera=new String("Венера");
//        String earth=new String("Земля");
//        String mars=new String("Марс");
//        String upiter=new String("Юпитер");
//        String saturn=new String("Сатурн");
//        String uran=new String("Уран");
//        String neptun=new String("Нептун");
//
//        ArrayList<String> solarSystem=new ArrayList<>(Arrays.asList(mercury,venera,earth,mars,upiter,saturn,uran,neptun));
//        System.out.println(solarSystem);
//        System.out.println("=== Поменять местами ===");
//        Collections.swap(solarSystem,solarSystem.indexOf(mercury),solarSystem.indexOf(neptun));
//        System.out.println(solarSystem);
//        System.out.println("=== Сортирова ===");
//        Collections.sort(solarSystem);
//        System.out.println(solarSystem);
//        System.out.println("=== В обратном направлении ===");
//        Collections.reverse(solarSystem);
//        System.out.println(solarSystem);
//
//    }
//}


////Проверяет ли есть ли в колекциях пересечения
////если есть возращает True если нет false
//public class Main {
//    public static void main(String[] args){
//        String mercury=new String("Меркурий");
//        String venera=new String("Венера");
//        String earth=new String("Земля");
//        String mars=new String("Марс");
//        String upiter=new String("Юпитер");
//        String saturn=new String("Сатурн");
//        String uran=new String("Уран");
//        String neptun=new String("Нептун");
//
//        ArrayList<String> solarSystem1=new ArrayList<>(Arrays.asList(mercury,venera,earth,mars));
//        ArrayList<String> solarSystem2=new ArrayList<>(Arrays.asList(mars,upiter,saturn,uran,neptun));
//
//
//
//        System.out.println(Collections.disjoint(solarSystem1,solarSystem2));
//    }
//}



//public class Main {
//    public static void main(String[] args) {
//        // Создаём экземпляр стека для целых чисел
//        Stack<Integer> stack = new Stack<>();
//
//        // Добавляем элементы
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
//        stack.push(7);
//
//        // Пример использования стека: вывод состояния и извлечение элементов
//        System.out.println("Стек после добавления элементов: " + stack);
//        System.out.println("Верхний элемент (peek): " + stack.peek());
//
//        System.out.println("\nИзвлекаем элементы по одному (принцип LIFO):");
//        while (!stack.empty()) {
//            int value = stack.pop();
//            System.out.println("Извлечён: " + value);
//        }
//
//        System.out.println("Стек пуст? " + stack.empty());
//    }
//}



//Интерфейс Deque двунаправленая очередь работающая по принципу стека
//Класс ArrayDeque<E> этот класс образует двунаправленную очередь

//
//public class Main {
//    public static void summ(Integer num1,Integer num2) {
//        System.out.println(num1+num2);
//    }
//    public static void main(String[] args){
//        Deque<String> deque=new ArrayDeque<>();
//        deque.addLast("Wor");
//        deque.addLast("Polina");
//        deque.addLast("Olga");
//        deque.addLast("Rita");
//        System.out.println(deque);
//        List<String> list=new ArrayList<>();
//        list.add("Aboba");
//        list.add("Bob");
//        list.add("Bob1");
//        list.add("Lop");
//        ArrayDeque<String> arrayDeque=new ArrayDeque<>(list);
//        ArrayDeque<String> arrayDeque1=new ArrayDeque<>(100);
//        System.out.println(list);
//    }
//}


//import java.util.ArrayDeque;
//import java.util.ArrayList;
//import java.util.Deque;
//import java.util.List;
//
//public class Main {
//
//    // Метод для суммы двух чисел
//    public static void summ(Integer num1, Integer num2) {
//        System.out.println("Сумма: " + (num1 + num2));
//    }
//
//    public static void main(String[] args) {
//        // 1. Работа с Deque как с очередью (FIFO)
//        Deque<String> deque = new ArrayDeque<>();
//        deque.addLast("Wor");
//        deque.addLast("Polina");
//        deque.addLast("Olga");
//        deque.addLast("Rita");
//
//        System.out.println("Deque (очередь): " + deque);
//
//        // Пример извлечения из начала (FIFO)
//        System.out.print("Извлекаем из начала: ");
//        while (!deque.isEmpty()) {
//            String name = deque.removeFirst();
//            System.out.print(name + " ");
//        }
//        System.out.println();
//
//
//        // 2. List и перенос в ArrayDeque
//        List<String> list = new ArrayList<>();
//        list.add("Aboba");
//        list.add("Bob");
//        list.add("Bob1");
//        list.add("Lop");
//
//        System.out.println("List: " + list);
//
//        ArrayDeque<String> arrayDeque = new ArrayDeque<>(list);
//        System.out.println("ArrayDeque из List: " + arrayDeque);
//
//
//        // 3. ArrayDeque с начальной ёмкостью (это не фиксированный размер, а подсказка для производительности)
//        ArrayDeque<String> arrayDeque1 = new ArrayDeque<>(100);
//        arrayDeque1.addLast("First");
//        arrayDeque1.addFirst("Top");  // добавляем в начало — удобно для стека
//        System.out.println("ArrayDeque1 (с addFirst/addLast): " + arrayDeque1);
//
//
//        // 4. Демонстрация работы как стека (LIFO)
//        System.out.print("Извлекаем как из стека (pop/removeLast): ");
//        while (!arrayDeque1.isEmpty()) {
//            String item = arrayDeque1.removeLast(); // аналог pop
//            System.out.print(item + " ");
//        }
//        System.out.println();
//
//
//        // 5. Вызов метода summ
//        summ(10, 25);
//        summ(-3, 7);
//    }
//}

//public class Main {

    // Метод для суммы двух чисел

//    public static void main(String[] args) {
//      Set<Integer> numbers=new HashSet<>();
//      numbers.add(21);
//      numbers.add(31);
//      numbers.add(21);
//      numbers.add(51);
//      numbers.add(581);
//      numbers.add(571);
//      numbers.add(561);
//        System.out.println(numbers);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//      Set<Integer> numbers=new HashSet<>();
//      Random rand=new Random();
//      for(int i=1;i<=500;i++){
//         numbers.add(rand.nextInt(20));
//      }
//        System.out.println(numbers);
//
//    }
//}

//import java.util.HashSet;
//import java.util.Random;
//import java.util.Set;

//    public class Main {
//        public static void main(String[] args) {
//            List<Integer> numbers = new ArrayList<>();
//            Random rand = new Random();
//
//            // Генерируем, пока не наберём 50 уникальных чисел
//            while (numbers.size() < 100) {
//                int value = rand.nextInt(20); // диапазон [0; 99] — достаточно для 50 уникальных
//                numbers.add(value);
//            }
//
//            System.out.println("Количество уникальных чисел: " + numbers.size());
//            System.out.println(numbers);
//        }
//    }


//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>();
//        Random rand = new Random();
//
//        for (int i = 1; i <= 50; i++) {
//            numbers.add(rand.nextInt(100)); // числа от 0 до 99
//        }
//
//        System.out.println("Всего чисел: " + numbers.size());
//        System.out.println(numbers);
//    }
//}

//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Random;
//import java.util.Set;
//
//public class Main {
//    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>();
//        Random rand = new Random();
//
//        // Генерируем 100 чисел (дубликаты возможны)
//        for (int i = 0; i < 100; i++) {
//            int value = rand.nextInt(20); // числа от 0 до 19
//            numbers.add(value);
//        }
//
//        System.out.println("Все числа (с повторами): " + numbers);
//        System.out.println("Всего чисел: " + numbers.size());
//
//        // Убираем дубликаты с помощью Set
//        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
//
//        System.out.println("Уникальные числа: " + uniqueNumbers);
//        System.out.println("Количество уникальных: " + uniqueNumbers.size());
//    }
//}
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>();
//        Random rand = new Random();
//
//        // Генерируем 100 чисел (дубликаты возможны)
//        for (int i = 0; i < 100; i++) {
//            int value = rand.nextInt(20); // числа от 0 до 19
//            numbers.add(value);
//        }
//
//        System.out.println("Все числа (с повторами): " + numbers);
//        System.out.println("Всего чисел: " + numbers.size());
//
//        // Убираем дубликаты без Set: вручную проверяем наличие
//        List<Integer> uniqueNumbers = new ArrayList<>();
//        for (Integer num : numbers) {
//            if (!uniqueNumbers.contains(num)) {
//                uniqueNumbers.add(num);
//            }
//        }
//
//        System.out.println("Уникальные числа: " + uniqueNumbers);
//        System.out.println("Количество уникальных: " + uniqueNumbers.size());
//    }
//}

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>();
//        Random rand = new Random();
//
//        for (int i = 0; i < 100; i++) {
//            numbers.add(rand.nextInt(20));
//        }
//
//        System.out.println("Все числа (с повторами): " + numbers);
//
//        // Сортируем, чтобы одинаковые встали рядом
//        Collections.sort(numbers);
//
//        List<Integer> uniqueNumbers = new ArrayList<>();
//        if (!numbers.isEmpty()) {
//            Integer prev = numbers.get(0);
//            uniqueNumbers.add(prev);
//
//            for (int i = 1; i < numbers.size(); i++) {
//                Integer current = numbers.get(i);
//                if (!current.equals(prev)) {
//                    uniqueNumbers.add(current);
//                    prev = current;
//                }
//            }
//        }
//
//        System.out.println("Уникальные числа (отсортированные): " + uniqueNumbers);
//        System.out.println("Количество уникальных: " + uniqueNumbers.size());
//    }
//}
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>();
//        Random rand = new Random();
//
//        for (int i = 0; i < 100; i++) {
//            numbers.add(rand.nextInt(20));
//        }
//
//        System.out.println("Все числа (с повторами): " + numbers);
//
//        boolean[] seen = new boolean[20]; // для чисел 0..19
//        List<Integer> uniqueNumbers = new ArrayList<>();
//
//        for (Integer num : numbers) {
//            if (!seen[num]) {
//                seen[num] = true;
//                uniqueNumbers.add(num);
//            }
//        }
//
//        System.out.println("Уникальные числа (в порядке первого появления): " + uniqueNumbers);
//        System.out.println("Количество уникальных: " + uniqueNumbers.size());
//    }
//}

//HashMap хранит значения в уникальном порядке,задает ключ значение
//LinkedMapp хранит значения в порядке добавления
//TreeMap сама сортирует значения по заданному критерию
//Hashtable как HashMap только не хранить null, и синхронизирован с точки зрения
// многопоточности могут работать безопасно

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Map<Integer,Integer> map=new HashMap<>();
//        map.put(0,0);
//        map.put(1,1);
//        map.put(2,2);
//        map.put(3,3);
//        System.out.println(map);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Map<Integer,Integer> map=new LinkedHashMap<>();
//        map.put(0,0);
//        map.put(1,1);
//        map.put(4,8);
//        map.put(2,2);
//        map.put(3,3);
//        System.out.println(map);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Map<Integer,Integer> map=new TreeMap<>();
//        map.put(0,45);
//        map.put(1,143);
//        map.put(4,8555);
//        map.put(2,66);
//        map.put(3,34555);
//        System.out.println(map);
//        System.out.println(map.get(4));
//    }
//}
//
//class Box {
//    int value;
//}
//
//public class Main {
//    public static void changeValue(Box b) {
//        b.value = 999; // меняем поле объекта
//    }
//
//    public static void main(String[] args) {
//        Box box = new Box();
//        box.value = 10;
//        changeValue(box);
//        System.out.println("Значение: " + box.value);
//    }
//}


//class Counter {
//    int count;
//}
//
//public class Main {
//    public static void add(Counter c) {
//        c.count += 5;
//    }
//
//    public static void reset(Counter c) {
//        c = new Counter(); // вот тут фокус
//        c.count += 25;
//    }
//
//    public static void main(String[] args) {
//        Counter x = new Counter();
//        x.count = 10;
//
//        add(x);
//        System.out.println(x.count); // что тут?
//
//        reset(x);
//        System.out.println(x.count); // а тут?
//    }
//}


//11
//public class Main {
//    public static void main(String[] args){
//        Queue<HeavyBox> boxes=new ArrayDeque<>();
//        boxes.offer(new HeavyBox(10));
//        boxes.offer(new HeavyBox(11));
//        boxes.offer(new HeavyBox(12));
//        boxes.offer(new HeavyBox(13));
//        System.out.println("Очередь: ");
//        System.out.println(boxes);
//        HeavyBox box=boxes.poll();
//        System.out.println("Удалили: " + box);
//        System.out.println("Осталось: ");
//        System.out.println(boxes);
//    }
//}

//12
//public class Main {
//    public static void main(String[] args) {
//        Queue<HeavyBox> boxes = new ArrayDeque<>();
//        boxes.offer(new HeavyBox(100));
//        boxes.offer(new HeavyBox(200));
//        boxes.offer(new HeavyBox(3001));
//        boxes.offer(new HeavyBox(400));
//        List<HeavyBox> heavyBoxes = new ArrayList<>();
//        List<HeavyBox> lightBoxes = new ArrayList<>();
//        for (HeavyBox box : boxes) {
//            if (box.getWeght() > 300) {
//                heavyBoxes.add(box);
//            } else {
//                lightBoxes.add(box);
//            }
//        }
//        System.out.println("Больше 300: " + heavyBoxes);
//        System.out.println("Меньше 300: " + lightBoxes);
//
//    }
//}
//
//12
//public class Main {
//    public static void main(String[] args) {
//        Queue<HeavyBox> boxes = new ArrayDeque<>();
//        boxes.offer(new HeavyBox(100));
//        boxes.offer(new HeavyBox(200));
//        boxes.offer(new HeavyBox(3001));
//        boxes.offer(new HeavyBox(400));
//
//        List<HeavyBox> heavyBoxes = new ArrayList<>();
//        List<HeavyBox> lightBoxes = new ArrayList<>();
//
//        // Используем итератор вместо for-each
//        Iterator<HeavyBox> iterator = boxes.iterator();
//        while (iterator.hasNext()) {
//            HeavyBox box = iterator.next();
//            if (box.getWeight() > 300) {
//                heavyBoxes.add(box);
//            } else {
//                lightBoxes.add(box);
//            }
//        }
//
//        System.out.println("Больше 300: " + heavyBoxes);
//        System.out.println("Меньше или равно 300: " + lightBoxes);
//    }
//}

//
////12
//public class Main {
//    public static void main(String[] args) {
//        Queue<HeavyBox> boxes = new ArrayDeque<>();
//        boxes.offer(new HeavyBox(100));
//        boxes.offer(new HeavyBox(200));
//        boxes.offer(new HeavyBox(3001));
//        boxes.offer(new HeavyBox(400));
//
//        List<HeavyBox> heavyBoxes = new ArrayList<>();
//        List<HeavyBox> lightBoxes = new ArrayList<>();
//
//        // Используем итератор вместо for-each
//        Iterator<HeavyBox> iterator = boxes.iterator();
//        while (iterator.hasNext()) {
//            HeavyBox box = iterator.next();
//            if (box.getWeight() > 300) {
//                heavyBoxes.add(box);
//            } else {
//                lightBoxes.add(box);
//            }
//        }
//        while (!boxes.isEmpty()) {
//            HeavyBox box = boxes.poll(); // вынимает элемент из головы очереди
//            if (box.getWeight() > 300) {
//                heavyBoxes.add(box);
//            } else {
//                lightBoxes.add(box);
//            }
//        }
//
//        System.out.println("Больше 300: " + heavyBoxes);
//        System.out.println("Меньше или равно 300: " + lightBoxes);
//        System.out.println("Пустая коробка: " +boxes);
//    }
//}

////15
//public class Main{
//    public static void main(String[] args){
//        HashMap<String,Product> toys=new HashMap<>();
//        toys.put("Плюшевый мишка",new Product("Плюшевый мишка",1500.00));
//        toys.put("Кукла Барби",new Product("Кукла Барби",2500.00));
//        toys.put("Конструктор LEGO",new Product("Конструктор  LEGO",3500.00));
//        toys.put("Машинка на радиоуправлении",new Product("Машинка на радиоуправлении",4500.00));
//
//        printEntries(toys);
//        System.out.println("------");
//        printKeys(toys);
//        System.out.println("-------");
//        printValues(toys);
//    }
//    public static void printEntries(HashMap<String,Product> map){
//        System.out.println("Пары Ключ-Значение");
//        for(Map.Entry<String,Product> entry: map.entrySet()){
//            System.out.println(entry.getKey()+ "->"+entry.getValue());
//        }
//    }
//    public static void printKeys(HashMap<String,Product> map){
//        System.out.println("Имена игрушек(ключи): ");
//        for (String key:map.keySet()){
//            System.out.println(key);
//        }
//    }
//    public static void printValues(HashMap<String,Product> map){
//        System.out.println("Обьекты игрушек(Значения): ");
//        for (Product value: map.values()){
//            System.out.println(value);
//        }
//    }
//}

////15
//public class Main{
//    public static void processStudents(List<Student> students){
//        var iterator=students.iterator();
//        while (iterator.hasNext()){
//            Student s=iterator.next();
//            double avg=s.getAverageGrade();
//
//            if(avg<3){
//                iterator.remove();
//            } else{
//                s.setCourse(s.getCourse()+1);
//            }
//        }
//    }
//
//    public static void printStudent(List<Student> students, int course){
//        boolean found=false;
//        for (Student s:students){
//            if (s.getCourse()==course){
//                System.out.println("- "+ s.getName());
//                found =true;
//            }
//        }
//        if(!found){
//            System.out.println("нет студентов на этом курсе");
//        }
//    }
//
//    public static void main(String[] args){
//        List<Student> students =new ArrayList<>();
//
//        students.add(new Student("Анна","ИВТ-21",2,List.of(4,5,4,3)));
//        students.add(new Student("Виктор","ИВТ-22",2,List.of(4,2,3,2)));
//        students.add(new Student("Алексей","ИВТ-23",3,List.of(3,5,4,3)));
//        students.add(new Student("Алла","УКН-21",3,List.of(4,4,4,3)));
//        students.add(new Student("Зинаида","УКТ-23",4,List.of(5,5,5,3)));
//        students.add(new Student("Рита","ИВТ-24",4,List.of(5,5,4,3)));
//
//        System.out.println("До обработки: ");
//        for(Student s:students){
//            System.out.println(s);
//        }
//
//        processStudents(students);
//        System.out.println("\nПосле обработки: ");
//        for (Student s:students){
//            System.out.println(s);
//        }
//        System.out.println("3 курс");
//        printStudent(students,3);
//        System.out.println("4 курс");
//        printStudent(students,4);
//        System.out.println("5 курс");
//        printStudent(students,5);
//
//    }
//}

////16
//public class Main {
//    public static void main(String[] args){
//        Map<Integer,Product> productMap=new HashMap<>();
//        productMap.put(1,new Product(1,"Book lives","Book",1233,45));
//        productMap.put(2,new Product(2,"Shnur","Izdelie",253,65));
//        productMap.put(3,new Product(3,"Odeyalo","Tkany",1300,15));
//        productMap.put(4,new Product(4,"Bocka","Derevo",4500,35));
//        System.out.println("По ID 1 изначально:"+ productMap.get(1));
//        Product p=productMap.get(1);
//        if(p!=null){
//            p.quantity-=2;
//        }
//        System.out.println("По ID 1:"+ productMap.get(1));
//        System.out.println("По ID 2:"+ productMap.get(2));
//        productMap.remove(2);
//        productMap.forEach((id,prod)-> System.out.println(id+":"+prod));
//        System.out.println(productMap);
//
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        Map<String,Integer> sorted=new TreeMap<>();
//        sorted.put("Polina",45);
//        sorted.put("Rita",30);
//        sorted.put("Katya",35);
//        sorted.put("Vica",20);
//        sorted.put("Angelina",34);
//        sorted.put("Olga",18);
//        for(Map.Entry<String,Integer> e: sorted.entrySet()){
//            String key= e.getKey();
//            Integer value= e.getValue();
//            System.out.println("Пара "+e.getKey()+"->"+e.getValue());
//            System.out.println("Ключи "+key);
//            System.out.println("Значения "+value);
//        }
//
//    }
//}

//
////17
//public class Main {
//    public static void main(String[] args){
//        Pet myCat=new Cat("Мурзик",3,true);
//        Pet myDog=new Dog("Пушок",10,"Дворняга");
//        Pet myParrot=new Parrot("Кеша",8,"Желтый");
//
//        Map<String,Pet> pets=new HashMap<>();
//        pets.put(myCat.getName(),myCat);
//        pets.put(myDog.getName(),myDog);
//        pets.put(myParrot.getName(),myParrot);
//
//        System.out.println("Все питомцы в коллекции: ");
//        for(Map.Entry<String,Pet> entry: pets.entrySet()){
//            String name=entry.getKey();
//            Pet pet=entry.getValue();
//            System.out.println("Имя: "+ name+" ->" +pet);
//            pet.makeSound();
//        }
//        String searchName="Кеша";
//        Pet foundPet=pets.get(searchName);
//        if(foundPet!=null){
//            System.out.println("\nНашли питомца с именем'"+searchName+"':" +foundPet);
//        }else {
//            System.out.println("\nПитомец с именем '"+searchName+"' не найден");
//        }
//    }
//}

////18
//public class Main {
//    public static void main(String[] args){
//        Warehouse sclady=new Warehouse();
//
//        sclady.dobProducty(new Product(1,"Ноутбук","Электроника",50000.00,23));
//        sclady.dobProducty(new Product(2,"Мышь","Электроника",500.00,43));
//        sclady.dobProducty(new Product(3,"Клавиатура","Электроника",5000.00,63));
//        sclady.dobProducty(new Product(4,"Стул","Мебель",4500.00,21));
//        sclady.dobProducty(new Product(5,"Стол","Мебель",7900.00,43));
//
//        System.out.println();
//
//        sclady.naytyPoId(3);
//        sclady.naytyPoId(45);
//        System.out.println();
//
//        sclady.izmKolic(2,67);
//        sclady.izmKolic(32,6);
//        System.out.println();
//
//        sclady.poiskCategoriy("Электроника");
//        sclady.poiskCategoriy("Одежда");
//        System.out.println();
//
//        sclady.polnayaStoimosty();
//        System.out.println();
//
//        sclady.udalityTovar(3);
//        sclady.udalityTovar(39);
//        System.out.println();
//
//        sclady.napicatyVseTovary();
//    }
//}

//
////19
//public class Main {
//    public static void main(String[] args){
//        ArrayList<Character> characters=new ArrayList<>();
//        characters.add(new Character("Воин",45, 12));
//        characters.add(new Character("Коршун",42, 1));
//        characters.add(new Character("Пеликан",77, 2));
//        characters.add(new Character("Дракон",456, 123));
//        characters.add(new Character("Тихоня",-23, 15));
//        characters.add(new Character("Страж",22, 34));
//
//        System.out.println("Исходный список персонажей: ");
//        spisokPersonaj(characters);
//        System.out.println();
//
//        Character maxUronCharacter=characters.stream()
//                .max(Comparator.comparingInt(Character::getDamage))
//                .orElse(null);
//        if (maxUronCharacter!=null){
//            System.out.println("Персонаж с максимальным уроном: "+ maxUronCharacter);
//            System.out.println();
//
//            characters.removeIf(character -> character.getHealth()<=0);
//            System.out.println("\nПосле удаления погибших");
//        }
//        spisokPersonaj(characters);
//        System.out.println();
//
//        characters.forEach(character -> character.setHealth(character.getHealth()+10));
//        System.out.println("\nПосле увеличения здоровья на 10");
//        spisokPersonaj(characters);
//        System.out.println();
//
//        int uron=30;
//        System.out.println("Персонажи с уроном свыше"+ uron+":");
//        characters.stream()
//                .filter(character -> character.getDamage()>uron)
//                .forEach(System.out::println);
//    }
//    private static void spisokPersonaj(ArrayList<Character> characters){
//        characters.forEach(System.out::println);
//    }
//}

////20
//public class Main {
//    public static void main(String[] args){
//        ArrayList<Movie> movies=new ArrayList<>();
//        movies.add(new Movie("Интерстейлер",2014,8.6));
//        movies.add(new Movie("Начало",2010,6.8));
//        movies.add(new Movie("Темный рыцарь",2008,9.0));
//        movies.add(new Movie("Матрица",1999,4.7));
//        movies.add(new Movie("Дюна",2021,8.0));
//
//        System.out.println("Исходный список фильмов: ");
//        printMovies(movies);
//        System.out.println();
//
//        int startYear=2010;
//        System.out.println("\nФильмы после "+startYear+ " года");
//        movies.stream()
//                .filter(movie -> movie.getYear()>startYear)
//                .forEach(System.out::println);
//
//        Movie maxRatingMovie=movies.stream()
//                .max(Comparator.comparingDouble(Movie::getRating))
//                .orElse(null);
//        if(maxRatingMovie!=null){
//            System.out.println("\nФильмы с максимальным рейтингом: "+ maxRatingMovie);}
//
//        System.out.println("\nФильмы с рейтингом больше 8");
//        movies.stream()
//                .filter(movie -> movie.getRating()>8)
//                .forEach(System.out::println);
//
//        System.out.println("\nСписок отсортированных по рейтингу фильмов(по убыванию)");
//        movies.sort(Comparator.comparingDouble(Movie::getRating).reversed());
//        printMovies(movies);
//
//
//    }
//    private static void printMovies(ArrayList<Movie> movies){
//        movies.forEach(System.out::println);
//    }
//}

////21
//public class Main {
//    public static void main(String[] args){
//        List<Student> students=new ArrayList<>();
//        students.add(new Student("Анна Иванова", "ИТ-101", 20, 9.2));
//        students.add(new Student("Борис Петров", "ИТ-102", 19, 8.7));
//        students.add(new Student("Виктор Сидоров", "ИТ-101", 21, 9.5));
//        students.add(new Student("Галина Козлова", "ИТ-103", 18, 7.8));
//        students.add(new Student("Дмитрий Новиков", "ИТ-102", 20, 8.9));
//        students.add(new Student("Елена Волкова", "ИТ-101", 19, 9.1));
//        students.add(new Student("Фёдор Зайцев", "ИТ-103", 22, 8.3));
//        students.add(new Student("Григорий Орлов", "ИТ-102", 20, 8.7)); // такой же балл, как у Бориса
//        students.add(new Student("Дарья Смирнова", "ИТ-101", 19, 9.5)); // такой же балл, как у Виктора
//        students.add(new Student("Иван Фёдоров", "ИТ-103", 21, 8.1));
//
//        System.out.println("Исходный список студентов: ");
//        students.forEach(System.out::println);
//
//        Student bestStudent=students.stream()
//                .max(Comparator.naturalOrder())
//                .orElse(null);
//        System.out.println("\nЛучший студент: "+ bestStudent);
//
//        System.out.println("\nТри лучштх студента: ");
//        students.stream()
//                .sorted().limit(3)
//                .forEach(System.out::println);
//
//        String targetGroup="ИТ-101";
//        System.out.println("\nСтуденты группы "+ targetGroup+":");
//        students.stream()
//                .filter(student -> student.getGroup().equals(targetGroup))
//                .forEach(System.out::println);
//
//        double minScore=8.5;
//        System.out.println("\nСтуденты с баллом выше "+minScore+":");
//        students.stream()
//                .filter(student -> student.getAverageScore()>minScore)
//                .forEach(System.out::println);
//
//        System.out.println("\nСортировка по имени:");
//        students.sort(Student.byName());
//        students.forEach(System.out::println);
//
//        System.out.println("\nСортировка по возрасту:");
//        students.sort(Student.byAge());
//        students.forEach(System.out::println);
//
//        System.out.println("\nСортировка по группе:");
//        students.sort(Student.byGroup());
//        students.forEach(System.out::println);
//    }
//}


////22
//public class Main {
//    public static void main(String[] args) {
//        Student s1 = new Student("Ivan", "M-23", 20, 4.5);
//        Student s2 = new Student("Ivan", "M-23", 20, 4.5);
//
//        System.out.println("s1 == s2: " + (s1 == s2));                     // false (всегда)
//        System.out.println("s1.equals(s2): " + s1.equals(s2));               // false (без override) или true (с override)
//        System.out.println("hashCode равны: " + (s1.hashCode() == s2.hashCode())); // false (без override) или true (с override)
//
//        java.util.Set<Student> set = new java.util.HashSet<>();
//        set.add(s1);
//        System.out.println("set.contains(s2): " + set.contains(s2));        // false (без override) или true (с override)
//    }
//}


//public class Main {
//    public static void main(String[] args)throws IOException {
//        Runnable action=()-> System.out.println("Hello");
//        action.run();
//    }
//}


////27
//public class Main {
//    public static void main(String[] args)throws IOException {
//        Action action=()-> System.out.println("Hello");
//        action.execute();
//        Consumer<String> printer=text-> System.out.println(text);
//        printer.accept("Hello Aboba");
//    }
//}

//public class Main {
//    public static void main(String[] args)throws IOException {
//        Action action=()-> System.out.println("Hello");
//        System.out.println("1");
//        System.out.println("2");
//        action.execute();
//        System.out.println("3");
//    }
//}

//public class Main {
//    public static void main(String[] args)throws IOException {
//       Button button=new Button()->System.out.println("Кнопка нажата");
//       button.click();
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Runnable runnable=()-> {
//            System.out.println("Работа в другом потоке");
//        };
//        Thread thread=new Thread(runnable);
//        thread.start();
//    }
//}



//public class Main {
//    public static void main(String[] args)throws  IOException {
//        Action action=()-> {
//            System.out.println("Работа в другом потоке");
//        };
//        Thread thread=new Thread(action);
//        thread.start();
//    }
//}

//public class Main {
//    public static void main(String[] args) throws IOException {
//        Action action = () -> System.out.println("Работа в другом потоке");
//        Thread thread = new Thread(() -> action.execute());
//        thread.start();
//    }
//}


//public class Main {
//    public static void main(String[] args)throws  IOException {
//        Action action=()-> {
//            System.out.println("Работа в другом потоке");
//        };
//        action.execute();
//        action.execute();
//        action.execute();
//    }
//}

//public class Main {
//    public static void main(String[] args)throws  IOException {
//        Action saveAction=()->{
//            System.out.println("save action...");
//        };
//        boolean isSave=true;
//        if(isSave){
//            saveAction.execute();
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args)throws  IOException {
//        Action saveAction=()->{
//            System.out.println("save action...");
//        };
//        boolean isSave=false;
//        if(isSave){
//            saveAction.execute();
//        }
//    }
//}




//public class Main {
//    public static void main(String[] args) {
//        Runnable task = () -> System.out.println("Я работаю в потоке: " + Thread.currentThread().getName());
//        new Thread(task).start();
//        System.out.println("Главный поток: " + Thread.currentThread().getName());
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        Runnable task = () -> System.out.println("Я работаю в потоке: " + Thread.currentThread().getName());
//        new Thread(task).start();
//        System.out.println("Главный поток: " + Thread.currentThread().getName());
//    }
//}
//

//import java.util.Arrays;
//import java.util.List;
//import java.util.function.Predicate;
//
//public class Main {
//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        Predicate<Integer> isEven = n -> n % 2 == 0;
//
//        numbers.stream()
//                .filter(isEven)
//                .forEach(n -> System.out.println("Чётное число: " + n));
//    }
//}


//import java.util.function.IntBinaryOperator;
//
//public class Main {
//    public static void main(String[] args) {
//        IntBinaryOperator sum = (a, b) -> a + b;
//        IntBinaryOperator product = (a, b) -> a * b;
//
//        int s = sum.applyAsInt(3, 5);
//        int p = product.applyAsInt(3, 5);
//
//        System.out.println("Сумма: " + s);        // 8
//        System.out.println("Произведение: " + p); // 15
//    }
//}


//import java.util.function.Consumer;
//
//public class Main {
//    public static void main(String[] args) {
//        Consumer<String> printer = text -> {
//            System.out.print("Начало: ");
//            System.out.print(text);
//            System.out.println(" :Конец");
//        };
//
//        printer.accept("Тест лямбды");
//    }
//}


//@FunctionalInterface
//interface Actiony {
//    void execute(String message);
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Actiony action = msg -> {
//            System.out.println("[ACTION] Сообщение: " + msg);
//            System.out.println("[ACTION] Время: " + System.currentTimeMillis());
//        };
//
//        action.execute("Привет от лямбды!");
//    }
//}

//import java.util.Arrays;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
//
//        words.stream()
//                .filter(w -> w.length() > 5)                 // оставить длинные
//                .map(String::toUpperCase)                    // в верхний регистр
//                .forEach(w -> System.out.println("Длинное слово: " + w));
//    }
//}



//public class Main {
//    public static void main(String[] args) {
//        int multiplier = 3;  // должна быть effectively final
//
//        java.util.function.IntUnaryOperator scale = x -> x * multiplier;
//
//        System.out.println(scale.applyAsInt(5));  // 15
//        System.out.println(scale.applyAsInt(10)); // 30
//    }
//}



//  30
//public class Main {
//    public static void main(String[] args) {
//        Action action = msg -> {
//            System.out.println("[ACTION] Сообщение: " + msg);
//            System.out.println("[ACTION] Время: " + System.currentTimeMillis());
//        };
//
//        action.execute("Привет от лямбды!");
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        Action action = msg -> {
//            System.out.println("[ACTION] Сообщение: " + msg);
//            System.out.println("[ACTION] Время: " + System.currentTimeMillis());
//        };
//        action.execute("Привет от лямбды!");
//    }
//}


////31
//public class Main {
//    public static void main(String[] args){
//        Operationable<Integer> operationable1=(x,y)->x+y;
//        Operationable<String> operationable2=(x,y)->x+y;
//
//        System.out.println(operationable1.calculate(10,20));
//        System.out.println(operationable2.calculate("10","20"));
//    }
//}


//public class Main{
//    public static void main(String[] args){
//        Operation1 func=action(1);
//        int a= func.execute(4,6);
//        System.out.println(a);
//
//        int b=action(2).execute(8,2);
//        System.out.println(b);
//
//        int c=action(3).execute(45,6);
//        System.out.println(c);
//
//
//        int x=33;
//        int y=3;
//        if(y==0){
//            System.out.println("На ноль делить нельзя");}
//        else {
//
//            int d=action(4).execute(x,y);
//            System.out.println(d);
//
//        }
//
//
//        int e=action(5).execute(81,3);
//        System.out.println(e);
//    }
//
//    private static Operation1 action(int number){
//        switch (number){
//            case 1:return (x,y)->x+y;
//            case 2:return (x,y)->x-y;
//            case 3:return (x,y)->x*y;
//            case 4:return (x,y)->x/y;
//            default:return (x,y)->0;
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        List<Student> students=new ArrayList<>();
//        students.add(new Student("Анна Иванова", "ИТ-101", 20, 9.2));
//        students.add(new Student("Борис Петров", "ИТ-102", 19, 8.7));
//        students.add(new Student("Виктор Сидоров", "ИТ-101", 21, 9.5));
//        students.add(new Student("Галина Козлова", "ИТ-103", 18, 7.8));
//        students.add(new Student("Дмитрий Новиков", "ИТ-102", 20, 8.9));
//        students.add(new Student("Елена Волкова", "ИТ-101", 19, 9.1));
//        students.add(new Student("Фёдор Зайцев", "ИТ-103", 22, 8.3));
//        students.add(new Student("Григорий Орлов", "ИТ-102", 20, 8.7)); // такой же балл, как у Бориса
//        students.add(new Student("Дарья Смирнова", "ИТ-101", 19, 9.5)); // такой же балл, как у Виктора
//        students.add(new Student("Иван Фёдоров", "ИТ-103", 21, 8.1));
//
//        System.out.println("Исходный список студентов: ");
//        students.forEach(System.out::println);
//
//        Student bestStudent=students.stream()
//                .max(Comparator.naturalOrder())
//                .orElse(null);
//        System.out.println("\nЛучший студент: "+ bestStudent);
//
//        System.out.println("\nТри лучштх студента: ");
//        students.stream()
//                .sorted().limit(3)
//                .forEach(System.out::println);
//
//        String targetGroup="ИТ-101";
//        System.out.println("\nСтуденты группы "+ targetGroup+":");
//        students.stream()
//                .filter(student -> student.getGroup().equals(targetGroup))
//                .forEach(System.out::println);
//
//        double minScore=8.5;
//        System.out.println("\nСтуденты с баллом выше "+minScore+":");
//        students.stream()
//                .filter(student -> student.getAverageScore()>minScore)
//                .forEach(System.out::println);
//
//        System.out.println("\nСортировка по имени:");
//        students.sort(Student.byName());
//        students.forEach(System.out::println);
//
//        System.out.println("\nСортировка по возрасту:");
//        students.sort(Student.byAge());
//        students.forEach(System.out::println);
//
//        System.out.println("\nСортировка по группе:");
//        students.sort(Student.byGroup());
//        students.forEach(System.out::println);
//    }
//}

////33Domashka
//public class Main {
//    public static void main(String[] args){
//        List<Player> player=new ArrayList<>();
//        player.add(new Player("Polo",21,31,1334));
//        player.add(new Player("Soldat",67,12,3450));
//        player.add(new Player("Uruk",55,93,9074));
//        player.add(new Player("Ork",68,94,901));
//        player.add(new Player("Semen",12,91,6774));
//        player.add(new Player("Suhary",42,66,4965));
//        player.add(new Player("Vasilich",57,21,9074));
//        for (Player p:player){
//            System.out.println(p);
//        }
//
//        TreeSet<Player> winsSort=new TreeSet<>(Comparator.comparingInt(Player::getWins).reversed());
//        winsSort.addAll(player);
//        System.out.println("\nОтсортировано по победам(убыванию)");
//        for(Player p:winsSort){
//            System.out.println(p);
//        }
//
//        TreeSet<Player> lossesSort=new TreeSet<>(Comparator.comparingInt(Player::getLosses).reversed());
//        lossesSort.addAll(player);
//        System.out.println("\nОтсортировано по поражениям(по убыванию)");
//        for(Player d:lossesSort){
//            System.out.println(d);
//        }
//
//        TreeSet<Player> scoreSort=new TreeSet<>(Comparator.comparingInt(Player::getScore).reversed());
//        scoreSort.addAll(player);
//        System.out.println("\nОтсортировано по количеству очков(по убывнию)");
//        for (Player f:scoreSort){
//            System.out.println(f);
//        }
//
////        player.stream().filter(s->s.getScore()==s.getScore()).sorted(Comparator.comparing(Player::getNickname).reversed())
////                        .forEach(System.out::println);
//
//        System.out.println("\nСортировка: по очкам (убывание), при равенстве — по нику (по убыванию):");
//        player.stream().sorted(Comparator.comparingInt(Player::getScore).reversed()
//                .thenComparing(Player::getNickname).reversed())
//                        .forEach(System.out::println);
//
//        System.out.println("=========");
//
//        System.out.println("Отсортировано по победам 3 лучших");
//        player.stream().sorted(Comparator.comparingInt(Player::getWins).reversed()).limit(3)
//                .forEach(System.out::println);
//
//        System.out.println("=======");
//
//      double sum=player.stream()
//                      .mapToDouble(Player::getWins)
//                              .sum();
//      double sred=sum/ player.size();
//
//        player.stream().filter(s->s.getWins()>sred)
//                .forEach(System.out::println);
//
//        Random random=new Random();
//        int chisloScore=random.nextInt(100);
//
//        player.forEach(play->play.setScore(play.getScore()+chisloScore));
//
//        System.out.println("\nПосле увеличения очков у каждой команды");
//
//        TreeSet<Player> scoreSort1=new TreeSet<>(Comparator.comparingInt(Player::getScore).reversed());
//        scoreSort1.addAll(player);
//        System.out.println("\nОтсортировано по количеству очков(по убывнию)");
//        scoreSort1.forEach(System.out::println);
//
//        Random random1=new Random();
//        int chisloWins=random1.nextInt(10);
//        player.forEach(player1 -> player1.setWins(player1.getWins()+chisloWins));
//        System.out.println("\nПосле увеличения побед у каждой команды");
//
//        TreeSet<Player> winsSort1=new TreeSet<>(Comparator.comparingInt(Player::getWins).reversed());
//        winsSort1.addAll(player);
//        System.out.println("\nОтсортировано по победам(убыванию)");
//        winsSort1.forEach(System.out::println);
//
//    }
//}

//
//public class Main {
//    public static void main(String[] args) {
//        List<Player> players = new ArrayList<>();
//        players.add(new Player("Polo", 21, 31, 1334));
//        players.add(new Player("Soldat", 67, 12, 3450));
//        players.add(new Player("Uruk", 55, 93, 9074));
//        players.add(new Player("Ork", 68, 94, 901));
//        players.add(new Player("Semen", 12, 91, 6774));
//        players.add(new Player("Suhary", 42, 66, 4965));
//        players.add(new Player("Vasilich", 57, 21, 9074));
//
//        System.out.println("=== ИСХОДНЫЙ СПИСОК ===");
//        players.forEach(System.out::println);
//
//        System.out.println("\n=== ТОП-3 ПО ПОБЕДАМ ===");
//        players.stream()
//                .sorted(Comparator.comparingInt(Player::getWins).reversed())
//                .limit(3)
//                .forEach(System.out::println);
//
//        double sum=players.stream().mapToDouble(Player::getWins).sum();
//        double sred=sum/ players.size();
//        System.out.println("\nСреднее количество побед: "+ sred);
//        System.out.println("=== ПОБЕДЫ ВЫШЕ СРЕДНЕГО ===");
//        players.stream()
//                .filter(p->p.getWins()>sred)
//                .forEach(System.out::println);
//
//        Random random=new Random();
//        System.out.println("\n=== ПРИБАВЛЯЕМ ОЧКИ(каждому свое случайное число)");
//        players.forEach(p->{
//            int increment= random.nextInt(100);
//            p.setScore(p.getScore()+increment);
//            System.out.println(p.getNickname()+" + "+increment+" Очков-> новые счет: "+p.getScore());
//        });
//
//        System.out.println("=== РЕЙТИНГ ПО ОЧКАМ(после прибавки) ===");
//        players.stream()
//                .sorted(Comparator.comparingInt(Player::getScore).reversed())
//                .forEach(System.out::println);
//
//        System.out.println("\n=== ПРИБАВЛЯЕМ ПОБЕДЫ(каждому свое случайное число)");
//        players.forEach(p->{
//            int increment=random.nextInt(10);
//            p.setWins(p.getWins()+increment);
//            System.out.println(p.getNickname()+" + "+increment+" побед-> новые победы "+p.getWins());
//        });
//
//        System.out.println("\n=== РЕЙТИНГ ПО ПОБЕДАМ(после прибавки) ===");
//        players.stream()
//                .sorted(Comparator.comparingInt(Player::getWins).reversed())
//                .forEach(System.out::println);
//
//    }
//}

//35
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Main {
//    public static void main(String[] args) {
//        // 1. Создаем общий список всех транспортных средств
//        List<Vehicle> allVehicles = new ArrayList<>();
//        allVehicles.add(new Car(1, "Toyota", "Camry", 2020, 25000, 4, "Petrol"));
//        allVehicles.add(new Car(2, "BMW", "M5", 2022, 85000, 4, "Petrol"));
//        allVehicles.add(new Motorcycle(3, "Harley-Davidson", "Iron 883", 2019, 12000, 883, false));
//        allVehicles.add(new Truck(4, "Volvo", "FH16", 2021, 150000, 24, 3));
//        allVehicles.add(new Car(5, "Ford", "F-150", 2023, 45000, 4, "Diesel"));
//        allVehicles.add(new Motorcycle(6, "Yamaha", "R1", 2023, 18000, 998, false));
//        allVehicles.add(new Truck(7, "Mercedes", "Actros", 2020, 140000, 22, 3));
//        allVehicles.add(new Car(8, "Toyota", "Corolla", 2021, 20000, 4, "Hybrid"));
//
//        System.out.println("=== 1. ВСЕ ТРАНСПОРТНЫЕ СРЕДСТВА ===");
//        allVehicles.forEach(System.out::println);
//
//        // 2. TreeSet: Уникальный отсортированный каталог (использует compareTo из Vehicle)
//        TreeSet<Vehicle> uniqueCatalog = new TreeSet<>(allVehicles);
//        System.out.println("\n=== 2. УНИКАЛЬНЫЙ КАТАЛОГ (TreeSet) ===");
//        uniqueCatalog.forEach(System.out::println);
//
//        // 3. Map: Группировка по марке
//        Map<String, List<Vehicle>> byBrand = allVehicles.stream()
//                .collect(Collectors.groupingBy(Vehicle::getBrand));
//
//        System.out.println("\n=== 3. ГРУППИРОВКА ПО МАРКЕ И СРЕДНЯЯ ЦЕНА ===");
//        byBrand.forEach((brand, list) -> {
//            double avgPrice = list.stream()
//                    .mapToDouble(Vehicle::getPrice)
//                    .average()
//                    .orElse(0.0);
//            System.out.printf("%s: %d шт., Средняя цена: $%.2f%n", brand, list.size(), avgPrice);
//        });
//
//        // --- ОТДЕЛЬНЫЕ ЗАДАЧИ С ФИЛЬТРАЦИЕЙ И СОРТИРОВКОЙ ---
//
//        // Задача А: Самый дорогой транспорт
//        Optional<Vehicle> mostExpensive = allVehicles.stream()
//                .max(Comparator.comparingDouble(Vehicle::getPrice));
//        System.out.println("\n=== 4. САМЫЙ ДОРОГОЙ ТРАНСПОРТ ===");
//        mostExpensive.ifPresent(System.out::println);
//
//        // Задача Б: Самый новый транспорт
//        Optional<Vehicle> newest = allVehicles.stream()
//                .max(Comparator.comparingInt(Vehicle::getYear));
//        System.out.println("\n=== 5. САМЫЙ НОВЫЙ ТРАНСПОРТ ===");
//        newest.ifPresent(System.out::println);
//
//        // Задача В: Только автомобили (instanceof) + естественная сортировка
//        System.out.println("\n=== 6. ТОЛЬКО АВТОМОБИЛИ (Естественная сортировка) ===");
//        allVehicles.stream()
//                .filter(v -> v instanceof Car)
//                .sorted() // использует compareTo (цена -> год -> id)
//                .forEach(System.out::println);
//
//        // Задача Г: Только мотоциклы (instanceof) + сортировка по цене (убывание)
//        System.out.println("\n=== 7. ТОЛЬКО МОТОЦИКЛЫ (Цена: убывание) ===");
//        allVehicles.stream()
//                .filter(v -> v instanceof Motorcycle)
//                .sorted(Comparator.comparingDouble(Vehicle::getPrice).reversed())
//                .forEach(System.out::println);
//
//        // Задача Д: Только грузовики (instanceof) + сортировка по грузоподъёмности
//        System.out.println("\n=== 8. ТОЛЬКО ГРУЗОВИКИ (Грузоподъёмность: возрастание) ===");
//        allVehicles.stream()
//                .filter(v -> v instanceof Truck)
//                // Приводим к типу Truck, чтобы вызвать специфичный геттер
//                .sorted(Comparator.comparingDouble(v -> ((Truck) v).getCargoCapacityTons()))
//                .forEach(System.out::println);
//
//        // Задача Е: Топ-5 самых дорогих (любого типа)
//        Comparator<Vehicle> byPriceDesc = Comparator.comparingDouble(Vehicle::getPrice).reversed();
//        System.out.println("\n=== 9. ТОП-5 САМЫХ ДОРОГИХ (ВСЕ ТИПЫ) ===");
//        allVehicles.stream()
//                .sorted(byPriceDesc)
//                .limit(5)
//                .forEach(System.out::println);
//
//        // Задача Ж: Сортировка по марке (A-Z)
//        System.out.println("\n=== 10. СОРТИРОВКА ПО МАРКЕ (A-Z) ===");
//        allVehicles.stream()
//                .sorted(Comparator.comparing(Vehicle::getBrand))
//                .forEach(System.out::println);
//    }
//}


//ПАТТЕРН ЭТО ИДЕЯ КАК ПРАВИЛЬНО ОРГАНИЗОВАТЬ ВЗАИМОДЕЙСТВИЕ КЛАССОВ И ОБЬЕКТОВ
//ТИПЫ : ПАРАЖДАЮЩИЕ(Одиночка,фабрика,Абстрактная фабрика,строитель,прототип)
//СТРУКТУРНЫЕ
// И ПОВЕДЕНЧЕСКИЕ

//36
//public class Main {
//    public static void main(String[] args)throws IOException{
//        Logger  logger1=Logger.getInstance();
//        logger1.printInfo("Start");
//        Logger  logger2=Logger.getInstance();
//        logger2.printInfo("End");
//        System.out.println(logger1==logger2);
//
//    }
//}


//36
//public class Main {
//    public static void main(String[] args)throws IOException{
////       IPayment payment=new CardPayment();
////       IPayment payment1=new SbpPayment();
////       IPayment payment2=new CashPayment();
//        IPayment payment=PaymentFactory.createPayment("card");
//        IPayment payment1=PaymentFactory.createPayment("cash");
//        IPayment payment2=PaymentFactory.createPayment("sbp");
//        payment.pay(233);
//
//    }
//}


//37
//public class Main {
//    public static void main(String[] args)throws IOException{
//        AbsFactory factory=new WindowsFactory();
//        Button1 button1=factory.createButton();
//        Checkbox checkbox=factory.createCheckbox();
//        checkbox.render();
//        button1.render();
//
//    }
//}


//public class Main {
//    public static void main(String[] args)throws IOException{
//
//        User1 user=new User1.Builder()
//                .email("email@mail.com")
//                .city("Краснодар")
//                .age(13)
//                .name("Иван")
//                .phone("345352552")
//                .build();
//        System.out.println(user);
//    }
//}

//39
//public class Main {
//    public static void main(String[] args)throws IOException{
//
////        new Character1("ddd",3,4);
//        Character1 prototype=new Character1("Aboba",100,55);
//        Character1 goblin1=prototype.copy();
//        Character1 goblin2=prototype.copy();
//        Character1 goblin3=prototype.copy();
//        Character1 goblin4=prototype.copy();
//        Character1 goblin5=prototype.copy();
//        Character1 goblin6=prototype.copy();
//
//        System.out.println(goblin1);
//        System.out.println(goblin2);
//        System.out.println(goblin3);
//        System.out.println(goblin4);
//        System.out.println(goblin5);
//        System.out.println(goblin6);
//    }
//}


//40
//public class Main {
//    public static void main(String[] args)throws IOException{
//
//        Pizza pizza=new Pizza.Builder()
//                .testo("dddd")
//                .sous("dddd")
//                        .build();
//        System.out.println(pizza);
//
//        Pizza pizza1=new Pizza.Builder()
//                .testo("dddd")
//                .sous("dddd")
//                .build();
//        System.out.println(pizza1);
//
//        Pizza pizza2=new Pizza.Builder()
//                .testo("dddd")
//                .sous("dddd")
//                .build();
//        System.out.println(pizza2);
//    }
//}