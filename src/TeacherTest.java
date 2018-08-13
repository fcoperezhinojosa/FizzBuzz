import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;


public class TeacherTest
{
    private Student student;
    private Teacher teacher;
    private ByteArrayOutputStream outContent ;

    @Before
     public void SetUp ()
     {
         student = new Student();
         teacher = new Teacher();
         outContent = new ByteArrayOutputStream();
     }

    @Test
    public void TeacherSayNumberDivisibleByThreeStudentSayFizz( ){ Assert.assertEquals("Fizz", student.FizzBuzz(3)); }

    @Test
    public void TeacherSayNumberDivisibleByFiveStudentSayBuzz()
    {
        Assert.assertEquals("Buzz", student.FizzBuzz(5));
    }

    @Test
    public void TeacherSayNumberNotDivisibleByThreeOrByFiveStudentRepeatNumber(){ Assert.assertEquals( "4", student.FizzBuzz(4)); }

    @Test
    public void TeacherSayNumberNotDivisibleByThreeButHas3StudentSayFizz(){ Assert.assertEquals("Fizz",student.FizzBuzz(23)); }

    @Test
    public void TeacherSayNumberNotDivisibleByFiveButHas5StudentSayFizz(){ Assert.assertEquals("Buzz",student.FizzBuzz(52));}


}