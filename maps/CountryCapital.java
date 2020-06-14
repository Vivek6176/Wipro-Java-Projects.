
package maps;
import java.util.*;
class CountryCapital {
    static HashMap<String,String> M1=new HashMap<>();
    static public HashMap<String,String> saveCountryCapital(String CountryName,String capital) {
        M1.put(CountryName,capital);
        return M1;
    }
    static public String getCapital(String CountryName) {
        if(M1.containsKey(CountryName))
            return M1.get(CountryName);
        else
            return "No country with name "+CountryName;
    }
    static public String getCountry(String capitalName) {
        if(M1.containsValue(capitalName))
        {
            Set<Map.Entry<String,String>> set=M1.entrySet();
            Iterator<Map.Entry<String, String>> itr=set.iterator();
            while(itr.hasNext()) {
                Map.Entry<String,String> x=itr.next();       
                    if (x.getValue().equals(capitalName))
                        return x.getKey();
            }
        }
        return "No country with capital "+capitalName;
    }
    static public HashMap<String,String> swap(){
        HashMap<String,String> M2=new HashMap<>();
        Set<Map.Entry<String,String>> set=M1.entrySet();
        Iterator<Map.Entry<String,String>> itr=set.iterator();
        while(itr.hasNext()) {
            Map.Entry<String,String> x=itr.next();
            M2.put(x.getValue(),x.getKey());
        }  
        return M2;
    }
    static public ArrayList<String> makeArrayList() {
        ArrayList<String> list=new ArrayList<>();
        Set<Map.Entry<String,String>> set=M1.entrySet();
        Iterator<Map.Entry<String,String>> itr=set.iterator();
        while(itr.hasNext()) {
            Map.Entry<String,String> me=itr.next();
            list.add(me.getKey());
        }
        return list;
    }
    public static void main(String[] args) {
        saveCountryCapital("India","New Delhi");
        saveCountryCapital("Norway","Oslo");
        saveCountryCapital("Germany","Berlin");
        saveCountryCapital("Czech Republic","Prague");
        System.out.println(getCapital("Norway"));
        System.out.println(getCapital("France"));
        System.out.println(getCountry("Berlin"));
        System.out.println(getCountry("London"));
        System.out.println(makeArrayList());
        HashMap<String,String> M2=swap();
        System.out.println(M2);
    }
}
