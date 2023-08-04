package org.example.Repo;

import org.example.model.Student;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

@Repository
public class StudentRepo implements  StudentRepoImpl{

    String url = "jdbc:mysql://localhost:3306/studentdb";
    String user = "root";
    String pass = "";


    @Override
    public void login(Student student){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            st.executeUpdate("insert into student values('"+student.getId()+"','"+student.getRoll()+"','"+student.getName()+"','"+student.getEmail()+"','"+student.getDob()+"')");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
