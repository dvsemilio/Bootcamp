import { useState } from "react";
import "./App.css";
//import ListaDeProductos from "../components/ListaDeProductos";
import Producto from "../components/producto";

function App() {
  const [count, setCount] = useState(0);

  return (
    <>
      <Producto nombre={"mando"} precio={"5"} descripcion={"a distancia"} />
      <Producto nombre={"cable"} precio={"6"} descripcion={"de 3 metros"} />
      <Producto
        nombre={"conector"}
        precio={"7"}
        descripcion={"de VGA a HDMI"}
      />
    </>
  );
}

export default App;
