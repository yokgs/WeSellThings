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


    $('#produitform').submit(function (e) {
        console.log(new FormData($('#produitform')))
        $.ajax({
            url: '/produit',
            method: 'POST',
            data: new FormData(this),
            processData: false,
            contentType: false
        });
        e.preventDefault();
    });

    $('#btnAddProduit').click(function () {
        var nom = $('#nomProduit').val();
        var prix = $('#prixProduit').val();
        var description = $('#descriptionProduit').val();
        var designation = $('#designationProduit').val();
        var categorie = $('#subCategorie').val();
        var marque = $('#marque').val();
        var unite = $('#uniteProduit').val();
        var data = new FormData();
        data.append('image', $('#imageProduit')[0].files[0]);
        data.append("nom", nom);
        data.append("prix", prix);
        data.append("description", description);
        data.append("categorie", categorie);
        data.append("marque", marque);
        data.append("unite", unite);


        $.ajax({
            url: '/produit',
            method: 'POST',
            data: data,
            processData: false,
            contentType: false,
            success: function (data, textStatus, jqXHR) {
                alert('Le produit "' + nom + '" est bien ajouté ! ');
                $('#nomProduit').val('');
                $('#prixProduit').val('');
                $('#descriptionProduit').val('');
                $('#imageProduit').val('');
                $('#designationProduit').val('');
                $('#subCategorie').val('');
                $('#marque').val('');
                $('#uniteProduit').val('');
            }
        });
    })
})