import java.io.File.*;
import java.util.*;
import java.lang.*;
import java.text.SimpleDateFormat;
import java.io.*;
//Name of the class
public class FileStatistics
{
//main method of class
    public static void main(String[] args)
       {

    try
    {
//get a filePath object of class File
   File filePath =new File("C:\\FileStatistics.txt");

    System.out.println("File Path "+filePath.getAbsolutePath());

long dateTime=filePath.lastModified();
//create a date object d
Date d=new Date(dateTime);
//Create object for simple date formatter
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
//given date object to format method ,it will convert into actual date format
String dateString=sdf.format(d);
System.out.println("Last modified Date and Time: " + dateString);
//File properties
System.out.println("File Name:- "+filePath.getName());
System.out.println("Drive Name:-   "+filePath.getParent());
System.out.println("Read >>> "+filePath.canRead());
System.out.println("Write >>> "+filePath.canWrite());
   System.out.println("Size of File:- " +filePath+"="+filePath.length()+"kb");
    }
    catch(Exception e)
    {
           System.out.println(e);
    }//End of catch blcok
    }//end of main method
}//end of class
