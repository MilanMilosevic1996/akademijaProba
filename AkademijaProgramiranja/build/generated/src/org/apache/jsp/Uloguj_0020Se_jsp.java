package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Uloguj_0020Se_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>UlogujSe</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"UlogujSeStyle.css\">\n");
      out.write("    </head>\n");
      out.write("    <body class = \"bodyy\">\n");
      out.write("\n");
      out.write("        <div class=\"sidenav\">\n");
      out.write("            <a  href=\"http://localhost:8080/AkademijaProgramiranja.jsp/O%20Akademiji.jsp\">Akademija</a>\n");
      out.write("            <a href=\"http://localhost:8080/AkademijaProgramiranja.jsp/Kursevi.jsp\">Kursevi</a>\n");
      out.write("            <a href=\"http://localhost:8080/AkademijaProgramiranja.jsp/Ucionice.jsp\">Ucionice</a>\n");
      out.write("            <a href=\"http://localhost:8080/AkademijaProgramiranja.jsp/Kontakt.jsp\">Kontakt</a>\n");
      out.write("            <a class = \"active\" style = \" margin-top: 420px; \" href=\"http://localhost:8080/AkademijaProgramiranja.jsp/Uloguj%20Se.jsp\">Uloguj se</a>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class = \"logginddiv\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <form> \n");
      out.write("                <table > \n");
      out.write("                    <tr >\n");
      out.write("                    <input class = \"kimi\" type = \"text\" name=\"korisnickoime\" placeholder=\"Unesite username\">\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                    <input class = \"kimi\"  type = \"text\" name=\"sifra\" placeholder=\"Unesite sifru\" >\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                    <input  class = \"sumbit\" type=\"submit\" value=\"UlogujSe\">\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
