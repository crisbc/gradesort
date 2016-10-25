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
import static jdk.nashorn.internal.parser.TokenType.EOL;
/**
 *
 * @author Cristina
 */
public class GradeSort {

    
    public static void main(String[] args) {
         Map<String, Integer> studentGrades = new HashMap<>();
        
        studentGrades.put("sally", 97);
        studentGrades.put("becky", 60);
        studentGrades.put("mary", 80);
        studentGrades.put("marc", 100);
        studentGrades.put("bob", 80);
        
        println("Normal list");
        System.out.println(studentGrades);
        
        //test expected names
        Map<String, Integer> expected = new HashMap<>();
        
        expected.put("becky", 60);
        expected.put("bob", 80);
        expected.put("marc", 100);
        expected.put("mary", 80);
         expected.put("sally", 97);
        
        
        //1. Test if equal but ignore order
        assert (studentGrades.equals(expected));
         boolean studentinlist5 = studentGrades.equals(expected);
        println("Are they the same names :" +studentinlist5);
        
        
      
       //sorted by name
       println("Here is the sorted list by names");
        Map<String, Integer> sortStudents = new TreeMap<String, Integer>(studentGrades);
        
        Set sort_Students = sortStudents.entrySet();
        Iterator i = sort_Students.iterator();
         while (i.hasNext()) {
             Map.Entry grade = (Map.Entry)i.next();
             println(grade.getKey() + " " + grade.getValue());
            
         }
         
         //test if sorted
        boolean studentinlist8 = sortStudents.equals(expected);
        println("Are they sorted the same :" +studentinlist8);
           
      
    } 
    void testIfInList(){
        //Map<String, Integer> studentGrades.entrySet() ;
       
       HashMap studentGrades = new HashMap();
        studentGrades.put("sally", 97);
        studentGrades.put("becky", 60);
        studentGrades.put("mary", 80);
        studentGrades.put("marc", 100);
        studentGrades.put("bob", 80);
       
        
         //test if contains a certain name
        assert (studentGrades.containsKey("sally")) == true;
        assert (studentGrades.containsKey("becky")) == true;
        assert (studentGrades.containsKey("brenda")) == false;
        assert studentGrades.containsKey("billy") == false;
        boolean studentinlist2 = studentGrades.containsKey("billy");
        println(" Is billy in the list ? :" +studentinlist2);
    }
    
    void testIfRemoved(){
        HashMap studentGrades = new HashMap();
       studentGrades.put("sally", 97);
       studentGrades.remove("sally");
       assert studentGrades.containsKey("sally") == false;
        
    }
    
    void testIfGradeInList() {
        HashMap studentGrades = new HashMap();
        studentGrades.put("sally", 97);
        studentGrades.put("becky", 60);
        studentGrades.put("mary", 80);
        studentGrades.put("marc", 100);
        studentGrades.put("bob", 80);
        
        
        assert studentGrades.containsValue(60) == true;
        assert studentGrades.containsValue(97) == true;
        assert studentGrades.containsValue(106)== false;
     
    }
    
  
    void testSmallStudentList() {
        println("test1");
    }
    
    
    
    void run() {
        main(APP_ARGS);
    }

}
