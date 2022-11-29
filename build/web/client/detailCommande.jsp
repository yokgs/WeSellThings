<%-- 
    Document   : detailCommande
    Created on : 28 nov. 2022, 15:48:05
    Author     : lenovo
--%>

<%@page import="entities.Produit"%>
<%@page import="service.ProduitService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <title>WeSellThings</title>
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
                        <a class="breadcrumb-item text-dark" href="#">Home</a>
                        <a class="breadcrumb-item text-dark" href="#">Shop</a>
                        <span class="breadcrumb-item active">Shopping Cart</span>
                    </nav>
                </div>
            </div>
        </div>
        <!-- Breadcrumb End -->


        <div class="col-lg-16 table-responsive mb-5">
            <table class="table table-light table-responsive text mb-0">                                     
                <tbody class="align-middle">
                    <tr>
                        <td class="align-middle">Le nom du Destinataire: Saad Baouchouch</td>
                        <td class="align-middle">Contact téléphonique: 062874468</td>
                        <td class="align-middle">Adresse de réception: 875 Lot Najah</td>
                        <td class="align-middle">courriel Electronique: saad@gmail.com</td>
                    </tr>
                    <tr>
                        <td class="align-middle">Date de commande: 26/06/2019 00:08:57 AM</td>
                        <td class="align-middle">Paiement: PayPal</td>
                        <td class="align-middle">Livraisons: BERAMHQTR</td>
                    </tr>
                    <tr>
                        <td></td>
                        
                    </tr>
                </tbody>
            </table>
        </div>


        <!-- Cart Start -->
        <div class="container-fluid">
            <div class="row px-xl-5">
                <div class="col-lg-8 table-responsive mb-5">
                    <table class="table table-light table-borderless table-hover text-center mb-0">
                        <thead>
                            <tr>
                                <th>Numero de la commande : W1324GFG8765G</th>
                            </tr>
                        </thead>
                        <thead class="thead-dark">
                            <tr>
                                <th>Produit</th>
                                <th>Prix unitaire</th>
                                <th>quantité</th>
                                <th>prix</th>  
                            </tr>
                        </thead>
                        <%
//                        ProduitService ps = new ProduitService();
//                        int id = Integer.parseInt(request.getParameter("id"));
//                        int quantite = Integer.parseInt(request.getParameter("quantite"));
//                        Produit p = ps.findById(id);
//                        String nom =p.getNom();
//                        String description =p.getDescription();
//                        String designation =p.getDesignation();
//                       // String image =p.getImage();
//                        String image = "img/notyet.jpg";
//                        double prixUni = p.getPrix();
//                        int unite =p.getUnite();
//                        double prix = quantite*prixUni;
//                        double shipping = 10;
//                        double prixTotale = prix+shipping;

                        %>


                        <tbody class="align-middle">
                            <tr>
                                <td class="align-middle"><img src="img/notyet.jpg" alt="" style="width: 50px;"> Nom</td>
                                <td class="align-middle">50$</td>
                                <td class="align-middle">2</td>
                                <td class="align-middle">100$</td>
                            </tr>
                            <tr>
                                <td class="align-middle"><img src="img/notyet.jpg" alt="" style="width: 50px;"> Nom</td>
                                <td class="align-middle">50$</td>
                                <td class="align-middle">2</td>
                                <td class="align-middle">100$</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="col-lg-4">
                    <h5 class="section-title position-relative text-uppercase mb-3"><span class="bg-secondary pr-3">Resumé de la commande</span></h5>
                    <div class="bg-light p-30 mb-5">
                        <div class="border-bottom pb-2">
                            <div class="d-flex justify-content-between mb-3">
                                <h6>Total</h6>
                                <h6>300$</h6>
                            </div>
                            <div class="d-flex justify-content-between">
                                <h6 class="font-weight-medium">Livraison</h6>
                                <h6 class="font-weight-medium">2$</h6>
                            </div>
                        </div>
                        <div class="pt-2">
                            <div class="d-flex justify-content-between mt-2">
                                <h5>Total</h5>
                                <h5>302$</h5>
                            </div>
                            <button class="btn btn-primary font-weight-bold my-2 py-3">Voir la facture</button>
                        </div>
                        <div>
                            <button class="btn btn-danger font-weight-bold my-2 py-3">Annuler la commande</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Cart End -->


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

        <!-- Template Javascript -->
        <script src="js/main.js"></script>
    </body>

</html>

