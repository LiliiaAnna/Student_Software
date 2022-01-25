
package student_win22_tuesday;

public class Student_win22_tuesday {

    public static void main(String[] args) {
       char[] myWord=new char[7];
       myWord[0]='s';
       myWord[1]='s';
       myWord[2]='s';
       myWord[3]='s';
       myWord[4]='s';
       myWord[5]='s';
       myWord[6]='s';
       
       for(int i=0; i<myWord.length; i++){
           System.out.println(myWord[i]);
           
       }
       
       System.out.println("   ");
       System.out.println(" reverse order...  ");
               for(int i=0; i<myWord.length; i++){
                   System.out.println(myWord[i]);
               }
    }
    
}
