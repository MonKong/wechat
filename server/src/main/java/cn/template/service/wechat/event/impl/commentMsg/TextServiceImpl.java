package cn.template.service.wechat.event.impl.commentMsg;

import org.springframework.stereotype.Service;

import cn.template.pojo.wechat.xml.WeChatXML;
import cn.template.pojo.wechat.xml.msg.TextMsgReqXML;
import cn.template.pojo.wechat.xml.msg.TextMsgRespXML;
import cn.template.service.wechat.event.WeChatService;

/**
 * @author MonKong
 * @Description 响应文字消息请求
 * @date 2014年12月10日
 */
@Service
public class TextServiceImpl extends
        WeChatService<TextMsgReqXML, TextMsgRespXML> {

    @Override
    public WeChatXML service(TextMsgReqXML req, TextMsgRespXML resp)
            throws Exception {
    	System.out.println("TextServiceImpl.service()");
        resp.setContent("呵呵~！B<a href='http://www.baidu.com'>点我</a>");
        return resp;
    }

}
