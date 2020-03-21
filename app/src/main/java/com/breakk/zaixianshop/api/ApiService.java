package com.breakk.zaixianshop.api;

import com.breakk.zaixianshop.model.BaseModel;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {
    public String pathName = "zaixianshop";
    /**
     * 6.post请求;
     * <p>
     * FieldMap：多个参数时可以使用，类型@QueryMap
     * FormUrlEncoded：表示请求实体是一个Form表单，每个键值对需要使用@Field注解
     * http://qt.qq.com/php_cgi/news/php/varcache_getnews.php?id=12&page=0&plat=android&version=9724
     */
    @FormUrlEncoded
    @POST(pathName+"/public/plugin/member/api_index/getWechatInfo")
    Call<BaseModel> getWeChatInfoByPost(@Field("code") String code);

}
