function saludar (nombre) {
    //console.log(`hola ${nombre} ,muy buenas.`);
    return `hola ${nombre} ,muy buenas.`;
}

function mayor (numero1, numero2) {
    if (numero1 > numero2) {
        return numero1;
    }
    if (numero1 < numero2){
        return numero2;
    }
    return numero1;
}
let nombre = "artem";
console.log(`resultado de llamar saludar("artem") es ${saludar(nombre)}`);

console.log(`resultado de llamar mayor (5, 7) es ${mayor(5,7)}`);