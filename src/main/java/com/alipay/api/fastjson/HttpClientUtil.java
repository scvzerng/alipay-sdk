package com.alipay.api.fastjson;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.*;
import com.alipay.api.AlipayConstants;
import com.alipay.api.AlipayRequest;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by scvzerng on 2017/8/1.
 */
public class HttpClientUtil {
   public static class Person{
       BigDecimal bigDecimal;

       public BigDecimal getBigDecimal() {
           return bigDecimal;
       }

       public void setBigDecimal(BigDecimal bigDecimal) {
           this.bigDecimal = bigDecimal;
       }
   }
    public static void main(String[] args) {


       Person person = new Person();
        person.setBigDecimal(new BigDecimal(4));
        System.out.println(JSON.toJSONString(person, new ValueFilter() {
            @Override
            public Object process(Object object, String name, Object value) {
                return value instanceof Number ?value.toString():value;
            }
        }));
//        HttpBody body = new DefaultHttpBody("GBK");
//        body.addParam("","");
//        System.out.println(post("https://openapi.alipay.com/gateway.do",body));
    }


    public static String post(String url, AlipayRequest request,String appId,String signType){
        HttpBody body = new DefaultHttpBody("GBK");
        body.addParam(AlipayConstants.METHOD,request.getApiMethodName())
                .addParam(AlipayConstants.VERSION,request.getApiVersion())
                .addParam(AlipayConstants.APP_ID,appId)
                .addParam(AlipayConstants.SIGN_TYPE,signType)
                .addParam(AlipayConstants.TERMINAL_TYPE,"");
        return post(url,body);
    }

    public static String post(String url, HttpBody body){
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);
        try {

            httpPost.setEntity(body.getEncoded());
            CloseableHttpResponse response =  httpClient.execute(httpPost);
            try{
            HttpEntity  httpEntity= response.getEntity();
           return EntityUtils.toString(httpEntity,body.getCharset());
            }finally {
                response.close();
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}
