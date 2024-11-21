import { useState } from "react";
import "./App.css";
import Tarjeta from "../components/tarjeta";

function App() {
  return (
    <>
      <Tarjeta
        nombre="emilio"
        apellido="apellido"
        ocupacion={"qweqew"}
        imagenURL={
          "https://images3.memedroid.com/images/UPLOADED916/60a3106a3c345.jpeg"
        }
      />
    </>
  );
}

export default App;
