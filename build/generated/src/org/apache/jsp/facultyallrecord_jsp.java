package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.FacultyDAO;
import java.util.Iterator;
import java.util.List;
import dto.DTO;
import dao.FacultyDAO;

public final class facultyallrecord_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Managment</title>\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <link href=\"styles.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div id=\"content\">\n");
      out.write("\n");
      out.write("<!-- header begins -->\n");
      out.write("<div id=\"header\"> \n");
      out.write("  <div id=\"menu\">\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li id=\"button1\"><a href=\"adminlogin.html\"  title=\"\">Admin</a></li>\n");
      out.write("                        <li id=\"button4\"><a href=\"#\" title=\"\">HOD</a></li>\n");
      out.write("\t\t\t<li id=\"button2\"><a href=\"facultylogin.html\" title=\"\">Faculty</a></li>\n");
      out.write("\t\t\t<li id=\"button3\"><a href=\"studentlogin.html\" title=\"\">Student</a></li>\n");
      out.write("\t\t\t<li id=\"button5\"><a href=\"#\" title=\"\">About</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- header ends -->\n");
      out.write("<!-- content begins -->\n");
      out.write("\n");
      out.write(" <div id=\"main1\"></div>\n");
      out.write(" <div>\n");
      out.write("\t<div id=\"left\">\t\t\n");
      out.write("            <h2>Welcome To Our Website</h2>\n");
      out.write("<!--\n");
      out.write("                        \n");
      out.write("                        <marquee> Lets Move this text.</marquee>\n");
      out.write("    <marquee direction=\"right\" \n");
      out.write("        behavior=\"alternate\" \n");
      out.write("        style=\"border:BLACK 2px SOLID\">\n");
      out.write("        Geeks for Geeks\n");
      out.write("    </marquee>-->\n");
      out.write("\t\t\t</div>\t\n");
      out.write("     <div id=\"hod\">\n");
      out.write("             <h1>H.O.D</h1>\n");
      out.write("             <!--<img src = \"https://www.google.com/search?q=admin+icon&sxsrf=APq-WBuuDC7X9ueuAUV8Hfpxgv05TTMhIg:1645101591129&tbm=isch&source=iu&ictx=1&vet=1&fir=w0_HSJ3toaE5SM%252ChyRewQutrNZ_nM%252C_%253BXKTEYbKXoj-JbM%252CBmdWsJbQoRBmFM%252C_%253BAcyA0BdPCxucSM%252CyUZV23h15dUAPM%252C_%253BBq7Fi2ByO2yZOM%252CItD25M9_8I7qxM%252C_%253BN17bzm2IEzKTKM%252CYlov9-87khsxjM%252C_%253BSmP8nZyMcDRbRM%252CJ3LFnydUBu7CVM%252C_%253BAjrNI9ZLskCqEM%252Cv1GWjTloOfcoQM%252C_%253BkemsT61OERGA-M%252C7Q3eocpuRzi_-M%252C_%253BtI1Z0lNwJ-eYyM%252CaiPLIaobLyElOM%252C_%253B5AJgvRAqQdvUTM%252CfePc_VX-gtx3PM%252C_%253BCMPnUiKKyuIG-M%252Cv3buvWo8t6qNXM%252C_%253BEnbDsTzdBc3p1M%252CRw6eiNy2hDSABM%252C_%253BC6d4e7njmYFSvM%252CmaFd3C0efByUfM%252C_%253BH9sSEQY68ln4qM%252CMlsH9snxD2ryNM%252C_%253BFCG3U0RfanuMVM%252CYlov9-87khsxjM%252C_%253BW2_mbmrSYrq0aM%252CL7-b464RRgNdTM%252C_&usg=AI4_-kRF3eGpSwDcsdy6tomT-M75eTWkaw&sa=X&ved=2ahUKEwirgtX_4Ib2AhXOTWwGHaYFBUIQ9QF6BAgYEAE#imgrc=XKTEYbKXoj-JbM\">-->\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ");

            FacultyDAO udao = new FacultyDAO();
            List<DTO>  dt = udao.userAllData();
            Iterator<DTO> itr = dt.iterator();
    
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <div class=\"center-0 \">\n");
      out.write("         <table border =\"2px\" class=\"tb\">\n");
      out.write("            <tr>\n");
      out.write("                <td><strong>Name</strong></td>\n");
      out.write("                <td><strong>Enrollment</strong></td>\n");
      out.write("                <td><strong>Password</strong></td>\n");
      out.write("                <td><strong>Address</strong></td>\n");
      out.write("                <td><strong>Admission Year</strong></td>\n");
      out.write("                <td><strong>Adhar Number</strong></td>\n");
      out.write("                <td><strong>Blood Group</strong></td>\n");
      out.write("                <td><strong>Branch</strong></td>\n");
      out.write("                <td><strong>Gender</strong></td>\n");
      out.write("                <td><strong>Contact</strong></td>\n");
      out.write("                <td><strong>DOB</strong></td>\n");
      out.write("                <td><strong>Email</strong></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");

            while(itr.hasNext())
            {
                DTO user = itr.next();
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td><strong>");
      out.print(user.getUsername());
      out.write("</strong></td>\n");
      out.write("                <td><strong>");
      out.print(user.getEnrollment());
      out.write("</strong></td>\n");
      out.write("                <td><strong>");
      out.print( user.getPassword());
      out.write("</strong></td>\n");
      out.write("                <td><strong>");
      out.print(user.getAddress() );
      out.write("</strong></td>\n");
      out.write("                <td><strong>");
      out.print( user.getYear());
      out.write("</strong></td>\n");
      out.write("                <td><strong>");
      out.print( user.getAdhar() );
      out.write("</strong></td>\n");
      out.write("                <td><strong>");
      out.print( user.getBlood() );
      out.write("</strong></td>\n");
      out.write("                <td><strong>");
      out.print( user.getBranch() );
      out.write("</strong></td>\n");
      out.write("                <td><strong>");
      out.print( user.getGender() );
      out.write("</strong></td>\n");
      out.write("                <td><strong>");
      out.print( user.getMobile() );
      out.write("</strong></td>\n");
      out.write("                <td><strong>");
      out.print( user.getDob() );
      out.write("</strong></td>\n");
      out.write("                <td><strong>");
      out.print( user.getEmail() );
      out.write("</strong></td>\n");
      out.write("            </tr>\n");
      out.write("            ");

            }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("<!--\t\t\t\t<form id=\"center-1\" method=\"post\" action=\"Addadmin\n");
      out.write("\t\t\t\t\t<fieldset>\n");
      out.write("                                            <legend style=\"text-align: center\">Login</legend>\n");
      out.write("                                            <table>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <label for=\"text1\">Student's Name  :</label>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        ");
      out.write("\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                \n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <label for=\"text2\">Faculty id  :</label>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        ");
      out.write("\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <label for=\"text1\">Password :</label>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        ");
      out.write("\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>\n");
      out.write("                                                       <label for=\"text1\">Address  :</label> \n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        ");
      out.write("\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <label for=\"text1\">Appointment Year :</label>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        ");
      out.write("\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <label for=\"text1\">Adhar Number :</label>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        ");
      out.write("\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <label for=\"text1\">Blood Group  :</label>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        ");
      out.write("\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <label for=\"text1\">Branch   :</label>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        ");
      out.write("\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <label for=\"text1\">Gender   :</label>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        ");
      out.write("\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <label for=\"text1\">Mobile Number    :</label>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        ");
      out.write("\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <label for=\"text1\">Date of Birth    :</label>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        ");
      out.write("\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <label for=\"text1\">email    :</label>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        ");
      out.write("\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <input style =\"margin-left: 150px\" id=\"size1\" type=\"submit\" name=\"submit1\" value=\"Login\" />\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                \n");
      out.write("                                            </table>\n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t</form>-->\n");
      out.write("\t\t\t</div>\n");
      out.write(" \n");
      out.write("                                                    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("        ");
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
