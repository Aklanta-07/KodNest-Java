public class Task3 {
    
    public static void main(String[] args) {
        int number = -7;
        int firstScore = 18;
        int secondScore = 25;

        if(number > 0) {
            System.out.println("+ve");
        } else if(number < 0) {
            System.out.println("-ve");
        }else {
            System.out.println("zero");
        }

        if(number % 2 == 0) {
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }

        if(firstScore > secondScore) {
            System.out.println("First Score is Larger" + firstScore);
        } else {
            System.out.println("Second Score is Larger" + secondScore);
        }

    }
}
