package com.coy.pay.route.sdk.swiftpass.dto;

import com.coy.pay.route.sdk.swiftpass.SwiftpassPayApiResult;

/**
 * 【微信】【扫码支付：统一下单API】出参
 *
 * @author chenck
 * @date 2018/8/21 19:26
 */
public class SwiftpassWeixinNativeResult extends SwiftpassPayApiResult {

    private String appid;// 公众账号ID 服务商公众号APPID
    private String code_url;// 二维码链接 商户可用此参数自定义去生成二维码后展示出来进行扫码支付
    private String code_img_url;// 二维码图片 	此参数的值即是根据code_url生成的可以扫码支付的二维码图片地址
    private String uuid;//

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getCode_url() {
        return code_url;
    }

    public void setCode_url(String code_url) {
        this.code_url = code_url;
    }

    public String getCode_img_url() {
        return code_img_url;
    }

    public void setCode_img_url(String code_img_url) {
        this.code_img_url = code_img_url;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
