//public class Stroky {
//    public static void main(String[] args){
//
//        //Исходная строка
//        System.out.println("Исходная строка");
//        String text="HelloWorld2025";
//
//        //1.length-длина строки
//        System.out.println("1.length-длина строки");
//        int len=text.length();
//        System.out.println("Длина строка: " + len);
//
//        //2.Вызов по индексу(CharAt)
//        char secondChar=text.charAt(1);
//        System.out.println("2.Символ по индексу(CharAt)(1)= '" + secondChar + "'   ");
//
//        //3.Подстрока в строке
//        String subFromIndex=text.substring(5);
//        System.out.println("3.Подстрока в строке: \"" + subFromIndex + "\"  ");
//
//        //4.Подстрока в строке(0,5)
//        String alles=text.substring(0,5);
//        System.out.println("4.Подстрока в строке(0,5) : \"" + alles + "\"");
//
//        //5.IndexOf - Индекс первого вхождения
//        int indexOfWorld= text.indexOf("World");
//        System.out.println("5.IndexOf(World) - Индекс первого вхождения: " + indexOfWorld);
//
//        //Проверка если подстрокки нет вернет (-1)
//        int indexOfMissing=text.indexOf("Java");
//        System.out.println(" text>indexOf (\"Java\")= " +indexOfMissing);
//
//        //6.startWith - начинается с префикса
//        boolean startWithHello=text.startsWith("Hello");
//        System.out.println("6.startWith - начинается с префикса: (\"Hello\") " + startWithHello);
//
//        boolean startWithJava=text.startsWith("Java");
//        System.out.println("6.startWith - начинается с префикса: (\"Java\") " + startWithJava);
//
//        //7.endWith - заканчивается префиксом(2025)
//        boolean endWith2025=text.endsWith("2025");
//        System.out.println("7.endWith - заканчивается префиксом(2025)  (\"2025\") " + endWith2025);
//
//        boolean endWithJava=text.endsWith("Java");
//        System.out.println("7.endWith - заканчивается префиксом(Java)  (\"2025\") " + endWithJava);
//
//        //8.contains - содержит ли подстроку
//        boolean conteinsWorld=text.contains("World");
//        System.out.println("8.contains - содержит ли подстроку (\"  World \" " + conteinsWorld);
//
//        boolean conteinsJava=text.contains("Java");
//        System.out.println("8.contains - содержит ли подстроку (\"  Java \" " + conteinsJava);
//
//    }
//}
