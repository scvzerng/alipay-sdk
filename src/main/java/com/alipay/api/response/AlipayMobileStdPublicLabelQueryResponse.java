package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PublicLabel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.label.query response.
 * 
 * @author auto create
 * @since 1.0, 2015-11-30 18:53:27
 */
public class AlipayMobileStdPublicLabelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4669928533786298627L;

	/** 
	 * 所有标签
	 */
	@ApiListField("label_list")
	@ApiField("public_label")
	private List<PublicLabel> labelList;

	public void setLabelList(List<PublicLabel> labelList) {
		this.labelList = labelList;
	}
	public List<PublicLabel> getLabelList( ) {
		return this.labelList;
	}

}
