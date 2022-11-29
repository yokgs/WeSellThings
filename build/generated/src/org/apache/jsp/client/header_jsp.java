package org.apache.jsp.client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entities.Client;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

Client c;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!-- Topbar Start -->\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("    <div class=\"row bg-secondary py-1 px-xl-5\">\n");
      out.write("        <div class=\"col-lg-6 d-none d-lg-block\">\n");
      out.write("            <div class=\"d-inline-flex align-items-center h-100\">\n");
      out.write("                <a class=\"text-body mr-3\" href=\"\">About</a>\n");
      out.write("                <a class=\"text-body mr-3\" href=\"\">Contact</a>\n");
      out.write("                <a class=\"text-body mr-3\" href=\"\">Help</a>\n");
      out.write("                <a class=\"text-body mr-3\" href=\"\">FAQs</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-6 text-center text-lg-right\">\n");
      out.write("            <div class=\"d-inline-flex align-items-center\">\n");
      out.write("                ");
      out.write("\n");
      out.write("                ");

                    HttpSession s = request.getSession();
                    String client = "My Account";
                    c = (Client) s.getAttribute("user-o");
                    try {
                        client = c.getPrenom();
                    } catch (Exception e) {
                    }
                    if (client == null) {
                        client = "My Account";
                    }
                
      out.write("\n");
      out.write("                <div class=\"btn-group\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-sm btn-light dropdown-toggle\" data-toggle=\"dropdown\"> <img class=\"img-fluid\" src=\"img/client.png\" alt=\"\">");
      out.print(client);
      out.write("</button>                         \n");
      out.write("                    <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                        ");

                            String inOut;
                            if (client.equals("My Account")) {

                        
      out.write("\n");
      out.write("                        \n");
      out.write("                    <button onclick=\"togglePopup()\" class=\"dropdown-item\" >Se connecter</button>\n");
      out.write("                    \n");
      out.write("                        ");
} else {
      out.write("\n");
      out.write("                        <form action=\"/deconnexion\">\n");
      out.write("                            <input class=\"dropdown-item\" type=\"submit\" value=\"Se déconnecter\">\n");
      out.write("                        </form>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                        <button class=\"dropdown-item\" type=\"button\">Mon Profile</button>\n");
      out.write("                        <a class=\"dropdown-item\" type=\"button\" href=\"mesCommandes.jsp\">Mes Commandes</a>                     \n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("                <div class=\"btn-group mx-2\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-sm btn-light dropdown-toggle\" data-toggle=\"dropdown\">USD</button>\n");
      out.write("                    <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                        <button class=\"dropdown-item\" type=\"button\">EUR</button>\n");
      out.write("                        <button class=\"dropdown-item\" type=\"button\">GBP</button>\n");
      out.write("                        <button class=\"dropdown-item\" type=\"button\">CAD</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"btn-group\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-sm btn-light dropdown-toggle\" data-toggle=\"dropdown\">EN</button>\n");
      out.write("                    <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                        <button class=\"dropdown-item\" type=\"button\">FR</button>\n");
      out.write("                        <button class=\"dropdown-item\" type=\"button\">AR</button>\n");
      out.write("                        <button class=\"dropdown-item\" type=\"button\">RU</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"d-inline-flex align-items-center d-block d-lg-none\">\n");
      out.write("                <a href=\"\" class=\"btn px-0 ml-2\">\n");
      out.write("                    <i class=\"fas fa-heart text-dark\"></i>\n");
      out.write("                    <span class=\"badge text-dark border border-dark rounded-circle\" style=\"padding-bottom: 2px;\">0</span>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"\" class=\"btn px-0 ml-2\">\n");
      out.write("                    <i class=\"fas fa-shopping-cart text-dark\"></i>\n");
      out.write("                    <span class=\"badge text-dark border border-dark rounded-circle\" style=\"padding-bottom: 2px;\">0</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row align-items-center bg-light py-3 px-xl-5 d-none d-lg-flex\">\n");
      out.write("        <div class=\"col-lg-4\">\n");
      out.write("            <a href=\"\" class=\"text-decoration-none\">\n");
      out.write("                <span class=\"h1 text-uppercase text-primary bg-dark px-2\">ISI</span>\n");
      out.write("                <span class=\"h1 text-uppercase text-dark bg-primary px-2 ml-n1\">SHOP</span>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-4 col-6 text-left\">\n");
      out.write("            <form action=\"\">\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Search for products\">\n");
      out.write("                    <div class=\"input-group-append\">\n");
      out.write("                        <span class=\"input-group-text bg-transparent text-primary\">\n");
      out.write("                            <i class=\"fa fa-search\"></i>\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-4 col-6 text-right\">\n");
      out.write("            <p class=\"m-0\">Customer Service</p>\n");
      out.write("            <h5 class=\"m-0\">+012 345 6789</h5>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- Topbar End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Navbar Start -->\n");
      out.write("<div class=\"container-fluid bg-dark mb-30\">\n");
      out.write("    <div class=\"row px-xl-5\">\n");
      out.write("        <div class=\"col-lg-3 d-none d-lg-block\">\n");
      out.write("            <a class=\"btn d-flex align-items-center justify-content-between bg-primary w-100\" data-toggle=\"collapse\" href=\"#navbar-vertical\" style=\"height: 65px; padding: 0 30px;\">\n");
      out.write("                <h6 class=\"text-dark m-0\"><i class=\"fa fa-bars mr-2\"></i>Categories</h6>\n");
      out.write("                <i class=\"fa fa-angle-down text-dark\"></i>\n");
      out.write("            </a>\n");
      out.write("            <nav class=\"collapse position-absolute navbar navbar-vertical navbar-light align-items-start p-0 bg-light\" id=\"navbar-vertical\" style=\"width: calc(100% - 30px); z-index: 999;\">\n");
      out.write("                <div class=\"navbar-nav w-100\">\n");
      out.write("                    <div class=\"nav-item dropdown dropright\">\n");
      out.write("                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Dresses <i class=\"fa fa-angle-right float-right mt-1\"></i></a>\n");
      out.write("                        <div class=\"dropdown-menu position-absolute rounded-0 border-0 m-0\">\n");
      out.write("                            <a href=\"\" class=\"dropdown-item\">Men's Dresses</a>\n");
      out.write("                            <a href=\"\" class=\"dropdown-item\">Women's Dresses</a>\n");
      out.write("                            <a href=\"\" class=\"dropdown-item\">Baby's Dresses</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"\" class=\"nav-item nav-link\">Shirts</a>\n");
      out.write("                    <a href=\"\" class=\"nav-item nav-link\">Jeans</a>\n");
      out.write("                    <a href=\"\" class=\"nav-item nav-link\">Swimwear</a>\n");
      out.write("                    <a href=\"\" class=\"nav-item nav-link\">Sleepwear</a>\n");
      out.write("                    <a href=\"\" class=\"nav-item nav-link\">Sportswear</a>\n");
      out.write("                    <a href=\"\" class=\"nav-item nav-link\">Jumpsuits</a>\n");
      out.write("                    <a href=\"\" class=\"nav-item nav-link\">Blazers</a>\n");
      out.write("                    <a href=\"\" class=\"nav-item nav-link\">Jackets</a>\n");
      out.write("                    <a href=\"\" class=\"nav-item nav-link\">Shoes</a>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-9\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg bg-dark navbar-dark py-3 py-lg-0 px-0\">\n");
      out.write("                <a href=\"\" class=\"text-decoration-none d-block d-lg-none\">\n");
      out.write("                    <span class=\"h1 text-uppercase text-dark bg-light px-2\">Multi</span>\n");
      out.write("                    <span class=\"h1 text-uppercase text-light bg-primary px-2 ml-n1\">Shop</span>\n");
      out.write("                </a>\n");
      out.write("                <button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse justify-content-between\" id=\"navbarCollapse\">\n");
      out.write("                    <div class=\"navbar-nav mr-auto py-0\">\n");
      out.write("                        <a href=\"indexClient.jsp\" class=\"nav-item nav-link active\">Home</a>\n");
      out.write("                        <a href=\"shop.jsp\" class=\"nav-item nav-link\">Shop</a>\n");
      out.write("                        <a href=\"produit.jsp\" class=\"nav-item nav-link\">Shop Detail</a>\n");
      out.write("                        <div class=\"nav-item dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Pages <i class=\"fa fa-angle-down mt-1\"></i></a>\n");
      out.write("                            <div class=\"dropdown-menu bg-primary rounded-0 border-0 m-0\">\n");
      out.write("                                <a href=\"cart.jsp\" class=\"dropdown-item\">Shopping Cart</a>\n");
      out.write("                                <a href=\"checkout.jsp\" class=\"dropdown-item\">Checkout</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"contact.html\" class=\"nav-item nav-link\">Contact</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"navbar-nav ml-auto py-0 d-none d-lg-block\">\n");
      out.write("                        <a href=\"\" class=\"btn px-0\">\n");
      out.write("                            <i class=\"fas fa-heart text-primary\"></i>\n");
      out.write("                            <span class=\"badge text-secondary border border-secondary rounded-circle\" style=\"padding-bottom: 2px;\">0</span>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"\" class=\"btn px-0 ml-3\">\n");
      out.write("                            <i class=\"fas fa-shopping-cart text-primary\"></i>\n");
      out.write("                            <span class=\"badge text-secondary border border-secondary rounded-circle\" style=\"padding-bottom: 2px;\">0</span>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Navbar End -->\n");
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
