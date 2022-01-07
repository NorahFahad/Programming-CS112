package Projectwithfiles;
import java.util.ArrayList;
import java.util.Arrays;
public class Projectwithfiles { 
}

    class Course{
        private String courseCode;
        private String courseName ;
        private int creditHourse;
        
        public Course(){
        }
        
        public Course(String courseCode , String courseName , int creditHourse){
            this.courseCode = courseCode;
            this.courseName = courseName;
            this.creditHourse =creditHourse;
        }
        public String getCourseCode(){
            return courseCode;
        }
        public void setCourseCode(String courseCode){
            this.courseCode = courseCode;
        }
        public String getCourseName(){
            return courseName;
        }
        public void setCourseName(String courseName ){
            this.courseName = courseName;
        }
        public int getCreditHourse(){
            return creditHourse;
        }
        public void setCreditHourse(int  creditHourse){
            this.creditHourse = creditHourse;
            
        }       

    @Override
    public String toString() {
        return "Course{" + "courseCode:" + getCourseCode() + " |courseName:" + getCourseName() +
                " |creditHourse:" + getCreditHourse() + '}';
    }
    }
    
    class FacultyMember{
        private String FacultyID;
        private String firstName;
        private String lastName;
        private String academicRank;
        private String academicSpecialization;
        
        public FacultyMember(){
        }
        
        public FacultyMember(String FacultyID, String firstName, String lastName ,String academicRank ,String academicSpecialization){
            this.FacultyID = FacultyID ;
            this.firstName = firstName ;
            this.lastName = lastName ;
            this.academicRank = academicRank ;
            this.academicSpecialization=academicSpecialization;
        }
         public String getFacultyID(){
            return FacultyID;
        }
        public void setFacultyID(String FacultyID){
            this.FacultyID = FacultyID;
        }
         public String getfirstName(){
            return firstName;
        }
        public void setfirstName(String firstName){
            this.firstName = firstName;
        }

         public String getlastName(){
            return lastName;
        }
        public void setlastName(String lastName){
            this.lastName = lastName;
        }
         public String getacademicRank(){
            return academicRank;
        }
        public void setacademicRank(String academicRank){
            this.academicRank = academicRank;
        }
        
         public String getacademicSpecialization(){
            return academicSpecialization;
        }
        public void setacademicSpecialization(String academicSpecialization){
            this.academicSpecialization = academicSpecialization;
        }
     @Override
    public String toString() {
 return "FacultyID:" +  getFacultyID()+ " |FirstName:"
  +  getfirstName() + " |LastName:" + getlastName()+ " |AcademicRank:" 
 + getacademicRank()+ " |AcademicSpecialization:" +getacademicSpecialization() ;
    }
        
 }
    class Lecturer extends FacultyMember{
        private int maximumNumberOfCourses;
        private int quotaOfCreditHours;
        private ArrayList<String> assignedCourses;
        
        public Lecturer(){
        }

         public Lecturer(int maximumNumberOfCourses, int quotaOfCreditHours,  ArrayList<String> assignedCourses) {
        this.maximumNumberOfCourses = maximumNumberOfCourses;
        this.quotaOfCreditHours = quotaOfCreditHours;
        this.assignedCourses = assignedCourses;
    }
     
         public Lecturer(String FacultyID0, String firstName0, String lastName0 ,String academicRank0 ,String academicSpecialization0
            ,int maximumNumberOfCourses, int quotaOfCreditHours ,  ArrayList<String> assignedCourses ){
        
            super(FacultyID0, firstName0, lastName0, academicRank0, academicSpecialization0);
        
            this.maximumNumberOfCourses = maximumNumberOfCourses ;
            this.quotaOfCreditHours = quotaOfCreditHours;
            this.assignedCourses = assignedCourses;
        }
    
        public int getmaximumNumberOfCourse(){
            return maximumNumberOfCourses;
        }
        public void setmaximumNumberOfCourse(int maximumNumberOfCourses){
            this.maximumNumberOfCourses = maximumNumberOfCourses ;
        }
        public int getquotaOfCreditHours(){
            return quotaOfCreditHours;
        }
        public void setquotaOfCreditHours(int quotaOfCreditHours ){
            this.quotaOfCreditHours = quotaOfCreditHours;
        }
        public ArrayList<String> getassignedCourses(){
            return assignedCourses;
        }
        public void setassignedCourses(ArrayList<String> assignedCourses ){
            this.assignedCourses = assignedCourses ;
        }
        @Override
    public String toString() {
        return  super.toString() + " |maximumNumberOfCourses:" +  getmaximumNumberOfCourse() +
                " |quotaOfCreditHours:" + getquotaOfCreditHours() + 
                " |assignedCourses:" + getassignedCourses() ;
    }
        
    }
     class TAs extends FacultyMember{
        private int maximumNumberOfCourses;
        private int quotaOfCreditHours;
        private ArrayList<String> assignedCourses ;

       public TAs(){
        }

    public TAs(int maximumNumberOfCourses, int quotaOfCreditHours, ArrayList<String> assignedCourses) {
        this.maximumNumberOfCourses = maximumNumberOfCourses;
        this.quotaOfCreditHours = quotaOfCreditHours;
        this.assignedCourses=assignedCourses;
    
    }
        
       public TAs(String FacultyID0, String firstName0, String lastName0 ,String academicRank0 ,String academicSpecialization0
                ,int maximumNumberOfCourses, int quotaOfCreditHours ,ArrayList<String> assignedCourses) {
            super(FacultyID0, firstName0, lastName0, academicRank0, academicSpecialization0);
            
            this.maximumNumberOfCourses = maximumNumberOfCourses ;
            this.quotaOfCreditHours = quotaOfCreditHours;
            this.assignedCourses = assignedCourses;
        }

        public int getmaximumNumberOfCourse(){
           return maximumNumberOfCourses;
        }
        public void setmaximumNumberOfCourse(int maximumNumberOfCourses){
            this.maximumNumberOfCourses = maximumNumberOfCourses ;
        }
        public int getquotaOfCreditHours(){
            return quotaOfCreditHours;
        }
        public void setquotaOfCreditHours(int quotaOfCreditHours ){
            this.quotaOfCreditHours = quotaOfCreditHours;
        }
        public ArrayList<String> getassignedCourses(){
            return assignedCourses;
        }
        public void setassignedCourses( ArrayList<String> assignedCourses ){
            this.assignedCourses = assignedCourses ;

        }
         @Override
    public String toString() {
     return  super.toString() + " |maximumNumberOfCourses:" +  getmaximumNumberOfCourse() +
      " |quotaOfCreditHours:" + getquotaOfCreditHours() + 
      " |assignedCourses:" +getassignedCourses();
    }
        
    }
    
     class Convener extends FacultyMember{
     private static String[] cources ;
     private static String[] tas;
     private static String[] lecturer;

    public Convener() {
    }

    public Convener(String[] cources, String[] tas, String[] lecturer) {
        Convener.cources = cources;
        Convener.lecturer = lecturer;
        Convener.tas = tas;
    }


    public Convener(String FacultyID0, String firstName0, String lastName0 ,String academicRank0 ,String academicSpecialization0,
              String[] cources, String[] lecturer, String[] tas) {

            super(FacultyID0, firstName0, lastName0, academicRank0, academicSpecialization0);
            
             Convener.cources = cources;
             Convener.lecturer = lecturer;
             Convener.tas = tas;
     }

    public String[] getCources() {
        return cources;
    }

    public void setCources(String[] cources) {
        Convener.cources = cources;
    }

    public static String[] getTas() {
        return tas;
    }

    public void setTas(String[] tas) {
        Convener.tas = tas;
    }

    public static String[] getLecturer() {
        return lecturer;
    }

    public void setLecturer(String[] lecturer) {
        Convener.lecturer = lecturer;
    }
   

    @Override
    public String toString() {
        return super.toString()+
     " Convener{cources:" + Arrays.toString(getCources()) + " |lecturer:" +Arrays.toString(getLecturer())  +
                " |tas:" + Arrays.toString(getTas()) + "}";
    }
 
     }
