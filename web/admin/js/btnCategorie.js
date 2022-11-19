$(document).ready(function(){

    $('#btnAddCategorie').click(function(){

var nom =  $('#nomCategorie').val();
var liste =  $('#subCategorie').val();

        $('#nomCategorie').val('')
        $('#subCategorie').val('')
        
        alert('La categorie "'+nom+'" est bien ajoutée ! ')
        
    })

})