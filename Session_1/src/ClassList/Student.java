package ClassList;

import java.util.ArrayList;

public class Student
{
    private String name;
    private int grade;

    private static ArrayList<Student> classList = new ArrayList<>();

    public Student(String name, int grade)
    {
        this.name = name;
        this.grade = grade;
        classList.add(this);
    }

    public static void printClassList()
    {
        for (int i = 0; i < classList.size(); i++)
        {
            System.out.print(classList.get(i).name + " ");
        }
        System.out.println();
    }
}
