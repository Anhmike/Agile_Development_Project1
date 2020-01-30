
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream; 
  
public class DistanceRange { 
    public static void main(String[] argv) 
        
    		throws Exception 
    { 
  
        try { 
  
            // Creating object of ArrayList<Integer> 
            ArrayList<String> 
                arrlist = new ArrayList<String>(); 
  
            // Populating arrlist1 
            arrlist.add("4"); 
            arrlist.add("7"); 
            arrlist.add("20"); 
            arrlist.add("3"); 
            arrlist.add("9"); 
            int start = 0;
			int end = 0;
			List<Integer> range = IntStream.rangeClosed(start, end)
            	    .boxed().collect(Collectors.toList());
  
            // print arrlist 
            System.out.println("Original distance list: "
                               + arrlist); 
  
            // not quite right but in the right direction.
            //I'm trying to set a range for the distance search
            List<String> arrlist2 = arrlist.subList(2, 4); 
  
            // print the subList 
            System.out.println("Range between index 2 and 4 : "
                               + arrlist2); 
        } 
  
        catch (IndexOutOfBoundsException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
  
        catch (IllegalArgumentException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
    } 
} 