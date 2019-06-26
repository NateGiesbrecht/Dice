import java.util.Scanner;


public class Main {

        public static int rolls;
        public static int sides;
        public static int index;

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Input dice");
            String input = in.next();
            System.out.println(input);
            index = indexOfD(input);
            rolls = howManyRolls(index, input);
            sides = howManySides(index, input);

            rollDice(rolls,sides);

        }
        public static void rollDice(int rolls, int sides){
            int sum = 0;
            System.out.println("rolls : "+ rolls + "sides : " + sides);
            for(int i = 0; i < rolls; i++){
                int roll = 1+ (int)(Math.random() * ( sides  ));
                System.out.println("You rolled : " + roll);
                sum = sum + roll;
            }
            System.out.println("Total roll was : " + sum);
        }

        public static int indexOfD(String input){
            int index = 0;
            for(int i = 0; i < input.length(); i++){
                if (input.charAt(i) == 'd')
                    index = i;
            }
            return index;
        }

        public static int howManySides(int index, String input){
            String sides = "";
            System.out.println(index);
            for(int i = index+1; i < input.length(); i++){
                sides = sides + input.charAt(i);
            }
            return Integer.parseInt(sides);
        }

    public static int howManyRolls(int index, String input){
        String rolls = "";
        for(int i = 0; i < index; i++){
            rolls = rolls + input.charAt(i);
        }
        return Integer.parseInt(rolls);
    }

}
