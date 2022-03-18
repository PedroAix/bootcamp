class Calculadora {
  constructor(pantalla) {
    this.pantalla = pantalla;
  }

  imprimir(value) {
    this.pantalla.textContent += value;
  }

  ponDigito(digito) {
      //CONSEGUIR QUE LOS NUMEROS NO SE SALGAN DE LA PANTALLA
    if (this.pantalla.textContent == "0") {
      this.pantalla.textContent = digito;
    } else {
      this.pantalla.textContent += digito;
    }
    console.log(this.pantalla.textContent);
  }

  borraDigito() {
    if (this.pantalla.textContent.length <= 1) {
      this.pantalla.textContent = "0";
    } else {
      this.pantalla.textContent = this.pantalla.textContent.substr(
        0,
        this.pantalla.textContent.length - 1
      );
    }
    console.log(this.pantalla.textContent);

  }
}
