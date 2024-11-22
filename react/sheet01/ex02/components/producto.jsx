function Producto({ nombre, precio, descripcion }) {
  return (
    <>
      <div className="info">
        <p>producto: {nombre}</p>
        <p>euros: {precio}</p>
        <p>descripción:{descripcion}</p>
      </div>
    </>
  );
}

export default Producto;
