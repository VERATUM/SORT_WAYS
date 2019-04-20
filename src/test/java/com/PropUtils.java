package com;

import com.google.gson.Gson;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropUtils {
    private static Map<String,Object> map = new HashMap<String,Object>();
    private static Properties props = null;
    private static Gson gson = new Gson();

    static {
        props = new Properties();
        InputStream is = null;
        try {
            is = PropUtils.class.getClassLoader().getResourceAsStream("test.properties");
            props.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private static Map<String,Object> getMap(String...keys) {
        if (keys != null && keys.length != 0){
            for (String key : keys) {
                if (key != null && key.length() != 0){
                    map.put(key,props.getProperty(key));
                }
            }
        }
        return map;
    }

    @Test
    public void getKey() {
        Map<String, Object> map01 = getMap("name","user","pwd","addr");
        System.out.println(gson.toJson(map01));
    }

    @Test
    public void getAllKeys() throws IOException {
        InputStream is = PropUtils.class.getClassLoader().getResourceAsStream("test.properties");
        InputStreamReader readers = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(readers);

        String str = null;
        while((str = (br.readLine()))!= null) {
            if (!str.startsWith("#") && !str.trim().equals("")){
                String[] strs = str.split("=");
                map.put(strs[0],strs[1]);
            }
        }
        is.close();
        readers.close();
        br.close();

        System.out.println("gson.toJson(map) = " + gson.toJson(map));
    }
}
