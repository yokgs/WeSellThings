package org.apache.jsp.client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entities.Client;
import entities.User;
import service.UserService;

public final class clientIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <!-- Basic -->\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <!-- Mobile Metas -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <!-- Site Metas -->\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("\n");
      out.write("        <title>we sell things</title>\n");
      out.write("\n");
      out.write("        <!-- slider stylesheet -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/owl.carousel.min.css\" />\n");
      out.write("\n");
      out.write("        <!-- bootstrap core css -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\" />\n");
      out.write("\n");
      out.write("        <!-- fonts style -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,700|Poppins:400,700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- responsive style -->\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"hero_area\">\n");
      out.write("\n");
      out.write("            <header class=\"header_section\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <nav class=\"navbar navbar-expand-lg custom_nav-container\">\n");
      out.write("                        <a class=\"navbar-brand\" href=\"index.html\">\n");
      out.write("                            <img src=\"images/logo.png\" alt=\"\" />\n");
      out.write("                        </a>\n");
      out.write("                        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\n");
      out.write("                                aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                            <ul class=\"navbar-nav  \">\n");
      out.write("                                <li class=\"nav-item active\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"index.html\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"about.html\"> About</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"shop.html\">Shop </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"furniture.html\"> Furniture </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"inscription.html\">S'inscrire</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                            <div class=\"user_option\">\n");
      out.write("                                <a href=\"connexion.html\">\n");
      out.write("                                    <img src=\"images/user.png\" alt=\"\">\n");
      out.write("                                    <span>\n");
      out.write("\n");
      out.write("                                        ");
      out.write("\n");
      out.write("                                        ");

                                            HttpSession sessio = request.getSession();
                                            if (sessio != null) {
                                                c = (Client) sessio.getAttribute("user-r");
                                            } else {
                                                response.sendRedirect("./client/connexion.html");
                                            }
                                        
      out.write("\n");
      out.write("                                        ");
      out.print(c.getNom());
      out.write("\n");
      out.write("                                    </span>\n");
      out.write("                                </a>\n");
      out.write("                                <form class=\"form-inline my-2 my-lg-0 ml-0 ml-lg-4 mb-3 mb-lg-0\">\n");
      out.write("                                    <button class=\"btn  my-2 my-sm-0 nav_search-btn\" type=\"submit\"></button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <div class=\"custom_menu-btn \">\n");
      out.write("                                <button>\n");
      out.write("                                    <span class=\" s-1\">\n");
      out.write("\n");
      out.write("                                    </span>\n");
      out.write("                                    <span class=\"s-2\">\n");
      out.write("\n");
      out.write("                                    </span>\n");
      out.write("                                    <span class=\"s-3\">\n");
      out.write("\n");
      out.write("                                    </span>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <section class=\"slider_section \">\n");
      out.write("                <div class=\"play_btn\">\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        <img src=\"images/play.png\" alt=\"\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <!-- <div class=\"number_box\">\n");
      out.write("                  <div>\n");
      out.write("                    <ol class=\"carousel-indicators indicator-2\">\n");
      out.write("                      <li data-target=\"#topproduits\" data-slide-to=\"0\" class=\"active\">01</li>\n");
      out.write("                      <li data-target=\"#topproduits\" data-slide-to=\"1\">02</li>\n");
      out.write("                      <li data-target=\"#topproduits\" data-slide-to=\"2\">03</li>\n");
      out.write("                      <li data-target=\"#topproduits\" data-slide-to=\"3\">04</li>\n");
      out.write("                    </ol>\n");
      out.write("                  </div>\n");
      out.write("                </div>-->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div id=\"topproduits\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                        <ol class=\"carousel-indicators\" id=\"topproduitsindex\">\n");
      out.write("\n");
      out.write("                        </ol>\n");
      out.write("                        <div class=\"carousel-inner\" id=\"topproduitsinner\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- trending section -->\n");
      out.write("\n");
      out.write("        <section class=\"trending_section layout_padding\">\n");
      out.write("            <div id=\"accordion\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"detail-box\">\n");
      out.write("                                <div class=\"heading_container\">\n");
      out.write("                                    <h2>\n");
      out.write("                                        Trending Categories\n");
      out.write("                                    </h2>\n");
      out.write("                                </div>\n");
      out.write("                                <div id=\"trendingNumTitle\" class=\"tab_container\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\" id=\"quatreImg\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- end trending section -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- discount section -->\n");
      out.write("\n");
      out.write("    <section class=\"discount_section  layout_padding\" >\n");
      out.write("        <div class=\"container\" id=\"discount\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- end discount section -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/bootstrap.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/owl.carousel.min.js\">\n");
      out.write("    </script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/remplirLatestProduit.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/remplirDiscount.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/remplirTrendingProduit.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/test.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(\".owl-carousel\").owlCarousel({\n");
      out.write("            loop: true,\n");
      out.write("            margin: 10,\n");
      out.write("            nav: true,\n");
      out.write("            navText: [],\n");
      out.write("            autoplay: true,\n");
      out.write("            autoplayHoverPause: true,\n");
      out.write("            responsive: {\n");
      out.write("                0: {\n");
      out.write("                    items: 1\n");
      out.write("                },\n");
      out.write("                420: {\n");
      out.write("                    items: 3\n");
      out.write("                },\n");
      out.write("                1000: {\n");
      out.write("                    items: 7\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <script>\n");
      out.write("        var nav = $(\"#navbarSupportedContent\");\n");
      out.write("        var btn = $(\".custom_menu-btn\");\n");
      out.write("        btn.click\n");
      out.write("        btn.click(function (e) {\n");
      out.write("\n");
      out.write("            e.preventDefault();\n");
      out.write("            nav.toggleClass(\"lg_nav-toggle\");\n");
      out.write("            document.querySelector(\".custom_menu-btn\").classList.toggle(\"menu_btn-style\")\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <script>\n");
      out.write("        $('.carousel').on('slid.bs.carousel', function () {\n");
      out.write("            $(\".indicator-2 li\").removeClass(\"active\");\n");
      out.write("            indicators = $(\".carousel-indicators li.active\").data(\"slide-to\");\n");
      out.write("            a = $(\".indicator-2\").find(\"[data-slide-to='\" + indicators + \"']\").addClass(\"active\");\n");
      out.write("            console.log(indicators);\n");
      out.write("        })\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
