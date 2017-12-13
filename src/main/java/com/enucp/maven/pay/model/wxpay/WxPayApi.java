package com.enucp.maven.pay.model.wxpay;

import com.enucp.maven.pay.model.wxpay.response.WxPayRefundResponse;
import com.enucp.maven.pay.model.wxpay.response.WxPaySyncResponse;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by weixuan
 * 2017-07-02 13:36
 */
public interface WxPayApi {

    /**
     * 统一下单
     * @param body 内容
     * @return Call<WxPaySyncResponse>
     */
    @POST("/pay/unifiedorder")
    Call<WxPaySyncResponse> unifiedorder(@Body RequestBody body);

    /**
     * 申请退款
     * @param body 内容
     * @return Call<WxPayRefundResponse>
     */
    @POST("/secapi/pay/refund")
    Call<WxPayRefundResponse> refund(@Body RequestBody body);
}
