var ajax1 = [
    {
        id: 1,
        nom: "produit",
        image: 'img/product-1.jpg',
        prix: 100,
        nbrVotes: '199'
    },
    {
        id: 2,
        nom: "produit",
        image: 'img/product-4.jpg',
        prix: 21,
        nbrVotes: '199'
    },
    {
        id: 3,
        nom: "produit",
        image: 'img/product-2.jpg',
        prix: 35,
        nbrVotes: '199'
    },
    {
        id: 4,
        nom: "produit",
        image: 'img/product-6.jpg',
        prix: 566,
        nbrVotes: '199'
    }
]

//function remplirProduit(image, siteProduit,titre, prix,prePrix, nbrVotes) {;
//    
//return '<div class="col-lg-3 col-md-4 col-sm-6 pb-1"><div class="product-item bg-light mb-4"><div class="product-img position-relative overflow-hidden"><img class="img-fluid w-100" src="'+image+'" alt=""><div class="product-action"><a class="btn btn-outline-dark btn-square" href="'+siteProduit+'"><i class="fa fa-shopping-cart"></i></a><a class="btn btn-outline-dark btn-square" href=""><i class="far fa-heart"></i></a><a class="btn btn-outline-dark btn-square" href=""><i class="fa fa-sync-alt"></i></a><a class="btn btn-outline-dark btn-square" href=""><i class="fa fa-search"></i></a></div></div><div class="text-center py-4"><a class="h6 text-decoration-none text-truncate" href="'+siteProduit+'">'+titre+'</a><div class="d-flex align-items-center justify-content-center mt-2"><h5>'+prix+'</h5><h6 class="text-muted ml-2"><del>'+prePrix+'</del></h6></div><div class="d-flex align-items-center justify-content-center mb-1"><small class="fa fa-star text-primary mr-1"></small><small class="fa fa-star text-primary mr-1"></small><small class="fa fa-star text-primary mr-1"></small><small class="fa fa-star text-primary mr-1"></small><small class="fa fa-star text-primary mr-1"></small><small>('+nbrVotes+')</small></div></div></div></div>';
//}
function remplirProduit(id, nom, description, designation, image, prix, unite, categorie_id, marque_id, nbrVotes) {

    return '<div class="col-lg-3 col-md-4 col-sm-6 pb-1"><div class="product-item bg-light mb-4"><div class="product-img position-relative overflow-hidden"><img class="img-fluid w-100" src="' + image + '" alt=""><div class="product-action"><a class="btn btn-outline-dark btn-square" href="produit.jsp?id=' + id + '"><i class="fa fa-shopping-cart"></i></a><a class="btn btn-outline-dark btn-square" href=""><i class="far fa-heart"></i></a><a class="btn btn-outline-dark btn-square" href=""><i class="fa fa-sync-alt"></i></a><a class="btn btn-outline-dark btn-square" href=""><i class="fa fa-search"></i></a></div></div><div class="text-center py-4"><a class="h6 text-decoration-none text-truncate" href="produit.jsp?id=' + id + '">' + nom + '</a><div class="d-flex align-items-center justify-content-center mt-2"><h5>' + prix + '$</h5><h6 class="text-muted ml-2"><del>' + (prix + 40) + '$</del></h6></div><div class="d-flex align-items-center justify-content-center mb-1"><small class="fa fa-star text-primary mr-1"></small><small class="fa fa-star text-primary mr-1"></small><small class="fa fa-star text-primary mr-1"></small><small class="fa fa-star text-primary mr-1"></small><small class="fa fa-star text-primary mr-1"></small><small>(' + nbrVotes + ')</small></div></div></div></div>';
}
window.remplirProduit = remplirProduit;

function remplirProduit1args(compId, data) {
    var html = "";
    data.forEach(function (x) {
        html += remplirProduit(x.id, x.nom, x.description, x.designation, "img/notyet.jpg", x.prix, x.unite, x.categorie, x.marque, x.nbrVotes);
    });
    $(compId).html(html);
}

$.ajax({
    url: '/produit',
    method: 'GET',
    success: function (data) {
        remplirProduit1args("#featuredProduit", data);
        remplirProduit1args("#recentProduit", data);
        remplirProduit1args("#produits", data);
    }
});

