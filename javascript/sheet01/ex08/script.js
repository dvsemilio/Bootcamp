const Persona = {
nombre: "Emilio",
edad: "32",
ciudad: "málaga"
}
for (const propiedad in Persona) {
   console.log(Persona[propiedad]);
}

function describirPersona(Persona) {
    let descripcion = '';
    for (const caracteristica in Persona) {
     descripcion += caracteristica+ ': '  + Persona[caracteristica]+ ' ';
    }
    return descripcion;
}
console.log(describirPersona(Persona));