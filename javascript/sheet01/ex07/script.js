let semana = ["lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"];
for (let index = 0; index < semana.length; index++) {
    console.log(semana[index]);
}

function sumarArreglo() {
    let numeros = [1,2,3,4,5];
    let suma = 0;
    for (let index = 0; index < numeros.length; index++) {
       suma += numeros[index];
    }
    console.log(suma);
}
sumarArreglo();