import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class date_english 
{ 
    public static void main (String[] args) throws Exception
    { 
     SimpleDateFormat format1 = new SimpleDateFormat("dd-mm-yyyy");
     Date date = format1.parse("15-01-1998");
     SimpleDateFormat format2 = new SimpleDateFormat("MMMMM dd, yyyy");
     String dateString = format2.format(date);
     System.out.println(dateString);     
    } 
} 
