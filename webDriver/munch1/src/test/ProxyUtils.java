package test;

public class ProxyUtils {



	static String[] proxyArr = {"80.237.22.46", 		"199.200.120.37"};
	static int[] portArr = 	   {8080, 					3127};





	public static Proxy getrandomProxy(){
		int numArr = proxyArr.length;
		int randProxy = (int)(Math.random()*numArr);
		
		// create object from Proxy class
		Proxy proxy = new Proxy();
		
		// fill fields
		proxy.port = portArr[randProxy];
		proxy.proxy = 	proxyArr[randProxy];
		
		return proxy;
	}




	public static class Proxy {
		String proxy;
		int port;
	}




}
