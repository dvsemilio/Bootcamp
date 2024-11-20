{
  /* <div class="caja"> +
          <div class="arriba"> +
            <img +
            src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png"
            alt="Bulbasaur"
            />
            <div class="id">id/1</div>+
          </div>
          <div class="abajo">+
            <h2>Bulbasaur</h2>+
            <ul class="tipos">+
              <li>poison</li>
              <li>grass</li>
            </ul>
            <div class="evol">
              <div class="evol_de"></div>
              <div class="evol_name"></div>
            </div>
          </div>
        </div> */
}

document.addEventListener("DOMContentLoaded", () => {
  function crearCaja(imagen, id, nombre, tipos, evolucion) {
    const grid = document.getElementById("grid");
    const caja = document.createElement("div");
    caja.className = "caja";
    const arriba = document.createElement("div");
    arriba.className = "arriba";
    const img = document.createElement("img");
    const divId = document.createElement("div");
    divId.className = "id";
    const abajo = document.createElement("div");
    abajo.className = "abajo";
    const ListTipos = document.createElement("ul");
    ListTipos.className = "tipos";
    const h2 = document.createElement("h2");
    const evol = document.createElement("evol");
    evol.className = "evol";
    const evol_de = document.createElement("div");
    const evol_name = document.createElement("div");
    evol_de.className = "evol_de";
    evol_name.className = "evol_name";

    grid.appendChild(caja);
    caja.appendChild(arriba);
    caja.appendChild(abajo);
    arriba.appendChild(img);
    arriba.appendChild(divId);
    abajo.appendChild(h2);
    abajo.appendChild(ListTipos);
    abajo.appendChild(evol);
    evol.appendChild(evol_de);
    evol.appendChild(evol_name);
  }
  function getPokemon() {}
});
