<%-- 
    Document   : index
    Created on : 23 nov. 2022, 21:14:59
    Author     : lenovo
--%>

<%@page import="dto.CategorieDTO"%>
<%@page import="entities.Client"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <title>WeSellThings</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="Plateforme de vente" name="keywords">
        <meta content="Plateforme de vente" name="description">
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
        <link href="css/newcss.css" rel="stylesheet" type="text/css"/>
        <link href="css/poUp.css" rel="stylesheet">
    </head>

    <body>



        <div class="popup" id="popup-1">
            <div class="content">
                <div class="close-btn" onclick="togglePopup()">
                    ×</div>

                <h1 class="text-white">Sign in</h1> 
                <div class="input-field"><input placeholder="Email" class="validate"></div>
                <div class="input-field"><input placeholder="Password" class="validate"></div>
                <button class="second-button">Sign in</button>
                <p class="text-white">Don't have an account? <a href="/signup.html">Sign Up</a></p>


            </div>
        </div>



        <!-- Header(Top bar and navbar) Start -->
        <%@include file="header.jsp" %>
        <!-- Header End -->
        <!-- Carousel Start -->
        <div class="container-fluid mb-3">
            <div class="row px-xl-5">
                <div class="col-lg-8">
                    <div id="header-carousel" class="carousel slide carousel-fade mb-30 mb-lg-0" data-ride="carousel">
                        <ol class="carousel-indicators">
                            <li data-target="#header-carousel" data-slide-to="0" class="active"></li>
                            <li data-target="#header-carousel" data-slide-to="1"></li>
                            <li data-target="#header-carousel" data-slide-to="2"></li>
                        </ol>

                        <div class="carousel-inner" id ="produits1">

                        </div>
                    </div>
                </div>
                <div id="reduction1" class="col-lg-4">


                </div>
            </div>
        </div>
        <!-- Carousel End -->


        <!-- Featured Start -->
        <div class="container-fluid pt-5">
            <div class="row px-xl-5 pb-3">
                <div class="col-lg-3 col-md-6 col-sm-12 pb-1">
                    <div class="d-flex align-items-center bg-light mb-4" style="padding: 30px;">
                        <h1 class="fa fa-check text-primary m-0 mr-3"></h1>
                        <h5 class="font-weight-semi-bold m-0">Quality Product</h5>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 col-sm-12 pb-1">
                    <div class="d-flex align-items-center bg-light mb-4" style="padding: 30px;">
                        <h1 class="fa fa-shipping-fast text-primary m-0 mr-2"></h1>
                        <h5 class="font-weight-semi-bold m-0">Free Shipping</h5>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 col-sm-12 pb-1">
                    <div class="d-flex align-items-center bg-light mb-4" style="padding: 30px;">
                        <h1 class="fas fa-exchange-alt text-primary m-0 mr-3"></h1>
                        <h5 class="font-weight-semi-bold m-0">14-Day Return</h5>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 col-sm-12 pb-1">
                    <div class="d-flex align-items-center bg-light mb-4" style="padding: 30px;">
                        <h1 class="fa fa-phone-volume text-primary m-0 mr-3"></h1>
                        <h5 class="font-weight-semi-bold m-0">24/7 Support</h5>
                    </div>
                </div>
            </div>
        </div>
        <!-- Featured End -->

        <%            CategorieService cc = new CategorieService();

        %>
        <!-- Categories Start -->
        <div class="container-fluid pt-5">
            <h2 class="section-title position-relative text-uppercase mx-xl-5 mb-4"><span class="bg-secondary pr-3">Categories</span></h2>
            <div class="row px-xl-5 pb-3">
                <%                    for (Categorie c : cc.findAll()) {
                %>
                <div class="col-lg-3 col-md-4 col-sm-6 pb-1">
                    <a class="text-decoration-none" href="">
                        <div class="cat-item d-flex align-items-center mb-4">
                            <div class="overflow-hidden" style="width: 100px; height: 100px;">
                                <img class="img-fluid" src="img/catnotyet.jpg" alt="">
                            </div>
                            <div class="flex-fill pl-3">
                                <h6><%=c.getNom()%></h6>
                                <small class="text-body"><%=(new CategorieDTO(c)).getProduits()%> Products</small>
                            </div>
                        </div>
                    </a>
                </div>
                <% }%>







            </div>
        </div>
        <!-- Categories End -->


        <!-- Products Start -->
        <div class="container-fluid pt-5 pb-3">
            <h2 class="section-title position-relative text-uppercase mx-xl-5 mb-4"><span class="bg-secondary pr-3">Featured Products</span></h2>
            <div id="featuredProduit" class="row px-xl-5">

            </div>
        </div>
        <!-- Products End -->


        <!-- Offer Start -->
        <div class="container-fluid pt-5 pb-3">
            <div id="reduction2" class="row px-xl-5">

            </div>
        </div>
        <!-- Offer End -->


        <!-- Products Start -->
        <div class="container-fluid pt-5 pb-3">
            <h2 class="section-title position-relative text-uppercase mx-xl-5 mb-4"><span class="bg-secondary pr-3">Recent Products</span></h2>
            <div id="recentProduit" class="row px-xl-5">

            </div>
        </div>
        <!-- Products End -->


        <!-- Vendor Start -->
        <div class="container-fluid py-5">
            <div class="row px-xl-5">
                <div class="col">
                    <div class="owl-carousel vendor-carousel">
                        <div class="bg-light p-4">
                            <img src="img/vendor-1.jpg" alt="">
                        </div>
                        <div class="bg-light p-4">
                            <img src="img/vendor-2.jpg" alt="">
                        </div>
                        <div class="bg-light p-4">
                            <img src="img/vendor-3.jpg" alt="">
                        </div>
                        <div class="bg-light p-4">
                            <img src="img/vendor-4.jpg" alt="">
                        </div>
                        <div class="bg-light p-4">
                            <img src="img/vendor-5.jpg" alt="">
                        </div>
                        <div class="bg-light p-4">
                            <img src="img/vendor-6.jpg" alt="">
                        </div>
                        <div class="bg-light p-4">
                            <img src="img/vendor-7.jpg" alt="">
                        </div>
                        <div class="bg-light p-4">
                            <img src="img/vendor-8.jpg" alt="">
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Vendor End -->


        <!-- Footer Start -->
        <%@include file="footer.jsp" %>
        <!-- Footer End -->


        <!-- Back to Top -->
        <a href="#" class="btn btn-primary back-to-top"><i class="fa fa-angle-double-up"></i></a>


        <!-- JavaScript Libraries -->
        <script src="js/jquery-3.3.1.min.js"></script>

        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
        <script src="lib/easing/easing.min.js"></script>
        <script src="lib/owlcarousel/owl.carousel.min.js"></script>


        <!-- Contact Javascript File -->
        <script src="mail/jqBootstrapValidation.min.js"></script>
        <script src="mail/contact.js"></script>
        <script src="js/remplirOffre.js"></script>
        <script src="js/remplirReduction1et2.js"></script>
        <script src="js/remplirProduit.js"></script>

        <!-- Template Javascript -->
        <script src="js/main.js"></script>



    </body>

</html>