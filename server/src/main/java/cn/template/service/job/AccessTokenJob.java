package cn.template.service.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import cn.template.pojo.wechat.json.msg.AccessTokenRespJSON;
import cn.template.util.DataConverUtils;
import cn.template.util.HttpUtils;
import cn.template.util.SysResources;
import cn.template.util.UrlGenerator;

/**
 * 定时更新accesstoken
 *
 * @author MonKong
 * @date 2014年12月16日
 */
public class AccessTokenJob extends QuartzJobBean {

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		System.err.println("开始获取微信AccessToken......");
		if (true) {

		}
		// 发起请求
		String respJson = null;
		try {
			respJson = HttpUtils.doGet(UrlGenerator.createAccessTokenUrl(), null, true);
			System.err.println(respJson);
		} catch (Exception e) {
			errorHandler("调用Http请求失败！", e, context);
		}
		// 解析返回数据
		AccessTokenRespJSON obj = DataConverUtils.JsonToObject(respJson, AccessTokenRespJSON.class);
		// 判断异常
		String accessToken = obj.getAccessToken();
		if (accessToken != null && !"".equals(obj.getAccessToken())) {
			// 更新全局accessToken
			SysResources.globalAccessToken = accessToken;
			System.err.println("微信AccessToken获取成功.accessToken为：" + accessToken);
		} else {
			errorHandler("返回信息异常：" + respJson + "|封装对象：" + obj, null, context);
		}
	}

	private void errorHandler(String msg, Exception e, JobExecutionContext context)
			throws JobExecutionException {
		int count = context.getRefireCount();
		if (count < 3) {
			System.err.println("微信AccessToken获取【失败】!正在尝试第 " + (count + 1) + " 次重试... 错误信息："
					+ msg);
			// e.printStackTrace();不能有这行代码
			throw new JobExecutionException(msg, true);

		} else {
			System.err.println("微信AccessToken获取【多次失败】!!!!！" + msg);
			e.printStackTrace();
			throw new JobExecutionException(e.getMessage(), false);
		}
	}
}
