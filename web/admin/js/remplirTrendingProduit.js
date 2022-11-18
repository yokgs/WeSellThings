

function remplirNumTitreProduit(num, titre, target, ison) {
    let on = ison ? '' : 'collapsed';
    return '<div class="t-link-box ' + on + '" data-toggle="collapse" data-target="#' + target + '" aria-expanded="'+ison+'" aria-controls="' + target + '"><div class="number"><h5>0' + num + '</h5></div><hr><div class="t-name"><h5>' + titre + '</h5></div></div>';
}
function remplirImgProduit(img1, img2, img3, img4, target, ison) {
    let on = ison ? 'show' : '';
    return '<div class="collapse ' + on + '" id="' + target + '" aria-labelledby="headingOne" data-parent="#accordion"><div class="img_container "><div class="box b-1"><div class="img-box"><img src=' + img1 + ' alt=""></div><div class="img-box"><img src=' + img2 + ' alt=""></div></div><div class="box b-2"><div class="img-box"><img src=' + img3 + ' alt=""></div><div class="img-box"><img src=' + img4 + ' alt=""></div></div></div></div>';
}


window.remplirNumTitreProduit = remplirNumTitreProduit;
window.remplirImgProduit = remplirImgProduit;