package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PublicBindAccount;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-07 20:29:04
 */
public class AlipayMobileStdPublicAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5199293693317185435L;

	/** 
	 * 绑定账户列表
	 */
	@ApiListField("public_bind_accounts")
	@ApiField("public_bind_account")
	private List<PublicBindAccount> publicBindAccounts;

	public void setPublicBindAccounts(List<PublicBindAccount> publicBindAccounts) {
		this.publicBindAccounts = publicBindAccounts;
	}
	public List<PublicBindAccount> getPublicBindAccounts( ) {
		return this.publicBindAccounts;
	}

}
