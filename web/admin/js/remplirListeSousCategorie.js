function remplirListeSousCategorie(id, sousCategorie, categorie, nbrProduit) {
    return '<tr><td><i class="fab fa-angular fa-lg text-danger me-3"></i> <strong>' + id + '</strong></td><td>' + sousCategorie + '</td><td>' + categorie + '</td><td>' + nbrProduit + '</td><td><div class="dropdown"><button type="button" class="btn p-0 dropdown-toggle hide-arrow" data-bs-toggle="dropdown"><i class="bx bx-dots-vertical-rounded"></i></button><div class="dropdown-menu"><a class="dropdown-item" href="javascript:void(0);"><i class="bx bx-edit-alt me-1"></i>Edit</a><a class="dropdown-item" href="javascript:void(0);"><i class="bx bx-trash me-1"></i> Delete</a></div></div></td> </tr>';
}

window.remplirListeSousCategorie = remplirListeSousCategorie;

function remplirListeSousCategorieArgs(data) {
    var html = "";
    data.forEach(function (x, i) {
        html += remplirListeSousCategorie(x.id, x.nom, x.categorie, x.produits);
    });
    $("#tableSousCategorie").html(html);
}
$.ajax({
    url: '/categorie',
    method: 'GET',
    success: function (data) {
        remplirListeSousCategorieArgs(data);
    }
});