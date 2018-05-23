
$(document).ready(function () {
    //swal({
    //    title: 'Error!',
    //  text: 'Do you want to continue',
    //type: 'error',
    //  confirmButtonText: 'Cool'
    // });
    var i = 1;

    $("#añadir").click(function () {

        $("#opciones").append(" <div class='row'> <div class='input-field col s9 m9'>\n\
                                <input id='opciones' name='opciones' type='text' class='validate'>\n\
                                <label for='opciones'>opcion " + i + "</label>\n\
                                </div>\n\
                                <div class='col s3 m3'>\n\
                                <label>\n\
                                <input id='correcta' name='correcta' type='radio' value='" + i + "'/>\n\
                                <span>correcta?</span>\n\
                                </label>\n\
                                </div>\n\
                                </div>"
                );

        i++;
    });

    //Cargo las preguntas por ajax
    $("#cargarpreguntas").click(function () {
        var div = $("#preguntas");
        var url = "MostrarListadoPreguntas.pre";
        $(div).load(url);
    });

});





