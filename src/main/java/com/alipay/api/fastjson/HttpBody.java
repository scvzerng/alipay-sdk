package com.alipay.api.fastjson;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by scvzerng on 2017/8/1.
 */
public interface HttpBody {
     HttpBody addParam(String key,String value);
     String getParamText() throws IOException;
     List<NameValuePair> getNameValuePairs();
     UrlEncodedFormEntity getEncoded() throws UnsupportedEncodingException;
     String getCharset();
}
