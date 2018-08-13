import java.util.List;

public class Teacher
{
    public int[] numbers;


    public Teacher()
    {
        numbers = new int[100];

        for ( int  i = 0 ; i < numbers.length ; i++ )
        {
            this.numbers[i] = i +1 ;

        }
    }
}
