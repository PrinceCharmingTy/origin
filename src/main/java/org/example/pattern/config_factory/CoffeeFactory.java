package org.example.pattern.config_factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class CoffeeFactory {

    private static HashMap<String, Coffee> map = new HashMap<String, Coffee>();

    static {
        Properties p = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            p.load(is);
            //从P集合中获取全类名并创建对象
            Set<Object> keys = p.keySet();

            for (Object key : keys) {
                String className = p.getProperty((String) key);
                //
                Class clazz = Class.forName(className);
                //
                Coffee coffee = (Coffee) clazz.newInstance();
                //
                map.put((String) key, coffee);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static Coffee getCoffee(String coffeeType) {
        return map.get(coffeeType);
    }
}
