public class NestedDoWhile {
    public static void main(String[] args) {
        int day = 1;
        int hour = 1;

        do {
            System.out.println(day + " Day");
            hour = 1;
            do {
                System.out.println("" + day + ":" + hour);
                hour++;
            } while(hour <= 6);
            day++;
        } while(day <= 7);
    }
}
