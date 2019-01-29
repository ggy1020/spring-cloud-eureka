package com.ggy.springcloudeureka.stream;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ObjectToMap {
    public static void main(String[] args) {
        User user = new User("gg",1,1);
        Map<String,Object>  map = object2Map(user);
        System.out.println(map.toString());
    }

    public static Map<String,Object> object2Map(Object object){
        Map<String,Object> result=new HashMap<>();
        //获得类的的属性名 数组
        Field[]fields=object.getClass().getDeclaredFields();
        try {
            for (Field field : fields) {
                field.setAccessible(true);
                result.put(field.getName(), field.get(object));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

}
