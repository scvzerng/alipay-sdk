package com.alipay.api.response;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alipay.api.domain.KoubeiMarketingDataIndicatorQueryModel;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

import java.util.List;

/**
 * ALIPAY API: koubei.marketing.data.indicator.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-11-25 10:44:10
 */
public class KoubeiMarketingDataIndicatorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2253139848599365154L;

	/** 
	 * JSON格式数组，每个对象表示一个门店某个具体日期的指标信息，KEY为指标代码，VALUE为该指标对应的值,各biz_type入参以及返回值的详细信息参见<a href="https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.XQ4g6J&treeId=193&articleId=105186&docType=1#s6">快速接入</a>
	 */
	@ApiField("indicator_infos")
	private String indicatorInfos;

	/** 
	 * 总条目数,供计算分页信息使用
	 */
	@ApiField("total_size")
	private String totalSize;

	public void setIndicatorInfos(String indicatorInfos) {
		this.indicatorInfos = indicatorInfos;
	}

	/**
	 * 使用方法 可直接用返回类型的对应数据接收 接受类型 为KoubeiMarketingDataIndicatorQueryModel下的
	 * 内部类
	 * 例如
	 * 	KoubeiMarketingDataIndicatorQueryModel.MemberQueryModel mqm = new KoubeiMarketingDataIndicatorQueryResponse().getIndicatorInfos()
	 * 返回值为对应class的list
	 * @param t
	 * @param <T>
	 * @return	List<T>
	 */
	public  <T> List<T> getIndicatorInfos() {
		return JSON.parseObject(this.indicatorInfos,new TypeReference<List<T>>(){});

	}

	public void setTotalSize(String totalSize) {
		this.totalSize = totalSize;
	}
	public String getTotalSize( ) {
		return this.totalSize;
	}

}
