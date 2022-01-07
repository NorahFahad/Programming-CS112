package Projectwithfiles;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class main {
   static ArrayList<Course> Course_list=new ArrayList();
  static ArrayList<Lecturer> Lecturer_list=new ArrayList();
  static ArrayList<TAs>TAs_list=new ArrayList();
  static ArrayList<Convener> Convener_list=new ArrayList();
  
 public static void main(String[] args) throws IOException {
   Scanner in = new Scanner (System.in);
   boolean continueInput = true;
   
  CorConverToList("Course.txt");
  LeConverToList("Lecturer.txt");
  TAsConverToList("TAs.txt");
  ConConverToList("Convener.txt");
    
  System.out.println("Enter 1 if you are convener, 2 if you are lecturer and 3 if you are TAs: ");
          int ansawer=in.nextInt();
          do{ 
          switch(ansawer){
         
         case 1:
           System.out.println("Enter Convener ID: ");
           String convenerID = in.next();
           
           for(Convener co :Convener_list)
           if(convenerID.equals(co.getFacultyID())){
           
              System.out.println("Enter 1 for Allocate course, 2 for Drop course and 3 to Print a report");
              int a=in.nextInt();
              
              switch(a){
                    case 1: allocateCourse();break;
                    case 2: dropCourse();break;   
                    case 3: printReport();break;
                        
              }continueInput = false; 
              break; 
               }break; 

         case 2:
             System.out.println("Enter Lecturer ID: ");
             String lecturerID = in.next();
             
             for( Lecturer L :Lecturer_list)
           if(lecturerID.equals(L.getFacultyID())){
              System.out.println(L);
             continueInput = false ;
         
             }break;

         case 3:
             System.out.println("Enter TAs ID: ");
             String TAsID = in.next();
             
               for( TAs T :TAs_list)
           if(TAsID.equals(T.getFacultyID())){
              System.out.println(T);
               continueInput = false;
             }break; 
            
     }// End switch
           }while(continueInput); // End while
 }// end of main methd
 
 public static void allocateCourse(){             
     Scanner in = new Scanner (System.in);
      
      System.out.println("Enter 1 if you want to add course to Lecturer and 2 to add course to TAs");
              String num = in.next();
              
              switch(num){
                      case "1":
                          System.out.println(Lecturer_list.get(0));
                          System.out.println(Lecturer_list.get(4));
                          for (int i=2 ; i<Course_list.size(); i++){
                          System.out.println(Course_list.get(i));
    }
                          System.out.println("Enter lecturer ID: ");
                          String Lid = in.next();
                          System.out.println("Enter Course code: ");
                          String Lcours = in.next().toUpperCase();
                          
                          for(Lecturer L1 : Lecturer_list){
     if(Lid.equals(L1.getFacultyID())){
         if((L1.getassignedCourses().size())+1 <= L1.getmaximumNumberOfCourse()){
             if(L1.getassignedCourses().contains(Lcours)){
                 System.out.println("the course is already exists");
                 break;
             }else{
             ArrayList<String> courses = L1.getassignedCourses();
             courses.add(Lcours);
             L1.setassignedCourses(courses);
             System.out.println("Course: "+Lcours +" is allocated to "+Lid+ " successfuly");
         displayinfo(Lid);
         return;
         }}//end if
         else{
             System.out.println("try again!!");
             allocateCourse();
         }//end else
     }//end if
 }break;
                      
    case"2":  
        System.out.println(TAs_list.get(3));
        System.out.println(TAs_list.get(4));
        for (int i=2 ; i<Course_list.size(); i++){
        System.out.println(Course_list.get(i));
    }
             System.out.println("Enter TAs ID: ");
             String Tid = in.next();
             System.out.println("Enter Course code: ");
             String Tcours = in.next().toUpperCase();

        for(TAs ta : TAs_list){
     if(Tid.equals(ta.getFacultyID())){
         if((ta.getassignedCourses().size())+1 <= ta.getmaximumNumberOfCourse()){
             if(ta.getassignedCourses().contains(Tcours)){
                 System.out.println("the course is already exists");
                 break;
             }
             else{
             ArrayList<String> courses = ta.getassignedCourses();
             courses.add(Tcours);
             ta.setassignedCourses(courses);
             System.out.println("Course: "+Tcours +" is allocated to "+Tid+ " successfuly");
         displayinfo(Tid);
         return;
         }}//end if
         else{
             System.out.println("try again!!");
             allocateCourse();
         }//end else
     }//end if
 }//end for
} //end switch  
 }//end allocate course method
 
 public static void dropCourse(){
          Scanner in = new Scanner (System.in);

     System.out.println("Enter 1 if you want to drop this course from Lecturer and 2 to drop this course from TAs");
              String num = in.next();
              
              switch(num){
                  case"1": 
                      System.out.println(Lecturer_list.get(0));
                      System.out.println(Lecturer_list.get(4));
                      
                      System.out.println("Enter lecturer ID: ");
                      String Lid = in.next();
                      
                      System.out.println("Enter course code to be dropped: ");
                      String LcourseCode = in.next().toUpperCase();
                      
                      for(Lecturer L1 : Lecturer_list){
     if(Lid.equals(L1.getFacultyID())){
            ArrayList<String> courses = L1.getassignedCourses();   
            courses.remove(LcourseCode);
            L1.setassignedCourses(courses);
            System.out.println("Course " + LcourseCode +" is dropped from " + Lid + " successfuly");
            displayinfo(Lid);
         break;
 }
 }break;
    case"2":  
        System.out.println(TAs_list.get(3));
        System.out.println(TAs_list.get(4));

                      System.out.println("Enter lecturer ID: ");
                      String Tid = in.next();
                      
                      System.out.println("Enter course code to be dropped: ");
                      String TcourseCode = in.next().toUpperCase();
        
        for(TAs ta : TAs_list){
     if(Tid.equals(ta.getFacultyID())){
            ArrayList<String> courses = ta.getassignedCourses();   
            courses.remove(TcourseCode);
            ta.setassignedCourses(courses);
            System.out.println("Course " + TcourseCode +" is dropped from " + Tid + " successfuly");
            displayinfo(Tid);
         break;
 }
 }
              }
 }//end drop course method
 
 public static void printReport() throws IOException{
     System.out.println("******************* Courses *******************");
  CorConverToList("Course.txt");
  for(Course cor :Course_list){
      System.out.println(cor.toString());
  }
     System.out.println("******************* Lecturers *******************");
  LeConverToList("Lecturer.txt");
  for(Lecturer le :Lecturer_list){
      System.out.println(le.toString());
  }
     System.out.println("******************* TAs *******************");
   TAsConverToList("TAs.txt");
  for(TAs ta :TAs_list){
      System.out.println(ta.toString());
  }
     System.out.println("******************* Conveners *******************");
  ConConverToList("Convener.txt");
  for(Convener co :Convener_list){
      System.out.println(co.toString());
  }
       System.out.println("******************* UnallocatedCourses *******************");
         ArrayList<Course> un_list = (ArrayList<Course>) Course_list.clone();
         for(int i=2; i<16; i++){
      System.out.println(un_list.get(i).toString());
  }
 }//End print method
 
 
 public static void displayinfo(String ID){
          for(TAs ta :TAs_list){
                     if(ID.equals(ta.getFacultyID())){
      System.out.println(ta.toString());
      return;
              }
          }
          for(Lecturer L1 : Lecturer_list){
                    if(ID.equals(L1.getFacultyID())){
      System.out.println(L1.toString());
      return;
              } 
          }
          for(Convener co :Convener_list){
                    if(ID.equals(co.getFacultyID())){
      System.out.println(co.toString());
      return;
              }
          }
             System.out.println(" try again!!");
 }//End displayinfo method
 
  public static void CorConverToList(String fileName) throws IOException{
          try {
FileReader fr = new FileReader(fileName);
BufferedReader br;
              br = new BufferedReader(fr);
String line;
    while ((line = br.readLine()) != null) {
            if (line != null) {
                    StringTokenizer s = new StringTokenizer(line, " ");
                    String code = s.nextToken();
                    String name = s.nextToken();
                    int creditHours = Integer.parseInt(s.nextToken());

  Course corse = new Course(code, name, creditHours);
Course_list.add(corse);
                      }    
             }            
   br.close();
         }
          catch(IOException ex){
              System.out.println(ex.getMessage());
          }
      }// end of CorConverToList method
 
 public static void LeConverToList(String fileName) throws IOException{
          try {
FileReader fr = new FileReader(fileName);
BufferedReader br;
              br = new BufferedReader(fr);
String line;
    while ((line = br.readLine()) != null) {
            if (line != null) {
                    StringTokenizer s = new StringTokenizer(line, " ");
                    String ID = s.nextToken();
                    String firstName = s.nextToken();
                    String lastName = s.nextToken();
                    String academicRank = s.nextToken();
                    String academicSpecialization = s.nextToken();
                    int maximumNumberOfCourses = Integer.parseInt(s.nextToken());
                    int quotaOfCreditHours = Integer.parseInt(s.nextToken());
                    String assignedCourses = s.nextToken();

ArrayList<String> lecturerList = new ArrayList();
if (!assignedCourses.equals("null")) {
lecturerList = new ArrayList<>(Arrays.asList(assignedCourses.split(",")));
Lecturer lecturer = new Lecturer(ID, firstName, lastName, academicRank, academicSpecialization, maximumNumberOfCourses,
quotaOfCreditHours,lecturerList);
Lecturer_list.add(lecturer);
                      }
        }
}
   br.close();
          }
          catch(IOException ex){
              System.out.println(ex.getMessage());
          }
      }// end of LeConverToList method
 
 
 public static void TAsConverToList(String fileName) throws IOException{
          try {
FileReader fr = new FileReader(fileName);
BufferedReader br;
              br = new BufferedReader(fr);
String line;
    while ((line = br.readLine()) != null) {
           if (line != null) {
                    StringTokenizer s = new StringTokenizer(line, " ");
                    String ID = s.nextToken();
                    String firstName = s.nextToken();
                    String lastName = s.nextToken();
                    String academicRank = s.nextToken();
                    String academicSpecialization = s.nextToken();
                    int maximumNumberOfCourses = Integer.parseInt(s.nextToken());
                    int quotaOfCreditHours = Integer.parseInt(s.nextToken());
                    String assignedCourses = s.nextToken();

ArrayList<String> tasList = new ArrayList();
if (!assignedCourses.equals("null")) {
tasList = new ArrayList<>(Arrays.asList(assignedCourses.split(",")));
TAs tas = new TAs(ID, firstName, lastName, academicRank, academicSpecialization, maximumNumberOfCourses,
quotaOfCreditHours,tasList);
TAs_list.add(tas);
                      }
        }
}
   br.close();
          }
          catch(IOException ex){
              System.out.println(ex.getMessage());
          }
      }// end of TAsConverToList method
    
    
public static void ConConverToList(String fileName) throws IOException{
          try {
FileReader fr = new FileReader(fileName);
BufferedReader br;
              br = new BufferedReader(fr);
String line;
    while ((line = br.readLine()) != null) {
            if (line != null) {
                    StringTokenizer s = new StringTokenizer(line, " ");
                    String ID = s.nextToken();
                    String firstName = s.nextToken();
                    String lastName = s.nextToken();
                    String academicRank = s.nextToken();
                    String academicSpecialization = s.nextToken();
                    String[] cources = s.nextToken().split(",");
                    String[] lecturer = s.nextToken().split(",");
                    String[] tas = s.nextToken().split(",");

  Convener c = new  Convener(ID, firstName, lastName, academicRank, academicSpecialization, cources, lecturer, tas);
Convener_list.add(c);
                      }
             }                  
   br.close();
         }
          catch(IOException ex){
              System.out.println(ex.getMessage());
          }   
      }// end of ConConverToList method
 }// end of main class
 
