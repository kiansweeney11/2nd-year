public class Test
{
   public static Student getBestStudent(Student [] student)
   {
        int best = 0;
        for(int i = 0; i < student.length; i++)
            if(student[i].getMark() > student[best].getMark())
            {
                best = i;
            }
        return(student[best]);
   }
}