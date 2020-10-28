/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Course;
import java.util.Vector;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class Course_DAO {
    
    private Vector<Course> vector;
    
    public Course_DAO(Vector<Course> vector) {
        this.vector = vector;
    }
    
    public Course checkCourseDuplicate(String code) {
        for (Course course : vector) {
            if (course.getCode().equals(code)) {
                return course;
            }
        }
        return null;
    }
    
    public boolean addCourse(Course course) {
        int firstValue = vector.size();
        vector.add(course);
        int secondValue = vector.size();
        if (firstValue < secondValue) {
            return true;
        }
        return false;
    }
    
    public boolean checkInputValues(String code, int mark) {
        return (Pattern.matches("^[A-Z0-9]+$", code) && mark == 1)
                || (Pattern.matches("^[A-Za-z]+(\\ [A-Za-z0-9]+)*$", code) && mark == 2)
                || (Pattern.matches("^[0-9]+$", code) && mark == 3);        
    }
}
