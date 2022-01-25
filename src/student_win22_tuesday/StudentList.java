
package student_win22_tuesday;


public class StudentList {
    public static void main(String[] args) {
        Student[] studentList = new Student[3];
        
        studentList[0] = new Student("s1","Lili");
        studentList[0] = new Student("s2","Lili");
        studentList[0] = new Student("s3","Lili");
        
        for(int i=0; i<studentList.length; i++){
            System.out.print(studentList[i].getStudentId());
            System.out.print("");
            System.out.print(studentList[i].getStudentName());
        }
    }
}
