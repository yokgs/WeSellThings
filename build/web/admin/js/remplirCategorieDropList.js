
 function init(){
         $.ajax({
        url: '/categorie',
        method: 'GET',
        success: function (data) {
            remplirCategorieListe(data);
        }
    });
    }
    $(document).ready(function () {
    
       init()



    $('#btnAddCategorie').click(function () {
        var nom = $('#nomCategorie').val(),
        id =  $("#subCategorie").val();
        $.ajax({
            url: '/categorie',
            method: 'POST',
            data: {
                nom: nom,
                id: id
            },
            success: function (data, textStatus, jqXHR) {
                alert('La categorie "' + nom + '" est bien ajoutée ! ');
                $('#nomCategorie').val('');
                remplirCategorieListe(data);
            }
        });
    })




})




function remplirCategorieListe(data) {
    var liste = $("#subCategorie");
    var option = "<option value = ''> aucune </option>";
    for (i = 0; i < data.length; i++) {
        option += "<option value = '" + data[i].id + "'> #" + data[i].categorie +' / '+ data[i].nom + "</option>";
    }
    liste.html(option);
}
