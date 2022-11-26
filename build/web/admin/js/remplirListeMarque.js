function remplirListeMarque(id, marque, nbrProduit) {

    return '<tr><td><i class="fab fa-angular fa-lg text-danger me-3"></i> <strong>' + id + '</strong></td><td>' + marque + '</td><td>' + nbrProduit + '</td><td><div class="dropdown"><button type="button" class="btn p-0 dropdown-toggle hide-arrow" data-bs-toggle="dropdown"><i class="bx bx-dots-vertical-rounded"></i></button><div class="dropdown-menu"><a class="dropdown-item" href="javascript:void(0);"><i class="bx bx-edit-alt me-1"></i>Edit</a><a class="dropdown-item data-delete" href="javascript:void(0);" data-id="' + id + '"><i class="bx bx-trash me-1"></i> Delete</a></div></div></td> </tr>';
}

window.remplirListeMarque = remplirListeMarque;




function remplirListeMarqueArgs(d) {

    var html = "";

    d.forEach(function (x) {
        html += remplirListeMarque(x.id, x.nom, x.produits);
    });
    $("#tableMarque").html(html);
    $(".data-delete").click(function () {
        var id = $(this).attr("data-id");
        $.ajax({
            url: '/marque/update',
            method: 'GET',
            data: {
                id
            },
            success: function (data, textStatus, jqXHR) {
                remplirListeMarqueArgs(data);
            }
        });


    })
}
function init() {
    $.ajax({
        url: '/marque',
        method: 'GET',
        success: function (data, textStatus, jqXHR) {
            remplirListeMarqueArgs(data);
        }
    });
}
init();

$("#refresh").click(init);

