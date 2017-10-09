package com.alipay.api;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * Created by scvzerng on 2017/7/13.
 */
public class StringValueSerializing implements ObjectSerializer {
    @Override
    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {
        if(object==null) return;
        if(!(object instanceof JSONObject)){
            throw new IllegalArgumentException("无法为非JSONObject对象序列化fieldName:"+fieldName);
        }
        JSONObject json = (JSONObject) object;
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String,Object> entry :json.entrySet()){
            sb.append("\"").append(entry.getKey()).append("\"").append(":").append("\"").append(entry.getValue()).append("\"").append(",");
        }
        serializer.write("{"+sb.substring(0,sb.lastIndexOf(","))+"}");
    }
}
