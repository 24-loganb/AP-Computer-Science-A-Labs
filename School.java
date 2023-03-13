// Logan Braun
import java.util.*;
public class School {

    private ArrayList<Student> year1 = new ArrayList<>();
    private ArrayList<Student> year2 = new ArrayList<>();
    private ArrayList<Student> year3 = new ArrayList<>();
    private ArrayList<Student> year4 = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    //School constructors
    public School()
    {
        System.out.println("Please enter the year of the first student as an integer between 1 & 4 (1 = freshman, 2 = sophomore, 3 = junior, 4 = senior) or any other number to quit: ");
        int year = in.nextInt();
        //Hint 1
        while((year>0) && (year <5))
        {
           //Hint 1
            if (year == 1)
            {
                year1.add(new Student());
            }
            else if (year == 2)
            {
                year2.add(new Student());
            }
            else if (year == 3)
            {
                year3.add(new Student());
            }
            else if (year == 4)
            {
                year4.add(new Student());
            }
            System.out.println("Please enter the year of the first student as an integer between 1 & 4 (1 = freshman, 2 = sophomore, 3 = junior, 4 = senior) or any other number to quit: ");
            year = in.nextInt();
        }
        alphabetizeList(year1);
        alphabetizeList(year2);
        alphabetizeList(year3);
        alphabetizeList(year4);
    }

    public School(ArrayList<Student> year1, ArrayList<Student> year2, ArrayList<Student> year3, ArrayList<Student> year4)
    {
        //Initialize the instance variables to the values in the parameters.
        this.year1 = year1;
        this.year2 = year2;
        this.year3 = year3;
        this.year4=year4;
        alphabetizeList(year1);
        alphabetizeList(year2);
        alphabetizeList(year3);
        alphabetizeList(year4);
    }

    /** getter methods - first, alphabetize the lists according to last name, then first name; then, return them.
     * Each one returns the instance variable lists after alphabetizing them.
     * Postcondition: The students in year1, year2, year3, and year4 are sorted in alphabetical
     * order by last name and then first name at return.*/
    public ArrayList<Student> getYear1()
    {
        alphabetizeList(year1);
        return year1;
    }
    public ArrayList<Student> getYear2()
    {
        alphabetizeList(year2);
        return year2;
    }
    public ArrayList<Student> getYear3()
    {
        alphabetizeList(year3);
        return year3;
    }
    public ArrayList<Student> getYear4()
    {
        alphabetizeList(year4);
        return year4;
    }



    /** Returns an alphabetized ArrayList of students representing those on the Dean's List -
     * all students with GPAs at or above 3.75.
     * Precondition: year1, year2, year3, and year4 are filled with Student objects.
     * Postcondition: year1, year2, year3, and year4 are unchanged.
     * A return, the list representing the Dean's List is full of students with GPAs at or above 3.75,
     * alphabetized by last name, then first name.
     * @return*/
    public ArrayList<Student> deansList()
    {
        ArrayList<Student> deans = new ArrayList<>();
        for (Student student : year1) {
            if (student.getGpa() >= 3.75)
                deans.add(student);
        }
        for (Student student : year2) {
            if (student.getGpa() >= 3.75)
                deans.add(student);
        }
        for (Student student : year3) {
            if (student.getGpa() >= 3.75)
                deans.add(student);
        }
        for (Student student : year4) {
            if (student.getGpa() >= 3.75)
                deans.add(student);
        }
        alphabetizeList(deans);
        return deans;
    }

    /** calcSchoolAverageGpa()
     * Returns the value representing the average GPA of all students at a school.
     * Precondition: year1, year2, year3, and year4 are filled with Student objects.
     * Postcondition: year1, year2, year3, and year4 are unchanged.*/
    public double calcSchoolAverageGpa()
    {
        double x = 0;
        double size = (year1.size() + year2.size() + year3.size() + year4.size());
        for (Student student : year1) {
            x += student.getGpa();
        }
        for (Student student : year2) {
            x += student.getGpa();
        }
        for (Student student : year3) {
            x += student.getGpa();
        }
        for (Student student : year4) {
            x += student.getGpa();
        }
        return (x / size);
    }


    private void alphabetizeList(ArrayList<Student> list) {
        int min;
        Student temp;
        for(int outer=0; outer<list.size()-1; outer++)
        {
            min = outer;
            for(int inner=outer+1; inner<list.size(); inner++)
            {
                //Compare the two last names of the Students at the indices inner and min. If the last name at index inner comes before the last name at index min alphabetically, {min becomes inner}.
                if ((list.get(inner).getLastName().compareTo((list.get(min).getLastName()))) < 0)
                { min = inner; }
                //If two last names of the Students at the indices inner and min are the same, then compare the two first names at indices inner and min. If the first name at index inner comes before the first name at index min alphabetically, {min becomes inner}.
                else if((list.get(inner).getLastName()).equals((list.get(min).getFirstName())) && (list.get(inner).getFirstName()).compareTo((list.get(min).getFirstName())) < 0)
                { min = inner; }
            }

            //swap
            temp = list.get(outer);
            list.set(outer, list.get(min));
            list.set(min, temp);
        }
    }

    /** Returns the Student object with the ID number, id. If id does not match anyone
     * in the school, return null.
     * Precondition: year1, year2, year3, and year4 are filled with Student objects.
     * Postcondition: year1, year2, year3, and year4 are unchanged.*/
    public Student findStudent(int id)
    {
        if (!(year1 == null || year1.isEmpty()))
        {
            for (int i = 0; i < year1.size() - 1; i++)
            {
                if (year1.get(i).getIdNum() == id)
                    return year1.get(i);
            }
        }
        if (!(year2 == null || year2.isEmpty()))
        {
            for (int i = 0; i < year2.size() - 1; i++)
            {
                if (year2.get(i).getIdNum() == id)
                    return year2.get(i);
            }
        }
        if (!(year3 == null || year3.isEmpty()))
        {
            for (int i = 0; i < year3.size() - 1; i++)
            {
                if (year3.get(i).getIdNum() == id)
                    return year3.get(i);
            }
        }
        if (!(year4 == null || year4.isEmpty()))
        {
            for (int i = 0; i < year4.size() - 1; i++)
            {
                if (year4.get(i).getIdNum() == id)
                    return year4.get(i);
            }
        }
            return null;
    }


    /** Removes the Student objects in schools that are equal, according to the
     * equals method in the Student class so that only one remains.
     * Returns a count of the number of objects that have been removed.
     * Precondition: year1, year2, year3, and year4 are filled with Student objects and no Student objects
     * across lists are equal. For example, there are no Student objects in year1 that are equal to
     * Student objects in year2, year3, or year4 and there are no Student objects in year2 that are equal to
     * Student objects in year1, year3, or year4, and so on.
     * Postcondition: Any Student objects in year1, year2, year3, and year4 that are doubles are removed
     * from their respective lists so that only one remains.
     * At return, a count of the number of objects that have been removed.*/
    public int removeDoubles()
    {
        int count = 0;
        for (int x = 0; x < year1.size() - 1; x++)
        {
            Student child = year1.get(x);
            for (int i = x; i < year1.size() - 1; i++)
            {
                if (child != year1.get(i) && child.equals(year1.get(i)))
                {
                    year1.remove(i);
                    count++;
                }
            }
        }
        for (int x = 0; x < year2.size() - 1; x++)
        {
            Student child = year2.get(x);
            for (int i = x; i < year2.size() - 1; i++)
            {
                if (child != year2.get(i) && child.equals(year2.get(i)))
                {
                    year2.remove(i);

                    count++;
                }
            }
        }
        for (int x = 0; x < year3.size() - 1; x++)
        {
            Student child = year3.get(x);
            for (int i = x; i < year3.size() - 1; i++)
            {
                if (child != year3.get(i) && child.equals(year3.get(i)))
                {
                    year3.remove(i);

                    count++;
                }
            }
        }
        for (int x = 0; x < year4.size() - 1; x++)
        {
            Student child = year4.get(x);
            for (int i = x; i < year4.size() - 1; i++)
            {
                if (child != year4.get(i) && child.equals(year4.get(i)))
                {
                    year4.remove(i);

                    count++;
                }
            }
        }
        return count;
    }
}
