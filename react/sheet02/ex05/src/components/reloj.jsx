import React, { useState, useEffect } from "react";
const Reloj = () => {
  // Declarar un estado para la hora actual
  const [horaActual, setHoraActual] = useState(new Date());

  // Usar useEffect para manejar el temporizador
  useEffect(() => {
    // Función que actualiza la hora
    const actualizarHora = () => {
      setHoraActual(new Date());
    };

    // Configurar un intervalo que llame a actualizarHora cada segundo
    const intervalo = setInterval(actualizarHora, 1000);

    // Limpiar el intervalo al desmontar el componente
    return () => clearInterval(intervalo);
  }, []); // El array vacío asegura que el efecto sólo se ejecute al montar y desmontar

  return (
    <div>
      <h2>Hora actual: {horaActual.toLocaleTimeString()}</h2>
    </div>
  );
};

export default Reloj;
