
/**
 * This class is used to create a GUI.
 * It implements ActionListener
 * The variables are kept in private class.
 * It contains WLC GUI class, RegularGUI class and DropoutGUI class and a main method.
 * It contains various methods such as setBounds, setFont, setFrame, add, getSource, showmessageDialogbox, getSource...
 * It contains 3 GUI and each contains 1 frame and panel each
 * Jlabel is used to set the name
 * JTextField is used to create a text field in the GUI
 * JButton is used to create buttons in the GUI
 * JComboBox is used to create box with options for date of birth, date of enrollment, date of dropout...
 * It contains a array list which stores all the data that are inserted into the GUI.
 * 
 *
 * @author (Sushant Dahal)
 */
import javax.swing.JButton;//importing swing for Buttons
import javax.swing.JFrame;//importing swing for Frame
import javax.swing.JLabel;//importing swing for Label
import javax.swing.JPanel;//importing swing for Panel
import javax.swing.JTextField;//importing swing for TextField
import java.awt.Color;//importing swing for Color
import java.awt.Font;//importing swing for Font
import javax.swing.*; //importing swing
import java.awt.event.ActionListener;//importing ActionListener
import java.awt.event.ActionEvent;//importing ActionEvent
import java.util.ArrayList; //importing ArrayList

public class StudentGUI implements ActionListener
{
    private JFrame firstFrame,stdRegframe,stdDrpframe; //Declaring all three JFrame
    private JPanel firstPanel,stdRegPanel,drpPanel; //Declaring all three JPanel
    private JLabel wlcHeading, wlcBackground, //Declaring all JLabel
    studRegHeading, studRegenrollmentID, studRegdateOfBirth, studRegcourseName, studRegstudentName, studRegdateOfEnrollment, studRegcourseDuration, studRegtuitionFee, 
    studRegnumOfModules, studRegnumOfCreditHours, studRegdaysPresent,//for Regular
    studDrpheading,studDrpdateOfBirth,studDrpstudentName,studDrpcourseDuration,studDrptutionFee,studDrpnumOfRemainingModules,studDrpnumOfMonthsAttended,studDrpdateOfDropOut,studDrpenrollmentID,
    studDrpdateOfEnrollment,studDrpcourseName,studDrpremainingAmount;//for Dropout
    //Declaring all JTextField
    private JTextField txtRegenrollmentID, txtRegdateOfBirth, txtRegcourseName, txtRegstudentName,txtRegdateOfEnrollment, txtRegcourseDuration, txtRegtuitionFee, 
    txtRegnumOfModules,txtRegnumOfCreditHours,txtRegdaysPresent,//for Regular
    txtDrpstudentName,txtDrpcourseDuration,txtDrptutionFee,txtDrpnumOfRemainingModules,txtDrpnumOfMonthsAttended,txtDrpenrollmentID,txtDrpdateOfEnrollment,txtDrpcourseName,
    txtDrpremainingAmount; //for Dropout
    //Declaring all JButton
    private JButton  regularButton, dropOutButton,//for firstFrame
    studRegclearButton,studRegaddButton, studPpercentageButton, grantCertificate, studRegdisplayButton, studRegbackButton,//for Regular
    drpClearButton,drpBackButton, billsPayable, drpDisplayButton, drpRemoveStudent,drpAddButton; //for Dropout
    //Delclaring all JComboBox
    private JComboBox regcomboDOByear,regcomboDOBmonth,regcomboDOBdays,regcomboDOEyear,regcomboDOEmonth,regcomboDOEdays,//for Regular
    drpcombodateOfBirthyear,drpcombodateOfBirthmonth,drpcombodateOfBirthdays,drpcombodateOfEnrollmentyear,drpcombodateOfEnrollmentmonth,
    drpcombodateOfEnrollmentdays,drpcombodateOfDropOutyear,drpcombodateOfDropOutmonth,drpcombodateOfDropOutdays; //for Dropout

    ArrayList<Student> stdArray = new ArrayList<Student>();//creating Array List

    public void WLCGUI() //This is the main GUI which appears first when the program runs
    {
        firstFrame = new JFrame("Student GUI"); //JFrame for Main Frame
        firstPanel = new JPanel(); //JPanel for Main Panel
        firstPanel.setLayout(null); //This sets layout for Main Panel
        firstFrame.add(firstPanel); //This adds the main panel to the GUI

        //label
        wlcHeading = new JLabel("x---Welcome---x"); //This creates new label in the Main GUI 

        //button
        regularButton = new JButton(); //creates new button in main GUI for regular class
        regularButton.setText("Regular");//This sets text for regular button

        dropOutButton = new JButton(); //creates new button in main GUI for dropout class
        dropOutButton.setText("DropOut"); //sets text for dropout button

        //setting up Action Listener for buttons
        regularButton.addActionListener(this); //This adds action listener for the regular button to work
        dropOutButton.addActionListener(this); //adds action listener for the dropout button to work

        //fonts
        wlcHeading.setFont(new Font("Arial", Font.BOLD, 50));//sets font for the word "Welcome" in main GUI
        regularButton.setFont(new Font("Arial",Font.BOLD,25)); //sets font for the Regular Button
        dropOutButton.setFont(new Font("Arial",Font.BOLD,25)); //sets font for the DropOut Button

        //setbounds
        wlcHeading.setBounds(320,30,400,49); //sets position(x,y,width,height) for the Main Heading 
        regularButton.setBounds(228, 266, 171, 56); //sets position for Regular Button
        dropOutButton.setBounds(600, 266, 171, 56); //sets position for DropOut Button

        //addpanel
        firstPanel.add(wlcHeading); //adding Main Heading in Panel
        firstPanel.add(regularButton); //adding Regular Button in Panel
        firstPanel.add(dropOutButton); //adding DropOut Button in Panel

        //background image
        ImageIcon img = new ImageIcon("../CS4001NI_CW2_22085641_Sushant.Dahal/Image/backgroundimg.png"); //adding path for the background image
        wlcBackground = new JLabel("",img,JLabel.CENTER); //setting the image name as blank and centering the background image
        wlcBackground.setBounds(0,0,1000,600); //setting position(x,y,width,height) for background image... x and y is 0 because the image is already centered and width and height is same as the main frame size
        firstPanel.add(wlcBackground); //adding background image to main panel

        //set frame
        firstFrame.setSize(1000,600); //setting frame size for main frame (x,y)
        firstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //this command is used when the program needs to be closed 
        firstFrame.setVisible(true); //this sets the frame as visible so it is seen when the program runs
        firstFrame.setResizable(false); //This prevents the frame from being resized which can cause problems in GUI

    }

    public void RegularGUI()
    {
        stdRegframe = new JFrame("Regular Gui"); //JFrame for Regular Frame
        stdRegPanel = new JPanel(); //JPanel for Regular Frame
        stdRegPanel.setLayout(null); //This sets layout of Regular Panel as null
        stdRegframe.add(stdRegPanel); //This adds the regular panel to the GUI
        stdRegPanel.setBackground(Color.decode("#E5FBD9")); //This sets background color for Regular GUI

        //label========
        studRegHeading = new JLabel("Regular"); //setting JLabel for Regular
        studRegenrollmentID = new JLabel("Enrollment ID"); //setting JLabel for Enrollment ID
        studRegdateOfBirth = new JLabel("Date of Birth"); //setting JLabel for Date Of Birth
        studRegstudentName = new JLabel("Student Name"); //setting JLabel for Student Name
        studRegdateOfEnrollment= new JLabel("Date of Enrollment"); //setting JLabel for Date Of Enrollment
        studRegcourseName = new JLabel("Course Name"); //setting JLabel for Course Name
        studRegcourseDuration = new JLabel("Course Duration"); //setting JLabel for Course Duration
        studRegtuitionFee = new JLabel("Tuition Fee"); //setting JLabel for Tuition Fee
        studRegnumOfModules = new JLabel("No. Of Modules"); //setting JLabel for No. Of Modules
        studRegnumOfCreditHours = new JLabel("No. Of CreditHours"); //setting JLabel for No. Of CreditHours
        studRegdaysPresent = new JLabel("Days Present"); //setting JLabel for Days Present 

        //TextArea
        txtRegenrollmentID = new JTextField(); //setting JTextField for EnrollmentID
        txtRegstudentName = new JTextField(); //setting JTextField for Student Name
        txtRegcourseDuration = new JTextField(); //setting JTextField for Course Duration
        txtRegcourseName = new JTextField(); //setting JTextField for Course Name
        txtRegnumOfModules = new JTextField();//setting JTextField for Num Of Modules  
        txtRegtuitionFee = new JTextField(); //setting JTextField for Tuition Fee
        txtRegnumOfCreditHours = new JTextField(); //setting JTextField for Num Of Credit Hours
        txtRegdaysPresent = new JTextField(); //setting JTextField for Days Present

        //combobox
        String[] regDOByear = {"2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000","1999","1998","1997","1996","1995","1994","1993","1992","1991","1990"};
        regcomboDOByear= new JComboBox<String>(regDOByear); //creating combobox for Date of Birth "year"
        String[] regDOBmonth = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        regcomboDOBmonth = new JComboBox<String>(regDOBmonth); //creating combobox for Date of Birth "month"
        String[] regDOBdays = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","24","25","26","27","28","29","30","31","32"};
        regcomboDOBdays = new JComboBox<String>(regDOBdays);//creating combobox for Date of Birth "days"
        String[] regDOEyear = {"2023","2022","2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010"};
        regcomboDOEyear = new JComboBox<String>(regDOEyear);//creating combobox for Date of Enrollment "year"
        String[] regDOEmonth = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        regcomboDOEmonth = new JComboBox<String>(regDOEmonth);//creating combobox for Date of Enrollment "month"
        String[] regDOEdays = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","24","25","26","27","28","29","30","31","32"};
        regcomboDOEdays = new JComboBox<String>(regDOEdays); //creating combobox for Date of Enrollment "days"

        //button
        studRegclearButton = new JButton(); //creating new button in Regular GUI
        studRegclearButton.setText("Clear"); //labelling button as "Clear"
        studRegclearButton.addActionListener(this);//Action Listener for Clear Button in Regular
        studRegaddButton = new JButton();//creating new button in Regular GUI
        studRegaddButton.setText("Add");//labelling button as "Add"
        studRegaddButton.addActionListener(this);//Action Listener for Add Button in Regular
        studPpercentageButton = new JButton();//creating new button in Regular GUI
        studPpercentageButton.setText("Present Percentage");//labelling button as "Present Percentage"
        studPpercentageButton.addActionListener(this);//Action Listener for Present Percentage Button in Regular
        grantCertificate = new JButton();//creating new button in Regular GUI
        grantCertificate.setText("Grant Certificate");//labelling button as "Grant Certificate"
        grantCertificate.addActionListener(this);//Action Listener for Grant Scholarship Button in Regular
        studRegdisplayButton = new JButton();//creating new button in Regular GUI
        studRegdisplayButton.setText("Display");//labelling button as "Display"
        studRegdisplayButton.addActionListener(this);//Action Listener for Display Button in Regular
        studRegbackButton = new JButton();//creating new button in Regular GUI
        studRegbackButton.setText("Back");//labelling button as "Back"
        studRegbackButton.addActionListener(this);//Action Listener for Back Button in Regular

        //fonts
        studRegHeading.setFont(new Font("Arial", Font.BOLD, 25)); //setting up font for Heading
        studRegenrollmentID.setFont(new Font("Arial",Font.BOLD,15)); //setting up font for EnrollmentID
        studRegdateOfBirth.setFont(new Font("Arial",Font.BOLD,15)); //setting up font for Date Of Birth
        studRegstudentName.setFont(new Font("Arial",Font.BOLD,15)); //setting up font for Student Name
        studRegdateOfEnrollment.setFont(new Font("Arial", Font.BOLD, 15)); //setting up font for Date Of Enrollment
        studRegcourseName.setFont(new Font("Arial",Font.BOLD,15)); //setting up font for Course Name
        studRegcourseDuration.setFont(new Font("Arial",Font.BOLD,15)); //setting up font for Course Duration
        studRegtuitionFee.setFont(new Font("Arial",Font.BOLD,15)); //setting up font for Tuition Fee
        studRegnumOfModules.setFont(new Font("Arial",Font.BOLD,15)); //setting up font for Num Of Modules
        studRegnumOfCreditHours.setFont(new Font("Arial",Font.BOLD,15)); //setting up font for Credit Hours
        studRegdaysPresent.setFont(new Font("Arial",Font.BOLD,15)); //setting up font for Days Present

        //setBounds
        studRegHeading.setBounds(440, 20, 110, 35); //sets bounds for Heading

        studRegenrollmentID.setBounds(55,75,140,30); //sets bounds for Enrollment ID
        txtRegenrollmentID.setBounds(200,75,100,30); //sets bounds for Enrollment ID TextBox

        studRegdaysPresent.setBounds(650,75,120,30); //sets bounds for Days Present
        txtRegdaysPresent.setBounds(800,75,100,30);//sets bounds for Days Present TextBox

        studRegstudentName.setBounds(55,135,120,30);//sets bounds for Student Name
        txtRegstudentName.setBounds(200,135,100,30);//sets bounds for Student Name TextBox

        studRegdateOfEnrollment.setBounds(350,300,150,30);//sets bounds for Date Of Enrollment
        regcomboDOEyear.setBounds(500,300,100,30);//sets bounds for Date Of Enrollment year
        regcomboDOEmonth.setBounds(610,300,100,30);//sets bounds for Date Of Enrollment month
        regcomboDOEdays.setBounds(720,300,100,30);//sets bounds for Date Of Enrollment days

        studRegcourseName.setBounds(650,135,100,30);//sets bounds for Course Name
        txtRegcourseName.setBounds(800,135,100,30);//sets bounds for Course Name TextBox

        studRegcourseDuration.setBounds(55,195,150,30);//sets bounds for Course Duration 
        txtRegcourseDuration.setBounds(200,195,100,30);//sets bounds for Course Duration TextBox

        studRegtuitionFee.setBounds(55,300,150,30);//sets bounds for Tuition Fee
        txtRegtuitionFee.setBounds(200,300,100,30);//sets bounds for Tuition Fee TextBox

        studRegnumOfModules.setBounds(650,195,150,30);//sets bounds for Num Of Modules
        txtRegnumOfModules.setBounds(800,195,100,30);//sets bounds for Num Of Modules TextBox

        studRegnumOfCreditHours.setBounds(55,255,150,30);//sets bounds for Num Of Credit Hours
        txtRegnumOfCreditHours.setBounds(200,255,100,30);//sets bounds for Num Of Credit Hours TextBox

        studRegdateOfBirth.setBounds(350,255,150,30);//sets bounds for Date Of Birth
        regcomboDOByear.setBounds(500,255,100,30);//sets bounds for Date Of Birth year
        regcomboDOBmonth.setBounds(610,255,100,30);//sets bounds for Date Of Birth month
        regcomboDOBdays.setBounds(720,255,100,30);//sets bounds for Date Of Birth days

        studRegclearButton.setBounds(670, 500, 120, 32);//sets bounds for Clear Button
        studRegaddButton.setBounds(800, 500, 120, 32);//sets bounds for Add Button
        studPpercentageButton.setBounds(55,500,150,32);//sets bounds for Present Percentage
        grantCertificate.setBounds(210,500,150,32);//sets bounds for Grant Certificate
        studRegdisplayButton.setBounds(365,500,120,32);//sets bounds for Display Button
        studRegbackButton.setBounds(800,20,120,32);//sets bounds for Back Button
        //panel add
        stdRegPanel.add(studRegHeading); //adds Heading to the panel
        stdRegPanel.add(studRegenrollmentID);//adds Enrollment ID to the panel
        stdRegPanel.add(txtRegenrollmentID);//adds Enrollment ID TextBox to the panel
        stdRegPanel.add(studRegdateOfBirth);//adds Date Of Birth to the panel
        stdRegPanel.add(regcomboDOByear);//adds Date Of Birth year to the panel
        stdRegPanel.add(regcomboDOBmonth);//adds Date Of Birth month to the panel
        stdRegPanel.add(regcomboDOBdays);//adds Date Of Birth days to the panel
        stdRegPanel.add(studRegstudentName);//adds Student Name to the panel
        stdRegPanel.add(txtRegstudentName);//adds Student Name TextBox to the panel
        stdRegPanel.add(studRegdateOfEnrollment);//adds Date Of Enrollment  to the panel
        stdRegPanel.add(regcomboDOEyear);//adds Date Of Enrollment year to the panel
        stdRegPanel.add(regcomboDOEmonth);//adds Date Of Enrollment month to the panel
        stdRegPanel.add(regcomboDOEdays);//adds Date Of Enrollment days to the panel
        stdRegPanel.add(studRegcourseName);//adds Course Name to the panel
        stdRegPanel.add(txtRegcourseName);//adds Course Name TextBox to the panel
        stdRegPanel.add(studRegcourseDuration);//adds Course Duration to the panel
        stdRegPanel.add(txtRegcourseDuration);//adds Course Duration TextBox to the panel
        stdRegPanel.add(studRegtuitionFee);//adds TuitionFee to the panel
        stdRegPanel.add(txtRegtuitionFee);//adds TuitionFee TextBox to the panel
        stdRegPanel.add(studRegnumOfModules);//adds Num Of Modules to the panel
        stdRegPanel.add(txtRegnumOfModules);//adds Num Of Modules TextBox to the panel
        stdRegPanel.add(studRegnumOfCreditHours);//adds Num Of Credit Hours to the panel
        stdRegPanel.add(txtRegnumOfCreditHours);//adds Num Of Credit Hours TextBox to the panel
        stdRegPanel.add(studRegdaysPresent);//adds Days Present to the panel
        stdRegPanel.add(txtRegdaysPresent);//adds Days Present TextBox to the panel
        stdRegPanel.add(studRegclearButton);//adds Clear Button to the panel
        stdRegPanel.add(studRegaddButton);//adds Add Button to the panel
        stdRegPanel.add(studPpercentageButton);//adds Present Percentage Button to the panel
        stdRegPanel.add(grantCertificate);//adds Grant Certificate to the panel
        stdRegPanel.add(studRegdisplayButton);//adds Display Button to the panel
        stdRegPanel.add(studRegbackButton);//adds Back Button to the panel
        //set frame
        stdRegframe.setSize(1000,600); //sets Frame size
        stdRegframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits program on close
        stdRegframe.setVisible(false); // sets frame as invisible
        stdRegframe.setResizable(false); //prevents from resizing the frame
    }

    public void DropoutGUI()
    {
        stdDrpframe=new JFrame("DROP OUT GUI "); //JFrame for Dropout Frame
        drpPanel=new JPanel();//JPanel for Dropout Frame
        drpPanel.setLayout(null);//This sets layout of Dropout Panel as null
        drpPanel.setBackground(Color.decode("#E5FBD9"));//This sets background color for Dropout GUI
        stdDrpframe.add(drpPanel);//adds panel to frame

        //Label
        studDrpheading=new JLabel("DROP OUT");  //labelling studDrpheading as Drop Out
        studDrpstudentName= new JLabel("Student Name: "); //labelling studDrpstudentName as Student Name
        studDrpenrollmentID=new JLabel("Enrollment ID: "); //labelling studDrpenrollmentID as Enrollment ID
        studDrptutionFee=new JLabel("Tution Fee: "); //labelling studDrptutionFee as Tution Fee
        studDrpcourseDuration= new JLabel("Course Duration: "); //labelling studDrpcourseDuration as Course Duration
        studDrpnumOfRemainingModules=new JLabel("Num Of Remaining Modules: "); //labelling studDrpnumOfRemainingModules as Num Of Remaining Modules
        studDrpnumOfMonthsAttended=new JLabel("Num OF Months Attended: ");//labelling studDrpnumOfMonthsAttended as Num OF Months Attended
        studDrpdateOfBirth=new JLabel("Date Of Birth: "); //labelling studDrpdateOfBirth as Date Of Birth
        studDrpdateOfEnrollment=new JLabel("Date Of Enrollment: "); //labelling studDrpdateOfEnrollment as Date Of Enrollment
        studDrpdateOfDropOut=new JLabel("Date Of Drop Out: "); //labelling studDrpdateOfDropOut as Date Of Drop Out
        studDrpcourseName=new JLabel("Course Name: "); //labelling studDrpcourseName as Course Name
        studDrpremainingAmount = new JLabel(" Remaining Amount: "); //labelling studDrpremainingAmount as Remaining Amount

        //TextArea
        txtDrpstudentName=new JTextField(); //setting JTextField for studentName
        txtDrpenrollmentID=new JTextField(); //setting JTextField for enrollmentID
        txtDrptutionFee=new JTextField();//setting JTextField for tutionFee
        txtDrpcourseDuration=new JTextField();//setting JTextField for courseDuration
        txtDrpnumOfRemainingModules=new JTextField();//setting JTextField for numOfRemainingModules
        txtDrpnumOfMonthsAttended=new JTextField();//setting JTextField for numOfMonthsAttended
        txtDrpcourseName=new JTextField();//setting JTextField for courseName
        txtDrpremainingAmount = new JTextField();//setting JTextField for remainingAmount

        //combobox
        String[] DOByear = {"2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000","1999","1998","1997","1996","1995","1994","1993","1992","1991","1990"};
        drpcombodateOfBirthyear = new JComboBox<String>(DOByear);//creating combobox for Date of Birth "year"
        String[] DOBmonth = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        drpcombodateOfBirthmonth = new JComboBox<String>(DOBmonth);//creating combobox for Date of Birth "month"
        String[] DOBdays = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","24","25","26","27","28","29","30","31","32"};
        drpcombodateOfBirthdays = new JComboBox<String>(DOBdays);//creating combobox for Date of Birth "days"
        String[] DOEyear = {"2023","2022","2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010"};
        drpcombodateOfEnrollmentyear = new JComboBox<String>(DOEyear);//creating combobox for Date of Enrollment "year"
        String[] DOEmonth = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        drpcombodateOfEnrollmentmonth = new JComboBox<String>(DOEmonth);//creating combobox for Date of Enrollment "month"
        String[] DOEdays = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","24","25","26","27","28","29","30","31","32"};
        drpcombodateOfEnrollmentdays = new JComboBox<String>(DOEdays);//creating combobox for Date of Enrollment "days"
        String[] DOPyear = {"2030","2029","2028","2027","2026","2025","2024","2023","2022","2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010"};
        drpcombodateOfDropOutyear = new JComboBox<String>(DOPyear);//creating combobox for Date of Dropout "year"
        String[] DOPmonth = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        drpcombodateOfDropOutmonth = new JComboBox<String>(DOPmonth);//creating combobox for Date of Dropout "month"
        String[] DOPdays = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","24","25","26","27","28","29","30","31","32"};
        drpcombodateOfDropOutdays = new JComboBox<String>(DOPdays);//creating combobox for Date of Dropout "days"

        //Button
        drpClearButton=new JButton("Clear");//creating new button as Clear in Dropout GUI
        drpClearButton.addActionListener(this);//Action Listener for Clear Button in Dropout GUI
        billsPayable=new JButton("Bills Payable");//creating new button as Bills Payable in Dropout GUI
        billsPayable.addActionListener(this);//Action Listener for Bills Payable Button in Dropout GUI
        drpDisplayButton=new JButton("Display");//creating new button as Display in Dropout GUI
        drpDisplayButton.addActionListener(this);//Action Listener for Display Button in Dropout GUI
        drpRemoveStudent=new JButton("Remove Student");//creating new button as Remove Student in Dropout GUI
        drpRemoveStudent.addActionListener(this);//Action Listener for Remove Student Button in Dropout GUI
        drpAddButton=new JButton("Add");//creating new button as Add in Dropout GUI
        drpAddButton.addActionListener(this);//Action Listener for Add Button in Dropout GUI
        drpBackButton=new JButton("Back");//creating new button as Back in Dropout GUI
        drpBackButton.addActionListener(this);//Action Listener for Back Button in Dropout GUI

        //fonts
        studDrpheading.setFont(new Font("Arial",Font.BOLD,25));//setting up font for Heading
        studDrpstudentName.setFont(new Font("Arial",Font.BOLD,15));//setting up font for Student Name
        studDrpdateOfBirth.setFont(new Font("Arial",Font.BOLD,15));//setting up font for Date Of Birth
        studDrpenrollmentID.setFont(new Font("Arial",Font.BOLD,15));//setting up font for studDrpenrollmentID
        studDrpdateOfEnrollment.setFont(new Font("Arial",Font.BOLD,15));//setting up font for Date Of Enrollment
        studDrpcourseName.setFont(new Font("Arial",Font.BOLD,15));//setting up font for Course Name
        studDrpcourseDuration.setFont(new Font("Arial",Font.BOLD,15));//setting up font for Course Duration
        studDrptutionFee.setFont(new Font("Arial",Font.BOLD,15));//setting up font for Tuition Fee
        studDrpnumOfRemainingModules.setFont(new Font("Arial",Font.BOLD,15));//setting up font for studDrpnumOfRemainingModules
        studDrpdateOfDropOut.setFont(new Font("Arial",Font.BOLD,15));//setting up font for studDrpdateOfDropOut
        studDrpnumOfMonthsAttended.setFont(new Font("Arial",Font.BOLD,15));//setting up font for studDrpnumOfMonthsAttended
        studDrpremainingAmount.setFont(new Font("Arial",Font.BOLD, 15));//setting up font for studDrpremainingAmount
        drpClearButton.setFont(new Font("Arial",Font.BOLD,15));//setting up font for drpClearButton
        drpAddButton.setFont(new Font("Arial", Font.BOLD,15));//setting up font for drpAddButton
        billsPayable.setFont(new Font("Arial", Font.BOLD,15));//setting up font for billsPayable
        drpDisplayButton.setFont(new Font("Arial", Font.BOLD,15));//setting up font for drpDisplayButton
        drpRemoveStudent.setFont(new Font("Arial", Font.BOLD,15));//setting up font for drpRemoveStudent
        drpBackButton.setFont(new Font("Arial", Font.BOLD,15));//setting up font for drpBackButton

        //setbounds
        studDrpheading.setBounds(435,33,130,42);//sets position(x,y,width,height) for studDrpheading

        studDrpstudentName.setBounds(60,110,127,25); //sets position(x,y,width,height) for studDrpstudentName
        txtDrpstudentName.setBounds(220,104,161,32);//sets position(x,y,width,height) for txtDrpstudentName

        studDrpenrollmentID.setBounds(60,175,123,25);//sets position(x,y,width,height) for studDrpenrollmentID
        txtDrpenrollmentID.setBounds(220,171,161,32);//sets position(x,y,width,height) for txtDrpenrollmentID

        studDrptutionFee.setBounds(60,240,101,25);//sets position(x,y,width,height) for studDrptutionFee
        txtDrptutionFee.setBounds(220,240,161,32);//sets position(x,y,width,height) for txtDrptutionFee

        studDrpcourseDuration.setBounds(60,305,147,25);//sets position(x,y,width,height) for studDrpcourseDuration
        txtDrpcourseDuration.setBounds(220,305,161,32);//sets position(x,y,width,height) for txtDrpcourseDuration

        studDrpcourseName.setBounds(60,370,222,25);//sets position(x,y,width,height) for studDrpcourseName
        txtDrpcourseName.setBounds(220,370,161,32);//sets position(x,y,width,height) for txtDrpcourseName

        studDrpremainingAmount.setBounds(60,430,246,25);//sets position(x,y,width,height) for studDrpremainingAmount
        txtDrpremainingAmount.setBounds(220,428,161,32);//sets position(x,y,width,height) for txtDrpremainingAmount

        studDrpnumOfMonthsAttended.setBounds(455,370,246,25);//sets position(x,y,width,height) for studDrpnumOfMonthsAttended
        txtDrpnumOfMonthsAttended.setBounds(670,370,161,32);//sets position(x,y,width,height) for txtDrpnumOfMonthsAttended

        studDrpnumOfRemainingModules.setBounds(455,305,222,25);//sets position(x,y,width,height) for studDrpnumOfRemainingModules
        txtDrpnumOfRemainingModules.setBounds(670,305,161,32);//sets position(x,y,width,height) for txtDrpnumOfRemainingModules

        studDrpdateOfBirth.setBounds(455,110,110,25);//sets position(x,y,width,height) for studDrpdateOfBirth
        drpcombodateOfBirthyear.setBounds(606,104,100,30);//sets position(x,y,width,height) for drpcombodateOfBirthyear
        drpcombodateOfBirthmonth.setBounds(716,104,100,30);//sets position(x,y,width,height) for drpcombodateOfBirthmonth
        drpcombodateOfBirthdays.setBounds(826,104,100,30);//sets position(x,y,width,height) for drpcombodateOfBirthdays

        studDrpdateOfEnrollment.setBounds(455,175,169,25);//sets position(x,y,width,height) for studDrpdateOfEnrollment
        drpcombodateOfEnrollmentyear.setBounds(606,175,100,30);//sets position(x,y,width,height) for drpcombodateOfEnrollmentyear
        drpcombodateOfEnrollmentmonth.setBounds(716,175,100,30);//sets position(x,y,width,height) for drpcombodateOfEnrollmentmonth
        drpcombodateOfEnrollmentdays.setBounds(826,175,100,30);//sets position(x,y,width,height) for drpcombodateOfEnrollmentdays

        studDrpdateOfDropOut.setBounds(455,240,153,25);//sets position(x,y,width,height) for studDrpdateOfDropOut
        drpcombodateOfDropOutyear.setBounds(606,240,100,30);//sets position(x,y,width,height) for drpcombodateOfDropOutyear
        drpcombodateOfDropOutmonth.setBounds(716,240,100,30);//sets position(x,y,width,height) for drpcombodateOfDropOutmonth
        drpcombodateOfDropOutdays.setBounds(826,240,100,30);//sets position(x,y,width,height) for drpcombodateOfDropOutdays

        //Button 
        drpClearButton.setBounds(786,500,120,32);//sets position(x,y,width,height) for drpClearButton
        drpAddButton.setBounds(650,500,120,32);//sets position(x,y,width,height) for drpAddButton
        billsPayable.setBounds(60,500,130,32);//sets position(x,y,width,height) for billsPayable
        drpDisplayButton.setBounds(786,460,120,32);//sets position(x,y,width,height) for drpDisplayButton
        drpRemoveStudent.setBounds(196,500,160,32);//sets position(x,y,width,height) for drpRemoveStudent
        drpBackButton.setBounds(786,33,120,32);//sets position(x,y,width,height) for drpBackButton

        //Add panel
        drpPanel.add(studDrpheading); //adds Heading to the panel
        drpPanel.add(studDrpstudentName); //adds studDrpstudentName to the panel
        drpPanel.add(txtDrpstudentName);//adds txtDrpstudentName to the panel
        drpPanel.add(studDrpenrollmentID);//adds studDrpenrollmentID to the panel
        drpPanel.add(txtDrpenrollmentID);//adds txtDrpenrollmentID to the panel
        drpPanel.add(studDrptutionFee);//adds studDrptutionFee to the panel
        drpPanel.add(txtDrptutionFee);//adds txtDrptutionFee to the panel
        drpPanel.add(studDrpcourseDuration);//adds studDrpcourseDuration to the panel
        drpPanel.add(txtDrpcourseDuration);//adds txtDrpcourseDuration to the panel
        drpPanel.add(studDrpnumOfMonthsAttended);//adds studDrpnumOfMonthsAttended to the panel
        drpPanel.add(txtDrpnumOfMonthsAttended);//adds txtDrpnumOfMonthsAttended to the panel
        drpPanel.add(studDrpnumOfRemainingModules);//adds studDrpnumOfRemainingModules to the panel
        drpPanel.add(txtDrpnumOfRemainingModules);//adds txtDrpnumOfRemainingModules to the panel
        drpPanel.add(studDrpdateOfBirth);//adds studDrpdateOfBirth to the panel
        drpPanel.add(drpcombodateOfBirthyear);//adds drpcombodateOfBirthyear to the panel
        drpPanel.add(drpcombodateOfBirthmonth);//adds drpcombodateOfBirthmonth to the panel
        drpPanel.add(drpcombodateOfBirthdays);//adds drpcombodateOfBirthdays to the panel
        drpPanel.add(studDrpdateOfEnrollment);//adds studDrpdateOfEnrollment to the panel
        drpPanel.add(drpcombodateOfEnrollmentyear);//adds drpcombodateOfEnrollmentyear to the panel
        drpPanel.add(drpcombodateOfEnrollmentmonth);//adds drpcombodateOfEnrollmentmonth to the panel
        drpPanel.add(drpcombodateOfEnrollmentdays);//adds drpcombodateOfEnrollmentdays to the panel
        drpPanel.add(studDrpdateOfDropOut);//adds studDrpdateOfDropOut to the panel
        drpPanel.add(drpcombodateOfDropOutyear);//adds drpcombodateOfDropOutyear to the panel
        drpPanel.add(drpcombodateOfDropOutmonth);//adds drpcombodateOfDropOutmonth to the panel
        drpPanel.add(drpcombodateOfDropOutdays);//adds drpcombodateOfDropOutdays to the panel
        drpPanel.add(studDrpcourseName);//adds studDrpcourseName to the panel
        drpPanel.add(txtDrpcourseName);//adds txtDrpcourseName to the panel
        drpPanel.add(drpClearButton); //adds drpClearButton to the panel
        drpPanel.add(billsPayable);//adds billsPayable to the panel
        drpPanel.add(drpDisplayButton);//adds drpDisplayButton to the panel
        drpPanel.add(drpRemoveStudent);//adds drpRemoveStudent to the panel
        drpPanel.add(drpAddButton);//adds drpAddButton to the panel
        drpPanel.add(drpBackButton);//adds drpBackButton to the panel
        drpPanel.add(studDrpremainingAmount);//adds studDrpremainingAmount to the panel
        drpPanel.add(txtDrpremainingAmount);//adds txtDrpremainingAmount to the panel
        //SetFrame
        stdDrpframe.setSize(1000,600); //sets frame size
        stdDrpframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits program on close
        stdDrpframe.setVisible(false); //sets frame as invisible
        stdDrpframe.setResizable(false); //prevents from resizing the frame

    }

    public void actionPerformed(ActionEvent e) //starting Action Event to add Button functionality
    {
        //for functionality of Regular Button
        if(e.getSource()==regularButton)
        {
            firstFrame.dispose();//disposes firstFrame
            stdRegframe.setVisible(true);
        }
        //for functionality of Dropout Button
        else if(e.getSource()==dropOutButton)
        {
            firstFrame.dispose();
            stdDrpframe.setVisible(true);

        }
        if (e.getSource() == studRegbackButton) //for functionality of back button in Regular GUI
        {
            stdRegframe.setVisible(false);
            stdDrpframe.setVisible(false);
            firstFrame.setVisible(true);
        }
        else if (e.getSource() == drpBackButton) //for functionality of back button in Dropout GUI
        {
            stdRegframe.setVisible(false);
            stdDrpframe.setVisible(false);
            firstFrame.setVisible(true);
        }

        else if (e.getSource() == studRegclearButton)// for functionality of Clear button in Regular GUI
        {
            txtRegenrollmentID.setText("");
            txtRegstudentName.setText("");
            txtRegcourseDuration.setText("");
            txtRegtuitionFee.setText("");
            txtRegnumOfModules.setText("");
            txtRegnumOfCreditHours.setText("");
            txtRegcourseName.setText("");
            txtRegdaysPresent.setText("");
        }

        else if (e.getSource() == studRegaddButton) //for functionality of add button in RegularGUI
        {
            if (txtRegenrollmentID.getText().isEmpty() ||
            txtRegstudentName.getText().isEmpty() ||
            txtRegcourseDuration.getText().isEmpty() ||
            txtRegnumOfCreditHours.getText().isEmpty() ||
            txtRegtuitionFee.getText().isEmpty() ||
            txtRegdaysPresent.getText().isEmpty() ||
            txtRegcourseName.getText().isEmpty() ||
            txtRegnumOfModules.getText().isEmpty()) 
            {
                JOptionPane.showMessageDialog(stdRegframe, "Please fill up all the values correctly", "ERROR", JOptionPane.ERROR_MESSAGE);//show a dialog box if the above loop is true
            } 
            else 
            {
                try 
                {
                    //inserting data in arraylist
                    int regenrollmentIDValue = Integer.parseInt(txtRegenrollmentID.getText());

                    String regDOByearValue = regcomboDOByear.getSelectedItem().toString();
                    String regDOBmonthValue = regcomboDOBmonth.getSelectedItem().toString();
                    String regDOBdaysValue = regcomboDOBdays.getSelectedItem().toString();
                    String regdateOfBirthValue = regDOByearValue + "/" + regDOBmonthValue + "/" + regDOBdaysValue;

                    String regcourseNameValue = txtRegcourseName.getText();
                    String regstudentNameValue = txtRegstudentName.getText();

                    String regDOEyearValue = regcomboDOEyear.getSelectedItem().toString();
                    String regDOEmonthValue = regcomboDOEmonth.getSelectedItem().toString();
                    String regDOEdaysValue = regcomboDOEdays.getSelectedItem().toString();
                    String regdateOfEnrollmentValue = regDOEyearValue + "/" + regDOEmonthValue + "/" + regDOEdaysValue;

                    int regcourseDurationValue = Integer.parseInt(txtRegcourseDuration.getText());
                    int regtuitionFeeValue = Integer.parseInt(txtRegtuitionFee.getText());
                    int regnumOfModulesValue = Integer.parseInt(txtRegnumOfModules.getText());
                    int regnumOfCreditHoursValue = Integer.parseInt(txtRegnumOfCreditHours.getText());
                    double regdaysPresentValue = Double.parseDouble(txtRegdaysPresent.getText());
                    if(regenrollmentIDValue < 1 || regcourseDurationValue  < 1 || regtuitionFeeValue < 1 || regnumOfModulesValue < 1 || regnumOfCreditHoursValue < 1 || 
                    regdaysPresentValue <1)
                    {
                        throw new IllegalArgumentException("Negative Integer is not allowed");//this throws a exception when negative integer is inserted in the text field
                    }
                    boolean reg_exist = false;
                    if (regstudentNameValue.matches("[a-zA-Z]+") && regcourseNameValue.matches("[a-zA-Z]+")) //prevents adding duplicate enrollmentID
                    {
                        for (Student inf : stdArray)
                        {
                            if (inf.getEnrollmentID() == regenrollmentIDValue && inf instanceof Regular) 
                            {
                                reg_exist = true;
                                break;
                            } 
                            else 
                            {
                                reg_exist = false;
                            }
                        }

                        if (reg_exist == false) 
                        {
                            Regular reg_studentObject = new Regular(regenrollmentIDValue, regdateOfBirthValue, regcourseNameValue, regstudentNameValue, 
                                    regdateOfEnrollmentValue, regcourseDurationValue, regtuitionFeeValue, regnumOfModulesValue, regnumOfCreditHoursValue, 
                                    regdaysPresentValue);
                            stdArray.add(reg_studentObject);
                            JOptionPane.showMessageDialog(stdRegframe, "Student Data Added.\n EnrollmentID: " + regenrollmentIDValue +"\n Date Of Birth: " +
                                regdateOfBirthValue +"\n Course Name: " + regcourseNameValue +"\n Name of Student: " + regstudentNameValue + "\n Date Of Enrollment: " +
                                regdateOfEnrollmentValue + "\n Course Duration: " + regcourseDurationValue +"\n Tuition Fee: " + regtuitionFeeValue +  "\n Num Of Modules: " 
                                + regnumOfModulesValue + "\n Num Of Credit Hours: "+ regnumOfCreditHoursValue +"\n Days Present: " + regdaysPresentValue, 
                                "Add Regular Student", JOptionPane.INFORMATION_MESSAGE); //adding all the arrays and labelling them and displayed
                        }
                        else 
                        {
                            JOptionPane.showMessageDialog(stdRegframe, "Student Enrollment ID : "+regenrollmentIDValue+" is Already in the base", "Duplicate Student Enrollment ID", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(stdRegframe, "Invalid Value Entered", "Check Again", JOptionPane.ERROR_MESSAGE);
                    }
                } 
                catch (NumberFormatException ex) 
                {
                    JOptionPane.showMessageDialog(stdRegframe, "Invalid Input", "Check the given data", JOptionPane.ERROR_MESSAGE);
                }
                catch(IllegalArgumentException ex)
                {
                    JOptionPane.showMessageDialog(stdDrpframe, ex.getMessage());
                }
            }
        } 
        else if (e.getSource() == studPpercentageButton) //for functionality button of presentPercentage
        {
            if (stdArray.isEmpty()) 
            {
                JOptionPane.showMessageDialog(stdRegframe, "Some or All details are empty", "Check Again", JOptionPane.ERROR_MESSAGE);
            }
            else 
            {
                try
                {
                    boolean reg_exist = false;
                    int txtregenrollmentIDValue = Integer.parseInt(txtRegenrollmentID.getText());
                    double txtregdaysPresentValue = Integer.parseInt(txtRegdaysPresent.getText());

                    for (Student inf : stdArray) 
                    {
                        if (inf instanceof Student) 
                        {
                            Regular regObj = (Regular) inf;
                            if (regObj.getEnrollmentID() == txtregenrollmentIDValue) 
                            {
                                char regpresentPercentage=regObj.presentPercentage(txtregdaysPresentValue);
                                if(regpresentPercentage == '\0')
                                {
                                    JOptionPane.showMessageDialog(stdRegframe,"Course Duration is less than Days Present","Retry",JOptionPane.INFORMATION_MESSAGE);
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(stdRegframe,"Grade : "+regpresentPercentage,"Student",JOptionPane.INFORMATION_MESSAGE);
                                }
                                reg_exist = true;
                                break; // Assuming you want to stop the loop if a match is found
                            }
                        }
                    }
                } 
                catch (NumberFormatException ex) //throws a number format exception
                {
                    JOptionPane.showMessageDialog(stdRegframe, "Invalid input for enrollment ID or days present", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else if (e.getSource() == grantCertificate)//for functionality of scholarship button
        {
            if(stdArray.isEmpty())
            {
                JOptionPane.showMessageDialog(stdRegframe,"Some or All details are empty","Check Again",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    int txtregenrollmentIDValue = Integer.parseInt(txtRegenrollmentID.getText());
                    String txtregcourseNameValue = txtRegcourseName.getText();
                    String DOEyear = regcomboDOEyear.getSelectedItem().toString();
                    String DOEmonth = regcomboDOEmonth.getSelectedItem().toString();
                    String DOEdays = regcomboDOEdays.getSelectedItem().toString();
                    String txtregdateOfEnrollmentValue = DOEyear + "/" + DOEmonth + "/" + DOEdays; //adding all the combobox to display it together
                    for(Student inf : stdArray)
                    {
                        if(inf instanceof Regular)
                        {
                            Regular regObj = (Regular) inf;
                            if (regObj.getEnrollmentID() == txtregenrollmentIDValue)
                            {
                                regObj.grantCertificate(txtregcourseNameValue,txtregenrollmentIDValue,txtregdateOfEnrollmentValue);
                                if(regObj.getIsGrantedScholarship() == true)
                                {
                                    JOptionPane.showMessageDialog(stdRegframe,"Scholarship Received","Congratulations",JOptionPane.INFORMATION_MESSAGE);
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(stdRegframe,"Scholarship Not Received","Sorry",JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                        }
                    }
                }
                catch(NumberFormatException exe)
                {
                    JOptionPane.showMessageDialog(stdRegframe,"Check and Fill Empty Details", "Try Again", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        else if (e.getSource() == studRegdisplayButton) 
        {
            try
            {
                boolean displayButtonflag = false;
                String displayButton_drop = "";

                for (Student inf : stdArray) 
                {
                    if (inf instanceof Regular) 
                    {
                        Regular regdispObj = (Regular) inf;
                        regdispObj.display();
                        displayButton_drop=("\n EnrollmentID: "+regdispObj.getEnrollmentID()+
                            "\n Date Of Birth: "+regdispObj.getDateOfBirth()+
                            "\n Course Name: "+regdispObj.getCourseName()+
                            "\n Date Of Enrollment:"+regdispObj.getDateOfEnrollment()+
                            "\n Course Duration: "+regdispObj.getCourseDuration()+
                            "\n Num Of Modules:"+ regdispObj.getNumOfModules()+
                            "\n  Num Of Credit Hours:"+regdispObj.getNumOfCreditHours()+
                            "\n Days Present:"+regdispObj.getDaysPresent())+
                        "\nx==========================================x" + displayButton_drop;
                        displayButtonflag = true;
                    }
                }

                if (displayButtonflag== false) 
                {
                    JOptionPane.showMessageDialog(stdRegframe, "Fill Leftout Details.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else 
                {
                    JOptionPane.showMessageDialog(stdRegframe, displayButton_drop);
                }
            } 
            catch (NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(stdRegframe, "Check all the given info", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (e.getSource() == drpClearButton)//functionality of clear button in DropoutGUI
        {
            txtDrpstudentName.setText("");
            txtDrpenrollmentID.setText("");
            txtDrptutionFee.setText("");
            txtDrpcourseDuration.setText("");
            txtDrpnumOfMonthsAttended.setText("");
            txtDrpnumOfRemainingModules.setText("");
            txtDrpcourseName.setText("");
            txtDrpremainingAmount.setText("");
        }
        else if(e.getSource() == drpAddButton)//functionality of add button in DropoutGUI
        {
            if(txtDrpstudentName.getText().isEmpty() ||
            txtDrpcourseName.getText().isEmpty() ||
            txtDrpenrollmentID.getText().isEmpty() ||
            txtDrptutionFee.getText().isEmpty() ||
            txtDrpnumOfRemainingModules.getText().isEmpty() ||
            txtDrpnumOfMonthsAttended.getText().isEmpty() ||
            txtDrpcourseDuration.getText().isEmpty() ||
            txtDrpremainingAmount.getText().isEmpty() )
            {
                JOptionPane.showMessageDialog(stdDrpframe,"Fill up the text field","Details are empty",JOptionPane.INFORMATION_MESSAGE);
            }  
            else
            {
                try 
                {
                    //inserting data in arraylist
                    String dropDOByear = drpcombodateOfBirthyear.getSelectedItem().toString();
                    String dropDOBmonth = drpcombodateOfBirthmonth.getSelectedItem().toString();
                    String dropDOBdays = drpcombodateOfBirthdays.getSelectedItem().toString();
                    String dateOfBirthValue = dropDOByear + "/" + dropDOBmonth + "/" + dropDOBdays;

                    String studentNameValue = txtDrpstudentName.getText();
                    int dropcourseDurationValue = Integer.parseInt(txtDrpcourseDuration.getText());
                    int droptutionFeeValue = Integer.parseInt(txtDrptutionFee.getText());
                    int dropnumOfRemainingModulesValue = Integer.parseInt(txtDrpnumOfRemainingModules.getText());
                    int dropnumOfMonthsAttendedValue = Integer.parseInt(txtDrpnumOfMonthsAttended.getText());

                    String dropDOEyear = drpcombodateOfEnrollmentyear.getSelectedItem().toString();
                    String dropDOEmonth = drpcombodateOfEnrollmentmonth.getSelectedItem().toString();
                    String dropDOEdays = drpcombodateOfEnrollmentdays.getSelectedItem().toString();
                    String dateOfEnrollmentValue = dropDOEyear + "/" + dropDOEmonth + "/" + dropDOEdays;

                    String dropDOPyear = drpcombodateOfDropOutyear.getSelectedItem().toString();
                    String dropDOPmonth = drpcombodateOfDropOutmonth.getSelectedItem().toString();
                    String dropDOPdays = drpcombodateOfDropOutdays.getSelectedItem().toString();
                    String dateOfDropoutValue = dropDOPyear + "/" + dropDOPmonth + "/" + dropDOPdays;

                    String courseNameValue = txtDrpcourseName.getText();
                    int dropremainingAmountValue = Integer.parseInt(txtDrpremainingAmount.getText());
                    int dropenrollmentIDValue = Integer.parseInt(txtDrpenrollmentID.getText());
                    if(dropcourseDurationValue < 1 || droptutionFeeValue  < 1 || dropnumOfRemainingModulesValue < 1 || dropnumOfMonthsAttendedValue < 1 || dropremainingAmountValue < 1
                    || dropenrollmentIDValue < 1)
                    {
                        throw new IllegalArgumentException("Negative Integer is not allowed");
                    }
                    boolean drop_exist = false; //prevents number to be entered in string

                    if(studentNameValue.matches("[a-zA-Z]+") && courseNameValue.matches("[a-zA-Z]+"))
                    {
                        for (Student inf : stdArray)
                        {
                            if(inf.getEnrollmentID()== dropenrollmentIDValue && inf instanceof Regular)
                                if(inf instanceof Dropout)
                                {
                                    drop_exist = true;
                                    break;
                                }
                                else
                                {
                                    drop_exist = false;
                                }
                        }
                        if(drop_exist == false)
                        {
                            Dropout DropoutObject = new Dropout(dateOfBirthValue,studentNameValue,dropcourseDurationValue,droptutionFeeValue,dropnumOfRemainingModulesValue,
                                    dropnumOfMonthsAttendedValue,dateOfDropoutValue,courseNameValue,dropenrollmentIDValue,dateOfEnrollmentValue);
                            stdArray.add(DropoutObject);
                            JOptionPane.showMessageDialog(stdDrpframe, "Student Data Added.\n Enrollment ID :"+dropenrollmentIDValue+"\n Student Name :"+ studentNameValue +
                                "\n Date Of Birth : "+dateOfBirthValue+"\n Date Of Enrollment :"+dateOfEnrollmentValue+"\n Date of Dropout :"+dateOfDropoutValue+"\n Course Name :"
                                +courseNameValue+"\n Course Duration :"+dropcourseDurationValue+"\n Tuition Fee"+droptutionFeeValue+"\n Remaining Amount :"+dropremainingAmountValue+
                                "\n No. Of Modules :"+ dropnumOfRemainingModulesValue+"\n No. Of Months Attended :"+dropnumOfMonthsAttendedValue,"Add DropOut Student", 
                                JOptionPane.INFORMATION_MESSAGE);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(stdDrpframe,"Student Enrollment ID :"+dropenrollmentIDValue+"is already in the database", "Duplicate Student Enrollment ID",
                                JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(stdDrpframe, "Invalid Value Entered","Check Again",JOptionPane.ERROR_MESSAGE);
                    }
                }

                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(stdDrpframe, "Enter valid info" , "Error", JOptionPane.ERROR_MESSAGE);
                }

                catch(IllegalArgumentException exi)
                {
                    JOptionPane.showMessageDialog(stdDrpframe, exi.getMessage());
                }
            }
        }

        else if (e.getSource() == billsPayable)
        {
            if(stdArray.isEmpty())
            {
                JOptionPane.showMessageDialog(stdDrpframe,"No students found","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    int enrollmentIDValue = Integer.parseInt(txtDrpenrollmentID.getText());
                    String studentNameValue = txtDrpstudentName.getText();
                    for(Student inf : stdArray)
                    {
                        if(inf instanceof Dropout)
                        {
                            Dropout DropoutObject = (Dropout) inf;
                            if(inf.getEnrollmentID() == enrollmentIDValue)
                            {
                                DropoutObject.billsPayable();
                                JOptionPane.showMessageDialog(stdDrpframe,"Bills Cleared","Success",JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(stdDrpframe, "enter valid info","error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        else if (e.getSource() == drpDisplayButton)
        {
            try
            {
                boolean dropDisplayflag = false;
                String dropdisplayButton_all = "";
                for (Student inf : stdArray)
                {
                    if(inf instanceof Dropout)
                    {
                        Dropout dropoutObject = (Dropout) inf;
                        dropoutObject.display();
                        dropdisplayButton_all = ("\n Date Of Birth :"+dropoutObject.getDateOfBirth()+"\n Date Of Student Name :"+dropoutObject.getStudentName()+"\n Course Duration :"
                            +dropoutObject.getCourseDuration()+"\n Tuition Fee :"+dropoutObject.getTuitionFee()+"\n No. of Remaining Modules :"+dropoutObject.getNumOfRemainingModules()+
                            "\n No. of Months Attended "+dropoutObject.getNumOfMonthsAttended()+"\n Date Of Dropout :"+ dropoutObject.getDateOfDropout()+"\n Course Name :"
                            +dropoutObject.getCourseName()+"\n  Enrollment ID :"+dropoutObject.getEnrollmentID()+"\n Date of Enrollment :"+dropoutObject.getDateOfEnrollment())+
                        "\n_______________________________" + dropdisplayButton_all;
                        dropDisplayflag = true;
                    }
                } 
                if (dropDisplayflag==false)
                {
                    JOptionPane.showMessageDialog(stdDrpframe, "Fill Leftout Details." , "Error", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(stdDrpframe, dropdisplayButton_all);
                }
            }
            catch (NumberFormatException ex)//exception
            {
                JOptionPane.showMessageDialog(stdDrpframe, "Check all the given info", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (e.getSource() == drpRemoveStudent )//functionality of remove student button
        {
            if(stdArray.isEmpty())  
            {
                JOptionPane.showMessageDialog(stdDrpframe, "Please fill the info correctly: " , "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                boolean dropremovestdflag =false;
                if(txtDrpenrollmentID.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(stdDrpframe,"Student"+studDrpstudentName+"Student has been removed successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    try
                    {
                        int enrollmentID = Integer.parseInt(txtDrpenrollmentID.getText());
                        for (Student inf : stdArray)
                        {
                            if(inf instanceof Dropout)
                            {
                                Dropout DropoutObject = (Dropout) inf;
                                if(DropoutObject.getEnrollmentID() == enrollmentID)
                                {
                                    if(DropoutObject.getHasPaid() == false)
                                    {
                                        JOptionPane.showMessageDialog(stdDrpframe,"No such Student Found","Error",JOptionPane.ERROR_MESSAGE);
                                    }
                                    else
                                    {
                                        DropoutObject.removeStudent();
                                        JOptionPane.showMessageDialog(stdDrpframe,"Successfully removed","Success",JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    dropremovestdflag = true;
                                }
                            }
                        }
                        if(dropremovestdflag = false)
                        {
                            JOptionPane.showMessageDialog(stdDrpframe,"Fill in with valid info","Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    catch (NumberFormatException ex)
                    {
                        JOptionPane.showMessageDialog(stdDrpframe, "Check all the given info", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }

    }

    // Calling main method of all GUI
    public static void main(String[]args)
    {
        StudentGUI student = new StudentGUI ();
        student.WLCGUI();
        student.RegularGUI();
        student.DropoutGUI(); 

    }
}

