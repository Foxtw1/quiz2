import java.awt.font.NumericShaper.Range;

class ThriceSimulation {

    public static void main(String[] args) {
        
        int i = 0;
        int a = 0;
        int b = 1;
        int c = 2;
        int count = 0;
        int totalTally = 0;


        for(int n = 0; n < 1000; n++){
            int tally = 0;

            while(i == 0) {

                count = count + 1;
                a = (int) (Math.random() * 6 + 1);
                b = (int) (Math.random() * 6 + 1);
                c = (int) (Math.random() * 6 + 1);


                if(a == b && b == c && a == c){
                    tally = tally + (a * b * c);
                    break;


                }
                if(count == 3){
                    tally = tally - (a + b + c);
                    count = 0;
                }
                else{
                    tally = tally + (a + b + c);


                }



            }
            totalTally = totalTally + tally;

            System.out.println(tally);

        }
        double avg = totalTally / 1000.0;
        System.out.println(avg);

    }





}


