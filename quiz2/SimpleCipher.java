import java.util.Scanner;



class SimpleCipher {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the word?");
        String str = scan.next();

        System.out.println("What is the amount shifted?");
        int shift = scan.nextInt();

        int conShift = shift;


        String newStr = "";

        for(int i = 0; i < str.length(); i++){

            shift = conShift;
            char chr = str.charAt(i);
            int asciiValue = (int) chr;
            

            if(asciiValue + shift >= 123){
                
                
                shift = (asciiValue + shift) - 122;

                asciiValue = (96);

            }


            asciiValue = asciiValue + shift;


            newStr = newStr + ((char) + asciiValue);




        }

        System.out.println(newStr);





    }






}


