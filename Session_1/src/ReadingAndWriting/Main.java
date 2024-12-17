package ReadingAndWriting;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> randomNums = new ArrayList<>();

        for (int i = 0; i < 10; i++)
        {
            int random = (int) (Math.random() * 10);
            randomNums.add(random);
        }

        System.out.println("First num " + randomNums.get(0));
        System.out.println("Last num " + randomNums.get(randomNums.size() - 1));
        for (Integer num : randomNums)
        {
            System.out.print(num + ", ");
        }
    }
}
