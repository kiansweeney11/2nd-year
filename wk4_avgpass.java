public class Test
{
   public static double getPassingAverage(Student [] student)
   {
        double count = 0;
        double sum = 0;
        for(int i = 0; i < student.length; i++)
            if(student[i].getMark() >= 40)
            {
                count++;
                sum = student[i].getMark() + sum;
            }
        return(sum / count);
   }
}