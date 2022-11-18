
var ajax4 = [
    {
        data: "choose"
    },
    {
        data: "shoes"
    },
    {
        data: "t-shirts"
    }
]

function remplirCategorieListe(data) {
    var liste = $("#subCategorie");
    var option = "";
    for (i = 0; i < data.length; i++) {
        option += "<option value = " + data[i].data + ">" + data[i].data + "</option>";
    }
    liste.html(option);
}
remplirCategorieListe(ajax4);