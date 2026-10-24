//public class Massivy2 {
//    public static void main(String[] args){
//        int[][] matrix={
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        for(int i=0;i< matrix.length;i++){
//            for(int j=0;j<matrix[i].length;j++){
//                System.out.println(matrix[i][j]+"\t");
//            }
//            System.out.println();
//        }
//    }
//}
//
//import java.util.Random;
//
//public class Massivy2 {
//    public static void main(String[] args){
//        int rows=4;
//        int cols=5;
//        int[][] matrix=new int[rows][cols];
//        Random rand=new Random();
//        for (int i=0;i<rows;i++){
//            for(int j=0;j<cols;j++){
//                matrix[i][j]=rand.nextInt(100);
//            }
//        }
//        for(int[]row:matrix){
//            for(int value:row){
//                System.out.printf("%3d",value);
//            }
//            System.out.println();
//        }
//    }
//}

//import java.lang.reflect.Array;
//import java.util.Arrays;
//
//public class Massivy2 {
//    public static void main(String[] args){
//        int[][] matrix={
//                {10,20,30},
//                {40,50,60},
//                {70,80,90}
//        };
//        System.out.println(Arrays.deepToString(matrix));
//    }
//}

//public class Massivy2 {
//    public static void main(String[] args){
//        String[][] products={
//                {"Book","Polnolunie","33.56"},
//                {"Phone","IPhone 13","999.00"},
//                {"Food","Chocolate","3.50"}
//        };
//        System.out.println("ID|Category|Name          | Price");
//        System.out.println("--+--------+--------------+-------");
//        for(int i=0;i< products.length;i++){
//            String[] row=products[i];
//            System.out.printf("%2d|%8s|%-14s|%6s%n",i,row[0],row[1],row[2]);
//        }
//    }
//}

//public  class Massivy2 {
//    public static void main(String[] args){
//        double[][] A={
//                {5,6,-7},
//                {2,-3,4},
//                {1,1,2}
//        };
//        double[] B={123,45,30};
//
//        double[] X=solveCramer(A,B);
//
//        if (X==null){
//            System.out.println("Система не имеет единого решения (определитель равен 0)");
//            return;
//        }
//        System.out.printf("Решение:%n");
//        System.out.printf("x=%.4f%n",X[0]);
//        System.out.printf("y=%.4f%n",X[2]);
//        System.out.printf("z=%.4f%n",X[2]);
//
//        System.out.println("\nПроверка (подстановка): ");
//        for (int i=0;i<3;i++){
//            double lhs=A[i][0]*X[0]+A[i][1]*X[1]+A[i][2]*X[2];
//            System.out.printf("Уравнение %d:%.4f(ожидалось %.4f)%n",i+1,lhs,B[i]);
//
//        }
//    }
//
//    private static double[] solveCramer(double[][]A,double[]B){
//        double detA=determinant3x3(A);
//        if(Math.abs(detA)<1e-9){
//            return null;
//        }
//        double[] result=new double[3];
//        for(int col=0;col<3;col++){
//            double[][] M=copyMatrix(A);
//            for(int row=0;row<3;row++){
//                M[row][col]=B[row];
//            }
//            result[col]=determinant3x3(M)/detA;
//        }
//        return result;
//    }
//
//    private static double determinant3x3(double[][] m){
//        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
//        - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
//        + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
//    }
//    private static double[][] copyMatrix(double[][] src){
//        double[][] dst=new double[3][3];
//        for(int i=0;i<3;i++){
//            System.arraycopy(src[i],0,dst[i],0,3);
//        }
//        return dst;
//    }
//}

