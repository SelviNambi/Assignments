import java.util.*;
 
public class NumberSquareMap 
{
 
  public static void main(String[] args)
   {
    // int array[] = new int[]{1,2,3,4,5,6,7,8,9};

    ArrayList<Integer> list = new ArrayList<>();
      
      
      list.add(10);
      list.add(9);
      list.add(12);
      list.add(5);
      list.add(4);
      
      System.out.println("List contents are:");
      System.out.println(list);
      HashMap<Integer, Integer> map = method(list);
   
      Iterator<Integer> it = map.keySet().iterator();
      System.out.println("Map Contents are..");
      while(it.hasNext())
      {
        Integer key = it.next();

      System.out.println(key + " : " + map.get(key));
    
      }
  
    }

      public static HashMap method(List<Integer> array) {
        HashMap<Integer, Integer> map = new HashMap<>();
     
        for (int n: array) {
          map.put( n, n*n);
        }
        return map;
      }
}