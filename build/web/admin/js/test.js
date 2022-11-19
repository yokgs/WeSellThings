var ajax = [
    {
        id: "1",
        marque: "capuchon",
        nbrProduit: "5"
    },
    {
        id: "1",
        marque: "capuchon",
        nbrProduit: "5"
    },
    {
        id: "1",
        marque: "capuchon",
        nbrProduit: "5"
    },
    {
        id: "1",
        marque: "capuchon",
        nbrProduit: "5"
    },
    {
        id: "1",
        marque: "capuchon",
        nbrProduit: "5"
    },
    {
        id: "1",
        marque: "capuchon",
        nbrProduit: "5"
    }
]
var ajax21 = [
    {
        sousCategorie: "Bagage et Sacs de Voyage",
        nbrProduit: "105"
    },
    {
        sousCategorie: "T-shirt",
        nbrProduit: "40"
    },
    {
        sousCategorie: "Jeans",
        nbrProduit: "11"
    },
    {
        sousCategorie: "Baskets",
        nbrProduit: "26"
    }
]
var ajax22 = [
    {
        sousCategorie: "Téléphones",
        nbrProduit: "105"
    },
    {
        sousCategorie: "Accessoires Informatiques",
        nbrProduit: "40"
    },
    {
        sousCategorie: "Accessoires Téléphones",
        nbrProduit: "11"
    }
]

/*function remplirListeMarqueArgs(data) {
    var html = "";
    data.forEach(function (x) {
        html += remplirListeMarque(x.id,x.marque, x.nbrProduit);
    });
    $("#tableMarque").html(html);
}*/
function remplirListeSousCategorieArgs(data) {
    var html = "";
    data.forEach(function (x,i) {
        html += remplirListeSousCategorie(i+1,x.sousCategorie, x.nbrProduit);
    });
    $("#tableSousCategorie").html(html);
}
remplirListeMarqueArgs(ajax);
remplirListeSousCategorieArgs(ajax22);