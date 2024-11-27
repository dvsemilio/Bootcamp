import React, { useState } from "react"; // Importamos React y el hook useState
import BotonesContador from "./BotonesContador"; // Importamos el componente hijo

/**
 * Componente ContadorConHijo que maneja el estado del contador.
 * Este componente se encarga de la lógica y el estado del contador.
 */
const ContadorConHijo = () => {
  // useState inicializa el contador a 0
  const [contador, setContador] = useState(0);

  // Función para incrementar el contador
  const incrementar = () => setContador(contador + 1);

  // Función para decrementar el contador
  const decrementar = () => setContador(contador - 1);

  // Función para reiniciar el contador a 0
  const reiniciar = () => setContador(0);

  return (
    <div>
      <h1>Contador: {contador}</h1> {/* Muestra el valor actual del contador */}
      <BotonesContador
        incrementar={incrementar} // Pasa la función incrementar como prop
        decrementar={decrementar} // Pasa la función decrementar como prop
        reiniciar={reiniciar} // Pasa la función reiniciar como prop
      />
    </div>
  );
};

export default ContadorConHijo; // Exportamos el componente para su uso en otros archivos
