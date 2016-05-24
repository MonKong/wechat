package cn.template.util.encryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 计算字符串的MD5的值
 * 
 * @author wuwenyi
 * 
 */
public class MD5
{
    /**
     * Computes the MD5 fingerprint of a string.
     * 
     * @return the MD5 digest of the input <code>String</code>
     * @throws NoSuchAlgorithmException
     */
    public static String compute(String inStr) 
    {
        char[] charArray = inStr.toCharArray();

        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];

        MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
        byte[] md5Bytes = md5.digest(byteArray);

        StringBuffer hexValue = new StringBuffer();

        for (int i = 0; i < md5Bytes.length; i++)
        {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16)
                hexValue.append("0");
            hexValue.append(Integer.toHexString(val));
        }

        return hexValue.toString();
    }
    
    public static void main(String[] args) throws NoSuchAlgorithmException
    {
    	System.out.println(MD5.compute("1"));
//    	b06ab6c4e5f5c06578c857f8fc4e9af8
    }

}
