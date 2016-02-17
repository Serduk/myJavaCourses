package core.locations;

/**
 * Created by sergey on 1/18/16.
 */
public enum LocationData {

    GBR ("London", "213.171.197.181"),
    ENG ("London", "213.171.197.181"),
    USA ("New York", "69.147.251.50"),
    AUS ("Sydney", "223.252.33.75"),
    NZL ("New Roads", "49.50.242.137"),
    IRL ("Dublin", "176.34.184.134"),
    CAN ("Ottawa", "199.167.19.29"),
    FRA ("Paris", "91.121.80.205"),
    SPA ("Madrid", "91.142.213.109"),
    ESP ("Madrid", "91.142.213.109"),
    NOR ("Oslo",  "81.27.33.8"),
    DNK ("Aarhus", "94.231.110.81"),
    ITA ("Verona", "195.88.7.112"),
    SWE ("Stockholm", "91.189.44.162"),
    SWI ("Zurich", "92.42.186.167"),
    GER ("Berlin", "80.237.249.248"),
    DEU ("Berlin", "80.237.249.248"),
    AUT ("Graz", "149.154.153.92"),
    FIN ("Helsinki", "212.94.78.134"),
    CZE ("Praha", "81.2.216.55"),
    BEL ("Brussel", "81.95.121.251"),
    JPN ("Tokyo", "110.50.241.70"),
    BRA ("Brasilia", "81.95.121.251");

    /**
     * Constructor
     */

    private final String city;
    private final String ip;

    LocationData(String city, String ip) {
        this.city = city;
        this.ip = ip;
    }


    /**method getIp
     * return ip value according to location
     */

    public String getIp() {
        return this.ip;
    }

    public String getCity() {
        return this.city;
    }
}
