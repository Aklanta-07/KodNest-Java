import java.util.Scanner;

public class CampusTrack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome Screen
        System.out.println("========================================================");
        System.out.println("                    CAMPUSTRACK");
        System.out.println("========================================================");
        System.out.println("       Student Academic Management System");
        System.out.println("--------------------------------------------------------");

        int choice = 1;

        do {
            // ====================== FR-02: Student Profile ======================
            System.out.print("Enter student ID: ");
            String studentId = scanner.next();
            scanner.nextLine(); // consume pending newline

            System.out.print("Enter full name: ");
            String fullName = scanner.nextLine();

            int age;
            while (true) {
                System.out.print("Enter age: ");
                age = scanner.nextInt();
                if (age >= 15 && age <= 35) {
                    System.out.println("Age accepted.");
                    break;
                }
                System.out.println("Invalid age. Enter a value between 15 and 35.");
            }

            System.out.print("Enter email: ");
            String email = scanner.next();

            // Course Selection
            String courseName = "";
            double baseSemesterFee = 0;
            int courseChoice;

            do {
                System.out.println("\nSelect course:");
                System.out.println("1. BCA");
                System.out.println("2. B.Sc Computer Science");
                System.out.println("3. B.E/B.Tech");
                System.out.println("4. MCA");
                System.out.println("5. Other");
                System.out.println();
                System.out.print("Enter course choice: ");
                courseChoice = scanner.nextInt();

                switch (courseChoice) {
                    case 1:
                        courseName = "BCA";
                        baseSemesterFee = 35000;
                        break;
                    case 2:
                        courseName = "B.Sc Computer Science";
                        baseSemesterFee = 30000;
                        break;
                    case 3:
                        courseName = "B.E/B.Tech";
                        baseSemesterFee = 50000;
                        break;
                    case 4:
                        courseName = "MCA";
                        baseSemesterFee = 45000;
                        break;
                    case 5:
                        courseName = "Other";
                        baseSemesterFee = 25000;
                        break;
                    default:
                        System.out.println("Invalid course choice. Select a value from 1 to 5.");
                }
            } while (courseChoice < 1 || courseChoice > 5);

            System.out.println("Course selected: " + courseName);

            int semester;
            while (true) {
                System.out.print("Enter semester (1-8): ");
                semester = scanner.nextInt();
                if (semester >= 1 && semester <= 8) {
                    System.out.println("Semester accepted.");
                    break;
                }
                System.out.println("Invalid semester. Enter a value between 1 and 8.");
            }

            scanner.nextLine(); // consume pending newline
            System.out.print("Enter career goal: ");
            String careerGoal = scanner.nextLine();

            // ====================== FR-03: Subject Marks ======================
            System.out.println();

            int javaMarks, sqlMarks, webMarks, aptitudeMarks, communicationMarks;

            while (true) {
                System.out.print("Enter Java marks: ");
                javaMarks = scanner.nextInt();
                if (javaMarks >= 0 && javaMarks <= 100) {
                    System.out.println("Java marks accepted.");
                    break;
                }
                System.out.println("Invalid marks. Enter a value between 0 and 100.");
            }

            while (true) {
                System.out.print("Enter SQL marks: ");
                sqlMarks = scanner.nextInt();
                if (sqlMarks >= 0 && sqlMarks <= 100) {
                    System.out.println("SQL marks accepted.");
                    break;
                }
                System.out.println("Invalid marks. Enter a value between 0 and 100.");
            }

            while (true) {
                System.out.print("Enter Web Technology marks: ");
                webMarks = scanner.nextInt();
                if (webMarks >= 0 && webMarks <= 100) {
                    System.out.println("Web Technology marks accepted.");
                    break;
                }
                System.out.println("Invalid marks. Enter a value between 0 and 100.");
            }

            while (true) {
                System.out.print("Enter Aptitude marks: ");
                aptitudeMarks = scanner.nextInt();
                if (aptitudeMarks >= 0 && aptitudeMarks <= 100) {
                    System.out.println("Aptitude marks accepted.");
                    break;
                }
                System.out.println("Invalid marks. Enter a value between 0 and 100.");
            }

            while (true) {
                System.out.print("Enter Communication marks: ");
                communicationMarks = scanner.nextInt();
                if (communicationMarks >= 0 && communicationMarks <= 100) {
                    System.out.println("Communication marks accepted.");
                    break;
                }
                System.out.println("Invalid marks. Enter a value between 0 and 100.");
            }

            // ====================== FR-04: Total and Percentage ======================
            int totalMarks = javaMarks + sqlMarks + webMarks + aptitudeMarks + communicationMarks;
            double percentage = (double) totalMarks / 5;

            // ====================== FR-05: Academic Result ======================
            boolean javaPassed = javaMarks >= 35;
            boolean sqlPassed = sqlMarks >= 35;
            boolean webPassed = webMarks >= 35;
            boolean aptitudePassed = aptitudeMarks >= 35;
            boolean communicationPassed = communicationMarks >= 35;

            boolean academicPassed = javaPassed && sqlPassed && webPassed
                    && aptitudePassed && communicationPassed && percentage >= 40;

            // ====================== FR-06: Grade Classification ======================
            String grade;
            if (!academicPassed) {
                grade = "F";
            } else if (percentage >= 85) {
                grade = "A+";
            } else if (percentage >= 75) {
                grade = "A";
            } else if (percentage >= 65) {
                grade = "B";
            } else if (percentage >= 50) {
                grade = "C";
            } else {
                grade = "D";
            }

            String academicResult = academicPassed ? "PASSED" : "FAILED";

            // ====================== FR-07: Attendance ======================
            System.out.println();

            int totalClasses;
            while (true) {
                System.out.print("Enter total classes conducted: ");
                totalClasses = scanner.nextInt();
                if (totalClasses >= 1 && totalClasses <= 300) {
                    break;
                }
                System.out.println("Invalid value. Total classes must be between 1 and 300.");
            }

            int attendedClasses;
            while (true) {
                System.out.print("Enter classes attended: ");
                attendedClasses = scanner.nextInt();
                if (attendedClasses >= 0 && attendedClasses <= totalClasses) {
                    System.out.println("Attendance accepted.");
                    break;
                }
                System.out.println("Invalid attendance. Attended classes cannot exceed " + totalClasses + ".");
            }

            double attendancePercentage = ((double) attendedClasses / totalClasses) * 100;
            String attendanceStatus = (attendancePercentage >= 75) ? "REGULAR" : "SHORTAGE";

            // ====================== FR-08: Assignment Score Processing ======================
            System.out.println();

            int numAssignments;
            while (true) {
                System.out.print("How many assignment scores do you want to enter? ");
                numAssignments = scanner.nextInt();
                if (numAssignments >= 1 && numAssignments <= 10) {
                    break;
                }
                System.out.println("Invalid number. Enter a value between 1 and 10.");
            }

            int assignmentTotal = 0;
            int validAssignmentCount = 0;

            for (int i = 1; i <= numAssignments; i++) {
                System.out.print("Enter score for assignment " + i + " (0-10, -1 to finish): ");
                int score = scanner.nextInt();

                if (score == -1) {
                    System.out.println("Assignment entry completed early.");
                    break;
                }

                if (score < 0 || score > 10) {
                    System.out.println("Invalid score. Assignment " + i + " skipped.");
                    continue;
                }

                assignmentTotal += score;
                validAssignmentCount++;
                System.out.println("Assignment score accepted.");
            }

            double assignmentAverage;
            if (validAssignmentCount > 0) {
                assignmentAverage = (double) assignmentTotal / validAssignmentCount;
            } else {
                assignmentAverage = 0.0;
            }

            boolean assignmentCriteriaPassed = (validAssignmentCount > 0) && (assignmentAverage >= 5);
            String assignmentStatus = assignmentCriteriaPassed ? "SATISFACTORY" : "NEEDS IMPROVEMENT";

            // ====================== FR-09: Scholarship Calculation ======================
            int scholarshipPercent;
            if (academicPassed && percentage >= 85 && attendancePercentage >= 85) {
                scholarshipPercent = 10;
            } else if (academicPassed && percentage >= 75 && attendancePercentage >= 75) {
                scholarshipPercent = 5;
            } else {
                scholarshipPercent = 0;
            }

            double scholarshipAmount = baseSemesterFee * scholarshipPercent / 100;
            double finalPayableFee = baseSemesterFee - scholarshipAmount;

            // ====================== FR-10: Fee Payment ======================
            System.out.println();
            System.out.printf("Final payable fee: ₹%.2f%n", finalPayableFee);

            double amountPaid;
            while (true) {
                System.out.print("Enter amount paid: ");
                amountPaid = scanner.nextDouble();
                if (amountPaid >= 0 && amountPaid <= finalPayableFee) {
                    System.out.println("Fee amount accepted.");
                    break;
                }
                System.out.printf("Invalid amount. Must be between 0 and %.2f%n", finalPayableFee);
            }

            double feeBalance = finalPayableFee - amountPaid;
            String feeStatus = (feeBalance == 0) ? "PAID" : "PENDING";

            // ====================== FR-11: Final Semester Clearance ======================
            boolean clearancePassed = academicPassed
                    && (attendancePercentage >= 75)
                    && assignmentCriteriaPassed
                    && (feeBalance == 0);

            String clearanceStatus = clearancePassed ? "CLEARED FOR NEXT SEMESTER" : "ACTION REQUIRED";

            // ====================== FR-14: Display Complete Report ======================
            System.out.println("\n========================================================");
            System.out.println("                 STUDENT SEMESTER REPORT");
            System.out.println("========================================================");
            System.out.printf("Student ID                 : %s%n", studentId);
            System.out.printf("Student Name               : %s%n", fullName);
            System.out.printf("Age                        : %d%n", age);
            System.out.printf("Email                      : %s%n", email);
            System.out.printf("Course                     : %s%n", courseName);
            System.out.printf("Semester                   : %d%n", semester);
            System.out.printf("Career Goal                : %s%n", careerGoal);

            System.out.println("\n---------------- ACADEMIC SUMMARY --------------------");
            System.out.printf("Java Marks                 : %d%n", javaMarks);
            System.out.printf("SQL Marks                  : %d%n", sqlMarks);
            System.out.printf("Web Technology Marks       : %d%n", webMarks);
            System.out.printf("Aptitude Marks              : %d%n", aptitudeMarks);
            System.out.printf("Communication Marks        : %d%n", communicationMarks);
            System.out.printf("Total Marks                : %d/500%n", totalMarks);
            System.out.printf("Percentage                 : %.2f%%%n", percentage);
            System.out.printf("Academic Result            : %s%n", academicResult);
            System.out.printf("Grade                      : %s%n", grade);

            System.out.println("\n---------------- ATTENDANCE SUMMARY ------------------");
            System.out.printf("Classes Conducted          : %d%n", totalClasses);
            System.out.printf("Classes Attended           : %d%n", attendedClasses);
            System.out.printf("Attendance Percentage      : %.2f%%%n", attendancePercentage);
            System.out.printf("Attendance Status          : %s%n", attendanceStatus);

            System.out.println("\n---------------- ASSIGNMENT SUMMARY ------------------");
            System.out.printf("Valid Assignments          : %d%n", validAssignmentCount);
            System.out.printf("Assignment Total           : %d%n", assignmentTotal);
            System.out.printf("Assignment Average         : %.2f%n", assignmentAverage);
            System.out.printf("Assignment Status          : %s%n", assignmentStatus);

            System.out.println("\n---------------- FEE SUMMARY -------------------------");
            System.out.printf("Base Semester Fee          : ₹%.2f%n", baseSemesterFee);
            System.out.printf("Scholarship Percentage     : %d%%%n", scholarshipPercent);
            System.out.printf("Scholarship Amount         : ₹%.2f%n", scholarshipAmount);
            System.out.printf("Final Payable Fee          : ₹%.2f%n", finalPayableFee);
            System.out.printf("Amount Paid                : ₹%.2f%n", amountPaid);
            System.out.printf("Fee Balance                : ₹%.2f%n", feeBalance);
            System.out.printf("Fee Status                 : %s%n", feeStatus);

            System.out.println("\n---------------- FINAL STATUS ------------------------");
            System.out.printf("Semester Clearance         : %s%n", clearanceStatus);

            // ====================== FR-12: Failed Conditions ======================
            System.out.println("\n---------------- FAILED CONDITIONS -------------------");

            boolean hasFailedConditions = false;

            if (!javaPassed) {
                System.out.println("- Java marks are below 35.");
                hasFailedConditions = true;
            }
            if (!sqlPassed) {
                System.out.println("- SQL marks are below 35.");
                hasFailedConditions = true;
            }
            if (!webPassed) {
                System.out.println("- Web Technology marks are below 35.");
                hasFailedConditions = true;
            }
            if (!aptitudePassed) {
                System.out.println("- Aptitude marks are below 35.");
                hasFailedConditions = true;
            }
            if (!communicationPassed) {
                System.out.println("- Communication marks are below 35.");
                hasFailedConditions = true;
            }
            if (percentage < 40) {
                System.out.println("- Overall percentage is below 40%.");
                hasFailedConditions = true;
            }
            if (attendancePercentage < 75) {
                System.out.println("- Attendance is below 75%.");
                hasFailedConditions = true;
            }
            if (!assignmentCriteriaPassed) {
                if (validAssignmentCount == 0) {
                    System.out.println("- No valid assignment score was entered.");
                } else {
                    System.out.println("- Assignment average is below 5.00.");
                }
                hasFailedConditions = true;
            }
            if (feeBalance > 0) {
                System.out.println("- Semester fee is pending.");
                hasFailedConditions = true;
            }

            if (!hasFailedConditions) {
                System.out.println("None");
            }

            // ====================== FR-13: Recommendations ======================
            System.out.println("\n---------------- RECOMMENDATIONS ---------------------");

            if (!hasFailedConditions) {
                System.out.println("Maintain the current performance in the next semester.");
            } else {
                if (!javaPassed || !sqlPassed || !webPassed || !aptitudePassed || !communicationPassed) {
                    System.out.println("- Revisit the failed subject and complete additional practice.");
                }
                if (percentage < 40) {
                    System.out.println("- Improve overall academic performance.");
                }
                if (attendancePercentage < 75) {
                    System.out.println("- Attend classes regularly and clear the attendance shortage.");
                }
                if (!assignmentCriteriaPassed) {
                    System.out.println("- Complete assignments consistently and maintain an average of at least 5.00.");
                }
                if (feeBalance > 0) {
                    System.out.println("- Pay the pending semester fee before clearance.");
                }
            }

            System.out.println("========================================================");

            // ====================== FR-14: Process Another Student ======================
            System.out.println();
            System.out.println("Do you want to process another student?");
            System.out.println("1. Yes");
            System.out.println("0. No");
            System.out.print("Enter choice: ");

            while (true) {
                choice = scanner.nextInt();
                if (choice == 1 || choice == 0) {
                    break;
                }
                System.out.println("Invalid choice. Enter 1 for Yes or 0 for No.");
                System.out.print("Enter choice: ");
            }

            System.out.println();

        } while (choice == 1);

        System.out.println("Thank you for using CampusTrack.");
        scanner.close();
    }
}