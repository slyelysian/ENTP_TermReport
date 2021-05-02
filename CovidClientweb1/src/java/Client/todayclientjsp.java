/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Client;

import org.json.JSONException;
import org.json.JSONObject;
import API.RecentCovidAPI;


/**
 *
 * @author kantanat
 */
public class todayclientjsp {
     public String data;
    String Confirmed ,Recovered,Hospitalized,Deaths,UpdateDate;
        
    public void Json () throws JSONException{
       RecentCovidAPI ci = new RecentCovidAPI();
            String json = null;
            json = ci.getJson(json);
        JSONObject myResponse = new JSONObject(json.toString());
     Confirmed = myResponse.getString("Confirmed");
     Recovered = myResponse.getString("Recovered");
     Hospitalized = myResponse.getString("Hospitalized");
     Deaths = myResponse.getString("Deaths");
     UpdateDate = myResponse.getString("UpdateDate");
     data = "Confirmed  : " + Confirmed 
             + "\nRecovered : "+Recovered
             + "\nHospitalized  : "+ Hospitalized
             + "\nDeaths  : " + Deaths 
             + "\nUpdateDate  : " +UpdateDate;
    }
     public String getConfirmed()
    {  
        return Confirmed;
    }

    public void setConfirmed(String confirmed)
    {
    this.Confirmed = Confirmed;
    }
    
      public String getRecovered()
    {  
        return  Recovered;
    }

    public void setRecovered(String  recovered)
    {
    this. Recovered =  Recovered;
    }
    
     public String getHospitalized()
    {  
        return  Hospitalized;
    }

    public void setHospitalized(String  hospitalized)
    {
    this. Hospitalized =  Hospitalized;
    }
    
     public String getDeaths()
    {  
        return  Deaths;
    }

    public void setDeaths(String deaths)
    {
    this. Deaths =  Deaths;
    }
     public String getUpdateDate()
    {  
        return  UpdateDate;
    }

    public void setUpdateDate(String updateDate)
    {
    this. UpdateDate =  UpdateDate;
    }
}
