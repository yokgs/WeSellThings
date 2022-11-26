function mutate(quantite){
  var a = $("#url").attr("href").replace(/quantite\=[\d]+/,"quantite="+quantite);
  $("#url").attr("href",a);
}
$(".quantite-modifier").click(function(){
    mutate($("#quantite").val());
})