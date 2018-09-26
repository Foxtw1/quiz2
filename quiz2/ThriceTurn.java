import java.awt.font.NumericShaper.Range;
import java.util.Scanner;

class ThriceTurn {

    public static void main(String[] args) {
        
        int i = 0;
        int a = 0;
        int b = 1;
        int c = 2;
        int count = 0;
        int tally = 0;


        while(i == 0) {

            count = count + 1;
            a = (int) (Math.random() * 6 + 1);
            b = (int) (Math.random() * 6 + 1);
            c = (int) (Math.random() * 6 + 1);

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

            if(a == b && b == c && a == c){
                tally = tally + (a * b * c);
                System.out.println(tally);
                break;


            }
            if(count == 3){
                Scanner scan = new Scanner(System.in);
                System.out.println("Do you wish to retire? Yes or No.");
                String str = scan.next();
    
                if(str.equals("Yes")){
                    break;
    
                }
                count = 0;
            }
            else if(count == 3){
                
                
            }
            else{
                tally = tally + (a + b + c);


            }



            System.out.println(tally);
            
            


        }







    }





}