var ajax = [
    {
        image: 'img/blackfriday.jpg',
        titre: "BlackFriday",
        description: "Profitez de la promo, c'est parti",
        url : '*'
    },
    {
        image: 'img/carousel-1.jpg',
        titre: "Théme 2",
        description: "blablablablablabla2",
        url : '**'
    },
    {
        image: 'img/carousel-3.jpg',
        titre: "Théme 3",
        description: "blablablablablabla3",
        url : '***'
    }
]


function remplirProduits1(image, titre, description, ibool,url) {
    let bool = ibool ? 'active' : '';
return '<div class="carousel-item position-relative '+bool+'" style="height: 430px;"><img class="position-absolute w-100 h-100" src='+image+ ' style="object-fit: cover;"><div class="carousel-caption d-flex flex-column align-items-center justify-content-center"><div class="p-3" style="max-width: 700px;"><h1 class="display-4 text-white mb-3 animate__animated animate__fadeInDown">'+titre+'</h1><p class="mx-md-5 px-5 animate__animated animate__bounceIn">'+description+'</p><a class="btn btn-outline-light py-2 px-4 mt-3 animate__animated animate__fadeInUp" href="'+url+'">Shop Now</a></div></div></div>';
}
window.remplirProduits1 = remplirProduits1;


function remplirProduits1args(data) {
    var html = "";
    data.forEach(function (x,i) {
        html += remplirProduits1(x.image, x.titre, x.description,i==0,x.url);
        i++;
    });
    $("#produits1").html(html);
}
remplirProduits1args(ajax);







// function remplirProduits1(image, titre, description, ibool) {
//     let num=7;
//     let bool = ibool ? 'active' : '';
//     let xi ='<li data-target="#header-carousel" data-slide-to=0 class="active"></li>';
//     for(let j=1;j>num;j++){   
//     let di = '<li data-target="#header-carousel" data-slide-to='+j+'></li>';
//     xi = xi+di;
//     }
// return '<div class="carousel slide carousel-fade mb-30 mb-lg-0" data-ride="carousel"><ol class="carousel-indicators">'+xi+'</ol><div class="carousel-inner" ><div class="carousel-item position-relative '+bool+'" style="height: 430px;"><img class="position-absolute w-100 h-100" src="'+image+ '" style="object-fit: cover;"><div class="carousel-caption d-flex flex-column align-items-center justify-content-center"><div class="p-3" style="max-width: 700px;"><h1 class="display-4 text-white mb-3 animate__animated animate__fadeInDown">'+titre+'</h1><p class="mx-md-5 px-5 animate__animated animate__bounceIn">'+description+'</p><a class="btn btn-outline-light py-2 px-4 mt-3 animate__animated animate__fadeInUp" href="#">Shop Now</a></div></div></div></div></div>';
// }
// window.remplirProduits1 = remplirProduits1;

// function remplirNumProduits1args(data) {
//     var html = "";
//     data.forEach(function (i) {
//         html += remplirNumProduits1(i,i==0);
//         i++;
//     });
//     $("#numProduits1").html(html);
// }
// remplirNumProduits1args(ajax22);

// var ajax22 = [
//     {
//         i:0
//     },
//     {
//         i:1
//     },
//     {
//        i:2
//     }
// ]

// function remplirNumProduits1(i,ibool) {
//     i=0;
//     let bool = ibool ? 'active' : '';
//     let mx = 'class="'+bool+'"';
// return '<ol class="carousel-indicators"><li data-target="#header-carousel" data-slide-to="'+(i++)+'" '+mx+'></li></ol>';
// }
// window.remplirNumProduits1 = remplirNumProduits1;