package cn.template.util;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

@Component
public class SysResources {
	public static Properties p = new Properties();
	static {
		ClassPathResource path = new ClassPathResource("/system.properties");
		try {
			p.load(path.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static final String CHARSET = "UTF-8";
	public static String wechatUrl = p.getProperty("wechat.sendMessage.url");
	public static String globalAccessToken;
	public static String imagePath;
	public static String imageController;
	public static String ckUploadController;
	public static String appId;
	public static String appSecret;
	public static String youkuClientid;
	public static String domainAndCtxPath;
	public static String globalJSSDKTicket;
	public static String smsUrl = p.getProperty("sms.url");
	public static String smsAppKey = p.getProperty("sms.appKey");
	public static String smsAppSecret = p.getProperty("sms.appSecret");
	public static String emailRegionId = p.getProperty("email.regionId");
	public static String emailAccessKeyId = p.getProperty("email.accessKeyId");
	public static String emailSecret = p.getProperty("email.secret");
	public static String emailAccountName = p.getProperty("email.accountName");
}
