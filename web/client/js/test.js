

var ajax = [
    {
        item: "BAOUCHOUCH",
        description: "SAAD"
    },
    {
        item: "AIT ELMAMOUN",
        description: "HAMZA"
    },
    {
        item: "SLILA",
        description: "YAZID"
    },
    {
        item: "BAOUCHOUCH",
        description: "SAAD"
    },
    {
        item: "AIT ELMAMOUN",
        description: "HAMZA"
    },
    {
        item: "SLILA",
        description: "YAZID"
    },
    {
        item: "BAOUCHOUCH",
        description: "SAAD"
    },
    {
        item: "AIT ELMAMOUN",
        description: "HAMZA"
    },
    {
        item: "SLILA",
        description: "YAZID"
    },
    {
        item: "BAOUCHOUCH",
        description: "SAAD"
    },
    {
        item: "AIT ELMAMOUN",
        description: "HAMZA"
    }
]

var ajax2 = [
    {
        titre: "airpods"
    },
    {
        titre: "cap"
    },
    {
        titre: "T-shirt"
    },
    {
        titre: "hoodie"
    },
    {
        titre: "pant"
    }
]
var ajax3 = [
    {
        titre: "The Latest Collection",
        discount:"99% discount",
        img:'images/glasses1.jpg'
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
        img += remplirImgProduit('images/ecouteurs.webp', 'images/taggiyat.jpg','images/cap.webp', 'images/ensemble.webp', id, i==0);

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







