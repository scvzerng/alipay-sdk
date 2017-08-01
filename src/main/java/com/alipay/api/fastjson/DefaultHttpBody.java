package com.alipay.api.fastjson;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by scvzerng on 2017/8/1.
 */
public class DefaultHttpBody implements HttpBody {
    private String charset = "UTF-8";
    public DefaultHttpBody(String charset) {
        this.charset = charset;
    }

    private List<NameValuePair> pairs = new ArrayList<NameValuePair>();
    @Override
    public HttpBody addParam(String key, String value) {
        if(value==null||"".equals(value)) return this;
        pairs.add(new BasicNameValuePair(key,value));
        return this;
    }

    @Override
    public String getParamText() throws IOException {

        return EntityUtils.toString(getEncoded());
    }

    @Override
    public List<NameValuePair> getNameValuePairs() {
        return pairs;
    }

    @Override
    public UrlEncodedFormEntity getEncoded() throws UnsupportedEncodingException {
        return new UrlEncodedFormEntity(this.pairs,this.charset);
    }

    @Override
    public String getCharset() {
        return charset;
    }
}
