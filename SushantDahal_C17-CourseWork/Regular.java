
/**
 *It is a child class with 10 parameters
    It contains 10 parameters.
    It also has accessor and mutator method.
    Calculation of presentPercentage is also done which determines whether a student gets scholarship or not.
 * The display method is used to display the inserted values
 * @author (Sushant Dahal)
 */
public class Regular extends Student
{
    //Attributes
    //instance variable
    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private boolean isGrantedScholarship;

    //constructor has 10 parameters
    public Regular(int enrollmentID, String dateOfBirth, String courseName, String studentName, String dateOfEnrollment,int courseDuration, int tuitionFee, int numOfModules, int numOfCreditHours, double daysPresent)
    {
        super(dateOfBirth, studentName,courseDuration,tuitionFee);
        setEnrollmentID(enrollmentID);
        setCourseName(courseName);
        setDateOfEnrollment(dateOfEnrollment);
        this.numOfModules = numOfModules;
        this.numOfCreditHours = numOfCreditHours;
        this.daysPresent = daysPresent;
        this.isGrantedScholarship = false;//set to false boolean datatype
    }
    //accessor method to access attributes
    public int getNumOfModules()
    {
        return numOfModules;
    }

    public int getNumOfCreditHours()
    {
        return numOfCreditHours;
    }

    public double getDaysPresent()
    {
        return daysPresent;
    }

    public boolean getIsGrantedScholarship()
    {
        return isGrantedScholarship;
    }
    //this method has all the calculation in this class

    public char presentPercentage(double daysPresent)
    {   
        double presentPercentage= (daysPresent/(getCourseDuration()*30)) * 100;
        if( (daysPresent) > (getCourseDuration()*30) )
        {
            System.out.println("Days present cannot be greater than course duration");
            return '\0';
        }
        else
        {
            if ( presentPercentage >= 80 && presentPercentage <= 100)
            {
                System.out.println("You have obtained grade A");
                isGrantedScholarship = true;
                return 'A';
            }
            else if ( presentPercentage >= 60 && presentPercentage <= 79)
            {
                System.out.println("You have obtained grade B");
                return 'B';
            }
            else if (presentPercentage >= 40 && presentPercentage <= 59)
            {
                System.out.println("You have obtained grade C");
                return 'C';
            }
            else if ( presentPercentage >= 20 && presentPercentage <= 39)
            {
                System.out.println("You have obtained grade D");
                return 'D';
            }
            else
            {
                System.out.println("You have obtained grade E");
                return 'E';
            }
        }
    }  
    //this methods determines which student gets certificate

    public void grantCertificate(String courseName, int enrollmentID, String dateOfEnrollment){
        System.out.println("Student has graduated.");
        System.out.println("Course name: " + courseName);
        System.out.println("Enrollment ID: " + enrollmentID);
        System.out.println("Date of enrollment: " + dateOfEnrollment);
        //if condition
        if (this.isGrantedScholarship==true){
            System.out.println("The scholarship has been granted.");
        }
    }
    //method to display the output

    public void display(){
        super.display();//called from parent class student
        System.out.println("Number of Modules: " + numOfModules);
        System.out.println("Number of Credit Hours: " + numOfCreditHours);
        System.out.println("Days Present: " + daysPresent);
    }
}