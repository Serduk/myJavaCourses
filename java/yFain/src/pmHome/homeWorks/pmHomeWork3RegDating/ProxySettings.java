package pmHome.homeWorks.pmHomeWork3RegDating;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Serduk on 20.11.2015.
 */
public class ProxySettings {
    Map<String, String> location = new HashMap<>();


    public void ProxySettings () {
        location.put("GBR", "213.171.197.181");
        location.put("USA", "69.147.251.50");
        location.put("AUS", "223.252.33.75");
        location.put("NZL", "49.50.242.137");
        location.put("IRL", "176.34.184.134");
        location.put("CAN", "199.167.19.29");
        location.put("FRA", "91.121.80.205");
        location.put("ESP", "91.142.213.109");
        location.put("NOR", "81.27.33.8");
        location.put("DNK", "94.231.110.81");
        location.put("ITA", "195.88.7.112");
        location.put("SWE", "91.189.44.162");
        location.put("SWI", "92.42.186.167");
        location.put("GER", "80.237.249.248");
        location.put("DEU", "80.237.249.248");
        location.put("AUST", "149.154.153.92");
        location.put("BRA", "186.226.60.92");
        location.put("CZE", "81.2.197.93");
        location.put("BEL", "81.95.121.251");
        location.put("FIN", "212.94.78.134");
        location.put("SPA", "91.142.213.109");
    }

    public String getLocation(String ip) {
        return location.get(ip);
    }
}
