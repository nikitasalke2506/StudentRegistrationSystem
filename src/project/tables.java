///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package project;
//import java.sql.*;
//import javax.swing.JOptionPane;
///**
// *
// * @author Nikita
// */
//public class tables {
//    public static void main(String args[])
//    {
//    Connection con=null;
//    Statement st=null;
//    try
//    {
//    con=ConnectionProvider.getCon();
//    st=con.createStatement();
//    st.executeUpdate("create table users(STUDENT_NAME varchar(30) ,STUDENT_NUMBER int,STUDENT_DOB int,STUDENT_DOJ int)");
//    JOptionPane.showMessageDialog(null, "Table Created Successfully");
//    }
//    catch(Exception e)
//            {
//            JOptionPane.showMessageDialog(null, e);
//            }
//    finally
//    {
//            try
//    {
//    con.close();
//    st.close();
//    }
//    catch(Exception e)
//            {}
//    }
//    }
//}
