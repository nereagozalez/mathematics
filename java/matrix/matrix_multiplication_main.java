package matrix;
import java.util.Random;
public class matrix_multiplication_main{
    public static void main(String[] args) {

        int [][] matrizUno  = new int [2][2];
        int [][] matrizDos  = new int [2][2];
        int [][] mC         = new int [1][3];
        int scalar = 5;

        System.out.println("Matriz Uno:");
        matrizUno = fill_matrix(matrizUno);
        print_matrix(matrizUno);
        System.out.println("Matriz Dos:");
        matrizDos = fill_matrix(matrizDos);
        print_matrix(matrizDos);
        System.out.println("AB");
        print_matrix(multiplication(matrizUno, matrizDos));
        System.out.println("eA");
        print_matrix(scalar_product(scalar, matrizUno));
        System.out.println("A + B");
        print_matrix(sum(matrizUno,matrizDos));
        System.out.println("Ct");
        mC = fill_matrix(mC);
        print_matrix((mC));
        print_matrix(transposed_matrix(mC));

    }

    public static int[][] fill_matrix(int [][] matrix) {

        Random r = new Random(1);

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){

                matrix[i][j] = r.nextInt(5);
            }

        }

        return matrix; 
    }

    public static void print_matrix(int[][]matrix) {

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){

                System.out.print(" " + matrix[i][j] );
            }
            System.out.println();
        }

    }

    public static int[][] multiplication(int[][] matrix_one, int[][] matrix_two) {

        //multiplicación de matrices --> p(ij) = m(ik)*m(kj)

        int [][] p = new int[matrix_one.length][matrix_two[0].length];

        for(int i = 0; i < p.length; i++){
            for (int j = 0; j < p.length; j++) {
                for (int k = 0; k < p.length; k++) {
                    p[i][j] += matrix_one[i][k] * matrix_two[k][j];
                }

            }
        }

        return p;
    }

    public static int[][] scalar_product(int scalar, int[][] matrix) {

        //p(ij) = s(a(ij))
        int [][] p = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                p[i][j] = scalar * matrix[i][j];
            }
        }

        return p;
        
    }

    public static int[][] sum( int[][]matrix_one, int[][]matrix_two ) {
        
        int [][] sum = new int [matrix_one.length][matrix_one.length];

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length; j++) {
                sum[i][j] = matrix_one[i][j] + matrix_two[i][j];
            }
        }

        return sum;
        
    }

    public static int[][] transposed_matrix(int[][]matrix) { //(1 2 4)

        int [][] transposed = new int [matrix[0].length][matrix.length];

        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[0].length; j++) {
                transposed[i][j] = matrix[j][i];
            }
        }

        return transposed;
        
    }
}
