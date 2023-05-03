// Fig. 7.15: GradeBookTest.java
// Creates GradeBook object using an array of grades.

public class GradeBookTest
{ 
   // main method begins program execution
   public static void main( String args[] )
   {
      // one-dimensional array of student grades
      int gradesArray[] = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
      
      GradeBook myGradeBook = new GradeBook( 
         "CS101 Introduction to Java Programming", gradesArray );
      myGradeBook.displayMessage();
      myGradeBook.processGrades();
   } // end main
} // end class GradeBookTest


/**************************************************************************
 * (C) Copyright 1992-2007 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
