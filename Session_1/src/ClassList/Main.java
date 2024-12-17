package ClassList;

public class Main
{
    public static void main(String[] args)
    {
        Student studentOne = new Student("Maxx", 1);
        Student studentTwo = new Student("Kaysen", 2);
        Student studentThree = new Student("Will", 3);
        Student studentFour = new Student("Audrey", 4);
        Student studentFive = new Student("Sean", 5);

        Student.printClassList();
    }
}
