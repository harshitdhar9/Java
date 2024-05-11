import java.sql.*;
public class dbtrial{
    static final String db_url="jdbc:mysql://localhost:3306/harshitdb1";
    static final String username="root";
    static final String password="mypass123";

    static final String query="INSERT INTO EMPTABLE VALUES(7,'SICO',28,'ACCOUNTANT')";
    static final String query2="DELETE FROM EMPTABLE WHERE EMPNAME='DAVID'";
    static final String query3="SELECT * FROM EMPTABLE";
    public static void main(String[] args) {
        try{
            Connection conn =DriverManager.getConnection(db_url,username,password);
            Statement stmt = conn.createStatement();
            int i=stmt.executeUpdate(query);
            System.out.println("Insert happened!");
            if(i==1){
                stmt.executeUpdate(query2);
                System.out.println("Row Deleted.");
            }
            Boolean bool = stmt.execute(query3);
            if(bool){
                System.out.println("Table Data Can be Printed");
            }
            else{
                System.out.println("Table Data Cant be Printed");
            }
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
