package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.label.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-30 16:12:57
 */
public class AlipayOpenPublicLifeLabelCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5448314227512453679L;

	/** 
	 * 标签id
	 */
	@ApiField("label_id")
	private Long labelId;

	public void setLabelId(Long labelId) {
		this.labelId = labelId;
	}
	public Long getLabelId( ) {
		return this.labelId;
	}

}
