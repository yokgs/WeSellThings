
var ajax1 = [
    {
        image: 'img/cap.webp',
        titreReduction: "reduction 80%",
        titre: "Black cap",
        url : '*'
    },
    {
        image: 'img/ecouteurs.webp',
        titreReduction: "reduction 60%",
        titre: "Airpods dial jumia",
        url : '**'
    }
]
var ajax2 = [
    {
        image: 'img/ensemble.webp',
        titreReduction: "jacketa hotgam",
        titre: "3000 DH",
        url : '**'
    },
    {
        image: 'img/glasses1.jpg',
        titreReduction: "Ndader d'ilyass lmalki",
        titre: "10 DH",
        url : '**'
    }
]

function remplirReduction1(image,titreReduction, titre, url) {

return '<div class="product-offer mb-30" style="height: 200px;"><img class="img-fluid" src="'+image+'" alt=""><div class="offer-text"><h6 class="text-white text-uppercase">'+titreReduction+'</h6><h3 class="text-white mb-3">'+titre+'</h3><a href="'+url+'" class="btn btn-primary">Shop Now</a></div></div>';

}
window.remplirReduction1 = remplirReduction1;

    function remplirReduction1Args(data) {
        var html = "";
        data.forEach(function (x) {
            html += remplirReduction1(x.image, x.titreReduction, x.titre, x.url);
        });
        $("#reduction1").html(html);
    }
    remplirReduction1Args(ajax1);





function remplirReduction2(image,titreReduction, titre, url) {

return '<div class="col-md-6"><div class="product-offer mb-30" style="height: 300px;"><img class="img-fluid" src="'+image+'" alt=""><div class="offer-text"><h6 class="text-white text-uppercase">'+titreReduction+'</h6><h3 class="text-white mb-3">'+titre+'</h3><a href="'+url+'" class="btn btn-primary">Shop Now</a></div></div></div>';
            
}
window.remplirReduction2 = remplirReduction2;


    function remplirReduction2Args(data) {
        var html = "";
        data.forEach(function (x) {
            html += remplirReduction2(x.image, x.titreReduction, x.titre, x.url);
        });
        $("#reduction2").html(html);
    }
    remplirReduction2Args(ajax2);