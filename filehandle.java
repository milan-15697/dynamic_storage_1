import java.io.*;
public class copytextfile1
{
    public static void main(String ars[])
    {
        File f=new File("C:/Users/milano/Dynamic Data Storage 2/input.txt");
		File f1=new File("C:/Users/Shubham Mishra/Desktop/ACADVIEW/ASSIGNMENTS/Dynamic Data Storage 2/output.txt");
		// FOR READING PURPOSE OF input.txt file and WRITTING PURPOSE of output.txt
		try
		{
			FileInputStream fin=new FileInputStream(f);
			FileOutputStream fout=new FileOutputStream(f1);
			int i;
			i=fin.read();
			
			while(i!=-1)
			{
				fout.write((char)i);
				i=fin.read();
				
			}
			fin.close();
			fout.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

// FOR READING PURPOSE OF OUTPUT FILE
		try{
			FileInputStream fin=new FileInputStream(f1);
			int i;
			i=fin.read();
			
			while(i!=-1)
			{
				System.out.print((char)i);
				i=fin.read();
			}
			fin.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		
		
       
    }
}

