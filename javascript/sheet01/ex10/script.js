function mostrarClick() {
  console.log("¡Botón pulsado!");
}
function mostrarAlerta() {
  let texto = document.getElementById("texto").value;
  /*El atributo innerText no funciona con elementos de entrada (<input>),
  ya que estos no contienen nodos de texto. En su lugar,
  debes usar la propiedad value para obtener el valor de un campo de entrada.*/
  alert(texto);
  console.log(texto);
}
