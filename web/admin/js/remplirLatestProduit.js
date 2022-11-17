

function remplirLatestProduit(latest, item, description, on) {
    return '<div class="carousel-item ' + on + '"><div class="row"><div class="col-md-6"><div class="detail-box"><h1>' + latest + '<span> ' + item + '</span></h1><p>' + description + '</p><div class="btn-box"><a href="" class="btn-1" >  Read More</a><a href="" class="btn-2"> Contact us</a></div></div></div><div class="col-md-6 img-container"><div class="img-box"><img src="images/slider-img.png" alt=""></div></div></div></div>';
}

window.remplirLatestProduit = remplirLatestProduit;