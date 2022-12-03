function remplirListeMarque(image, nom, quantite, unite, commandes, marque, categorie, id) {

    return '<tr><td></td><td><i class="fab fa-angular fa-lg text-danger me-3"></i> <strong>' + image + '</strong></td><td>' + nom + '</td><td>' + quantite + '</td><td>' + unite + '</td><td>' + commandes + '</td><td>' + marque + '</td><td>' + categorie + '</td><td><div class="dropdown"><button type="button" class="btn p-0 dropdown-toggle hide-arrow" data-bs-toggle="dropdown"><i class="bx bx-dots-vertical-rounded"></i></button><div class="dropdown-menu"><a class="dropdown-item" href="javascript:void(0);"><i class="bx bx-edit-alt me-1"></i>Edit</a><a class="dropdown-item data-delete" href="javascript:void(0);" data-id="' + id + '"><i class="bx bx-trash me-1"></i> Delete</a></div></div></td> </tr>';
}

window.remplirListeMarque = remplirListeMarque;




function remplirListeMarqueArgs(d) {

    var html = "";

    d.forEach(function (x) {
        html += remplirListeMarque(x.nom, x.prix, x.unite, x.ligneCommandes, x.description, x.marque, x.categorie, x.id);
    });
    $("#tableProduit").html(html);
    $(".data-delete").click(function () {
        var id = $(this).attr("data-id");
        if (confirm("supprimer ?")) {
            $.ajax({
                url: '/produit/update',
                method: 'GET',
                data: {
                    id
                },
                success: function (data, textStatus, jqXHR) {
                    remplirListeMarqueArgs(data);
                }
            });
        }


    })
}
function init() {
    $.ajax({
        url: '/produit',
        method: 'GET',
        success: function (data, textStatus, jqXHR) {
            remplirListeMarqueArgs(data);
        }
    });
}
init();

$("#refresh").click(init);

