
$(document).ready(function () {

    var i = 1;

    $("#masJugadores").click(function () {
        if (i <= 4) {
            i++;

            $("#nombres").append('<input id="j' + i + '" type="text" name = "jugadores" placeholder="Jugador ' + i + '"/>');
        }

    });

    $("#menosJugadores").click(function () {
        if (i >= 2) {
            $('#j' + i + '').remove();

            i--;
        }
    });



});


