
import java.util.Arrays
public class Main {
    public static void main(String[] args){
        // 3. comparando arrays
        int[] numbersA = new int[]{1,2,3};
        int[] numbersB = new int[]{1,2,3};

        System.out.println(numbersA == numbersB);
        System.out.println(numbersA.equals(numbersB));
        System.out.println(numbersA + " " + numbersB);
        System.out.println(Arrays.equals(numbersA, numbersB));

    }
}
