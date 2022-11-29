<%-- 
    Document   : header
    Created on : 24 nov. 2022, 23:40:26
    Author     : lenovo
--%>

<%@page import="dto.CommandeDTO"%>
<%@page import="entities.Commande"%>
<%@page import="entities.Categorie"%>
<%@page import="service.CategorieService"%>
<%@page import="entities.Client"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Topbar Start -->
<div class="container-fluid">
    <div class="row bg-secondary py-1 px-xl-5">
        <div class="col-lg-6 d-none d-lg-block">
            <div class="d-inline-flex align-items-center h-100">
                <a class="text-body mr-3" href="">About</a>
                <a class="text-body mr-3" href="">Contact</a>
                <a class="text-body mr-3" href="">Help</a>
                <a class="text-body mr-3" href="">FAQs</a>
            </div>
        </div>
        <div class="col-lg-6 text-center text-lg-right">
            <div class="d-inline-flex align-items-center">
                <%!Client c;%>
                <%
                    HttpSession s = request.getSession();
                    String client = "Mon Compte";
                    
                    try {
                        c = (Client) s.getAttribute("user-o");
                        client = c.getPrenom();
                    } catch (Exception e) {
                    }
                    if (client == null) {
                        client = "Mon Compte";
                    }
                %>
                <div class="btn-group">
                    <button type="button" class="btn btn-sm btn-light dropdown-toggle" data-toggle="dropdown"> <img class="img-fluid" src="img/client.png" alt=""><%=client%></button>                         
                    <div class="dropdown-menu dropdown-menu-right">
                        <%
                            String inOut;
                            if (client.equals("Mon Compte")) {

                        %>

                        <button onclick="document.location = 'connexion.html'" class="dropdown-item" >Se connecter</button>

                        <%} else {%>
                            <a class="dropdown-item" href="/deconnexion">Se déconnecter</a>
                        <%}%>
                        <button class="dropdown-item" type="button">Mon Profile</button>
                        <a class="dropdown-item" type="button" href="mesCommandes.jsp">Mes Commandes</a>                     
                    </div>
                </div> 
                <div class="btn-group mx-2">
                    <button type="button" class="btn btn-sm btn-light dropdown-toggle" data-toggle="dropdown">USD</button>
                    <div class="dropdown-menu dropdown-menu-right">
                        <button class="dropdown-item" type="button">EUR</button>
                        <button class="dropdown-item" type="button">GBP</button>
                        <button class="dropdown-item" type="button">CAD</button>
                    </div>
                </div>
                <div class="btn-group">
                    <button type="button" class="btn btn-sm btn-light dropdown-toggle" data-toggle="dropdown">EN</button>
                    <div class="dropdown-menu dropdown-menu-right">
                        <button class="dropdown-item" type="button">FR</button>
                        <button class="dropdown-item" type="button">AR</button>
                        <button class="dropdown-item" type="button">RU</button>
                    </div>
                </div>
            </div>
            <div class="d-inline-flex align-items-center d-block d-lg-none">
                <a href="" class="btn px-0 ml-2">
                    <i class="fas fa-heart text-dark"></i>
                    <span class="badge text-dark border border-dark rounded-circle" style="padding-bottom: 2px;">0</span>
                </a>
                <a href="" class="btn px-0 ml-2">
                    <i class="fas fa-shopping-cart text-dark"></i>
                    <span class="badge text-dark border border-dark rounded-circle" style="padding-bottom: 2px;">0</span>
                </a>
            </div>
        </div>
    </div>
    <div class="row align-items-center bg-light py-3 px-xl-5 d-none d-lg-flex">
        <div class="col-lg-4">
            <a href="indexClient.jsp" class="text-decoration-none">
                <span class="h1 text-uppercase text-primary bg-dark px-2">WE</span>
                <span class="h1 text-uppercase text-dark bg-primary px-2 ml-n1">SELLTHINGS</span>
            </a>
        </div>
        <div class="col-lg-4 col-6 text-left">
            <form action="">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="Search for products">
                    <div class="input-group-append">
                        <span class="input-group-text bg-transparent text-primary">
                            <i class="fa fa-search"></i>
                        </span>
                    </div>
                </div>
            </form>
        </div>
        <div class="col-lg-4 col-6 text-right">
            <p class="m-0">Customer Service</p>
            <h5 class="m-0">+012 345 6789</h5>
        </div>
    </div>
</div>
<!-- Topbar End -->


<!-- Navbar Start -->
<div class="container-fluid bg-dark mb-30">
    <div class="row px-xl-5">
        <div class="col-lg-3 d-none d-lg-block">
            <a class="btn d-flex align-items-center justify-content-between bg-primary w-100" data-toggle="collapse" href="#navbar-vertical" style="height: 65px; padding: 0 30px;">
                <h6 class="text-dark m-0"><i class="fa fa-bars mr-2"></i>Categories</h6>
                <i class="fa fa-angle-down text-dark"></i>
            </a>
            <%
                CategorieService cs = new CategorieService();

            %>

            <nav class="collapse position-absolute navbar navbar-vertical navbar-light align-items-start p-0 bg-light" id="navbar-vertical" style="width: calc(100% - 30px); z-index: 999;">
                <div class="navbar-nav w-100"> 

                    <%                            for (Categorie c : cs.findAll()) {
                            if (c.getSupCategorie() == null) {
                    %>
                    <div class="nav-item dropdown dropright">
                        <%
                            if (c.getCategories().size() > 0) {
                        %>
                        <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">
                            <%=c.getNom()%><i class="fa fa-angle-right float-right mt-1"></i>
                        </a>
                        <div class="dropdown-menu position-absolute rounded-0 border-0 m-0">
                            <% for (Categorie sbc : c.getCategories()) {%>
                            <a href="" class="dropdown-item"><%=sbc.getNom()%></a>
                            <% } %>
                        </div>
                        <% } else {%>
                        <a href="" class="nav-item nav-link"><%=c.getNom()%></a>
                        <%}%>
                    </div>
                    <%
                            }
                        }
                    %>

                </div>
            </nav>
        </div>
        <div class="col-lg-9">
            <nav class="navbar navbar-expand-lg bg-dark navbar-dark py-3 py-lg-0 px-0">
                <a href="" class="text-decoration-none d-block d-lg-none">
                    <span class="h1 text-uppercase text-dark bg-light px-2">Multi</span>
                    <span class="h1 text-uppercase text-light bg-primary px-2 ml-n1">Shop</span>
                </a>
                <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse justify-content-between" id="navbarCollapse">
                    <div class="navbar-nav mr-auto py-0">
                        <a href="indexClient.jsp" class="nav-item nav-link active">Home</a>
                        <a href="shop.jsp" class="nav-item nav-link">Shop</a>
                        <a href="contact.jsp" class="nav-item nav-link">Contact</a>
                    </div>
                    <div class="navbar-nav ml-auto py-0 d-none d-lg-block">
                        <a href="" class="btn px-0">
                            <i class="fas fa-heart text-primary"></i>
                            <span class="badge text-secondary border border-secondary rounded-circle" style="padding-bottom: 2px;">0</span>
                        </a>
                        <a href="cart.jsp" class="btn px-0 ml-3">
                            <i class="fas fa-shopping-cart text-primary"></i>
                            <% int amount = 0;
                            if(session.getAttribute("user-o") != null) amount = (new CommandeDTO((Commande) session.getAttribute("cart"))).getProduits();
                            %>
                            <span class="badge text-secondary border border-secondary rounded-circle" style="padding-bottom: 2px;"><%= amount %></span>
                        </a>
                    </div>
                </div>
            </nav>
        </div>
    </div>
</div>
<!-- Navbar End -->
