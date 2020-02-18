var nombre = document.getElementById("nombre");
var boton = document.getElementById("btnSaludar");
var nivel = document.getElementById("nivel");
var fibo = document.getElementById("btnFibo");
var numero = document.getElementById("numero");
var boton3 = document.getElementById("btnTabla");
boton.addEventListener("click", saludar);
fibo.addEventListener("click",fibonacci);
boton3.addEventListener("click",tabla);
function saludar(){
    alert("Bienvenido a JS " + nombre.value);
}
function fibonacci() {
    var inicial = 0;
    var actual = 1;
    var aux = 0;
    var resultado = 0;
    for (var i = inicial; i <= nivel.value; i++) {
        aux = inicial + actual;
        resultado = resultado + inicial + " + " + actual + " = " + aux + "\n";
        inicial = aux;
        actual = actual + 1;
    }
    alert(resultado);
}
function tabla(){
    var numinicial = numero.value;
    var producto = 0;
    var multi = 0;
    for(multi = 0; multi <=10; multi++){
        producto = producto + numinicial + " x " + multi + " = " + numinicial * multi + "\n";
    }
    alert(producto);
}