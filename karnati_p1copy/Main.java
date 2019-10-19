


import java.util.Random;
import java.util.Scanner;

public class Main {

        public static int SecureRandom(int i) {

            Random seed = new Random();
            int int1 = seed.nextInt(i) ;
            return int1;
        }

        public static int  questionGenerator(int level, int operation) {

            int answer = 0;
            int option5;
            int num  =  (int) Math.pow(10 ,level) + 1;
            int int1 = SecureRandom(num);
            int int2 = SecureRandom(num);

             if (operation == 1){
                  answer =  int1 + int2;
                  System.out.println("How much is " + int1 + " plus " + int2+"?");
             }
             else if (operation == 2){
                  answer =  int1 * int2;
                 System.out.println("How much is " + int1 + " times " + int2+"?");
             }
             else if (operation == 3){
                 answer = int2 - int1;
                 System.out.println("How much is " + int1 + " minus" + int2+"?");
             }
             else if (operation == 4){
                 answer =  int1 / int2;
                 System.out.println("How much is " + int1 + " divided by " + int2+"?");
             }
             else if (operation == 5){
                 option5 = SecureRandom(4) + 1;
                 return questionGenerator(level,option5);
             }
            int i = 0;

            Scanner object = new Scanner(System.in);
            int response = object.nextInt();

            if (response == answer) {
                i = SecureRandom(4);
                switch (i) {
                    case 0:
                        System.out.println("Very good!");
                        break;
                    case 1:
                        System.out.println("Excellent!");
                        break;
                    case 2:
                        System.out.println("Nice work!");
                        break;
                    case 3:
                        System.out.println("Keep up the good work!");
                        break;
                }
                return 1;

            } else {
                i = SecureRandom(4);
                switch (i) {
                    case 0:
                        System.out.println("No. Please try again.>again.");
                        break;
                    case 1:
                        System.out.println("Wrong. Try once more.");
                        break;
                    case 2:
                        System.out.println("Don’t give up!");
                        break;
                    case 3:
                        System.out.println("No. Keep trying.");
                        break;
                }

                return 0;
            }

        }


        public static void main(String[] args) {

            int x,z, choice=0;
            int [] y = new int [10];
            double sum = 0, avg = 0;
            int level;
            int operation;
            Scanner choose = new Scanner((System.in));

            System.out.println("select the level from 1- 4");
            level= choose.nextInt();

            while (choice == 0){

                System.out.println("select the operation 1:add, 2:multiply, 3:subtraction, 4:division, 5: random");
                operation = choose.nextInt();

                for (x = 0; x <= 9; x++) {
                    y[x] = questionGenerator(level, operation);
                }

                for (z = 0; z <= 9; z++) {
                    sum = sum + y[z];
                }
                avg = sum / 10;

                if( avg < 0.75){
                    System.out.println("Please ask your teacher for extra help.");
                }
                else{
                    System.out.println( "Congratulations, you are ready to go to the next level!");
                }

                System.out.println("please enter 0 if you would like to reset");
                choice = choose.nextInt();

                sum = 0;

            }
            return;
        }
}
