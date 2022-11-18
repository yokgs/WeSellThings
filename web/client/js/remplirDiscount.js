
function remplirDiscount(titre, discount, img) {
   return '<div class="row"><div class="col-md-6"><div class="detail-box"><h2>'+titre+'</h2><h2 class="main_heading">'+discount+'</h2><div class=""><a href="">Buy Now</a></div></div></div><div class="col-md-6"><div class="img-box"><img src='+img+' alt=""></div></div></div>';
}
window.remplirDiscount = remplirDiscount;