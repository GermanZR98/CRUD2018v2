package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modificaTarjeta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\">\n");
      out.write("        <title>Zambrana´s GYM</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 request.setCharacterEncoding("UTF-8");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <br><br>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"names2\">Modificación de socio</div>\n");
      out.write("                <form method=\"get\" action=\"grabaTarjetaModificada.jsp\">\n");
      out.write("                    <div class=\"names\"> \n");
      out.write("                        <label>&nbsp;&nbsp;ID:&nbsp;</label><input type=\"text\" size=\"5\" name=\"socio_id\" value=\"");
      out.print( Integer.valueOf(request.getParameter("socio_id")));
      out.write("\" readonly>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"names\">\n");
      out.write("                        <label>&nbsp;&nbsp;Localidad:&nbsp;</label><input type=\"text\" size=\"15\" name=\"localidad\" value=\"");
      out.print( request.getParameter("localidad"));
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"names\">\n");
      out.write("                        <label>&nbsp;&nbsp;Nombre:&nbsp;</label><input type=\"text\" size=\"30\" name=\"nombre\" value=\"");
      out.print( request.getParameter("nombre"));
      out.write("\">\n");
      out.write("                        <label>&nbsp;&nbsp;Tipo Somático:&nbsp;</label><input type=\"text\" size=\"15\" name=\"tipo_somatico\" value=\"");
      out.print( request.getParameter("tipo_somatico"));
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"names\">\n");
      out.write("                        <label>&nbsp;&nbsp;Peso:&nbsp;</label><input type=\"text\" name=\"peso\" size=\"5\" value=\"");
      out.print( Double.valueOf(request.getParameter("peso")));
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                    &nbsp;&nbsp;<a href=\"index.jsp\" class=\"boton\"><span></span>Cancelar</a>\n");
      out.write("                    <button class=\"cuadro\" type=\"submit\"><span></span>Aceptar</button><br><br>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
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
