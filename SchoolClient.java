import java.util.*;
//Logan Braun
public class SchoolClient {
    public static void main(String[] args)
    {
        /*
        //Use this code to help you test what you have written.
            School school = new School();
            System.out.println("School Roster: ");
            System.out.println("Freshmen: ");
            ArrayList<Student> frosh = school.getYear1();
            for(Student kid: frosh)
                System.out.println(kid);
            System.out.println("Sophomores: ");
            ArrayList<Student> soph = school.getYear2();
            for(Student kid: soph)
                System.out.println(kid);
            System.out.println("Juniors: ");
            ArrayList<Student> junior = school.getYear3();
            for(Student kid: junior)
                System.out.println(kid);
            System.out.println("Seniors: ");
            ArrayList<Student> senior = school.getYear4();
            for(Student kid: senior)
                System.out.println(kid);
            System.out.println("The average GPA of the school is " + school.calcSchoolAverageGpa());
            System.out.println("Dean's List:");
            ArrayList<Student> deans = school.deansList();
            for(Student kid: deans)
                System.out.println(kid.getLastName() + ", " + kid.getFirstName());
            school.removeDoubles();
            System.out.println("School Roster with Doubles removed: ");
            System.out.println("Freshmen: ");
            for(Student kid: frosh)
                System.out.println(kid);
            System.out.println("Sophomores: ");
            for(Student kid: soph)
                System.out.println(kid);
            System.out.println("Juniors: ");
            for(Student kid: junior)
                System.out.println(kid);
            System.out.println("Seniors: ");
            for(Student kid: senior)
                System.out.println(kid);


*/
        ArrayList<Student> year1 = new ArrayList<Student>();
        ArrayList<Student> year2 = new ArrayList<Student>();
        ArrayList<Student> year3 = new ArrayList<Student>();
        ArrayList<Student> year4 = new ArrayList<Student>();
        char[] gradesJ = {'A', 'B', 'C', 'A'};
        char[] gradesD = {'A', 'A', 'C', 'A'};
        year1.add(new Student("Jolie", "Keate", 247723, gradesJ, 2024));
        year1.add(new Student("Dobby", "Keate", 243456, gradesD, 2024));
        char[] gradesS = {'A', 'B', 'B', 'A', 'A'};
        char[] gradesL = {'A', 'A', 'A', 'A'};
        year2.add(new Student("John", "Smith", 237723, gradesS, 2023));
        year2.add(new Student("John", "Smith", 237723, gradesS, 2023));
        year2.add(new Student("Liz", "Keate", 236756, gradesL, 2023));
        char[] gradesM = {'C', 'B', 'C', 'A', 'A'};
        char[] gradesR = {'A', 'A', 'B', 'A'};
        year3.add(new Student("Mike", "Keate", 227723, gradesM, 2022));
        year3.add(new Student("Raul", "Hernandez", 227878, gradesR, 2022));
        char[] gradesMH = {'A', 'B', 'B', 'A', 'A'};
        char[] gradesDH = {'A', 'A', 'C', 'A'};
        year4.add(new Student("Mike", "Hernandez", 217723, gradesMH, 2021));
        year4.add(new Student("Mike", "Hernandez", 217723, gradesMH, 2021));
        year4.add(new Student("Dani", "Hernandez", 217735, gradesDH, 2021));
        School serra = new School(year1, year2, year3, year4);
        double schoolGPA = serra.calcSchoolAverageGpa();
        String findStudentCheck = serra.findStudent(217735).getFirstName();
        String deansListCheck = (serra.deansList().get(1).getFirstName());
//print schoolGpa
//print out findStudentCheck
//print out deansList or a member of deansList to see if your method works
        year4.add(0, new Student("Mike", "Hernandez", 217723, gradesMH, 2021));
        int checkRemoveDoubles = serra.removeDoubles();
//print out checkRemoveDoubles to see how many students would be removed
    }
}
