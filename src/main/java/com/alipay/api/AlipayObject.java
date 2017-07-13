package com.alipay.api;

import com.yazuo.xiaoya.common.Identity;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Base Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public abstract class AlipayObject implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 身份标识
     */
    @NotNull(groups = {AppAuth.class})
    private Identity identity;

    public Identity getIdentity() {
        return identity;
    }

    public void setIdentity(Identity identity) {
        this.identity = identity;
    }
}
