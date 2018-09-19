import java.util.Scanner;

class Countdown {

    public static void main(String[] args) {
        
        java.util.Scanner scan = new Scanner(System.in);
        System.out.println("How long until lauch in minutes?");
        int min = scan.nextInt();


        int sec = 0;

        
        
        while (min >= 0){
            if (sec > 0 && sec < 60) {

                System.out.println("T-minus " + min + " minute " + sec + " seconds to launch");

                sec = sec - 10;

            }
            else if ((sec == 0 || sec == 60) && min > 0) {

                
                System.out.println("T-minus " + min + " minutes to launch");
                min = min - 1;

                sec = 50;


            }

            else if (min == 0 && sec == 0) {
                System.out.println("Missile Away!");
                break;
            }

        }




    }


}