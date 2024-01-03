import java.util.*;

public class StudentDetails {
    private String first_name;
    private String last_name;
    private Date date_of_birth;
    private String gender;
    private String email;
    private Double gpa;
    private String mobile_number;

    public StudentDetails(String first_name, String last_name, Date date_of_birth, String gender,
            String email, Double gpa, String mobile_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.gender = gender;
        this.email = email;
        this.gpa = gpa;
        this.mobile_number = mobile_number;
    }

    public String first_name() {
        return first_name;
    }

    public String last_name() {
        return last_name;
    }

    public Date date_of_birth() {
        return date_of_birth;
    }

    public String gender() {
        return gender;
    }

    public String email() {
        return email;
    }

    public Double gpa() {
        return gpa;
    }

    public String mobile_number() {
        return mobile_number;
    }
}
