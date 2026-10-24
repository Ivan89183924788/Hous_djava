import java.util.Random;
import java.util.Arrays;

//public class Massivi {
//    public static void main(String[] args){
//        int[] arr=new int[10];
//        Random rand=new Random();
//        for(int i=0;i<arr.length;i++){
//            arr[i]= rand.nextInt(100)+1;
//        }
//        System.out.print("Массив: ");
//        for(int value:arr){
//            System.out.println(value+" ");
//        }
//        System.out.println();
//    }
//}


//public class Massivi {
//    public static void main(String[] args){
//        int[] arr=new int[8];
//        Random rand=new Random();
//        for(int i=0;i<arr.length;i++){
//            arr[i]= rand.nextInt(50)+1;
//        }
//
//        int min=arr[0];
//        int minIndex=0;
//        for (int i=1;i<arr.length;i++){
//            if(arr[i]<min){
//                min=arr[i];
//                minIndex=i;
//            }
//        }
//        System.out.println("Массив: " + java.util.Arrays.toString(arr));
//        System.out.println("Минимум: " + min + ",индекс " + minIndex);
//    }
//}

//
//public class Massivi{
//    public static void main(String[] args){
//        int[] arr=new int[15];
//        Random rand=new Random();
//        for (int i=0;i<arr.length;i++){
//            arr[i]=rand.nextInt(5);
//        }
//        int zeroCount=0;
//        for(int value:arr){
//            if (value==0){
//                zeroCount++;
//            }
//        }
//        System.out.println("Массив: " + java.util.Arrays.toString(arr));
//        System.out.println("Количество нулей: " + zeroCount);
//    }
//}


//public class Massivi {
//    public static void main(String[] args){
//        int[] arr=new int[14];
//        Random rand=new Random();
//        for (int i=0;i< arr.length;i++){
//            arr[i]= rand.nextInt(50)+1;
//        }
//
//        int sum=0;
//        int umn=1;
//        boolean pravo=false;
//
//        for (int value:arr){
//            sum+=value;
//            if (value%2!=0){
//                umn*=value;
//                pravo=true;
//            }
//
//        }
//        if(!pravo){
//            umn=0;}
//        System.out.println("Массив :" + java.util.Arrays.toString(arr));
//        System.out.println("Сумма: " + sum);
//        System.out.println("Произведение: " + umn);
//    }
//}

//public  class Massivi {
//    public static void main(String[] args){
//        int[] orriginal={2,54,6,54,77,8,7,55,23};
//        int[] copy=new int[orriginal.length];
//        for(int i=0;i< orriginal.length-1;i++){
//            copy[i]=orriginal[i];
//        }
//        System.out.println("Оригинал:" + java.util.Arrays.toString(orriginal));
//        System.out.println("Копия:" + java.util.Arrays.toString(copy));
//    }
//}

//public class Massivi {
//    public static void main(String[] args){
//        int[]arr=new int[13];
//        Random rand=new Random();
//        for(int i=0;i< arr.length;i++){
//            arr[i]= rand.nextInt(50)+1;
//        }
//        System.out.println("Массив: " + java.util.Arrays.toString(arr));
//        int sum=0;
//        System.out.println("Элементы с нечетными индексами");
//        for (int i=1;i< arr.length;i+=2){
//
//
//            System.out.println(arr[i]+" ");
//            sum+=arr[i];
//        }
//        System.out.println();
//        System.out.println("Их сумма: " + sum);
//    }
//}

//public class Massivi {
//    public static void main(String[] args) {
//        int[] arr = new int[13];
//        Random rand = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = rand.nextInt(50) + 1;
//        }
//        System.out.println("Исходный массив: " + Arrays.toString(arr));
//
//        int nechetIndex=0;
//        for (int i=0;i<arr.length;i+=2){
//            nechetIndex++;
//        }
//
//        //Создаем копию нужного размера
//        int[] copy=new int[nechetIndex];
//        int j=0;
//
//        for (int i=0;i<arr.length;i+=2){
//            copy[j]=arr[i];
//            j++;
//        }
//        System.out.println("Только нечетные индексы: " + Arrays.toString(copy));
//
//        //Сумма нечетных элементов
//        int sum=0;
//        for (int i=0;i<copy.length;i++){
//            sum+=i;
//        }
//        System.out.println("Их сумма: " + sum);
//        int sum1=0;
//        for(int i:copy){
//            sum1+=i;
//        }
//        System.out.println("Их сумма: " + sum1);
//    }
//
//}

//public class Massivi {
//    public static void main(String[] args){
//        int[] arr=new int[13];
//        int[] copy=new int[arr.length];
//        Random rand=new Random();
//        for (int i=0;i< arr.length;i++){
//            arr[i]= rand.nextInt(45)+1;
//        }
//
//        System.out.println("Исходный массив: " + Arrays.toString(arr));
//
//        //Копируем только нечетные индексы
//        for (int i=0;i< arr.length;i+=2){
//            copy[i]=arr[i];
//        }
//        System.out.println("C нечетными индексами массив: " + Arrays.toString(copy));
//
//        int sum=0;
//        for (int i:copy){
//            sum+=i;
//        }
//        System.out.println("Сумма нечетных индексов: " + sum);
//    }
//}

//
//public class Massivi {
//    public static void main(String[] args){
//        int[] arr=new int[13];
//        Random rand=new Random();
//        for (int i=0;i< arr.length;i++){
//            arr[i]= rand.nextInt(50)+1;
//        }
//
//        System.out.println("Исходный массив: " + Arrays.toString(arr));
//        int[] copy=new int[arr.length];
//        System.arraycopy(arr,0,copy,0,arr.length);
//        System.out.println("Полная копия(System.arraycopy: " + Arrays.toString(copy));
//
//        int nechetIndex=0;
//        for (int i=0; i<arr.length;i+=2){
//            nechetIndex++;
//        }
//        int j=0;
//         int[] dop=new int[nechetIndex];
//        for(int i=1;i< arr.length;i+=2){
//            dop[j]=arr[i];
//            j++;
//        }
//        System.out.println("Массив с нечетными индексами: " + Arrays.toString(dop));
//        int sum=0;
//        for(int y:dop){
//            sum+=y;
//        }
//        System.out.println("Сумма чисел  снечетными индексами: " + sum);
//    }
//}

//public class Massivi {
//    public static void main(String[] args){
//        int n=14;
//        int[] fib=new int[n];
//        fib[0]=0;
//
//        if(n>1)
//            fib[1]=1;
//
//        for (int i=2;i< fib.length;i++){
//            fib[i]=fib[i-1]+fib[i-2];
//        }
//
//        System.out.println("Числа Фибаначи: " + Arrays.toString(fib));
//    }
//}

//public class Massivi {
//    public static void main(String[] args){
//        int l=19;
//        long[] trib=new long[l];
//
//        if(l>0) trib[0]=0;
//        if (l>1)trib[1]=0;
//        if(l>2)trib[2]=1;
//
//        for (int i=3;i<l;i++){
//            trib[i]=trib[i-3]+trib[i-2]+trib[i-1];
//        }
//        System.out.println("Числа трибоначи: " + Arrays.toString(trib));
//    }
//}

//public class Massivi {
//    public static void main(String[] args){
//        int k=19;
//        long[] trib=new long[k];
//
//        for (int i=0;i<k;i++){
//            trib[i]=tribRecursie(i);
//        }
//        System.out.println("Трибоначи (рекурсивно): " + java.util.Arrays.toString(trib));
//
//    }
//    private static long tribRecursie(int k) {
//        if (k == 0 || k == 1) return 0;
//        if (k == 2) return 1;
//        return tribRecursie( k-1)+tribRecursie(k-2)+tribRecursie(k-3);
//    }
//}

//public class Massivi {
//    public static void main(String[] args){
//        int[] arr=new int[10];
//        Random rand=new Random();
//        for(int i=0;i<arr.length;i++)
//            arr[i]= rand.nextInt(20)+1;
//        int window=3;
//        int resultSize=Math.max(0, arr.length-window+1);
//        int[] mivingSum=new int[resultSize];
//
//        for (int i=0;i<resultSize;i++){
//            int sum=0;
//            for( int j=0;j<window;j++){
//                sum+=arr[i+j];
//            }
//            mivingSum[i]=sum;
//        }
//        System.out.println("Исходный массив: " + Arrays.toString(arr));
//        System.out.println("Скользящая сумма(окно 3): " + Arrays.toString(mivingSum));
//
//    }
//}

//public class Massivi {
//    public static void main(String[] args){
//        int[] arr=new int[10];
//        Random rand=new Random();
//        for(int i=0;i< arr.length;i++){
//            arr[i]= rand.nextInt(20)+1;
//        }
//
//        int window=3;
//        int result=Math.max(0,arr.length-window+1);
//        int[] movingSum=new int[result];
//        if(result==0){
//            System.out.println("Окна должны быть длинее массива!");
//            return;
//        }
//        int sum=0;
//        for (int j=0;j<window;j++){
//            sum+=arr[j];
//        }
//        movingSum[0]=sum;
//        for (int i=1;i<result;i++){
//            sum-=arr[i-1];
//            sum+=arr[i+window-1];
//            movingSum[i]=sum;
//        }
//        System.out.println("Исходный массив: " + Arrays.toString(arr));
//        System.out.println("Скользящая сумма(окно) " + window + " " + Arrays.toString(movingSum));
//
//        System.out.println("\n Разбор по шагам:");
//
//        for(int i=0;i<result;i++){
//            int start=i;
//            int end=i+window-1;
//            System.out.printf("Окно [%d...%d]:%s=%d%n",start,end,Arrays.toString(Arrays.copyOfRange(arr,start,end+1)),movingSum[i]);
//        }
//    }
//}

//public class Massivi {
//    public static void main(String[] args){
//        int[] arr=new int[8];
//        Random rand=new Random();
//        for (int i=0;i< arr.length;i++){
//            arr[i]=rand.nextInt(9)+2;
//        }
//        System.out.println("Исходный массив: " + Arrays.toString(arr));
//
//        long[] prefiks =new long[arr.length];
//        long product=1;
//        for (int j=0;j< arr.length;j++){
//            product*=arr[j];
//            prefiks[j]=product;
//        }
//        System.out.println("Префиксные произведения: " + Arrays.toString(prefiks));
//    }
//}

//public class Massivi {
//    public static void main(String[] args){
//        int[] arr=new int[10];
//        Random rand=new Random();
//        for(int i=0;i< arr.length;i++){
//            arr[i]= rand.nextInt(50)+1;
//        }
//        System.out.println("Исходный массив: " + Arrays.toString(arr));
//
//        double sum=0;
//        for (int l=0;l<arr.length;l++){
//            sum+=arr[l];
//        }
//        sum/= arr.length;
//        double sred=sum;
//        System.out.printf("Среднее %.2f%n",sred);
//
//        int chetchik=0;
//        for (int x:arr){
//            if(x>sred){
//                chetchik++;
//            }
//        }
//        int[] filterSred=new int[chetchik];
//        int dx=0;
//        for (int f:arr){
//            if(f>sred){
//                filterSred[dx++]=f;
//            }
//        }
//        System.out.println("Элементы больше среднего: " + Arrays.toString(filterSred));
//
//    }
//}

//public class Massivi {
//    public static void main(String[] args){
//        int[] arr= new int[6];
//        Random rand=new Random();
//        for(int i=0;i< arr.length;i++){
//            arr[i]= rand.nextInt(45)+5;
//        }
//        System.out.println("Исходный массив: " + Arrays.toString(arr));
//
//        int n=arr.length;
//        int[] copy=new int[2*arr.length];
//        System.arraycopy(arr,0,copy,0,arr.length);
//
//        for(int i=0;i<n;i++){
//            copy[n+i]=arr[n-1-i];
//        }
//        System.out.println("Зеркальный массив: " + Arrays.toString(copy));
//    }
//}

//public class Massivi {
//    public static int[] getBinomCoefficient(int n){
//        if(n<0){
//            return new int[0];
//        }
//        int[] row=new int[n+1];
//        row[0]=1;
//
//        for(int i=1;i<=n;i++){
//            for(int j=i;j>0;j--){
//                row[j]+=row[j-1];
//            }
//        }
//        return row;
//    }
//
//    public static void main(String[] args){
//        int n=10;
//        int[] coefficent=getBinomCoefficient(n);
//        System.out.println("Коэффициенты для(a+b)^ " + n +":");
//        for (int c:coefficent){
//            System.out.println(c +" ");
//        }
//    }
//}

//
//public class Massivi {
//    public static int[] getPascalRow(int n){
//        if (n<0){
//            throw new IllegalArgumentException("n должно быть >=0");
//        }
//        int[] row=new int[n+1];
//        row[0]=1;
//
//        for (int k=1;k<=n;k++){
//            long prev=row[k-1];
//            row[k]=(int)(prev*(n-k+1)/k);
//        }
//        return row;
//    }
//
//    public static void printArray(String label,int[] arr){
//        System.out.print(label+" : [");
//        for (int i=0;i< arr.length;i++){
//            System.out.print(arr[i]);
//            if (i< arr.length-1){
//                System.out.print(", ");
//            }
//        }
//        System.out.println("]");
//    }
//
//    public static void main(String[] args){
//        System.out.println("Треугольник паскаля (первые 8 строк):\n");
//        for (int f=0;f<8;f++){
//            int[] row=getPascalRow(8);
//            printArray("Строка: " + f,row);
//        }
//
//        System.out.println("\nОтдельная строка: ");
//        int golop=10;
//        int[] golopy=getPascalRow(golop);
//        printArray("Строка:" +golop, golopy);
//
//        System.out.println("Обработка  отрицательного значения: ");
//        try{
//            getPascalRow(-3);
//        }catch (IllegalArgumentException ex){
//            System.out.println("Ошибка: " + ex.getMessage());
//        }
//    }
//}

////
//public class Massivi {
//    public static long binomCoefficient(int n,int k){
//        if (k<0 || k>n) return 0;
//        if (k==0 || k==n) return 1;
//        k=(k<n-k)?k:n-k;
//        long res=1;
//        for (int i=1;i<=k;i++){
//            res=res*(n-i+1)/i;
//        }
//        return res;
//    }
//
//    public static long[] getBinomRow(int n){
//        long[] row=new long[n+1];
//        for (int k=0;k<=n;k++){
//            row[k]=binomCoefficient(n,k);
//        }
//        return row;
//    }
//
//    public static void main(String[] args){
//        int n=10;
//        long[] coeffs=getBinomRow(n);
//        System.out.print("(a+b)^" + n+ "Коэфициенты: ");
//        for (long c: coeffs){
//            System.out.println(c +" ");
//        }
//    }
//
//}


import java.math.BigInteger;
//
//public class Massivi {
//    // Вычисление C(n, k) через последовательное умножение/деление, но с BigInteger
//    private static BigInteger binomialCoefficient(int n, int k) {
//        if (k < 0 || k > n) return BigInteger.ZERO;
//        if (k == 0 || k == n) return BigInteger.ONE;
//
//        k = Math.min(k, n - k); // оптимизация: берём меньшее k
//        BigInteger result = BigInteger.ONE;
//
//        for (int i = 1; i <= k; i++) {
//            result = result.multiply(BigInteger.valueOf(n - i + 1))
//                    .divide(BigInteger.valueOf(i));
//        }
//        return result;
//    }
//
//    // Считаем (a + b)^n как сумму C(n,k)*a^(n-k)*b^k
//    public static BigInteger expandAndSum(BigInteger a, BigInteger b, int n) {
//        BigInteger total = BigInteger.ZERO;
//
//        for (int k = 0; k <= n; k++) {
//            BigInteger coeff = binomialCoefficient(n, k);
//            BigInteger term = coeff
//                    .multiply(a.pow(n - k))
//                    .multiply(b.pow(k));
//            total = total.add(term);
//        }
//        return total;
//    }
//
//    public static void main(String[] args) {
//        int n = 30;
//        BigInteger a = BigInteger.valueOf(2);
//        BigInteger b = BigInteger.valueOf(3);
//
//        BigInteger value = expandAndSum(a, b, n);
//        System.out.println("(" + a + "+" + b + ")^" + n + " = " + value);
//    }
//}



//
//public class Massivi {
//
//    public static BigInteger[] getCoefficients(int n) {
//        BigInteger[] row = new BigInteger[n + 1];
//        for (int i = 0; i <= n; i++) {
//            row[i] = BigInteger.ZERO;
//        }
//        row[0] = BigInteger.ONE;
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = i; j > 0; j--) {
//                row[j] = row[j].add(row[j - 1]);
//            }
//        }
//        return row;
//    }
//
//    public static String expand(BigInteger a, BigInteger b, int n) {
//        BigInteger[] coeffs = getCoefficients(n);
//        StringBuilder sb = new StringBuilder();
//        boolean first = true;
//
//        for (int k = 0; k <= n; k++) {
//            BigInteger coeff = coeffs[k];
//            if (coeff.equals(BigInteger.ZERO)) {
//                continue;
//            }
//
//            String term = "";
//
//            // Добавляем плюс между членами
//            if (!first) {
//                term += " + ";
//            }
//            first = false;
//
//            int expA = n - k;
//            int expB = k;
//
//            // Коэффициент
//            boolean needCoeff = !coeff.equals(BigInteger.ONE);
//            if (needCoeff) {
//                term += coeff;
//            }
//
//            // Часть с a
//            if (expA > 0) {
//                if (needCoeff) {
//                    term += "*";
//                }
//                term += "a";
//                if (expA > 1) {
//                    term += "^" + expA;
//                }
//            }
//
//            // Часть с b
//            if (expB > 0) {
//                // Если уже есть коэффициент или часть с a — добавляем '*'
//                if ((needCoeff || expA > 0)) {
//                    term += "*";
//                }
//                term += "b";
//                if (expB > 1) {
//                    term += "^" + expB;
//                }
//            }
//
//            sb.append(term);
//        }
//
//        return sb.toString();
//    }
//
//    public static void main(String[] args) {
//        int n = 6;
//        BigInteger a = BigInteger.valueOf(2);
//        BigInteger b = BigInteger.valueOf(-3);
//
//        System.out.println("Разложение (a+b)^" + n + ":");
//
//        System.out.println(expand(a, b, n));
//    }
//}




//public class Massivi {
//
//    public static BigInteger[] getCoefficients(int n) {
//        BigInteger[] row = new BigInteger[n + 1];
//        for (int i = 0; i <= n; i++) {
//            row[i] = BigInteger.ZERO;
//        }
//        row[0] = BigInteger.ONE;
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = i; j > 0; j--) {
//                row[j] = row[j].add(row[j - 1]);
//            }
//        }
//        return row;
//    }
//
//    // Возвращает пару: (строка формулы, итоговая сумма)
//    public static Result expandWithSum(BigInteger a, BigInteger b, int n) {
//        BigInteger[] coeffs = getCoefficients(n);
//        StringBuilder sb = new StringBuilder();
//        BigInteger totalSum = BigInteger.ZERO;
//        boolean first = true;
//
//        for (int k = 0; k <= n; k++) {
//            BigInteger coeff = coeffs[k];
//            if (coeff.equals(BigInteger.ZERO)) {
//                continue;
//            }
//
//            int expA = n - k;
//            int expB = k;
//
//            // Вычисляем значение этого слагаемого: coeff * a^expA * b^expB
//            BigInteger termValue = coeff
//                    .multiply(a.pow(expA))
//                    .multiply(b.pow(expB));
//            totalSum = totalSum.add(termValue);
//
//            // Формируем часть формулы для вывода
//            String termFormula = "";
//            if (!first) {
//                termFormula += " + ";
//            }
//            first = false;
//
//            boolean needCoeff = !coeff.equals(BigInteger.ONE);
//            if (needCoeff) {
//                termFormula += coeff;
//            }
//
//            if (expA > 0) {
//                if (needCoeff) termFormula += "*";
//                termFormula += "a";
//                if (expA > 1) termFormula += "^" + expA;
//            }
//
//            if (expB > 0) {
//                if ((needCoeff || expA > 0)) termFormula += "*";
//                termFormula += "b";
//                if (expB > 1) termFormula += "^" + expB;
//            }
//
//            sb.append(termFormula);
//        }
//
//        return new Result(sb.toString(), totalSum);
//    }
//
//    // Вспомогательный класс, чтобы вернуть и строку, и сумму
//    public static class Result {
//        public final String formula;
//        public final BigInteger sum;
//
//        public Result(String formula, BigInteger sum) {
//            this.formula = formula;
//            this.sum = sum;
//        }
//    }
//
//    public static void main(String[] args) {
//        int n = 6;
//        BigInteger a = BigInteger.valueOf(6);
//        BigInteger b = BigInteger.valueOf(-3);
//
//        Result res = expandWithSum(a, b, n);
//
//        System.out.println("Разложение (a+b)^" + n + ":");
//        System.out.println(res.formula);
//        System.out.println("Сумма подставленных чисел: " + res.sum);
//        // Для проверки: это то же самое, что (a + b)^n
//        System.out.println("Проверка (a+b)^n: " + a.add(b).pow(n));
//    }
//}

