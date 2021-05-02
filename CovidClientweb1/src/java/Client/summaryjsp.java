/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Client;

import org.json.JSONException;
import org.json.JSONObject;
import API.SummaryCovidAPI;

/**
 *
 * @author kantanat
 */
public class summaryjsp {
    String myProvince,Bangkok,Phuket,Nonthaburi,Yala,SamutPrakan,Songkhla,Pattani,Chonburi,ChiangMai,PathumThani,Narathiwat,NakhonPathom,Chumphon
              ,Krabi,NakhonRatchasima,SuratThani,Satun,PrachuapKhiriKhan,Chachoengsao,UbonRatchathani,Phatthalung,SamutSakhon,Buriram,NakhonSiThammarat
              ,NakhonSawan,SaKaeo,Surin,Kanchanaburi,UdonThani,Sisaket,ChiangRai,Prachinburi,Ratchaburi,SuphanBuri,Trang,Phitsanulok,KhonKaen,Rayong,
               MaeHongSon,Loei,PhraNakhonSiAyutthaya,Lampang;
    
      String myNation,Thailand,Burmese,China,India,Indonesia,Philippines,Pakistan,Bangladesh ,Japan,Malaysia,Skorea,Singapore,Cambodia ,Vietnam ,Laos  ;
      String myGender,Male,Female;
      String ProvinceText,NationText,GenderText;
      public void Json () throws JSONException{
       SummaryCovidAPI api = new SummaryCovidAPI();
            String json = null;
            json = api.getJson(json);  
        JSONObject obj = new JSONObject(json.toString()); 
     String [] prov = new String[50];
   myProvince = obj.getString("Province");
     Bangkok = obj.getJSONObject("Province").getString("Bangkok"); 
     Phuket = obj.getJSONObject("Province").getString("Phuket");
     Nonthaburi = obj.getJSONObject("Province").getString("Nonthaburi");
     Yala = obj.getJSONObject("Province").getString("Yala");
     SamutPrakan = obj.getJSONObject("Province").getString("Samut Prakan");
     Songkhla = obj.getJSONObject("Province").getString("Songkhla");
     Pattani = obj.getJSONObject("Province").getString("Pattani");
     Chonburi = obj.getJSONObject("Province").getString("Chonburi");
     ChiangMai = obj.getJSONObject("Province").getString("Chiang Mai");
     PathumThani = obj.getJSONObject("Province").getString("Pathum Thani");
     Narathiwat = obj.getJSONObject("Province").getString("Narathiwat");
     NakhonPathom = obj.getJSONObject("Province").getString("Nakhon Pathom");
     Chumphon = obj.getJSONObject("Province").getString("Chumphon");
     NakhonRatchasima = obj.getJSONObject("Province").getString("Nakhon Ratchasima");
     SuratThani = obj.getJSONObject("Province").getString("Surat Thani");
     Satun = obj.getJSONObject("Province").getString("Satun");
     PrachuapKhiriKhan = obj.getJSONObject("Province").getString("Prachuap Khiri Khan");
     Chachoengsao = obj.getJSONObject("Province").getString("Chachoengsao");
     UbonRatchathani = obj.getJSONObject("Province").getString("Ubon Ratchathani");
     Phatthalung = obj.getJSONObject("Province").getString("Phatthalung");
     SamutSakhon = obj.getJSONObject("Province").getString("Samut Sakhon");
     Buriram = obj.getJSONObject("Province").getString("Buriram");
     NakhonSiThammarat = obj.getJSONObject("Province").getString("Nakhon Si Thammarat");
     SaKaeo = obj.getJSONObject("Province").getString("Sa Kaeo");
     Surin = obj.getJSONObject("Province").getString("Surin");
     Kanchanaburi = obj.getJSONObject("Province").getString("Kanchanaburi");
     UdonThani = obj.getJSONObject("Province").getString("Udon Thani");
     ChiangRai = obj.getJSONObject("Province").getString("Chiang Rai");
     Prachinburi = obj.getJSONObject("Province").getString("Prachinburi");
     Ratchaburi = obj.getJSONObject("Province").getString("Ratchaburi");
     Trang = obj.getJSONObject("Province").getString("Trang");
     SuphanBuri = obj.getJSONObject("Province").getString("Suphan Buri");
     Phitsanulok = obj.getJSONObject("Province").getString("Phitsanulok");
     KhonKaen = obj.getJSONObject("Province").getString("Khon Kaen");
     Rayong = obj.getJSONObject("Province").getString("Rayong");
     MaeHongSon = obj.getJSONObject("Province").getString("Mae Hong Son");
     Loei = obj.getJSONObject("Province").getString("Loei");
     PhraNakhonSiAyutthaya = obj.getJSONObject("Province").getString("Phra Nakhon Si Ayutthaya");
     Lampang = obj.getJSONObject("Province").getString("Lampang");
     
     
     
     //String myNation,Thailand,Burmese,China,India,Indonesia,Philippines,Pakistan,Bangladesh ,Japan,Malaysia,Skorea,Singapore,Cambodia ,Vietnam ,Laos  ;
     myNation = obj.getString("Nation");
     Thailand = obj.getJSONObject("Nation").getString("Thailand");
     Burmese = obj.getJSONObject("Nation").getString("Burmese");
     China = obj.getJSONObject("Nation").getString("China");
     India = obj.getJSONObject("Nation").getString("India");
     Indonesia = obj.getJSONObject("Nation").getString("Indonesia");
     Philippines = obj.getJSONObject("Nation").getString("Philippines");
     Pakistan = obj.getJSONObject("Nation").getString("Pakistan");
     Bangladesh = obj.getJSONObject("Nation").getString("Bangladesh");
     Japan = obj.getJSONObject("Nation").getString("Japan");
     Malaysia = obj.getJSONObject("Nation").getString("Malaysia");
     Skorea = obj.getJSONObject("Nation").getString("Korea,South");
     Singapore = obj.getJSONObject("Nation").getString("Singapore");
     Cambodia = obj.getJSONObject("Nation").getString("Cambodia");
     Vietnam = obj.getJSONObject("Nation").getString("Vietnam");
     Laos = obj.getJSONObject("Nation").getString("Laos");
     
     
     
     myGender = obj.getString("Gender");
     Male= obj.getJSONObject("Gender").getString("Male");
     Female = obj.getJSONObject("Gender").getString("Female");
     
  
     
     ProvinceText= " Krungthep(Bangkok) : "+Bangkok+"\n"+"Chaingmai: "+ChiangMai+"\n"+"Chonburi  : "+Chonburi+"\n" ;     
     NationText =   "Thailand: "+Thailand+"\n"+
                    "Myanmar: "+ Burmese+"\n"+
                    "China: "+ China+"\n"+
                    "India: "+India+"\n"+
                    "Indonesia: "+ Indonesia+"\n"+
                    "Philippines: "+ Philippines+"\n"+
                    "Pakistan: "+Pakistan+"\n"+
                    "Bangladesh: "+Bangladesh+"\n"+
                    "Japan: "+ Japan+"\n"+
                    "Malaysia: " +Malaysia+"\n"+
                    "Southkorea: "+ Skorea+"\n"+
                    "Singapore: "+ Singapore+"\n"+
                    "Cambodia: "+ Cambodia+"\n"+
                    "Vietnam: "+ Vietnam+"\n"+
                    "Laos: "+ Laos +"\n";
    
     GenderText =  "Male  : "+Male+"\n"+",Female  : "+Female;
         
    }
      public String getProvinceText()
    {  
        return ProvinceText;
    }

    public void setProvinceText(String ProvinceText)
    {
    this.ProvinceText = ProvinceText;
    }
    
      public String getNationText()
    {  
        return  NationText;
    }

    public void setNationText(String  NationText)
    {
    this.NationText =  NationText;
    }
    
      public String getGenderText()
    {  
        return GenderText;
    }

    public void setGenderText(String GenderText)
    {
    this.GenderText = GenderText;
    }
}
