package cn.template.service.wechat.sender;

import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import cn.template.pojo.wechat.json.WeChatJSON;
import cn.template.pojo.wechat.json.msg.ReturnJSON;
import cn.template.util.DataConverUtils;
import cn.template.util.HttpUtils;
import cn.template.util.SysResources;
import cn.template.util.UrlGenerator;

/**
 * @author MonKong
 * @Description 用于提交微信POST请求
 * @date 2014年12月12日
 */
@Component
public class WeChatMsgSender {
    private  final Logger logger = LogManager.getLogger(this.getClass());

    public ReturnJSON sendGet(String url, Map<String, String> params)
            throws Exception {
        String respJson = HttpUtils.doGet(url, params,true);
        return DataConverUtils.JsonToObject(respJson, ReturnJSON.class);
    }

    public ReturnJSON sendPost(WeChatJSON postData) throws Exception {
        if (postData == null) {
            throw new Exception("调用微信接口的post内容为空！");
        }
        // 转换为JSON数据
        String requestBody = DataConverUtils.ObjectToJson(postData);
        // 发送请求
        String respJson = HttpUtils.doPost(UrlGenerator.createSendMessageUrl(SysResources.globalAccessToken), requestBody);
        // 返回响应数据
        return DataConverUtils.JsonToObject(respJson, ReturnJSON.class);
    }

}
