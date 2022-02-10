package pack2;

import java.util.*;

public class CollectionEx {

    public static void main(String[] args) {

        Map<String,String> obj = new TreeMap();
        obj.put("name1","Hari");
        obj.put("name2","Bob");
        obj.put("name3","Ciya");
        obj.replace("name3","Abhi");

       Set obj1 = obj.entrySet();
       Iterator iterator = obj1.iterator();

       while (iterator.hasNext()){

           Map.Entry entry = (Map.Entry)iterator.next();
           System.out.println(entry.getKey()+":"+entry.getValue());

       }

    }
}
