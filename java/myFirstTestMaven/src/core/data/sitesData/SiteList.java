package core.data.sitesData;

/**
 * Created by sergey on 1/20/16.
 */
public class SiteList {
    /** Domain tipe/environment for sites*/
    String webVersion = "https://www.";
    String mobVersion = "https://m.";
    String domainLive = ".com";
    String domainRelDating = "-rel.platformphoenix.com";
    String domainRelCam = ".wc-rel.hwtool.net";

    /** SiteList in array all dating */
    public String[] sitesArrayDating = {
                "naughtyavenue",
                "mylustywish",
                "mynaughtydreams",
                "shagtogether",
                "flinghub",
                "naughtyevents",
                "myfling",
                "hookupsexy",
                "naughtyluck",
                "nastywish",
                "getnaughty",
                "blistyggnu",
                "blivuartignu",
                "blislem",
                "soyezcoquin",
                "flirtnu",
                "flirtanu",
                "finnemeg",
                "rencardsexy",
                "amourfinder",
                "chatdatesex",
                "myflinghub"
    };

    /** SiteList in array all Cams */
    public String[] siteListCam = {
            "firecams"
    };


    /** getters for siteList/Domain/etc */
    public String getWebVersion(){
        return webVersion;
    }
    public String getMobVersion(){
        return mobVersion;
    }
    public String getDomainLive(){
        return domainLive;
    }
    public String getDomainRelDating(){
        return domainRelDating;
    }
    public String getDomainRelCam(){
        return domainRelCam;
    }
    public String getSitesArrayDating(int i){
        return sitesArrayDating[i];
    }
    public String getSiteListCam(int i){
        return siteListCam[i];
    }
//
//    List<String> sitesListDating = new ArrayList<String>();
//    sitesListDating.add()
}
