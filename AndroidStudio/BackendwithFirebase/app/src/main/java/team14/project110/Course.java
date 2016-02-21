package team14.project110;

import com.firebase.client.Firebase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2/2/2016.
 */
public class Course {
    String name;
    String departName;
    List<Professor> professors = new ArrayList<Professor>(); //List of courses within department

    //Default constructor
    public Course() {
        name = "";
    }
    //Constructor with course name

    public Course(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public String getDepartName(){
        return departName;
    }

    @Override
    public String toString(){
        return getName();
    }

    public List<Professor> getProfessors(){
        return professors;
    }

    //Add course to list of courses belonging to this department
    public void addProfessor(String name, int day) {
        //Check if course had already been added
     /*   if (professors.contains(name)) {
            return;
        } else {
        */
     //   Professor c = new Professor(name, day);

          //  professors.add(c);
       // }
    }
}
