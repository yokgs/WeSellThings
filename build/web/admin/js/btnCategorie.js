$(document).ready(function(){

    $('#btnAddCategorie').click(function(){

var nom =  $('#nomCategorie').val();
var liste =  $('#subCategorie').val();

        $('#nomCategorie').val('')
        $('#nomCategorie').val('choose')
        
        alert('La categorie "'+nom+'" est bien ajoutée ! ')
        
    })

})