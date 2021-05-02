/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author kantanat
 */
@Path("summary")
public class CovSumAPI {

    @EJB
    NewSessionBean respones;
    @Context
    private UriInfo context;
    public CovSumAPI() {
    }
@GET
    @Produces("application/json")
    public String getJson() throws MalformedURLException, IOException {
    StringWriter writer = new StringWriter();
     String url = "https://covid19.th-stat.com/api/open/cases/sum?key=IM4FQlfG0O1th7jj1en3cbm9VHlyT9ye";
     URL obj = new URL(url);
     HttpURLConnection con = (HttpURLConnection) obj.openConnection();
     con.setRequestMethod("GET");
     con.setRequestProperty("User-Agent", "Mozilla/5.0");
     int responseCode = con.getResponseCode();
     StringBuffer response;
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
        NewSessionBean res = new  NewSessionBean();
           res.setResponse(response.toString());      
          return response.toString();
        }
    }

    /**
     * PUT method for updating or creating an instance of covidSummary
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}