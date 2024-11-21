import "./tarjeta.css";

function Tarjeta({ nombre, apellido, ocupacion, imagenURL }) {
  return (
    <div className="Lista">
      <div className="info">
        <p>Nombre: {nombre}</p>
        <p>Apellido: {apellido}</p>
        <p>Ocupación:{ocupacion}</p>
      </div>
      <div className="foto">
        <img src={imagenURL}></img>
      </div>
    </div>
  );
}
export default Tarjeta;
