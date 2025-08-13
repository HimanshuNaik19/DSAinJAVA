import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMask=1<<pos;

        // get operation
        if((bitMask & n)==0){
            System.out.println("bit was zero");
        }else {
            System.out.println("bit was one");
        }

        //set operation
        int newNumber = bitMask | n;
        System.out.println(newNumber);

        //clear operation
        int NotBitMask = ~(bitMask);
        int newNumber1 = NotBitMask & n;
        System.out.println(newNumber1);

        //update operation
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        if(operation == 1){
            int newNumber2 = bitMask | n;
            System.out.println(newNumber2);
        } else {
            int notBitMask = ~(bitMask);
            int newNumber3 = notBitMask & n;
            System.out.println(newNumber3);
        }


    }
}
