
$(document).ready(function () {

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

    //Muestro el modal para registrar los nombres de los jugadores
    $("#jugador1").click(function () {
        mostrarModal(1);
    });

    $("#jugador2").click(function () {
        mostrarModal(2);
    });

    $("#jugador3").click(function () {
        mostrarModal(3);
    });

    $("#jugador4").click(function () {
        mostrarModal(4);
    });


});


function mostrarModal(cantidad) {
    //Debo mandar en una variable los nombres
    //Guardar los nombres en una variable
    //Despues por get o post enviar al controlador
    //Y en el controlador capturarlos
    var jugadores = "";
    for (var i = 1; i <= cantidad; i++) {
        jugadores += '<input id="swal-input' + i + '" class="swal2-input" placeholder="Nombre Jugador ' + i + '">';
    }
    swal({
        title: 'Escribe el nombre de cada jugador',
        text: 'Nombre de los jugadores',
        type: 'info',
        confirmButtonText: 'Jugar',
        html: jugadores,
        focusConfirm: false,
        preConfirm: () => {
            //$.post('ActionServlet', {
		//		nombre : nombreVar,
		//		apellido: apellidoVar,
		//		edad: edadVar
		//	}, function(responseText) {
		//		$('#tabla').html(responseText);
		//	});
            return [
                document.getElementById('swal-input1').value,
                document.getElementById('swal-input2').value
            ];
        }
        
    
    //document.getElementById('swal-input1').value,
    //document.getElementById('swal-input2').value
    });
}





