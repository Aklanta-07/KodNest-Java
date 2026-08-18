 class MainOne {
public static void main(String[] args) {
int javaHours = 2;
int aptiHours = 1;
int noofDay = 5;
int weeklyJavaHours = javaHours * noofDay;
int weeklyAptiHours = aptiHours * noofDay;
int totalPreparationHours = weeklyJavaHours + weeklyAptiHours;
System.out.println("Java: " + weeklyJavaHours);
System.out.println("Aptitude: " + weeklyAptiHours);
System.out.println("Total: " + totalPreparationHours);
}
}