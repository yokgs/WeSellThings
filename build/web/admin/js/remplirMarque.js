
$(document).ready(function () {

    $('#btnAddMarque').click(function () {

        var nom = $('#nomMarque').val();
        $.ajax({
            url: '/marque',
            method: 'POST',
            data: {
                nom: nom
            },
            success: function (data, textStatus, jqXHR) {
                alert('La marque "' + nom + '" est bien ajoutéeeee ! ');
                $('#nomMarque').val('');
            }
        });



    })







})