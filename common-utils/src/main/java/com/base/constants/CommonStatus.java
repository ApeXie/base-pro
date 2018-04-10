package com.base.constants;

/**
 * <br>状态类</br>
 *
 * @version 1.0
 * @author: XieNengYan
 * @email 373309446@qq.com
 * @date: 2018/4/10 11:03
 */
public enum CommonStatus {
    VALID(1, "有效"),
    INVALID(0, "无效");

    private Integer code;

    private String desc;

    private CommonStatus(Integer code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
