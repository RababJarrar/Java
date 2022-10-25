import java.util.HashMap;
import java.util.Set;

public class Track {
public static void main(String[] args) {
HashMap<String, String> Track = new HashMap<String, String>();
Track.put("first song", "Hi Hi Hi");
Track.put("seconed song", "welcome back");
Track.put("third song", "Buy Buy Buy");
Track.put("forth song", "Ahen W Sahlan");
String string_selected = Track.get("third song");
System.out.println(string_selected);

Set<String> keys = Track.keySet();
        for(String key : keys) {
            System.out.println(key+" : "+Track.get(key)); 
        }

}
}