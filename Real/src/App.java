import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Operation.CreateStudentTable();
        System.out.println("welcome to student management\n\n");
        System.out.println("enter from the following menu");
        System.out.println("1.Add student\n2.Get Student's \n 3.Update student's \n 4.Remove student \n 0.Exit");
        int menu;
        Scanner sc = new Scanner(System.in);
        String first_name, last_name, date_of_birth, gender, email, mobile_number;
        Double gpa;
        menu = sc.nextInt();
        sc.nextLine();
        while (menu >= 1 && menu <= 4) {
            switch (menu) {
                case 1:
                    try {
                        System.out.println("enter firstname");
                        first_name = sc.nextLine();
                        System.out.println("enter last name");
                        last_name = sc.nextLine();
                        System.out.println("date of birth: dd-mm-yyyy");
                        date_of_birth = sc.nextLine();
                        DateFormat df = new SimpleDateFormat("dd-mm-yyyy");
                        Date d1 = df.parse(date_of_birth);
                        System.out.println("gender");
                        gender = sc.nextLine();
                        System.out.println("email");
                        email = sc.nextLine();
                        System.out.println("gpa");
                        gpa = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("mobile number");
                        mobile_number = sc.nextLine();
                        StudentDetails std = new StudentDetails(first_name, last_name, d1, gender, email, gpa,
                                mobile_number);
                        Operation.AddStudent(std);
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                    break;
                case 2:
                    try {

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                default:
                    break;
            }
            System.out.println("enter from the following menu");
            System.out.println("1.Add student\n2.Get Student's \n 3.Update student's \n 4.Remove student \n 0.Exit");
            menu = sc.nextInt();
            sc.nextLine();
        }

        sc.close();

    }
}
