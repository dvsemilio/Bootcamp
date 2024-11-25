import Producto from "./producto";

function ListaDeProductos({ array }) {
  return (
    <div className="Lista_De_Productos">
      {array.map((Product, index) => (
        <Producto
          key={index}
          nombre={Product.nombre}
          precio={Product.precio}
          descripcion={Product.descripcion}
        />
      ))}
    </div>
  );
}
export default ListaDeProductos;
