public class NestedWhile {
    public static void main(String[] args) {
        int day = 1;
        int hour = 1;

        while(day <= 7) {
            System.out.println(day + " Day");
            hour = 1;
            while(hour <= 6) {
                System.out.println("" + day + ":" + hour);
                hour++;
            }
            day++;
        }
    }
}
