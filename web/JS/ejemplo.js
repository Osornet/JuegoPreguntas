$(document).ready(function () {
    //Muestro la tabla a medida que avanzan las casillas
    if($("#res").val()!==""){
        alert($("#res").val());
    }
    var tope = $("#tope").val();
    for(var i = 0; i<tope; i++){
        var nombre = $("#nombre"+i).val();
        var posicion = $("#posicion"+i).val();
        $('#p'+posicion+'').append(nombre+"<br/>");
    }
 
    
    
});


