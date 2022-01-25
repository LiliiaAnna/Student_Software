
package student_win22_tuesday;


public class PartTimeStudent extends Student {
    
    private int numCourses;

    
    public PartTimeStudent(String studentId,String studentName,int numCourse){ 
        super(studentId,studentName); 
        this.numCourses=numCourse; 
    }
    
    public int getNumCourses(){
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    
}
