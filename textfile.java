

import java.io.*;
public class textfile 
{
    public static void main(String ars[])
    {
        File f=new File("C:/Users/Milan_Bhardwaj/Desktop/ACADVIEW/Dynamic Data Storage/abc.txt");
		
		try{
			FileInputStream fin=new FileInputStream(f);
			int i;
			i=fin.read();//at last return -1
			
			while(i!=-1)
			{
				System.out.println((char)i);
				i=fin.read();
			}
			fin.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		System.out.println("\nFile path = "+f.getPath());
		
       
    }
}

