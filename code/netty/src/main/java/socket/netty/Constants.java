/**
 * Project Name:netty
 * File Name:Constants.java
 * Package Name:socket.netty
 * Date:2015年5月11日上午10:01:11
 * Copyright (c) 2015, sid Jenkins All Rights Reserved.
 * 
 *
*/

package socket.netty;

import utils.utils.PropertiesUtil;

/**
 * ClassName:Constants
 * Function: TODO ADD FUNCTION. 
 * Reason:	 TODO ADD REASON. 
 * Date:     2015年5月11日 上午10:01:11 
 * @author   sid
 * @see 	 
 */
public class Constants {

	/**
	 * 配置文件地址
	 */
	private static final String SERVER_CONFIG="server.properties";
	private static final String CLIENT_CONFIG="client.properties";
	private static final String charset="utf-8";
	public static final String SERVER_MAC =PropertiesUtil.getProperties(SERVER_CONFIG, charset).getProperty("msg.mac");
	public static final String CLIENT_MAC =PropertiesUtil.getProperties(CLIENT_CONFIG, charset).getProperty("msg.mac");
	public static final String HEARTBEATDELAY = PropertiesUtil.getProperties().getProperty("tcp.temheartbeatdelay");
	
}

