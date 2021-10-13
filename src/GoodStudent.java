import java.util.Locale;

public class GoodStudent
{
    // instance variables
    private String firstName;
    private String lastName;
    private int idNum;
    private double gpa;
    private boolean csStudent;

    // constructors
    public GoodStudent(String newFirst, String newLast, int newIdNum, double newGpa, boolean newCsStudent)
    {
        firstName = newFirst;
        lastName = newLast;
        idNum = newIdNum;
        gpa = newGpa;
        csStudent = newCsStudent;
    } // end full goodStudent constructor

    public GoodStudent()
    {
        firstName = "";
        lastName = "";
        idNum = 0;
        gpa = 0.0;
        csStudent = false;
    } // end empty goodStudent constructor

    public GoodStudent(String newFirst, String newLast, boolean newCsStudent)
    {
        firstName = newFirst;
        lastName = newLast;
        idNum = 0;
        gpa = 0.0;
        csStudent = newCsStudent;
    } // end default goodStudent constructor

    // getters
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getIdNum()
    {
        return idNum;
    }

    public double getGpa()
    {
        return gpa;
    }

    public boolean getCsStudent()
    {
        return csStudent;
    }

    // setters
    public void setFirstName(String newFirstName)
    {
        firstName = newFirstName;
    }

    public void setLastName(String newLastName)
    {
        lastName = newLastName;
    }

    public void setIdNum(int newIdNum)
    {
        idNum = newIdNum;
    }

    public void setGpa(double newGpa)
    {
        gpa = newGpa;
    }

    public void setCsStudent(boolean newCsStudent)
    {
        csStudent = newCsStudent;
    }

    // brain method
    public String CreateID()
    {
        String idNumAsString = "" + idNum;
        String id = firstName.charAt(0) + lastName.toLowerCase();
        id = id.toLowerCase();
        id += idNumAsString.substring(idNumAsString.length() - 3);;
        return id;
    }
    public double CSGPA()
    {
        if (csStudent)
        {
            gpa *= 1.15;
        }
        gpa *= 100;
        gpa = Math.floor(gpa);
        gpa /= 100;
        return gpa;
    }

    // toString
    public String toString()
    {
        String output = "First Name: " + firstName;
        output += "\nLast Name: " + lastName;
        output += "\nID Number: " + idNum;
        output += "\nGPA: " + gpa;
        output += "\nCS Student: " + csStudent;
        return output;
    }

} // end class GoodStudent
