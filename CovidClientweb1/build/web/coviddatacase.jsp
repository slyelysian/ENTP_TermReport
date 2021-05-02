<%-- 
    Document   : coviddatacase
    Created on : May 1, 2020, 11:00:13 PM
    Author     : da
--%>


<%@page import="client.datacaseclientjsp"%>
<%@page import="org.json.JSONException"%>
<%@page import="response.Responsetoday"%>
<%@page import="org.json.JSONObject"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ข้อมูลแต่ละเคสของเดือนพฤษภาคม 63 </title>
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"  rel="stylesheet">
     <style>
            td{
                padding: 10px;
            }
            div{
                width: 100%;
                border: 1px solid black ;
                border-radius: 5px;
                background-color: lightgreen;
            }
            
        </style>
    </head>
  
    <body>
         <center> <h1>ข้อมูลแต่ละเคสของเดือนพฤษภาคม 63</h1>
        <center>  
                 <div>
                     <table>
                         <tr>
                             <td>
                         <center>
        <%  /*String data = request.getParameter("data");*/
            datacaseclientjsp res = new datacaseclientjsp();   
            res.Json();
            out.println(res.getcase1());
           
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
          <%  out.println(res.getcase2());
            
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
    <%     out.println(res.getcase3());
          
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
            out.println(res.getcase4());

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
            
            out.println(res.getcase5());
              
            //out.println(res.getData());
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
            
            out.println(res.getcase6());
              
            //out.println(res.getData());
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
            
            out.println(res.getcase7());
              
            //out.println(res.getData());
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
            
            out.println(res.getcase8());
              
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
