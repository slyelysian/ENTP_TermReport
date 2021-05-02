<%-- 
    Document   : covidSum
    Created on : May 2, 2021, 12:35:27 PM
    Author     : kantanat
--%>

<%@page import="Client.summaryjsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Summary</title>
        <style>
            td{
                padding: 10px;
            }
            div{
                width: 80%;
                border: 1px solid black ;
                border-radius: 5px;
             
            }
            
        </style>
    </head>
    <body>
    <center><h1>Summary</h1></center>
        <center>  
                 <div>
                     <table>
                         <tr>
                             <td>
                         <center><h3> Thailand main city  </h3></center> 
                         <center>
        <%
            summaryjsp res = new summaryjsp();   
            res.Json();
            out.println(res.getProvinceText());
           
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
                         <center><h3> Based on country (Asia country) </h3></center> 
                         <center>
          <% 
            res.Json();
            out.println(res.getNationText());
           
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
                         <center><h3> Based on Gender </h3></center> 
                         <center>
    
               <%  
            res.Json();
            out.println(res.getGenderText());
           
              %>  
                         </center>
                       </td>
                     </tr>
                  </table>
             </div>
          </center>                
        </body>
</html>
