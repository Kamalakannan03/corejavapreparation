import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTry {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","one");
        map.put("2","two");
        map.put("3","three");

        for(Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        map.entrySet().stream()
                .forEach((set)-> {
                    System.out.println("from value"+set.getValue());
                    System.out.println("from key"+set.getKey());});

        map
                .forEach((key,value)-> System.out.println("key==>"+key+" value==>"+value));

    }
}
