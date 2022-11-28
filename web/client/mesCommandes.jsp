<%-- 
    Document   : mesCommandes
    Created on : 28 nov. 2022, 14:27:31
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
                        <a class="breadcrumb-item text-dark" href="indexClient.jsp">Mon compte</a>
                        <span class="breadcrumb-item active">Mes commandes</span>
                    </nav>
                </div>
            </div>
        </div>
        <!-- Breadcrumb End -->


        <!-- Cart Start -->
        <div class="container-fluid">
            <div class="row px-xl-5">
                <div class="col-lg-16 table-responsive mb-30">
                    <table class="table table-light table-borderless table-hover text-center mb-0">
                        <thead class="thead-dark">
                            <tr>
                                <th>Commande (#)</th>
                                <th>Date  d'achat</th>
                                <th>Prix  total </th>
                                <th>Etat</th>
                                <th>detail</th>


                            </tr>
                        </thead>


                        <tbody class="align-middle">
                            <tr>

                                <td class="align-middle">W1324GFG8765G</td>
                                <td class="align-middle">2022/06/07</td> 
                                <td class="align-middle">699$</td>
                                <td class="align-middle">En cours de la revision</td>
                                <td class="align-middle"><a href='detailCommande.jsp' class="btn btn-sm btn-info"><i class="fa fa-info"></i></a></td>

                            </tr>
                        </tbody>
                    </table>
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

