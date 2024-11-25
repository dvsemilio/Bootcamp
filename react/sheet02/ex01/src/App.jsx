import "./App.css";
import Contador from "../components/contador";
//una forma de tener components fuera de src, una gilipollez mía.
const App = () => {
  return (
    <div>
      {" "}
      <h1>Contador de los cojones</h1> <Contador />{" "}
    </div>
  );
};
export default App;
/*Componente principal de la aplicación.
 *Renderiza la estructura general de la aplicación y utiliza el componente Contador.
 *El componente Contador permite incrementar, decrementar y reiniciar un valor numérico,
 *mostrando el resultado en pantalla. */
