/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restapi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kantanat
 */@XmlRootElement
public class responseRecent {
    
    private String response;
    @XmlElement
    public String getResponse()
    {
        return response;
    }
    public void setResponse(String response)
    {
    this.response = response;
    }

}
