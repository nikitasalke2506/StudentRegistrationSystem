/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author Nikita
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionProvider 
{
    public static Connection getCon()
    {
        try
        {
              Class.forName("com.mysql.cj.jdbc.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","root","root");
              return con;
        }
        catch(Exception e)
        {
        return null;
        }
    }
    
}