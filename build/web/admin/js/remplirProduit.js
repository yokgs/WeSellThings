$(document).ready(function () {
    $('#btnAddProduit').click(function () {
        var nom = $('#nomProduit').val();
        var prix = $('#prixProduit').val();
        var description = $('#descriptionProduit').val();
        var image = $('#imageProduit').val();
        var designation = $('#designationProduit').val();
        var categorie = $('#subCategorie').val();
        var marque = $('#marque').val();
        var unite = $('#uniteProduit').val();

        $.ajax({
            url: '/produit',
            method: 'POST',
            data: {
                nom: nom,
                prix:prix,
                unite: unite,
                image: image,
                description: description,
                designation: designation,
                categorie: categorie,
                marque: marque


            },
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