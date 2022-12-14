package org.apache.jsp.client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dto.CategorieDTO;
import entities.Client;
import dto.CommandeDTO;
import entities.Commande;
import entities.Categorie;
import service.CategorieService;
import entities.Client;

public final class indexClient_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

Client c;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/client/header.jsp");
    _jspx_dependants.add("/client/footer.jsp");
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <title>WeSellThings</title>\r\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("        <meta content=\"Plateforme de vente\" name=\"keywords\">\r\n");
      out.write("        <meta content=\"Plateforme de vente\" name=\"description\">\r\n");
      out.write("        <!-- Favicon -->\r\n");
      out.write("        <link href=\"img/favicon.ico\" rel=\"icon\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Google Web Fonts -->\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap\" rel=\"stylesheet\">  \r\n");
      out.write("\r\n");
      out.write("        <!-- Font Awesome -->\r\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Libraries Stylesheet -->\r\n");
      out.write("        <link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Customized Bootstrap Stylesheet -->\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/newcss.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"css/poUp.css\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"popup\" id=\"popup-1\">\r\n");
      out.write("            <div class=\"content\">\r\n");
      out.write("                <div class=\"close-btn\" onclick=\"togglePopup()\">\r\n");
      out.write("                    ??</div>\r\n");
      out.write("\r\n");
      out.write("                <h1 class=\"text-white\">Sign in</h1> \r\n");
      out.write("                <div class=\"input-field\"><input placeholder=\"Email\" class=\"validate\"></div>\r\n");
      out.write("                <div class=\"input-field\"><input placeholder=\"Password\" class=\"validate\"></div>\r\n");
      out.write("                <button class=\"second-button\">Sign in</button>\r\n");
      out.write("                <p class=\"text-white\">Don't have an account? <a href=\"/signup.html\">Sign Up</a></p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Header(Top bar and navbar) Start -->\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- Topbar Start -->\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"row bg-secondary py-1 px-xl-5\">\r\n");
      out.write("        <div class=\"col-lg-6 d-none d-lg-block\">\r\n");
      out.write("            <div class=\"d-inline-flex align-items-center h-100\">\r\n");
      out.write("                <a class=\"text-body mr-3\" href=\"\">About</a>\r\n");
      out.write("                <a class=\"text-body mr-3\" href=\"\">Contact</a>\r\n");
      out.write("                <a class=\"text-body mr-3\" href=\"\">Help</a>\r\n");
      out.write("                <a class=\"text-body mr-3\" href=\"\">FAQs</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-6 text-center text-lg-right\">\r\n");
      out.write("            <div class=\"d-inline-flex align-items-center\">\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");

                    
                    String client = "Mon Compte";

                    try {
                        c = (Client) session.getAttribute("user-o");
                        client = c.getPrenom();
                    } catch (Exception e) {
                    }
                    if (client == null) {
                        client = "Mon Compte";
                    }
                
      out.write("\r\n");
      out.write("                <div class=\"btn-group\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-sm btn-light dropdown-toggle\" data-toggle=\"dropdown\"> <img class=\"img-fluid\" src=\"img/client.png\" alt=\"\">");
      out.print(client);
      out.write("</button>                         \r\n");
      out.write("                    <div class=\"dropdown-menu dropdown-menu-right\">\r\n");
      out.write("                        ");

                            String inOut;
                            if (client.equals("Mon Compte")) {

                        
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <button onclick=\"document.location = 'connexion.html'\" class=\"dropdown-item\" >Se connecter</button>\r\n");
      out.write("\r\n");
      out.write("                        ");
} else {
      out.write("\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"/deconnexion\">Se d??connecter</a>\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                        ");
if (middleware.SessionUtil.isClient(request, response)) {
      out.write("\r\n");
      out.write("                        <button class=\"dropdown-item\" type=\"button\">Mon Profile</button>\r\n");
      out.write("                        <a class=\"dropdown-item\" type=\"button\" href=\"mesCommandes.jsp\">Mes Commandes</a>  \r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div> \r\n");
      out.write("                <div class=\"btn-group mx-2\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-sm btn-light dropdown-toggle\" data-toggle=\"dropdown\">USD</button>\r\n");
      out.write("                    <div class=\"dropdown-menu dropdown-menu-right\">\r\n");
      out.write("                        <button class=\"dropdown-item\" type=\"button\">EUR</button>\r\n");
      out.write("                        <button class=\"dropdown-item\" type=\"button\">GBP</button>\r\n");
      out.write("                        <button class=\"dropdown-item\" type=\"button\">CAD</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"btn-group\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-sm btn-light dropdown-toggle\" data-toggle=\"dropdown\">EN</button>\r\n");
      out.write("                    <div class=\"dropdown-menu dropdown-menu-right\">\r\n");
      out.write("                        <button class=\"dropdown-item\" type=\"button\">FR</button>\r\n");
      out.write("                        <button class=\"dropdown-item\" type=\"button\">AR</button>\r\n");
      out.write("                        <button class=\"dropdown-item\" type=\"button\">RU</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"d-inline-flex align-items-center d-block d-lg-none\">\r\n");
      out.write("                <a href=\"\" class=\"btn px-0 ml-2\">\r\n");
      out.write("                    <i class=\"fas fa-heart text-dark\"></i>\r\n");
      out.write("                    <span class=\"badge text-dark border border-dark rounded-circle\" style=\"padding-bottom: 2px;\">0</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a href=\"\" class=\"btn px-0 ml-2\">\r\n");
      out.write("                    <i class=\"fas fa-shopping-cart text-dark\"></i>\r\n");
      out.write("                    <span class=\"badge text-dark border border-dark rounded-circle\" style=\"padding-bottom: 2px;\">0</span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row align-items-center bg-light py-3 px-xl-5 d-none d-lg-flex\">\r\n");
      out.write("        <div class=\"col-lg-4\">\r\n");
      out.write("            <a href=\"indexClient.jsp\" class=\"text-decoration-none\">\r\n");
      out.write("                <span class=\"h1 text-uppercase text-primary bg-dark px-2\">WE</span>\r\n");
      out.write("                <span class=\"h1 text-uppercase text-dark bg-primary px-2 ml-n1\">SELLTHINGS</span>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-4 col-6 text-left\">\r\n");
      out.write("            <form action=\"\">\r\n");
      out.write("                <div class=\"input-group\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Search for products\">\r\n");
      out.write("                    <div class=\"input-group-append\">\r\n");
      out.write("                        <span class=\"input-group-text bg-transparent text-primary\">\r\n");
      out.write("                            <i class=\"fa fa-search\"></i>\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-4 col-6 text-right\">\r\n");
      out.write("            <p class=\"m-0\">Customer Service</p>\r\n");
      out.write("            <h5 class=\"m-0\">+012 345 6789</h5>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Topbar End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Navbar Start -->\r\n");
      out.write("<div class=\"container-fluid bg-dark mb-30\">\r\n");
      out.write("    <div class=\"row px-xl-5\">\r\n");
      out.write("        <div class=\"col-lg-3 d-none d-lg-block\">\r\n");
      out.write("            <a class=\"btn d-flex align-items-center justify-content-between bg-primary w-100\" data-toggle=\"collapse\" href=\"#navbar-vertical\" style=\"height: 65px; padding: 0 30px;\">\r\n");
      out.write("                <h6 class=\"text-dark m-0\"><i class=\"fa fa-bars mr-2\"></i>Categories</h6>\r\n");
      out.write("                <i class=\"fa fa-angle-down text-dark\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("            ");

                CategorieService cs = new CategorieService();

            
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <nav class=\"collapse position-absolute navbar navbar-vertical navbar-light align-items-start p-0 bg-light\" id=\"navbar-vertical\" style=\"width: calc(100% - 30px); z-index: 999;\">\r\n");
      out.write("                <div class=\"navbar-nav w-100\"> \r\n");
      out.write("\r\n");
      out.write("                    ");
                            for (Categorie c : cs.findAll()) {
                            if (c.getSupCategorie() == null) {
                    
      out.write("\r\n");
      out.write("                    <div class=\"nav-item dropdown dropright\">\r\n");
      out.write("                        ");

                            if (c.getCategories().size() > 0) {
                        
      out.write("\r\n");
      out.write("                        <a href=\"shop.jsp?categorie=");
      out.print(c.getId());
      out.write("\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                            ");
      out.print(c.getNom());
      out.write("<i class=\"fa fa-angle-right float-right mt-1\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"dropdown-menu position-absolute rounded-0 border-0 m-0\">\r\n");
      out.write("                            ");
 for (Categorie sbc : c.getCategories()) {
      out.write("\r\n");
      out.write("                            <a href=\"shop.jsp?categorie=");
      out.print(sbc.getId());
      out.write("\" class=\"dropdown-item\">");
      out.print(sbc.getNom());
      out.write("</a>\r\n");
      out.write("                            ");
 } 
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");
 } else {
      out.write("\r\n");
      out.write("                        <a href=\"shop.jsp?categorie=");
      out.print(c.getId());
      out.write("\" class=\"nav-item nav-link\">");
      out.print(c.getNom());
      out.write("</a>\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    ");

                            }
                        }
                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-9\">\r\n");
      out.write("            <nav class=\"navbar navbar-expand-lg bg-dark navbar-dark py-3 py-lg-0 px-0\">\r\n");
      out.write("                <a href=\"\" class=\"text-decoration-none d-block d-lg-none\">\r\n");
      out.write("                    <span class=\"h1 text-uppercase text-dark bg-light px-2\">Multi</span>\r\n");
      out.write("                    <span class=\"h1 text-uppercase text-light bg-primary px-2 ml-n1\">Shop</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\">\r\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse justify-content-between\" id=\"navbarCollapse\">\r\n");
      out.write("                    <div class=\"navbar-nav mr-auto py-0\">\r\n");
      out.write("                        <a href=\"indexClient.jsp\" class=\"nav-item nav-link active\">Home</a>\r\n");
      out.write("                        <a href=\"shop.jsp\" class=\"nav-item nav-link\">Shop</a>\r\n");
      out.write("                        <a href=\"contact.jsp\" class=\"nav-item nav-link\">Contact</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"navbar-nav ml-auto py-0 d-none d-lg-block\">\r\n");
      out.write("                        <a href=\"\" class=\"btn px-0\">\r\n");
      out.write("                            <i class=\"fas fa-heart text-primary\"></i>\r\n");
      out.write("                            <span class=\"badge text-secondary border border-secondary rounded-circle\" style=\"padding-bottom: 2px;\">0</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <a href=\"cart.jsp\" class=\"btn px-0 ml-3\">\r\n");
      out.write("                            <i class=\"fas fa-shopping-cart text-primary\"></i>\r\n");
      out.write("                            ");
 int amount = 0;
                                if (session.getAttribute("user-o") != null) {
                                    amount = (new CommandeDTO((Commande) session.getAttribute("cart"))).getProduits();
                                }
                            
      out.write("\r\n");
      out.write("                            <span class=\"badge text-secondary border border-secondary rounded-circle\" style=\"padding-bottom: 2px;\">");
      out.print( amount);
      out.write("</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Navbar End -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Header End -->\r\n");
      out.write("        <!-- Carousel Start -->\r\n");
      out.write("        <div class=\"container-fluid mb-3\">\r\n");
      out.write("            <div class=\"row px-xl-5\">\r\n");
      out.write("                <div class=\"col-lg-8\">\r\n");
      out.write("                    <div id=\"header-carousel\" class=\"carousel slide carousel-fade mb-30 mb-lg-0\" data-ride=\"carousel\">\r\n");
      out.write("                        <ol class=\"carousel-indicators\">\r\n");
      out.write("                            <li data-target=\"#header-carousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                            <li data-target=\"#header-carousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("                            <li data-target=\"#header-carousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"carousel-inner\" id =\"produits1\">\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"reduction1\" class=\"col-lg-4\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Carousel End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Featured Start -->\r\n");
      out.write("        <div class=\"container-fluid pt-5\">\r\n");
      out.write("            <div class=\"row px-xl-5 pb-3\">\r\n");
      out.write("                <div class=\"col-lg-3 col-md-6 col-sm-12 pb-1\">\r\n");
      out.write("                    <div class=\"d-flex align-items-center bg-light mb-4\" style=\"padding: 30px;\">\r\n");
      out.write("                        <h1 class=\"fa fa-check text-primary m-0 mr-3\"></h1>\r\n");
      out.write("                        <h5 class=\"font-weight-semi-bold m-0\">Quality Product</h5>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-6 col-sm-12 pb-1\">\r\n");
      out.write("                    <div class=\"d-flex align-items-center bg-light mb-4\" style=\"padding: 30px;\">\r\n");
      out.write("                        <h1 class=\"fa fa-shipping-fast text-primary m-0 mr-2\"></h1>\r\n");
      out.write("                        <h5 class=\"font-weight-semi-bold m-0\">Free Shipping</h5>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-6 col-sm-12 pb-1\">\r\n");
      out.write("                    <div class=\"d-flex align-items-center bg-light mb-4\" style=\"padding: 30px;\">\r\n");
      out.write("                        <h1 class=\"fas fa-exchange-alt text-primary m-0 mr-3\"></h1>\r\n");
      out.write("                        <h5 class=\"font-weight-semi-bold m-0\">14-Day Return</h5>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-6 col-sm-12 pb-1\">\r\n");
      out.write("                    <div class=\"d-flex align-items-center bg-light mb-4\" style=\"padding: 30px;\">\r\n");
      out.write("                        <h1 class=\"fa fa-phone-volume text-primary m-0 mr-3\"></h1>\r\n");
      out.write("                        <h5 class=\"font-weight-semi-bold m-0\">24/7 Support</h5>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Featured End -->\r\n");
      out.write("\r\n");
      out.write("        ");
            CategorieService cc = new CategorieService();

        
      out.write("\r\n");
      out.write("        <!-- Categories Start -->\r\n");
      out.write("        <div class=\"container-fluid pt-5\">\r\n");
      out.write("            <h2 class=\"section-title position-relative text-uppercase mx-xl-5 mb-4\"><span class=\"bg-secondary pr-3\">Categories</span></h2>\r\n");
      out.write("            <div class=\"row px-xl-5 pb-3\">\r\n");
      out.write("                ");
                    for (Categorie c : cc.findAll()) {
                
      out.write("\r\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-sm-6 pb-1\">\r\n");
      out.write("                    <a class=\"text-decoration-none\" href=\"\">\r\n");
      out.write("                        <div class=\"cat-item d-flex align-items-center mb-4\">\r\n");
      out.write("                            <div class=\"overflow-hidden\" style=\"width: 100px; height: 100px;\">\r\n");
      out.write("                                <img class=\"img-fluid\" src=\"img/catnotyet.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"flex-fill pl-3\">\r\n");
      out.write("                                <h6>");
      out.print(c.getNom());
      out.write("</h6>\r\n");
      out.write("                                <small class=\"text-body\">");
      out.print((new CategorieDTO(c)).getProduits());
      out.write(" Products</small>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Categories End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Products Start -->\r\n");
      out.write("        <div class=\"container-fluid pt-5 pb-3\">\r\n");
      out.write("            <h2 class=\"section-title position-relative text-uppercase mx-xl-5 mb-4\"><span class=\"bg-secondary pr-3\">Featured Products</span></h2>\r\n");
      out.write("            <div id=\"featuredProduit\" class=\"row px-xl-5\">\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Products End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Offer Start -->\r\n");
      out.write("        <div class=\"container-fluid pt-5 pb-3\">\r\n");
      out.write("            <div id=\"reduction2\" class=\"row px-xl-5\">\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Offer End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Products Start -->\r\n");
      out.write("        <div class=\"container-fluid pt-5 pb-3\">\r\n");
      out.write("            <h2 class=\"section-title position-relative text-uppercase mx-xl-5 mb-4\"><span class=\"bg-secondary pr-3\">Recent Products</span></h2>\r\n");
      out.write("            <div id=\"recentProduit\" class=\"row px-xl-5\">\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Products End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Vendor Start -->\r\n");
      out.write("        <div class=\"container-fluid py-5\">\r\n");
      out.write("            <div class=\"row px-xl-5\">\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                    <div class=\"owl-carousel vendor-carousel\">\r\n");
      out.write("                        <div class=\"bg-light p-4\">\r\n");
      out.write("                            <img src=\"img/vendor-1.jpg\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"bg-light p-4\">\r\n");
      out.write("                            <img src=\"img/vendor-2.jpg\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"bg-light p-4\">\r\n");
      out.write("                            <img src=\"img/vendor-3.jpg\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"bg-light p-4\">\r\n");
      out.write("                            <img src=\"img/vendor-4.jpg\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"bg-light p-4\">\r\n");
      out.write("                            <img src=\"img/vendor-5.jpg\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"bg-light p-4\">\r\n");
      out.write("                            <img src=\"img/vendor-6.jpg\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"bg-light p-4\">\r\n");
      out.write("                            <img src=\"img/vendor-7.jpg\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"bg-light p-4\">\r\n");
      out.write("                            <img src=\"img/vendor-8.jpg\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Vendor End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Footer Start -->\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Footer Start -->\n");
      out.write("<div class=\"container-fluid bg-dark text-secondary mt-5 pt-5\">\n");
      out.write("    <div class=\"row px-xl-5 pt-5\">\n");
      out.write("        <div class=\"col-lg-4 col-md-12 mb-5 pr-3 pr-xl-5\">\n");
      out.write("            <h5 class=\"text-secondary text-uppercase mb-4\">Get In Touch</h5>\n");
      out.write("            <p class=\"mb-4\">No dolore ipsum accusam no lorem. Invidunt sed clita kasd clita et et dolor sed dolor. Rebum tempor no vero est magna amet no</p>\n");
      out.write("            <p class=\"mb-2\"><i class=\"fa fa-map-marker-alt text-primary mr-3\"></i>123 Street, New York, USA</p>\n");
      out.write("            <p class=\"mb-2\"><i class=\"fa fa-envelope text-primary mr-3\"></i>info@example.com</p>\n");
      out.write("            <p class=\"mb-0\"><i class=\"fa fa-phone-alt text-primary mr-3\"></i>+012 345 67890</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-8 col-md-12\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 mb-5\">\n");
      out.write("                    <h5 class=\"text-secondary text-uppercase mb-4\">Quick Shop</h5>\n");
      out.write("                    <div class=\"d-flex flex-column justify-content-start\">\n");
      out.write("                        <a class=\"text-secondary mb-2\" href=\"indexClient.jsp\"><i class=\"fa fa-angle-right mr-2\"></i>Home</a>\n");
      out.write("                        <a class=\"text-secondary mb-2\" href=\"shop.jsp\"><i class=\"fa fa-angle-right mr-2\"></i>Our Shop</a>\n");
      out.write("                        <a class=\"text-secondary mb-2\" href=\"shop.jsp\"><i class=\"fa fa-angle-right mr-2\"></i>Shop Detail</a>\n");
      out.write("                        <a class=\"text-secondary\" href=\"contact.jsp\"><i class=\"fa fa-angle-right mr-2\"></i>Contact Us</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 mb-5\">\n");
      out.write("                    <h5 class=\"text-secondary text-uppercase mb-4\">My Account</h5>\n");
      out.write("                    <div class=\"d-flex flex-column justify-content-start\">\n");
      out.write("                        <a class=\"text-secondary mb-2\" href=\"indexClient.jsp\"><i class=\"fa fa-angle-right mr-2\"></i>Home</a>\n");
      out.write("                        <a class=\"text-secondary mb-2\" href=\"shop.jsp\"><i class=\"fa fa-angle-right mr-2\"></i>Our Shop</a>\n");
      out.write("                        <a class=\"text-secondary mb-2\" href=\"shop.jsp\"><i class=\"fa fa-angle-right mr-2\"></i>Shop Detail</a>\n");
      out.write("                        <a class=\"text-secondary\" href=\"contact.jsp\"><i class=\"fa fa-angle-right mr-2\"></i>Contact Us</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 mb-5\">\n");
      out.write("                    <h5 class=\"text-secondary text-uppercase mb-4\">Newsletter</h5>\n");
      out.write("                    <p>Duo stet tempor ipsum sit amet magna ipsum tempor est</p>\n");
      out.write("                    <form action=\"\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Your Email Address\">\n");
      out.write("                            <div class=\"input-group-append\">\n");
      out.write("                                <button class=\"btn btn-primary\">Sign Up</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <h6 class=\"text-secondary text-uppercase mt-4 mb-3\">Follow Us</h6>\n");
      out.write("                    <div class=\"d-flex\">\n");
      out.write("                        <a class=\"btn btn-primary btn-square mr-2\" href=\"#\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                        <a class=\"btn btn-primary btn-square mr-2\" href=\"#\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                        <a class=\"btn btn-primary btn-square mr-2\" href=\"#\"><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("                        <a class=\"btn btn-primary btn-square\" href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row border-top mx-xl-5 py-4\" style=\"border-color: rgba(256, 256, 256, .1) !important;\">\n");
      out.write("        <div class=\"col-md-6 px-xl-0\">\n");
      out.write("            <p class=\"mb-md-0 text-center text-md-left text-secondary\">\n");
      out.write("                &copy; <a class=\"text-primary\" href=\"#\">Domain</a>. All Rights Reserved. Designed\n");
      out.write("                by\n");
      out.write("                <a class=\"text-primary\" href=\"https://htmlcodex.com\">HTML Codex</a>\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6 px-xl-0 text-center text-md-right\">\n");
      out.write("            <img class=\"img-fluid\" src=\"img/payments.png\" alt=\"\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- Footer End -->\n");
      out.write("<script src=\"js/popUp.js\"></script>\n");
      out.write("\r\n");
      out.write("        <!-- Footer End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Back to Top -->\r\n");
      out.write("        <a href=\"#\" class=\"btn btn-primary back-to-top\"><i class=\"fa fa-angle-double-up\"></i></a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- JavaScript Libraries -->\r\n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <script src=\"lib/easing/easing.min.js\"></script>\r\n");
      out.write("        <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Contact Javascript File -->\r\n");
      out.write("        <script src=\"mail/jqBootstrapValidation.min.js\"></script>\r\n");
      out.write("        <script src=\"mail/contact.js\"></script>\r\n");
      out.write("        <script src=\"js/remplirOffre.js\"></script>\r\n");
      out.write("        <script src=\"js/remplirReduction1et2.js\"></script>\r\n");
      out.write("        <script src=\"js/remplirProduit.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Template Javascript -->\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
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
