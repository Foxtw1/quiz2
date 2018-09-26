import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;


class SimpleCipher {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the word?");
        String str = scan.next();

        System.out.println("What is the amount shifted?");
        int shift = scan.nextInt();


        String newStr = "";

        for(int i = 0; i < str.length(); i++){

            char chr = str.charAt(i);
            int asciiValue = (int) chr;
            if(asciiValue + shift > 122){

                asciiValue = (asciiValue + shift - 25);

            }
            asciiValue = asciiValue + shift;

            System.out.println(asciiValue);





        }






    }






}