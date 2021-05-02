<%-- 
    Document   : covidtimeline
    Created on : May 1, 2020, 10:14:09 PM
    Author     : da
--%>

<%@page import="rest.CovidtimelineRest"%>
<%@page import="org.json.JSONArray"%>
<%@page import="client.timelineclientjsp"%>
<%@page import="org.json.JSONException"%>
<%@page import="response.Responsetoday"%>
<%@page import="org.json.JSONObject"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ข้อมูลสรุปตามช่วงเวลา</title>
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  rel="stylesheet">
     <style>
            td{
                padding: 10px;
            }
            div{
                width: 80%;
                border: 1px solid black ;
                border-radius: 5px;
                background-color: lightskyblue;
            }
            
        </style>
    
    </head>
    <body>
         <center> <h1>ข้อมูลสรุปตามช่วงเวลา (เริ่มตั้งแต่วันที่ 29/04/20-ล่าสุด) </h1>
             <center>  
                 <div>
                     <table>
                         <tr>
                             <td>
                         <center>
        <%  /*String data = request.getParameter("data");*/
            timelineclientjsp res = new timelineclientjsp();   
            res.Json();
            out.println(res.getday1());
           
              %>
                                 </center>
                              </td>   
                             </tr>
                          </table>
                   </div>
             </center>
           <center>
               <div>
                     <table>
                         <tr>
                             <td>
                         <center>
          <%  out.println(res.getday2());
            
              %>
                         </center>
                             </td>
                             </tr>
                           </table>
                   </div>            
           </center> 
   <center>
       <div>
                     <table>
                         <tr>
                             <td>
                              <center>
    <%     out.println(res.getday3());
          
              %>
                                </center>
                             </td>  
                             </tr>
                          </table>
                   </div>
     </center>
   <center>
       <div>
                     <table>
                         <tr>
                             <td>
                              <center>
   <%     
            out.println(res.getday4());

              %>
                                 </center>
                             </td>  
                             </tr>
                          </table>
                   </div>                           
        </center>
  <center>
      <div>
                     <table>
                         <tr>
                             <td>
                              <center>
   <%     
            
            out.println(res.getday5());
              
            //out.println(res.getData());
              %>
                          </center>
                             </td>  
                             </tr>
                          </table>
                   </div>
     </center>
   </body>
</html>