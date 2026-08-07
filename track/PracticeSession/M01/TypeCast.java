public class TypeCast {
      private static boolean dailyTarget;
public static void main(String[] args) {
int solvedProblems = 47;
int practiceDays = 5;
double exactPercentage = 86.75;
double reportValue = solvedProblems;
int wholePer = (int) exactPercentage;
double averagePerDay = reportValue / practiceDays;
if (averagePerDay >= 9.0) {
dailyTarget = true;
}
System.out.println("Report Value: "+ reportValue);
System.out.println("Whole Percentage: "+ wholePer);
System.out.println("Average Per Day: "+ averagePerDay);
System.out.println("Daily Target Reached: "+ dailyTarget);
}
}