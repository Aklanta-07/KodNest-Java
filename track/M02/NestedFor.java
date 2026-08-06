public class NestedFor {
    public static void main(String[] args) {
        
        for(int day = 1; day <= 7; day++) {

            System.out.println(day + " Day");

            for(int hour = 1; hour <= 6; hour++) {

                System.out.println("" + day + ":" + hour);

            }

        }

    }
}
