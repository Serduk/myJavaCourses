package test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import test.ProxyUtils.Proxy;

public class BrowserUtis {
	
	
	
	
	public static FirefoxDriver getFireFoxBrowserWithRandomProxy(){
		
		Proxy proxyObj = ProxyUtils.getrandomProxy();
		String proxy = proxyObj.proxy;
		int port = proxyObj.port;
	
		FirefoxDriver driver = getFireFoxBrowserWithProxy(proxy, port);
		
		return driver;
	}
	
	
	
	
	
	
	
	
	public static FirefoxDriver getFireFoxBrowserWithProxy(String proxy, int port){
		
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("network.proxy.share_proxy_settings", true);
		profile.setPreference("network.proxy.ftp", proxy);
		profile.setPreference("network.proxy.ftp_port", port);
		profile.setPreference("network.proxy.gopher", proxy);
		profile.setPreference("network.proxy.gopher_port", port);
		profile.setPreference("network.proxy.http", proxy);
		profile.setPreference("network.proxy.http_port", port);
		profile.setPreference("network.proxy.socks", proxy);
		profile.setPreference("network.proxy.socks_port", port);
		profile.setPreference("network.proxy.ssl", proxy);
		profile.setPreference("network.proxy.ssl_port", port);
		profile.setPreference("network.proxy.type", 1);
		
		FirefoxDriver driver = new FirefoxDriver(profile);
		
		return driver;
	}

	
	
	
	
	
	
}
