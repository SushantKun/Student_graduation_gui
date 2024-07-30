
/**
 * Student is super/parent class.\
 *  It has a constructor with 4 parameters
 * It also conains extramutator method which was edited after creating super class
 * It also has getter and setter methods also known as accessor method and mutator method.
 * The display method which displays inserted values
 * @author (Sushant Dahal)
 
 */
 

public class Student 
{
    //Attributes
    //instance variable
    private int enrollmentID;//int datatype
    private String dateOfBirth;//String datatype
    private String courseName;
    private String studentName;
    private String dateOfEnrollment;
    private int courseDuration;
    private int tuitionFee;

    //constructor has 4 parameters
    public Student(String dateOfBirth,String studentName, int courseDuration,int tuitionFee)
    {
        this.dateOfBirth=dateOfBirth;
        this.studentName=studentName;
        this.courseDuration=courseDuration;
        this.tuitionFee=tuitionFee;
        this.courseName="";//the value is set to empty string
        this.dateOfEnrollment="";
        this.enrollmentID = 0;//the value is set to empty integer
    }
    //Accessor method
    public int getEnrollmentID()//getter method
    {
        return enrollmentID;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public int getCourseDuration()
    {
        return courseDuration;
    }

    public int getTuitionFee()
    {
        return tuitionFee;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public String getDateOfEnrollment()
    {
        return dateOfEnrollment;
    }

    public String getDateOfBirth()
    {
        return dateOfBirth;
    }
    //Mutator method
    public void setCourseName(String courseName)//settermethod
    {
        this.courseName=courseName;
    }

    public void setEnrollmentID(int enrollmentID)
    {
        this.enrollmentID=enrollmentID;
    }

    public void setDateOfEnrollment(String dateOfEnrollment)
    {
        this.dateOfEnrollment=dateOfEnrollment;
    }
    //extramutator for droput
    public void setStudentName(String studentName)
    {
        this.studentName=studentName;
    }

    public void setCourseDuration(int courseDuration)
    {
        this.courseDuration=courseDuration;
    }

    public void setTuitionFee(int tuitionFee)
    {
        this.tuitionFee=tuitionFee;
    }

    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth=dateOfBirth;
    }
    //Display Method
    public void display()
    {
        //conditional operator
        if(this.courseName==(""))//if else loop is used
        {
            System.out.println("Course Name is not Given");
        }
        else if(this.dateOfEnrollment==(""))
        {
            System.out.println("Date Of Enrollment is not Defined");
        }
        else{
            System.out.println("Enrollment ID: " + enrollmentID);
            System.out.println("Date of Birth: " + dateOfBirth);
            System.out.println("Course Name: " + courseName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Date of Enrollment: " + dateOfEnrollment);
            System.out.println("Course Duration: " + courseDuration);
            System.out.println("Tuition Fee: " + tuitionFee);
        }
    }
}
