<%-- 
    Document   : coviddataarea
    Created on : May 2, 2020, 12:14:36 AM
    Author     : da
--%>

<%@page import="client.dataareaclientjsp"%>
<%@page import="org.json.JSONException"%>
<%@page import="org.json.JSONObject"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>แจ้งเตือนพื้นที่ตามคำประกาศ</title>
    <style>
            td{
                padding: 10px;
            }
            div{
                width: 100%;
                border: 1px solid black ;
                border-radius: 5px;
                background-color: lightcyan;
            }
            
        </style>
    </head>
 
    <body>
         <center> <h1>แจ้งเตือนพื้นที่ตามคำประกาศ</h1>
             <center>  
                 <div>
                     <table>
                         <tr>
                             <td>
                         <center>
        <%  /*String data = request.getParameter("data");*/
             dataareaclientjsp res = new dataareaclientjsp();   
            out.println(res.Json());
              %>
                    </center>
                       </td>
                     </tr>
                  </table>
             </div>
          </center>               
           </center>
    </body>
</html>