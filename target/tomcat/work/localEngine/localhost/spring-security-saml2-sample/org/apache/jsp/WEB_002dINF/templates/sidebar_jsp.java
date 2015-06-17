package org.apache.jsp.WEB_002dINF.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("<div class=\"right sidebar\" id=\"sidebar\">\r\n");
      out.write("    <div class=\"section\">\r\n");
      out.write("        <div class=\"section-content\">\r\n");
      out.write("            <h2>Useful links</h2>\r\n");
      out.write("            <ul class=\"nice-list\">\r\n");
      out.write("                <li><a href=\"http://projects.spring.io/spring-security-saml/\">Homepage <span class=\"quiet\">(Spring)</span></a></li>\r\n");
      out.write("                <li><a href=\"https://github.com/spring-projects/spring-security-saml\">Sources <span class=\"quiet\">(GitHub)</span></a></li>\r\n");
      out.write("                <li><a href=\"http://docs.spring.io/spring-security-saml/docs/\">Documentation <span class=\"quiet\">(Spring)</span></a></li>\r\n");
      out.write("                <li><a href=\"https://jira.spring.io/browse/SES/component/10711/\">Issue tracking <span class=\"quiet\">(Jira)</span></a></li>\r\n");
      out.write("                <li><a href=\"https://build.springsource.org/browse/SES\">Continuous integration <span class=\"quiet\">(Bamboo)</span></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <div class=\"section-content\">\r\n");
      out.write("            <h2>Support</h2>\r\n");
      out.write("            <ul class=\"nice-list\">\r\n");
      out.write("                <li><a href=\"http://stackoverflow.com/questions/tagged/spring-saml\">Community <span class=\"quiet\">(Stackoverflow)</span></a></li>\r\n");
      out.write("                <li><a href=\"mailto:vladimir@v7security.com\">Commercial <span class=\"quiet\">(V7 Security)</span></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <div class=\"section-content\">\r\n");
      out.write("            <h2>Releases</h2>\r\n");
      out.write("            <ul class=\"nice-list\">\r\n");
      out.write("                <li><a href=\"http://repo.spring.io/list/release/org/springframework/security/extensions/\">Final releases <span class=\"quiet\">(Spring)</span></a></li>\r\n");
      out.write("                <li><a href=\"http://repo.spring.io/list/milestone/org/springframework/security/extensions/\">Milestone releases <span class=\"quiet\">(Spring)</span></a></li>\r\n");
      out.write("                <li><a href=\"http://repo.spring.io/list/snapshot/org/springframework/security/extensions/\">Snapshot releases <span class=\"quiet\">(Spring)</span></a></li>                \r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"clearer\">&nbsp;</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
