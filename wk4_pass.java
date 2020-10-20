//Print only the students whose mark is forty something, i.e. a mark between 40 and 49 inclusive.
//Your method should be called printForties.

public class Test
{
   public static void printForties(Student [] student)
   {
        for(int i = 0; i < student.length; i++)
            if(student[i].getMark() >= 40 && student[i].getMark() <= 49)
            {
                System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
            }
   }
}