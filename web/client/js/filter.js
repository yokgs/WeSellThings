var o = [],
    u = [0, 100, 200, 300, 400];
var p = [];
function fetchProduits() {
    let f = (document.location).toString().split('?')[1];
    $.ajax({
        url: "/produit?"+f,
        method: "GET",
        success: function (data, textStatus, jqXHR) {
            p = data;
            o = [...new Set(p.map(x=>x.marqueId))];
        }
    })
}

fetchProduits();
function filter() {
    return p.filter(function (e) {
        var yy = false;
        u.forEach(function (i) {
            yy = (i < e.prix && i + 100 > e.prix) || yy;
        })
        return yy && o.indexOf(e.marqueId) > -1;
    })
}
function load(x) {
    if (o.indexOf(x) == -1) {
        o.push(x);
    } else {
        o = o.filter(function (i) {
            return i != x
        })
    }
    var ps = filter()
    print(ps)
}

function loadPrice(x) {
    if (u.indexOf(x) == -1) {
        u.push(x);
    } else {
        u = u.filter(function (i) {
            return i != x
        })
    }
    var ps = filter()
    print(ps)
}

function produit(P) {
    return `<div class="col-lg-3 col-md-4 col-sm-6 pb-1">
    <div class="product-item bg-light mb-4">
        <div class="product-img position-relative overflow-hidden">
            <img class="img-fluid w-100" src="..\\ressource\\images\\${P.image}" alt="${P.nom}">

            <div class="product-action"><a
                    class="btn btn-outline-dark btn-square"
                    href="produit.jsp?id=${P.id}"><i
                        class="fa fa-shopping-cart"></i></a><a
                    class="btn btn-outline-dark btn-square"
                    href=""><i
                        class="far fa-heart"></i></a><a
                    class="btn btn-outline-dark btn-square"
                    href=""><i
                        class="fa fa-sync-alt"></i></a><a
                    class="btn btn-outline-dark btn-square"
                    href=""><i class="fa fa-search"></i></a>
            </div>
        </div>
        <div class="text-center py-4"><a
                class="h6 text-decoration-none text-truncate"
                href="produit.jsp?id=${P.id}">
                ${P.nom}
            </a>
            <div
                class="d-flex align-items-center justify-content-center mt-2">
                <h5>${P.prix}$</h5>
                <h6 class="text-muted ml-2"><del>${P.prix + 50}$</del></h6>
            </div>
            <div
                class="d-flex align-items-center justify-content-center mb-1">
                <small
                    class="fa fa-star text-primary mr-1"></small><small
                    class="fa fa-star text-primary mr-1"></small><small
                    class="fa fa-star text-primary mr-1"></small><small
                    class="fa fa-star text-primary mr-1"></small><small
                    class="fa fa-star text-primary mr-1"></small><small>55</small>
            </div>
        </div>
    </div>
</div>`;

}

function print(obj) {
    let y = '';
    obj.forEach(x => {
        y += produit(x);
    })
    $('#produit-s').html(y);
}