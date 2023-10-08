package math;

import java.sql.*;
public class Mysql {

    public static void main(String[] args) {
        try{

            String sql = "insert into emp values(1,\"nikhil\",\"sur\",23)";

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://192.168.16.174:3306/mydb","root","root");
            Statement stmt=con.createStatement();
            stmt.executeUpdate(sql);
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}

