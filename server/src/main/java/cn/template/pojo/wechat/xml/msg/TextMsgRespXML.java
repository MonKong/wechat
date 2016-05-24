package cn.template.pojo.wechat.xml.msg;

import cn.template.pojo.wechat.MessageType;
import cn.template.pojo.wechat.xml.WeChatXML;

/**
 * @author MonKong
 * @Description 用一句话描述该类的作用
 * @date 2014年12月9日
 */
public class TextMsgRespXML extends WeChatXML {
    private static final MessageType msgType = MessageType.text;
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "TextMsgRespXML [msgType=" + msgType + ", content=" + content
                + "]";
    }

    public MessageType getMsgType() {
        return msgType;
    }


}
