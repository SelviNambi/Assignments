import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;
 
public class OrderByValue {
 
    public static void main(String a[]){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("java", 20);
        map.put("C++", 45);
        map.put("HTML", 2);
        map.put("JS", 67);
        map.put("SQL", 93);

        Iterator<String> it = map.keySet().iterator();
          System.out.println("Map Contents are..");
          while(it.hasNext())
          {
            String key = it.next();

          System.out.println(key + " : " + map.get(key));
        
          }
  
        Set<Entry<String, Integer>> set = map.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o1.getValue()).compareTo( o2.getValue() );
            }
        } );
        for(Map.Entry<String, Integer> entry:list){
            System.out.println("Key:   "+entry.getKey()+"   Value:   "+entry.getValue());
        }
    }
}