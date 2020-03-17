package com.sjzc.enote.utils;

import java.util.HashMap;
import java.util.Map;

/*
* 统一响应处理API
* success
* fail
* */

public class ResHelper {

    public static Map success(String message, Object data) {
        Map<String, Object> hashMap = new HashMap();
        hashMap.put("code", "200");
        hashMap.put("message", message);
        hashMap.put("data", data);
        return hashMap;
    }



    public static Map fail(String message, Object data) {
        Map<String, Object> hashMap = new HashMap();
        hashMap.put("code", "500");
        hashMap.put("message", message);
        hashMap.put("data", data);
        return hashMap;
    }


}
