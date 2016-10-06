package com.mycompany.studentregdriver;

import com.mycompany.studentreg.Module;
import com.mycompany.studentreg.Programme;
import com.mycompany.studentreg.Student;
import java.util.Arrays;
import org.joda.time.DateTime;

public class Driver {

    
public static void main(String[] args)
{
registration(); 
}
    
public static void registration()
{
Student a = new Student("Eric", 20, "12/12/1995", 13345687);
Student b = new Student("Alison", 19, "12/07/1995", 13346327);
Student c = new Student("Jamie", 19, "12/08/1994", 13343124);
Student d = new Student("Indy", 18, "21/10/1993", 13378903);
Student e = new Student("Fergus", 20, "20/07/1995", 13479054);

String[] studentList = new String[]{a.getName(), b.getName(), c.getName(),d.getName(), e.getName() };

System.out.println("list of all students:");
System.out.println(Arrays.toString(studentList));

Student[] students1 = new Student[]{a,b,c};
Student[] students2 = new Student[]{c,d,e};
Student[] students3 = new Student[]{a,e,b};


Module a2 = new Module("Professional skills", "CT342", students1 );
Module b2 = new Module("Machine learning", "CT432", students2 );
Module c2 = new Module("Software Engineering", "CT476", students3 );

System.out.println("list of students taking Professional skills(CT342):");
a2.getStudentsTakingModule();

System.out.println("list of students taking Machine learning(CT432):");
b2.getStudentsTakingModule();

System.out.println("list of students taking Software Engineering(CT476):");
c2.getStudentsTakingModule();

Module[] modules1 = new Module[]{a2, b2};
Module[] modules2 = new Module[]{c2, b2};
Module[] modules3 = new Module[]{a2, c2};
    
DateTime yearStart = new DateTime(2016, 7, 1, 0, 0, 0, 0);
DateTime yearEnd = new DateTime(2017, 5, 1, 0, 0, 0, 0);

Programme a3 = new Programme("Computer Science", modules1, yearStart , yearEnd);
Programme b3 = new Programme("Arts", modules2, yearStart , yearEnd);
Programme c3 = new Programme("Law", modules3, yearStart , yearEnd );


System.out.println("list of students registered for Computer Science:");
a3.getModulesForProgramme();

System.out.println("list of students registered for Arts:");
b3.getModulesForProgramme();

System.out.println("list of students registered for Law:");
c3.getModulesForProgramme();
}

}
