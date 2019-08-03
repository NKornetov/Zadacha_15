import java.util.Arrays;

public class Zadacha15 {
    public static void main(String[] args) {

        int [] massiv = {4, 5, 7, 2, 1, 8, 9, 0, 3, 6};


        for(int i = massiv.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

            if( massiv[j] > massiv[j+1] ){
                int tmp = massiv[j];
                massiv[j] = massiv[j+1];
                massiv[j+1] = tmp;
            }
        }
    }
        System.out.println(Arrays.toString(massiv));
}
    }
