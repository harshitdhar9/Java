import java.sql.*;
public class createdb {
    public static void main(String[] args) {
        try{
            Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/harshitdb1", "root", "mypass123");
            Statement stmt = conn.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM EMPTABLE");
            while(rs.next()){
                System.out.println("empid ="+rs.getInt("empid"));
                System.out.println("empname ="+rs.getString("empname"));
                System.out.println("empage ="+rs.getInt("empage"));
                System.out.println("empdep ="+rs.getString("empdep"));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
