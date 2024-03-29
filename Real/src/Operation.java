import java.sql.Statement;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Operation {
    public static void CreateStudentTable() {
        try {
            Connection con = Database.Connections.connectToDB();
            Statement st = con.createStatement();
            String Query = Database.Queries.createTable;
            st.execute(Query);
            // System.out.println("table student created successfully");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void AddStudent(StudentDetails std) {
        try {
            Connection con = Database.Connections.connectToDB();
            String Query = Database.Queries.insert;
            PreparedStatement prst = con.prepareStatement(Query);
            prst.setString(1, std.first_name());
            prst.setString(2, std.last_name());
            java.util.Date utilDate = std.date_of_birth();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            prst.setDate(3, sqlDate);
            prst.setString(4, std.gender());
            prst.setString(5, std.email());
            prst.setBigDecimal(6, new BigDecimal(std.gpa()));
            prst.setString(7, std.mobile_number());
            prst.execute();
            prst.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static ResultSet ReadStudent() {
        try {
            Connection con = Database.Connections.connectToDB();
            String Query = Database.Queries.read;
            PreparedStatement ps = con.prepareStatement(Query);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public static void UpdateStudent(int student_id, String columnName, String data) {
        try {
            Connection con = Database.Connections.connectToDB();
            String UpdateQuires = String.format(Database.Queries.update, columnName);
            PreparedStatement prst = con.prepareStatement(UpdateQuires);
            prst.setString(1, data);
            prst.setInt(2, student_id);
            prst.executeUpdate();
            System.out.println("data updated successfully");
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void DeleteStudent(int student_id) {
        try {
            Connection con = Database.Connections.connectToDB();
            String Query = Database.Queries.delete;
            PreparedStatement prst = con.prepareStatement(Query);
            prst.setInt(1, student_id);
            System.err.println("student " + student_id + " deleted successfully");
            prst.execute();
            prst.close();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
