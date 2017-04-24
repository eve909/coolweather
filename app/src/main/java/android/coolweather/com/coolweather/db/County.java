package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by eve on 17-4-24.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private int weatherId;
    private int cityID;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCountyName(){
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }
}
