/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradesort;
import static kiss.API.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
/**
 *
 * @author Cristina
 */
public class GradeSort {

    
    public static void main(String[] args) {
         Map<String, Integer> studentGrades = new HashMap<String, Integer>();
        
        studentGrades.put("sally", 97);
        studentGrades.put("becky", 60);
        studentGrades.put("mary", 80);
        studentGrades.put("marc", 100);
        studentGrades.put("bob", 80);
        
        println("Normal list");
        System.out.println(studentGrades);
        
        //check if students are in the list
        boolean studentinlist = studentGrades.containsKey("sally");
        println("Is Sally in the list? :" +studentinlist);
        
        boolean studentinlist2 = studentGrades.containsKey("becky");
        println(" Is becky in the list? :" +studentinlist2);
         
        boolean studentinlist3 = studentGrades.containsKey("tom");
        println(" Is tom in the list? :" +studentinlist3);
        
        
        assert (studentGrades.containsKey("sally")) == true;
        assert (studentGrades.containsKey("becky")) == true;
        assert (studentGrades.containsKey("brenda")) == false;
        
       
        //size of the class
       println("The size of the class is :" + studentGrades.size());
       
       //sorted by name
       println("Here is the sorted list by names");
        Map<String, Integer> sortStudents = new TreeMap<String, Integer>(studentGrades);
        
        Set sort_Students = sortStudents.entrySet();
        Iterator i = sort_Students.iterator();
         while (i.hasNext()) {
             Map.Entry grade = (Map.Entry)i.next();
             println(grade.getKey() + " " + grade.getValue());
            
         }
         
         
       
         
         // is becky in the list
         assert (studentGrades.containsKey("becky")) == true;
         studentGrades.remove("becky");
         boolean studentinlist4 = studentGrades.containsKey("becky");
        println(" Is becky still in the list? :" +studentinlist4);
        assert (studentGrades.containsKey("becky")) == false;
    }
    
    
}
