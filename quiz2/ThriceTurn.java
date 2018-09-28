import java.awt.font.NumericShaper.Range;
import java.util.Scanner;
import java.lang.Math;

class ThriceTurn {

    public static void main(String[] args) {
        
        int i = 0;
        int a = 0;
        int b = 1;
        int c = 2;
        int a1 = 0;
        int b1 = 0;
        int c1 = 0;


        int count = 0;
        double tally = 0;

        System.out.println("Round 1");
        while(i == 0) {

            count = count + 1;
            a = (int) (Math.random() * 6 + 1);
            b = (int) (Math.random() * 6 + 1);
            c = (int) (Math.random() * 6 + 1);

            //System.out.println(a);
            //System.out.println(b);
            //System.out.println(c);

            if(a == b && b == c && a == c){
                tally = tally + (a + b + c);
                System.out.println(tally);
                a1 = a;
                b1 = b;
                c1 = c;
                break;

            }


 
            tally = tally + (a + b + c);

            System.out.println(tally);
            
            


        }
        
        System.out.println("Round 2");
        for(i = 0; i < (a + b + c); i++){


            a = (int) (Math.random() * 6 + 1);
            b = (int) (Math.random() * 6 + 1);
            c = (int) (Math.random() * 6 + 1);

            tally = tally + (a * b * c);

            System.out.println(tally);

        }


        int n = 0;

        System.out.println("Round 3");
        while(i != 0) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Do you wish to retire? yes or no.");
            String str = scan.next();


            if(str.equals("yes")){
                System.out.println(tally);

                break;
    
            }




            a = (int) (Math.random() * 6 + 1);
            b = (int) (Math.random() * 6 + 1);
            c = (int) (Math.random() * 6 + 1);
            
            if(a == a1 && b == b1 && c == c1){

                tally = tally * 3;
                System.out.println("Big Win!");

                System.out.println(tally);
                break;


            }

            if(a == b && b == c && a == c){
                tally = a + b + c;
                System.out.println("Big Loss!");

                System.out.println(tally);

                break;

            }

            tally = tally + Math.pow(3, n);
            System.out.println(tally);
            System.out.println(n);


            n++;





        }
        System.out.println("Total Tally: " + tally);

        
    }





}