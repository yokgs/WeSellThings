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
    },
   
]

function remplirListeMarqueArgs(data) {
    var html = "";
    data.forEach(function (x) {
        html += remplirListeMarque(x.id,x.marque, x.nbrProduit);
    });
    $("#tableMarque").html(html);
}

remplirListeMarqueArgs(ajax);