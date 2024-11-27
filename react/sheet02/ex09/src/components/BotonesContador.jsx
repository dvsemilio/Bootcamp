import React from "react";

/**
 * Componente BotonesContador que recibe funciones como props
 * y renderiza los botones para controlar el contador.
 */
const BotonesContador = ({ incrementar, decrementar, reiniciar }) => {
  return (
    <div>
      <button onClick={incrementar}>+</button>{" "}
      {/* Botón que llama a la función incrementar */}
      <button onClick={decrementar}>-</button>{" "}
      {/* Botón que llama a la función decrementar */}
      <button onClick={reiniciar}>Reset</button>{" "}
      {/* Botón que llama a la función reiniciar */}
    </div>
  );
};

export default BotonesContador; // Exportamos el componente para su uso en otros archivos
