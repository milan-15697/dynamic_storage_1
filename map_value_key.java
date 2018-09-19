import java.util.*;
class map_value_key {
  public static void main(String[] args) {

    Scanner Scan= new Scanner (System.in);
    HashMap<String, Integer> hm= new HashMap<String, Integer>();

        hm.put("Milan", 222); 
        hm.put("Pankaj", 268); 
        hm.put("Shubham", 365);

if (hm.isEmpty())  
        { 
            System.out.println("HM is empty"); 
        } 
          
        else
        { 
            System.out.println(hm); 
        } 

  
  }
}
