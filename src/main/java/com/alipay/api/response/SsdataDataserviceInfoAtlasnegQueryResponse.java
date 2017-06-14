package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GraphNegInfoModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.info.atlasneg.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-10-21 14:31:01
 */
public class SsdataDataserviceInfoAtlasnegQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1542696231534184876L;

	/** 
	 * 标志位说明
	 */
	@ApiField("flag")
	private String flag;

	/** 
	 * 负面信息模型列表
	 */
	@ApiListField("infos")
	@ApiField("graph_neg_info_model")
	private List<GraphNegInfoModel> infos;

	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getFlag( ) {
		return this.flag;
	}

	public void setInfos(List<GraphNegInfoModel> infos) {
		this.infos = infos;
	}
	public List<GraphNegInfoModel> getInfos( ) {
		return this.infos;
	}

}
