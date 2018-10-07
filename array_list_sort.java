import java.util.*; 
import java.lang.*; 
import java.io.*; 
 
class Student 
{ 
    int rollno; 
    String name, address; 
    public Student(int rollno, String name, 
                               String address) 
    { 
        this.rollno = rollno; 
        this.name = name; 
        this.address = address; 
    } 
  
    public String toString() 
    { 
        return this.rollno + " " + this.name + 
                           " " + this.address; 
    } 
} 
  
class sort_roll implements Comparator<Student> 
{ 
    public int compare(Student obj1, Student obj2) 
    { 
        return obj1.rollno - obj2.rollno; 
    } 
} 

class array_list_sort 
{ 
    public static void main (String[] args) 
    { 
        List<Student> al = new ArrayList<Student>(); 
        al.add(new Student(22, "Shubham", "Kalka")); 
        al.add(new Student(21, "Milan", "Chandigarh")); 
        al.add(new Student(17, "Pankaj", "Baddi")); 

        System.out.println("Sorted by Name"); 
        //Collections.sort(this.al); 
        System.out.println(al); 

        Collections.sort(al, new sort_roll()); 
  
        System.out.println("\nSorted by Age"); 
        System.out.println(al); 
    } 
} 
