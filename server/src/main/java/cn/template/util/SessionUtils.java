package cn.template.util;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


/**
 * 常用Session属性操作
 */
public class SessionUtils {
	public static final String WECHAT_MEMBER_LOGIN_ATTR = "wechat_login";
	public static final String WEB_MEMBER_LOGIN_ATTR = "web_login";
	public static final String ADMIN_MEMBER_LOGIN_ATTR = "admin_login";
	public static final String WECHAT_OPENID_ATTR = "wechat_openid";
	public static final String SMS_CODE = "sms_code";
	public static final String PERMISSION_SESSION_ATTR = "permissionList";


	public static void removeSMSCode() {
		removeSessionAttr(SMS_CODE);
	}

	public static List<String> getAdminPermissionIdList() {
		return (List<String>) getSessionAttr(PERMISSION_SESSION_ATTR);
	}
	
	private static void removeSessionAttr(String name) {
		getReq().getSession().removeAttribute(name);
	}

	private static Object getSessionAttr(String name) {
		return getReq().getSession().getAttribute(name);
	}

	private static void setReqAttr(String name, Object obj) {
		getReq().setAttribute(name, obj);
		return;
	}

	private static Object getReqAttr(String name) {
		return getReq().getAttribute(name);
	}

	private static void setSessionAttr(String name, Object obj) {
		getReq().getSession().setAttribute(name, obj);
		return;
	}

	public static HttpServletRequest getReq() {
		return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
	}
}
