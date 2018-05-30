


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
    $("#dado").click(function (event) {
        
        $("#enviar").removeAttr("disabled");
//var img = $('<img>');
//img.attr('src', imageURL);
//img.appendTo('#randomDiv');function mostrarimagen(){

//var imagen = "  "



//document.write('<img id="myPhoto" width="50" height="50">');

//document.getElementById("myPhoto").src=imagen;


        swal({
            title: 'Lanzando Dado...!',
            text: '',
            timer: 1000,
            onOpen: () => {
                swal.showLoading();
            }
        }).then((result) => {
            if (
                    // Read more about handling dismissals
                    result.dismiss === swal.DismissReason.timer
                    ) {
                console.log('I was closed by the timer');
            }
            var numero = Math.round(Math.random() * (6 - 1) + 1);
            var dado = '';

            if (numero === 1)
                dado = 'Imagenes/dice1.png';
            else if (numero === 2)
                dado = 'Imagenes/dice2.png';
            else if (numero === 3)
                dado = 'Imagenes/dice3.png';
            else if (numero === 4)
                dado = 'Imagenes/dice4.png';
            else if (numero === 5)
                dado = 'Imagenes/dice5.png';
            else
                dado = 'Imagenes/dice6.png';

            swal({
                imageUrl: dado
            });
            $('#enviodado').val(numero);
            //$('#numero').replaceWith('<h2 class="white-text" id="numero">' + numero + "</h2>");
            //$('#imagendado').replaceWith('<img id="imagendado"> src="' + dado + '"</h2>');
            document.getElementById('imagendado').src = dado;
        });

    });

    $("#enviar").click(function (event) {
        if ($('#res').val() !== '') {
            $('#responder').submit();
        }
        else{
            swal({
                type: 'warning',
                title: '! Debes lanzar el dado ¡ :)',
                text: '',
                confirmButtonColor: 'red',
            })
        }                
    });

    if ($('#res').val() !== '') {
        if ($('#res').val() === 'correcta') {
            swal({
                type: 'success',
                title: '! Respuesta Correcta ¡ :)',
                text: '',
                confirmButtonColor: 'green',
                //confirmButtonText: 'yupi!',
            })
        } else {
            swal({
                type: 'error',
                title: 'Oops...Respuesta Incorrecta :(',
                text: '',
                confirmButtonColor: 'red',
                //confirmButtonText: 'nooo',
            })
        }
        //alert($('#res').val());
    }


    //Valido cual radiobutton esta seleccionado
    $("input[name=res]").click(function () {
        alert("La edad seleccionada es: " + $('input:radio[name=res]:checked').val());
        alert("La edad seleccionada es: " + $(this).val());
        $('#seleccionado').val($(this).val());
    });

    //Cargo las preguntas por ajax
    $("#cargarpreguntas").click(function () {
        var div = $("#preguntas");
        var url = "MostrarListadoPreguntas.pre";
        $(div).load(url);
    });

    //Muestro el modal para registrar los nombres de los jugadores
    $("#jugador1").click(function () {
        //mostrarModal(1);
        //mostrarCampos(1);

    });

    $("#jugador2").click(function () {
        //mostrarModal(2);
    });

    $("#jugador3").click(function () {
        //mostrarModal(3);
    });

    $("#jugador4").click(function () {
        //mostrarModal(4);
    });


});

function mostrarCampos(jugador) {
    //location.href ="jugadores.jsp";
    $("#nombres").append("");

}

function mostrarModal(cantidad) {
    //Debo mandar en una variable los nombres
    //Guardar los nombres en una variable
    //Despues por get o post enviar al controlador
    //Y en el controlador capturarlos
    var jugadores = "";
    var val = true;
    for (var i = 1; i <= cantidad; i++) {
        jugadores += '<input id="swal-input' + i + '" class="swal2-input" placeholder="Nombre Jugador ' + i + '" name="jugadores" required>';
    }
    swal({
        title: 'Escribe el nombre de cada jugador',
        text: 'Nombre de los jugadores',
        type: 'info',
        confirmButtonText: 'Jugar',
        //confirmButtonColor: 'green',
        html: jugadores,
        focusConfirm: false,
        //showLoaderOnConfirm: true,

        preConfirm: () => {

            var inputs = document.getElementsByName('jugadores');
            var nombres = [];
            // console.log(jugadores);
            var datos;
            for (i = 0; i < inputs.length; i++) {
                console.log(inputs[i].value);
                if (i < inputs.length - 1)
                    datos += inputs[i].value + ",";
                else
                    datos += inputs[i].value;
                nombres.push(inputs[i].value);
                if (inputs[i].value === "") {
                    val = false;
                }
            }
            console.log(nombres);
            var json = JSON.stringify(nombres);
            console.log(json);
            if (val) {
                $.ajax({
                    type: "POST",
                    url: "Jugadores",
                    //dataType : 'json',
                    data: "nombres=" + datos,
                    //data: {nombres : datos},
                    //data: json,
                    success: function (result) {
                        alert("meeeeeeeeeeeeeeeeeeeeeeeeeeeec!");
                    }
                });
                //return [
                //   document.getElementById('swal-input1').value,
                //  document.getElementById('swal-input2').value
                //];
            }

        }

    });
    if (!val)
        swal('Debes escribir todos los nombres :(');
}





