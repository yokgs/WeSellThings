

var ajax = [
    {
        item: "saad",
        description: "derri nadi"
    },
    {
        item: "mamoun",
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




function remplir(data) {
    var html = "",
        indicator = "";
    data.forEach(function (x, i) {
        indicator += '<li data-target="#topproduits" data-slide-to="' + i + '" class="' + (i == 0 ? 'active' : '') + '">777</li>';
        html += remplirLatestProduit("top ", x.item, x.description, i == 0 ? 'active' : '');
    });
    $("#topproduitsinner").html(html);
    $("#topproduitsindex").html(indicator);
}

remplir(ajax);






