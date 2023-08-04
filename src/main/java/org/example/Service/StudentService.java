package org.example.Service;

import org.example.Repo.StudentRepoImpl;
import org.example.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService implements StudentServiceImpl{
    @Autowired
    private StudentRepoImpl repo;
    @Override
    public void login(Student student){
        repo.login(student);
    }
}
