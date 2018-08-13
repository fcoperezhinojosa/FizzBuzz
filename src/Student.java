public class Student
{

    public Student(){}

    public void PlayWithTeacher( Teacher teacher)
    {
        for ( Integer number: teacher.numbers )

                System.out.println(FizzBuzz (number));
    }

    public String FizzBuzz(int number)
    {
        String word =  sayFizz( number );

        if ( word.isEmpty() ) word = sayBuzz(number);

        if ( word.isEmpty() ) word =  Integer.toString(number);

        return word;
    }

    private String sayFizz(int number)
    {
        return isDivisibleByThree(number) | hasNumberThree(number) ? "Fizz" : "";
    }

    private boolean isDivisibleByThree(int number)
    {
        return ( number % 3 ) == 0;
    }

    private boolean hasNumberThree(int number)
    {
        return Integer.toString(number).indexOf('3') >= 0;
    }


    private String sayBuzz(int number)
    {
        return isDivisibleByFive(number) | hasNumberFive(number)? "Buzz" : "";
    }

    private boolean isDivisibleByFive(int number)
    {
        return ( number % 5 ) == 0;
    }

    private boolean hasNumberFive(int number)
    {
        return Integer.toString(number).indexOf('5') >= 0;
    }
}
