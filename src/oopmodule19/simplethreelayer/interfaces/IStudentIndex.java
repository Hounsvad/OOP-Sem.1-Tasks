/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule19.simplethreelayer.interfaces;

import javafx.collections.ObservableList;
import oopmodule19.simplethreelayer.domain.Student;

/**
 *
 * @author Pinnacle F
 */
public interface IStudentIndex {

    void addStudent(String name, int age);

    ObservableList<Student> getStudents();
    
}
