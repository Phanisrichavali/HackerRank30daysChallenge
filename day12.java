import java.io.*;
import java.util.*;
class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;
    
    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }
    
    // Print person data
    public void printPerson(){
         System.out.println(
                "Name: " + lastName + ", " + firstName 
            +     "\nID: " + idNumber); 
    }
     
}

     class Student extends Person{
        private final int[] testScores;
        
        public Student(String firstName,String lastName, int idNumber,int[] testScores){
             super(firstName, lastName, idNumber); //reusing parent constructor
             this.testScores=testScores;
        }

        public   char calculate(){
            int sum  = 0;
            for(int i = 0; i < testScores.length; i++){
                sum += testScores[i];
            }
            int avg = sum/testScores.length;
            
            if(avg <= 100 && avg >= 90){
                return 'O';
            }
            
            else if(avg < 90 && avg >= 80){
                return 'E';
            }
            
             else if(avg < 80 && avg >= 70){
                return 'A';
            }
            
              else if(avg >= 55 && avg < 70){
                return 'P';
            }
            
               else if(avg >= 40 && avg < 55){
                return 'D';
            }
            
               else if(avg < 40 && avg >= 0){
                return 'T';
            }
            
            else {
                    return Character.MIN_VALUE;
            }
        }
}

class Solution{
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName = in.next();
        String lastName = in.next();
        int idNumber = in.nextInt();
        int numScores = in.nextInt();
        int[] testScores = new int[numScores]; 
        for(int i =0; i < numScores; i++){
            testScores[i] = in.nextInt();
        }
        in.close();
        Student s = new Student(firstName, lastName, idNumber, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}
