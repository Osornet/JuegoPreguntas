
$(document).ready(function(){
    var i = 1;
  
  $("#opcion").click(function(){
      
      $("#opciones").append("<p><label for='Opcion"+i+"'>Opcion "+i+": </p> \n\
                            <p> \n\
                                <input type='text' name='Opcion"+i+"'/> \n\
                                <label for = 'esCorrecta'>es correcta</label>   \n\
                                <input type='radio' name = 'esCorrecta' value = 'Opcion"+i+"'/>   \n\
                            </p>    ");
  
  i++;
  });
  
});
        
        


