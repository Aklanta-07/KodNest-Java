public class BreakInNestedLoop {
    public static void main(String[] args) {
        for(int i = 1; i <=10; i++) {
            for(int j = 1; j <= 10; j++) {
                if(j == 5) {
                    break;
                }
                System.out.println(i +" "+j);
            }
        }
    }
}
