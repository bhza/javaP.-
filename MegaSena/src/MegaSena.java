import java.util.Random;

public class MegaSena {
    public static void main(String[] args){
        Random generate = new Random();
        int i =0;
        // while(true) looping inifinito for (;;) também funciona igual o C.
        /*while(i<6){
            int number = generate.nextInt(60);
            System.out.println(number);
            i++;
        }*/

        for(i=0;i<6;i++){
            int number = generate.nextInt(60);
            System.out.println(number);
        }

    }
}
