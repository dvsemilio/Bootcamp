import { useState } from "react";
import "./App.css";
import Tarjeta from "../components/tarjeta";
import ListaTarjeta from "../components/ListaTarjetas";

function App() {
  return (
    <>
      <Tarjeta
        nombre={"emilio"}
        apellido={"apellido"}
        ocupacion={"qweqew"}
        imagenURL={
          "https://images3.memedroid.com/images/UPLOADED916/60a3106a3c345.jpeg"
        }
      />
      <ListaTarjeta nombre={"caraculo"} />
    </>
  );
}

export default App;
