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
        
        // Test to find if grade is in map
        boolean studentinlist6 = studentGrades.containsValue(60);
        println("Does it contain grade 60 :" +studentinlist6);
        
         boolean studentinlist7 = studentGrades.containsValue(70);
        println("Does it contain grade 70 :" +studentinlist7);
        
        /* was trying to use this but gave me an error
        try(Close out = outExpect("studentGrades[bob]=80",EOL,
                                    "studentGrades[marc]=100",EOL,
                                    "studentGrades[mary]=80",EOL,
                                    "studentGrades[sally=97",EOL,
                                    "studentGrades[becky]=60",EOL )){
                    studentGrades.keySet().stream().forEach((key)-> {
            studentGrades.put(key,studentGrades.get(key));
        });
        
        for (String key : studentGrades.keySet()){
            println("studentGrades["+key+"]=" + studentGrades.get(key));
        }
                }*/
        
        
        //test if students are in the list
        boolean studentinlist = studentGrades.containsKey("sally");
        println("Is Sally in the list? :" +studentinlist);
        
        boolean studentinlist2 = studentGrades.containsKey("becky");
        println(" Is becky in the list? :" +studentinlist2);
         
        boolean studentinlist3 = studentGrades.containsKey("tom");
        println(" Is tom in the list? :" +studentinlist3);
        
        
        //test if contains a certain name
        assert (studentGrades.containsKey("sally")) == true;
        assert (studentGrades.containsKey("becky")) == true;
        assert (studentGrades.containsKey("brenda")) == false;
        assert (studentGrades.containsKey("ryan")) == true;
        
       
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
         
         //test if sorted
        boolean studentinlist8 = sortStudents.equals(expected);
        println("Are they sorted the same :" +studentinlist8);
        
       
         
          //test if student is still in list after removing
         assert (studentGrades.containsKey("becky")) == true;
         studentGrades.remove("becky");
         boolean studentinlist4 = studentGrades.containsKey("becky");
        println(" Is becky still in the list? :" +studentinlist4);
        assert (studentGrades.containsKey("becky")) == false;
        
    } 

}
