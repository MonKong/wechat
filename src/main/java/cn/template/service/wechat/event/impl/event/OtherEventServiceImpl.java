package cn.template.service.wechat.event.impl.event;

import org.springframework.stereotype.Service;

import cn.template.pojo.wechat.xml.WeChatXML;
import cn.template.pojo.wechat.xml.event.ClickEventReqXML;
import cn.template.pojo.wechat.xml.msg.TextMsgRespXML;
import cn.template.service.wechat.event.WeChatService;

/**
 * Created with IntelliJ IDEA.
 * User: zhu
 * Date: 15-5-8
 * Time: 下午2:28
 * To change this template use File | Settings | File Templates.
 */
@Service
public class OtherEventServiceImpl extends
        WeChatService<ClickEventReqXML, TextMsgRespXML> {

    @Override
    public WeChatXML service(ClickEventReqXML req, TextMsgRespXML resp)
            throws Exception {
        System.out.println("req.getEvent():" + req.getEvent());
        if ("subscribe".equals(req.getEvent().toString())) { //关注
           /* System.out.println("OtherSystemUtil.wechat_subscribe_msg:" + OtherSystemUtil.wechat_subscribe_msg);
            resp.setContent(OtherSystemUtil.wechat_subscribe_msg);*/
        }
        return resp;
    }
}
