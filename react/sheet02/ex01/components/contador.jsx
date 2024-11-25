import { useState } from "react";

const Contador = () => {
  // Declarar un estado para el contador
  const [contador, setContador] = useState(0);

  // Funciones para manejar los botones
  const incrementar = () => setContador(contador + 1);
  const decrementar = () => setContador(contador - 1);
  const reiniciar = () => setContador(0);

  return (
    <div>
      <h1>Contador: {contador}</h1>
      <button onClick={incrementar}>+</button>
      <button onClick={decrementar}>-</button>
      <button onClick={reiniciar}>Reset</button>
    </div>
  );
};

export default Contador;
