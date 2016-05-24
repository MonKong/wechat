package cn.template.service.wechat.event.impl.event;

import org.springframework.stereotype.Service;

import cn.template.pojo.wechat.xml.WeChatXML;
import cn.template.pojo.wechat.xml.msg.TextMsgRespXML;
import cn.template.service.wechat.event.WeChatService;

/**
 * Created with IntelliJ IDEA.
 * User: zhu
 * Date: 15-4-28
 * Time: 下午4:26
 * To change this template use File | Settings | File Templates.
 */

//无作用，只是做中转用，具体的是该类的子类进行处理
@Service
public class BaseEventServiceImpl extends
        WeChatService<WeChatXML, TextMsgRespXML> {


    @Override
    public WeChatXML service(WeChatXML req, TextMsgRespXML resp)
            throws Exception {
        return resp;
    }
}
