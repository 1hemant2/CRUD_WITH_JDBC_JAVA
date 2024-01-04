package Database;

public class Queries {
    public static String createTable = """
            CREATE TABLE IF NOT EXISTS student(
                student_id INT AUTO_INCREMENT PRIMARY KEY,
                first_name VARCHAR(50),
                last_name VARCHAR(50),
                date_of_birth DATE,
                gender VARCHAR(10),
                email VARCHAR(100),
                gpa DECIMAL(4, 2),
                mobile_number VARCHAR(15)
                )
                      """;
    public static String insert = """
            INSERT INTO student (
            first_name,
            last_name,
            date_of_birth,
            gender,
            email,
            gpa,
            mobile_number) VALUES(?,?,?,?,?,?,?)
            """;
    public static String read = "select * from student";
    public static String update = "UPDATE student SET %s=? where student_id=?";
    public static String delete = "DELETE FROM student WHERE student_id=?";
}
