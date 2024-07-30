
/**
 * It is a child class containing 10 parameters.
 * It uses the concept of inheritance
 * It uses getNumOfRemainingModules method to calculate the remaining modules.
 *  This class is used to remove a student after the billsPayable is cleared.
 * It uses display method to display the output
 * It also has super class which lends values from other class
 * It has multiple methods each with their own working mechanincs
 *
 * @author (Sushant Dahal)
 */
public class Dropout extends Student
{
    //Attributes
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private int remainingAmount;
    private boolean hasPaid;
    
    //constructor
    public Dropout(String dateOfBirth, String studentName, int courseDuration, int tuitionFee, int numOfRemainingModules, int numOfMonthsAttended, String dateOfDropout,String courseName, int enrollmentID,String dateOfEnrollment)
    {
        super(dateOfBirth, studentName, courseDuration, tuitionFee);
        setEnrollmentID(enrollmentID);
        setCourseName(courseName);
        setDateOfEnrollment(dateOfEnrollment);
        this.numOfRemainingModules = numOfRemainingModules;
        this.numOfMonthsAttended = numOfMonthsAttended;
        this.dateOfDropout = dateOfDropout;
        this.remainingAmount = remainingAmount;
        this.remainingAmount = 0;
        this.hasPaid = false;
    }
    
    public int getNumOfRemainingModules()
    {
        return this.numOfRemainingModules;
    }
    public int getNumOfMonthsAttended()
    {
        return this.numOfMonthsAttended;
    }
    public String getDateOfDropout()
    {
        return this.dateOfDropout;
    }
    public int getRemainingAmount()
    {
        return this.remainingAmount;
    }
    public boolean getHasPaid()
    {
        return this.hasPaid;
    }
    public void billsPayable()
    {
        this.remainingAmount =((getCourseDuration() - numOfMonthsAttended) * getTuitionFee());
        this.hasPaid = true;
    }
    public void removeStudent() 
    {
        if(hasPaid==true) //if else loop
        {
            setDateOfBirth("");
            setStudentName("");
            setCourseName("");
            setDateOfEnrollment("");
            setCourseDuration(0);
            setTuitionFee(0);
            setEnrollmentID(0);
            numOfRemainingModules= 0;
            numOfMonthsAttended = 0;
            remainingAmount = 0;
            dateOfDropout = "";
        }
        else
        {
            System.out.println("All bill not cleared"); //if all bills are cleared then the code above runs otherwise else runs
        }
    }
    //display method
    public void display()
    {
        super.display();
        System.out.println("Number of Remaining Modules: " + this.numOfRemainingModules);
        System.out.println("Number of Months Attended: " + this.numOfMonthsAttended);
        System.out.println("Date of Dropout: " + this.dateOfDropout);
        System.out.println("Remaining Amount: " + this.remainingAmount);
    }
}