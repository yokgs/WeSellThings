

var ajax = [
    {
        item: "saad",
        description: "derri nadi"
    },
    {
        item: "mamon",
        description: "ki neem"
    },
    {
        item: "lachg   ar",
        description: "boss"
    },
    {
        item: "yazid",
        description: "boss"
    },
    {
        item: "lachgar",
        description: "boss"
    },
    {
        item: "yazid",
        description: "boss"
    },
    {
        item: "lachgar",
        description: "boss"
    },
    {
        item: "yazid",
        description: "boss"
    },
    {
        item: "lachgar",
        description: "boss"
    },
    {
        item: "yazid",
        description: "boss"
    },
    {
        item: "brioual ",
        description: "bataatan"
    }
]

var ajax2 = [
    {
        titre: "T-shirt nadi"
    },
    {
        titre: "sbbat wa3r "
    },
    {
        titre: "sbrdoukha"
    },
    {
        titre: "komama"
    },
    {
        titre: "taggiya"
    }
]
var ajax3 = [
    {
        titre: "The Latest Collection",
        discount:"99% discount",
        img:'images/openshoe.jpg'
    }
]




function remplirTop(data) {
    var html = "",
        indicator = "";
    data.forEach(function (x, i) {
        indicator += '<li data-target="#topproduits" data-slide-to="' + i + '" class="' + (i == 0 ? 'active' : '') + '">777</li>';
        html += remplirLatestProduit("top ", x.item, x.description, i == 0 ? 'active' : '');
    });
    $("#topproduitsinner").html(html);
    $("#topproduitsindex").html(indicator);
}
function remplirTrending(data) {
    var html = "";
    var img = "";
    data.forEach(function (x, i) {
        let id = 'y' + i;
        html += remplirNumTitreProduit(i+1, x.titre, id, i==0);
        img += remplirImgProduit('images/sbrdoukha.jpg', 'images/br9l.jfif','images/sndalatuellement.jfif', 'images/sbat.jpg', id, i==0);

    });
    $("#trendingNumTitle").html(html);
    $("#quatreImg").html(img);
}
function remplirDiscountargs(data) {
    var html = "";
    data.forEach(function (x, i) {
        html += remplirDiscount(x.titre, x.discount, x.img);
    });
    $("#discount").html(html);
}

remplirTop(ajax);
remplirTrending(ajax2);
remplirDiscountargs(ajax3);






