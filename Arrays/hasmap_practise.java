package arrays;
import java.net.Inet4Address;
import java.util.HashMap;

class hashmap_practise{

    public static void hash(){
        HashMap<String ,Integer> mapy = new HashMap<>();

        mapy.put("rohit", 99);
        mapy.put("riya", 90);
        mapy.put("manu", 79);
        mapy.put("tanu", 87);

        System.out.println(mapy);
        
        System.out.println(mapy.get("rohit"));

        System.out.println(mapy.size());

        System.out.println(mapy.remove("riya"));
        System.out.println(mapy.size());

        //loop through keys 
        for(String key : mapy.keySet()){
            System.out.println(key + " : "+mapy.get(key)); //key only give key
        }

        //loop through values
        for(Integer value : mapy.values()){
            System.out.println(value);
        }

        //check if key or value present it give ans in boolean 

        System.out.println(mapy.containsKey("rohit"));
        System.out.println(mapy.containsKey("Rohit")); // that means need exact wording
        System.out.println(mapy.containsValue(87));

    }
    public static void main(String[] args) {
        hashmap_practise h = new hashmap_practise();
        h.hash();

        

    }
}