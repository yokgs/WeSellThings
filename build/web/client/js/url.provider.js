function mutate(quantite) {
    var a = $("#url").attr("href").replace(/quantite\=[\d]+/, "quantite=" + quantite);
    $("#url").attr("href", a);
}
$(".quantite-modifier").click(function () {
    mutate($("#quantite").val());
});

/*$("#url").click(function (e) {
    e.preventDefault();
    $.ajax({
        url: $(this).attr("href"),
        method: "POST",
        success: function (data, textStatus, jqXHR) {
            alert(data);
        }
    })
})*/