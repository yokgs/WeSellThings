<%-- 
    Document   : shop
    Created on : 25 nov. 2022, 00:01:12
    Author     : lenovo
--%>

<%@page import="dto.MarqueDTO"%>
<%@page import="service.MarqueService"%>
<%@page import="java.util.ArrayList"%>
<%@page import="service.ProduitService"%>
<%@page import="entities.Produit"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="isLoggedIn.jsp" %>
<!DOCTYPE html>

<html lang="en">

    <head>
        <meta charset="utf-8">
        <title>MultiShop - Online Shop Website Template</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="Free HTML Templates" name="keywords">
        <meta content="Free HTML Templates" name="description">

        <!-- Favicon -->
        <link href="img/favicon.ico" rel="icon">

        <!-- Google Web Fonts -->
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">  

        <!-- Font Awesome -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">

        <!-- Libraries Stylesheet -->
        <link href="lib/animate/animate.min.css" rel="stylesheet">
        <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

        <!-- Customized Bootstrap Stylesheet -->
        <link href="css/style.css" rel="stylesheet">
    </head>

    <body>


        <!-- Header(Top bar and navbar) Start -->
        <%@include file="header.jsp" %>
        <!-- Header End -->

        <!-- Breadcrumb Start -->
        <div class="container-fluid">
            <div class="row px-xl-5">
                <div class="col-12">
                    <nav class="breadcrumb bg-light mb-30">
                        <a class="breadcrumb-item text-dark" href="indexClient.jsp">Home</a>
                        <span class="breadcrumb-item active">Shop</span>
                        
                    </nav>
                </div>
            </div>
        </div>
        <!-- Breadcrumb End -->


        <!-- Shop Start -->
        <div class="container-fluid">
            <div class="row px-xl-5">
                <!-- Shop Sidebar Start -->
                <div class="col-lg-3 col-md-4">
                    <!-- Price Start -->
                    <h5 class="section-title position-relative text-uppercase mb-3"><span class="bg-secondary pr-3">Filter by price</span></h5>
                    <div class="bg-light p-4 mb-30">
                        <form>
                            <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                <input type="checkbox" class="custom-control-input" checked id="price-all">
                                <label class="custom-control-label" for="price-all">All Price</label>
                                <span class="badge border font-weight-normal">1000</span>
                            </div>
                            <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                <input type="checkbox" class="custom-control-input" id="price-1">
                                <label class="custom-control-label" for="price-1">$0 - $100</label>
                                <span class="badge border font-weight-normal">150</span>
                            </div>
                            <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                <input type="checkbox" class="custom-control-input" id="price-2">
                                <label class="custom-control-label" for="price-2">$100 - $200</label>
                                <span class="badge border font-weight-normal">295</span>
                            </div>
                            <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                <input type="checkbox" class="custom-control-input" id="price-3">
                                <label class="custom-control-label" for="price-3">$200 - $300</label>
                                <span class="badge border font-weight-normal">246</span>
                            </div>
                            <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                <input type="checkbox" class="custom-control-input" id="price-4">
                                <label class="custom-control-label" for="price-4">$300 - $400</label>
                                <span class="badge border font-weight-normal">145</span>
                            </div>
                            <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between">
                                <input type="checkbox" class="custom-control-input" id="price-5">
                                <label class="custom-control-label" for="price-5">$400 - $500</label>
                                <span class="badge border font-weight-normal">168</span>
                            </div>
                        </form>
                    </div>
                    <!-- Price End -->

                    <!-- Marque Start -->
                                            <%                                                    MarqueService ms = new MarqueService();
                            ProduitService ps = new ProduitService();

                        %>
                    <h5 class="section-title position-relative text-uppercase mb-3"><span class="bg-secondary pr-3">Filter by marque</span></h5>
                    <div class="bg-light p-4 mb-30">
                        <form>
                            <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                <input type="checkbox" class="custom-control-input" checked id="color-all">
                                <label class="custom-control-label" for="price-all">All Marque</label>
                                <span class="badge border font-weight-normal"><%=ps.findAll().size()%></span>
                            </div>
                            <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                <input onclick="document.location = 'shop.jsp?marque=2'" type="checkbox" class="custom-control-input" id="color-1">
                                <label class="custom-control-label" for="color-1"><%=ms.findById(2).getNom()%></label>
                                <span class="badge border font-weight-normal"><%=(new MarqueDTO(ms.findById(2)).getProduits())%></span>
                            </div>
                            <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                <input type="checkbox" class="custom-control-input" id="color-2">
                                <label class="custom-control-label" for="color-2"><%=ms.findById(3).getNom()%></label>
                                <span class="badge border font-weight-normal"><%=(new MarqueDTO(ms.findById(3)).getProduits())%></span>
                            </div>
                            <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                <input type="checkbox" class="custom-control-input" id="color-3">
                                <label class="custom-control-label" for="color-3"><%=ms.findById(4).getNom()%></label>
                                <span class="badge border font-weight-normal"><%=(new MarqueDTO(ms.findById(4)).getProduits())%></span>
                            </div>
                            <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                <input type="checkbox" class="custom-control-input" id="color-4">
                                <label class="custom-control-label" for="color-4"><%=ms.findById(5).getNom()%></label>
                                <span class="badge border font-weight-normal"><%=(new MarqueDTO(ms.findById(5)).getProduits())%></span>
                            </div>
                            <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between">
                                <input type="checkbox" class="custom-control-input" id="color-5">
                                <label class="custom-control-label" for="color-5"><%=ms.findById(6).getNom()%></label>
                                <span class="badge border font-weight-normal"><%=(new MarqueDTO(ms.findById(6)).getProduits())%></span>
                            </div>
                        </form>
                    </div>
                    <!-- Marque End -->


                </div>
                <!-- Shop Sidebar End -->


                <!-- Shop Product Start -->
                <div class="col-lg-9 col-md-8">
                    <div class="row pb-3">
                        <div class="col-12 pb-1">
                            <div class="d-flex align-items-center justify-content-between mb-4">
                                <div>
                                    <button class="btn btn-sm btn-light"><i class="fa fa-th-large"></i></button>
                                    <button class="btn btn-sm btn-light ml-2"><i class="fa fa-bars"></i></button>
                                </div>
                                <div class="ml-2">
                                    <div class="btn-group">
                                        <button type="button" class="btn btn-sm btn-light dropdown-toggle" data-toggle="dropdown">Sorting</button>
                                        <div class="dropdown-menu dropdown-menu-right">
                                            <a class="dropdown-item" href="#">Latest</a>
                                            <a class="dropdown-item" href="#">Popularity</a>
                                            <a class="dropdown-item" href="#">Best Rating</a>
                                        </div>
                                    </div>
                                    <div class="btn-group ml-2">
                                        <button type="button" class="btn btn-sm btn-light dropdown-toggle" data-toggle="dropdown">Showing</button>
                                        <div class="dropdown-menu dropdown-menu-right">
                                            <a class="dropdown-item" href="#">10</a>
                                            <a class="dropdown-item" href="#">20</a>
                                            <a class="dropdown-item" href="#">30</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                                                <div id="produit-s" class="row px-xl-5">
                            <% List<Produit> prds = new ArrayList<>();
                                if (request.getParameter("categorie") != null) {

                                    Categorie c
                                            = cs.findById(Integer.parseInt(request.getParameter("categorie")));
                                    prds = c.getProduits();
                                } else {
                                    prds = (new ProduitService()).findAll();
                                }
                                for (Produit p : prds) {
                            %>
                            <div class="col-lg-3 col-md-4 col-sm-6 pb-1">
                                <div class="product-item bg-light mb-4">
                                    <div
                                        class="product-img position-relative overflow-hidden">
                                        <img class="img-fluid w-100" src="img/notyet.jpg"
                                             alt="">
                                        <div class="product-action"><a
                                                class="btn btn-outline-dark btn-square"
                                                href="produit.jsp?id=<%= p.getId()%>"><i
                                                    class="fa fa-shopping-cart"></i></a><a
                                                class="btn btn-outline-dark btn-square"
                                                href=""><i
                                                    class="far fa-heart"></i></a><a
                                                class="btn btn-outline-dark btn-square"
                                                href=""><i
                                                    class="fa fa-sync-alt"></i></a><a
                                                class="btn btn-outline-dark btn-square"
                                                href=""><i class="fa fa-search"></i></a>
                                        </div>
                                    </div>
                                    <div class="text-center py-4"><a
                                            class="h6 text-decoration-none text-truncate"
                                            href="produit.jsp?id=<%= p.getId()%>">
                                            <%= p.getNom()%>
                                        </a>
                                        <div
                                            class="d-flex align-items-center justify-content-center mt-2">
                                            <h5><%= p.getPrix()%>$</h5>
                                            <h6 class="text-muted ml-2"><del><%= p.getPrix() + 50%>$</del></h6>
                                        </div>
                                        <div
                                            class="d-flex align-items-center justify-content-center mb-1">
                                            <small
                                                class="fa fa-star text-primary mr-1"></small><small
                                                class="fa fa-star text-primary mr-1"></small><small
                                                class="fa fa-star text-primary mr-1"></small><small
                                                class="fa fa-star text-primary mr-1"></small><small
                                                class="fa fa-star text-primary mr-1"></small><small>55</small>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <% }%>


                        </div>


                        <div class="col-12">
                            <nav>
                                <ul class="pagination justify-content-center">
                                    <li class="page-item disabled"><a class="page-link" href="#">Previous</span></a></li>
                                    <li class="page-item active"><a class="page-link" href="#">1</a></li>
                                    <li class="page-item"><a class="page-link" href="#">2</a></li>
                                    <li class="page-item"><a class="page-link" href="#">3</a></li>
                                    <li class="page-item"><a class="page-link" href="#">Next</a></li>
                                </ul>
                            </nav>
                        </div>
                    </div>
                </div>
                <!-- Shop Product End -->
            </div>
        </div>
        <!-- Shop End -->


        <!-- Footer Start -->
        <%@include file="footer.jsp" %>
        <!-- Footer End -->

        <!-- Back to Top -->
        <a href="#" class="btn btn-primary back-to-top"><i class="fa fa-angle-double-up"></i></a>


        <!-- JavaScript Libraries -->
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
        <script src="lib/easing/easing.min.js"></script>
        <script src="lib/owlcarousel/owl.carousel.min.js"></script>

        <!-- Contact Javascript File -->
        <script src="mail/jqBootstrapValidation.min.js"></script>
        <script src="mail/contact.js"></script>
        <script src="js/remplirProduit.js"></script>

        <!-- Template Javascript -->
        <script src="js/main.js"></script>
    </body>

</html>
