<%-- 
    Document   : covidRecent
    Created on : May 1, 2021, 8:59:55 AM
    Author     : kantanat
--%>

<%@page import="Client.todayclientjsp"%>
<%@page import="org.json.JSONException"%>
<%@page import="resp.Responsetoday"%>
<%@page import="org.json.JSONObject"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recent cases</title> 
        <style>
            td{
                padding: 10px;
            }
            div{
                width: 30%;
                border: 1px solid black ;
                border-radius: 5px;
               //background-color: cyan;
            }
            
        </style>
        
        
    </head>

    <body>
         <center> <h1>Daily Recent cases</h1></center> 
             <center>  
                 <div style="background-color: lightcoral"   >
                     <table>
                         <tr>
                             <td>
                         <center><h3> Confirmed </h3></center> 
                         <center>
                       <% 
                           todayclientjsp res = new todayclientjsp();   
                            res.Json();
                             out.println(res.getConfirmed());
                       %>
                         </center>
                       </td>
                     </tr>
                  </table>
             </div>
          </center>
        
         <center>
         <div style="background-color: darkgreen"  > 
                     <table>
                         <tr>
                             <td>
                         <center><h3> Recovered </h3></center>
                         <center>
                       <%   
                             res.Json();
                             out.println(res.getRecovered());
                       %>
                         </center>
                       </td>
                     </tr>
                  </table>
          </div>
        </center>  
         <center>
         <div  style="background-color: lightgreen"  >
                     <table>
                         <tr>
                             <td>
                         <center><h3> Hospitalized </h3></center>
                         <center>
                       <%   
                             res.Json();
                             out.println(res.getHospitalized());
                       %>
                         </center>
                       </td>
                     </tr>
                  </table>
          </div>
        </center>                  
                         
       <center>
           <div style="background-color: #fd4747"  >
                     <table>
                         <tr>
                             <td>
                         <center><h3> Deaths </h3></center>
                         <center>
                       <%   
                             res.Json();
                             out.println(res.getDeaths());
                       %>
                         </center>
                       </td>
                     </tr>
                  </table>
          </div>
        </center>           
                    <center>
                     <%   
                             res.Json();
                             out.println(" UpdateDate  : " + res.getUpdateDate());
                       %>              
            </center>                                  
    </body>
</html>