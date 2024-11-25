import "./App.css";
import ListaDeProductos from "../components/ListaDeProductos";
const arrayDeProductos = [
  {
    nombre: "cerveza",
    precio: "incalculable",
    descripcion: "que cosa más rica",
  },
  { nombre: "galletas", precio: "1 euro", descripcion: "azucar pal cuerpo" },
  { nombre: "cable", precio: "3 euros", descripcion: "conecta cosas" },
  { nombre: "libro", precio: "12 euros", descripcion: "leer es bueno" },
];

function App() {
  return (
    <>
      <ListaDeProductos array={arrayDeProductos} />
    </>
  );
}

export default App;
