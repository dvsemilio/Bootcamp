function invertirCadena(palabra) {
    let resultado = '';
    for (let letra = palabra.length -1; letra >= 0; letra--) {
        resultado += palabra[letra];
    }
    return resultado;
}
console.log(invertirCadena("mamahuevo"));

function contarVocales(cadena) {
    let contador = 0;
    for (let i = 0; i < cadena.length; i++) {
        let letra = cadena[i];
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
            letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            contador++;
        }
    }
     return contador;
}
console.log(contarVocales("murciélAgo"));
//no cuenta las vocales con tílde, puta que lo parió.