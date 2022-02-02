

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Cat cat=new Cat("Tom",20);
        System.out.println(cat.print());

        ObjectMapper mapper=new ObjectMapper();
        String serialaser =mapper.writeValueAsString(cat);
        System.out.println(serialaser);

        Cat deserialaser =mapper.readValue(serialaser,Cat.class);
        System.out.println(deserialaser);
    }
}
