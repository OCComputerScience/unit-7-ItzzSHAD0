package ListMethods;

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

    public static String getLastStudent()
    {
        return classList.getLast().name;
    }

    public static void getClassSize()
    {
        System.out.println(classList.size());
    }

    public static void addStudent(int index, Student student)
    {
        classList.remove(classList.size() - 1);
        classList.add(index, student);
    }

    public static String getStudent(int index)
    {
        return classList.get(index).name;
    }
}
