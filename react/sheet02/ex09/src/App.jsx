import "./App.css";
import React from "react";
import ContadorConHijo from "./components/ContadorConHijo"; // Importamos el componente padre

/**
 * Componente principal de la aplicación.
 * Renderiza la estructura general de la aplicación y utiliza el componente ContadorConHijo.
 */
const App = () => {
  return (
    <div>
      <h1>Mi Aplicación React</h1>
      <ContadorConHijo /> {/* Renderiza el componente ContadorConHijo */}
    </div>
  );
};
export default App;
