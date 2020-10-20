public class TestStudent
{
   public static void main(String [] args)
   {
       // Test the constructors
       Student student = new Student("Charlie", "12345678");
      
       System.out.println(student); // Test the toString method
      
       // Test setters/assessors
       student.setName("Cormac");
       System.out.println(student.getName());
       student.setID("87654321");

       System.out.println(student.getID());
       
       System.out.println(student); // Finally print the student object again.
   }
}