import java.sql.*;
//This program will insert the query string into the mysql table 'Empl1' in database 'Mydb'.
public class DBConn{
    public static void main(String[] args) {
//   Surronded with try catch to catch exception
        try{
// Insert Query to insert values into table
        String  query="Insert into Empl(empcode,ename,empage ,esalary)values(106,'Aadira',25,90000)";
//Storing connection URl in a string
        String url="jdbc:mysql://localhost/mydb?user=root&password=PHW#94#vithu";
//Try with resource block to automatically close the connection
try (
        Connection con = DriverManager.getConnection(url)) {
                PreparedStatement p=con.prepareStatement(query);
                p.executeUpdate();
        }}
        catch (SQLException e)
        {
                e.printStackTrace();//to print error
        }
        System.out.println("Records succesfully added");

        }
    }


