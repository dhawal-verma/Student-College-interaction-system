package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminpanel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Metamorphosis Design Free Css Templates</title>\n");
      out.write("<meta name=\"keywords\" content=\"\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<link href=\"styles.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"content\">\n");
      out.write("\n");
      out.write("<!-- header begins -->\n");
      out.write("<div id=\"header\"> \n");
      out.write("  <div id=\"menu\">\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li id=\"button1\"><a href=\"adminlogin.html\"  title=\"\">Admin</a></li>\n");
      out.write("\t\t\t<li id=\"button5\"><a href=\"#\" title=\"\">H.O.D</a></li>\n");
      out.write("                        <li id=\"button2\"><a href=\"facultylogin.html\" title=\"\">Faculty</a></li>\n");
      out.write("\t\t\t<li id=\"button3\"><a href=\"studentlogin.html\" title=\"\">Student</a></li>\n");
      out.write("\t\t\t<li id=\"button4\"><a href=\"#\" title=\"\">About</a></li>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</ul>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- header ends -->\n");
      out.write("<!-- content begins -->\n");
      out.write("\n");
      out.write(" <div id=\"main\"></div>\n");
      out.write(" <div id =\"back\">\n");
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
      out.write("        \n");
      out.write("     <section>\n");
      out.write("         <div class=\"panel \">\n");
      out.write("           <div class = \"panel-progress mb-teal\">\n");
      out.write("                 <div class=\"panel-a\">\n");
      out.write("                     <a href=\"addadmin.html\">Add a new Admin</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class = \"panel-progress mb-teal\">\n");
      out.write("                 <div class=\"panel-a\">\n");
      out.write("                    <a href=\"addhod.html\">Add a new H.O.D </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("         \n");
      out.write("            <div class = \"panel-progress mb-teal\">\n");
      out.write("                <div class=\"panel-a\">\n");
      out.write("                    <a href=\"addfaculty.html\">Add a new Faculty</a>\n");
      out.write("                </div>        \n");
      out.write("            </div>\n");
      out.write("         \n");
      out.write("            <div class = \"panel-progress mb-teal\">\n");
      out.write("                 <div class=\"panel-a\">\n");
      out.write("                    <a href=\"addstudent.html\">Add a new Student</a>\n");
      out.write("                </div>\n");
      out.write("            </div >\n");
      out.write("         \n");
      out.write("            <div class = \"panel-progress mb-orange\">\n");
      out.write("                 <div class=\"panel-a\">\n");
      out.write("                    <a href=\"removeadmin.html\">Remove a Admin</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("         \n");
      out.write("            <div class = \"panel-progress mb-orange\">\n");
      out.write("                 <div class=\"panel-a\">\n");
      out.write("                    <a href=\"removehod.html\">Remove a  H.O.D</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("         \n");
      out.write("            <div class = \"panel-progress mb-orange\">\n");
      out.write("                 <div class=\"panel-a\">\n");
      out.write("                    <a href=\"removefaculty.html\">Remove a  Faculty</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("         \n");
      out.write("            <div class = \"panel-progress mb-orange\">\n");
      out.write("                 <div class=\"panel-a\">\n");
      out.write("                    <a href=\"removestudent.html\">Remove a  Student</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class = \"panel-progress mb-blue\">\n");
      out.write("                 <div class=\"panel-a\">\n");
      out.write("                    <a href=\"#\">Update a new Admin</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("         \n");
      out.write("            <div class = \"panel-progress mb-blue\">\n");
      out.write("                 <div class=\"panel-a\">\n");
      out.write("                    <a href=\"#\">Update a new H.O.D</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("         \n");
      out.write("            <div class = \"panel-progress mb-blue\">\n");
      out.write("                 <div class=\"panel-a\">\n");
      out.write("                    <a href=\"#\">Update a new Faculty</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("         \n");
      out.write("            <div class = \"panel-progress mb-blue\">\n");
      out.write("                <div class=\"panel-a\">\n");
      out.write("                    <a href=\"#\">Update a new Student</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("     </div>\n");
      out.write("     </section>\n");
      out.write("     <div>\n");
      out.write("         <div id=\"signout\">\n");
      out.write("             <span ><a href=\"adminlogin.html\">Sign out</a></span>\n");
      out.write("         </div>\n");
      out.write("     </div>\n");
      out.write("\t<div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("\t\n");
      out.write("<!--content ends -->\n");
      out.write("<!--footer begins -->\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"bottom\"></div>\n");
      out.write("</div>\n");
      out.write("<!-- footer ends-->\n");
      out.write("</body>\n");
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
