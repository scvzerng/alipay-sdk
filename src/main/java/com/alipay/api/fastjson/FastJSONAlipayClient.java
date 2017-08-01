/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.alipay.api.fastjson;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayRequest;
import com.alipay.api.AlipayResponse;

import java.util.Map;

/**
 * 
 * @author runzhi
 */
public interface FastJSONAlipayClient {

    /**
     * 
     * 
     * @param <T>
     * @param request
     * @return
     * @throws AlipayApiException
     */
    public <T extends AlipayResponse> T execute(AlipayRequest<T> request, SerializerFeature... features) throws AlipayApiException;

}
