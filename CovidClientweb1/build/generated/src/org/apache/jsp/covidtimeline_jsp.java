package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import rest.CovidtimelineRest;
import org.json.JSONArray;
import client.timelineclientjsp;
import org.json.JSONException;
import response.Responsetoday;
import org.json.JSONObject;

public final class covidtimeline_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ข้อมูลสรุปตามช่วงเวลา</title>\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\"  rel=\"stylesheet\">\n");
      out.write("     <style>\n");
      out.write("            td{\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("            div{\n");
      out.write("                width: 80%;\n");
      out.write("                border: 1px solid black ;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                background-color: lightskyblue;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <center> <h1>ข้อมูลสรุปตามช่วงเวลา (เริ่มตั้งแต่วันที่ 29/04/20-ล่าสุด) </h1>\n");
      out.write("             <center>  \n");
      out.write("                 <div>\n");
      out.write("                     <table>\n");
      out.write("                         <tr>\n");
      out.write("                             <td>\n");
      out.write("                         <center>\n");
      out.write("        ");
  /*String data = request.getParameter("data");*/
            timelineclientjsp res = new timelineclientjsp();   
            res.Json();
            out.println(res.getday1());
           
              
      out.write("\n");
      out.write("                                 </center>\n");
      out.write("                              </td>   \n");
      out.write("                             </tr>\n");
      out.write("                          </table>\n");
      out.write("                   </div>\n");
      out.write("             </center>\n");
      out.write("           <center>\n");
      out.write("               <div>\n");
      out.write("                     <table>\n");
      out.write("                         <tr>\n");
      out.write("                             <td>\n");
      out.write("                         <center>\n");
      out.write("          ");
  out.println(res.getday2());
            
              
      out.write("\n");
      out.write("                         </center>\n");
      out.write("                             </td>\n");
      out.write("                             </tr>\n");
      out.write("                           </table>\n");
      out.write("                   </div>            \n");
      out.write("           </center> \n");
      out.write("   <center>\n");
      out.write("       <div>\n");
      out.write("                     <table>\n");
      out.write("                         <tr>\n");
      out.write("                             <td>\n");
      out.write("                              <center>\n");
      out.write("    ");
     out.println(res.getday3());
          
              
      out.write("\n");
      out.write("                                </center>\n");
      out.write("                             </td>  \n");
      out.write("                             </tr>\n");
      out.write("                          </table>\n");
      out.write("                   </div>\n");
      out.write("     </center>\n");
      out.write("   <center>\n");
      out.write("       <div>\n");
      out.write("                     <table>\n");
      out.write("                         <tr>\n");
      out.write("                             <td>\n");
      out.write("                              <center>\n");
      out.write("   ");
     
            out.println(res.getday4());

              
      out.write("\n");
      out.write("                                 </center>\n");
      out.write("                             </td>  \n");
      out.write("                             </tr>\n");
      out.write("                          </table>\n");
      out.write("                   </div>                           \n");
      out.write("        </center>\n");
      out.write("  <center>\n");
      out.write("      <div>\n");
      out.write("                     <table>\n");
      out.write("                         <tr>\n");
      out.write("                             <td>\n");
      out.write("                              <center>\n");
      out.write("   ");
     
            
            out.println(res.getday5());
              
            //out.println(res.getData());
              
      out.write("\n");
      out.write("                          </center>\n");
      out.write("                             </td>  \n");
      out.write("                             </tr>\n");
      out.write("                          </table>\n");
      out.write("                   </div>\n");
      out.write("     </center>\n");
      out.write("   </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
