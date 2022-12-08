$(document).ready(function () {



    function init() {
        $.ajax({
            url: '/categorie',
            method: 'GET',
            success: function (data) {
                remplirCategorieListe(data);
            }
        });
        $.ajax({
            url: '/marque',
            method: 'GET',
            success: function (data) {
                remplirMarqueListe(data);
            }
        });
    }

    init()


    function remplirCategorieListe(data) {
        var liste = $("#subCategorie");
        var option = "";
        for (i = 0; i < data.length; i++) {
            option += "<option value = '" + data[i].id + "'> #" + data[i].categorie + ' / ' + data[i].nom + "</option>";
        }
        liste.html(option);
    }

    function remplirMarqueListe(data) {
        var liste = $("#marque");
        var option = "";
        for (i = 0; i < data.length; i++) {
            option += "<option value = '" + data[i].id + "'>" + data[i].nom + "</option>";
        }
        liste.html(option);
    }


    

   
})