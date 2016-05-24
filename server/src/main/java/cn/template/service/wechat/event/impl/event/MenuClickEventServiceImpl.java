package cn.template.service.wechat.event.impl.event;

import org.springframework.stereotype.Service;

import cn.template.pojo.wechat.xml.WeChatXML;
import cn.template.pojo.wechat.xml.event.ClickEventReqXML;
import cn.template.pojo.wechat.xml.msg.TextMsgRespXML;
import cn.template.service.wechat.event.WeChatService;

/**
 * Created with IntelliJ IDEA. User: zhu Date: 15-4-27 Time: 下午5:20 To change
 * this template use File | Settings | File Templates.
 */
@Service
public class MenuClickEventServiceImpl extends
		WeChatService<ClickEventReqXML, TextMsgRespXML> {

	@Override
	public WeChatXML service(ClickEventReqXML req, TextMsgRespXML resp)
			throws Exception {
		/*String eventKey = req.getEventKey();
		System.out.println("req.getEventKey():" + eventKey);
		if (eventKey.equals("historyResearch")) { // 历史调查
			resp.setContent(investHis(req));
		} else if (eventKey.equals("acceptJoinin")) { // 立即参与调查
			resp.setContent(investCanJoin(req));
		} */
		/*
		 * else if (req.getEventKey().equals("applyForVIP")) { //申请
		 * resp.setContent(applyForVIP(req)); }else if
		 * (req.getEventKey().equals("duiyaVote")) { //对呀投票
		 * resp.setContent(duiyaVote(req)); } else if
		 * (req.getEventKey().equals("prizeExchange")) { //礼品兑换
		 * resp.setContent(prizeExchange(req)); }
		 */
		return resp;
	}


	

}
