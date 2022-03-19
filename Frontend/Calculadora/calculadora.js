class Calculadora {
  constructor(pantalla, historial) {
    this.pantalla = pantalla;
    this.historial = historial;
    this.inicializar();
  }

  inicializar() {
    this.total = 0;
    this.operadorPendiente = "+";
    this.sustituir = false;
  }

  ponerDigito(digito) {
    //CONSEGUIR QUE LOS NÚMEROS NO SE SALGAN DE LA PANTALLA
    if (this.pantalla.textContent == "0") {
      this.pantalla.textContent = digito;
    } else {
      this.pantalla.textContent += digito;
    }
  }

  ponerDecimal() {
    if (!this.pantalla.textContent.match(/\d+\.\d*/)) {
      this.pantalla.textContent += ".";
    }
  }

  borrarDigito() {
    if (!this.sustituir){
    let longitud = this.pantalla.textContent.length;

    if (longitud <= 1) {
      this.pantalla.textContent = "0";
    } else {
      this.pantalla.textContent = this.pantalla.textContent.substr(
        0,
        longitud - 1
      );
    }}
  }

  borrarPantalla() {
    this.pantalla.textContent = "0";
  }

  sustituirOperando() {
      if(this.sustituir){
        this.borrarPantalla(); 
        this.sustituir = false;
      }
  }

  reiniciarCalculadora() {
    this.inicializar();
    this.historial.textContent = "";
    this.pantalla.textContent = "0";
  }

  ponerHistorial() {
    this.historial.textContent = this.total + " " + this.operadorPendiente;
  }

  getTotal() {
    console.log("total: " + this.total);
    return this.total;
  }

  calcula(operando2, nuevoOperador) {
    this.operando = operando2;
    console.log(operando2 + " " + nuevoOperador);

    switch (this.operadorPendiente) {
      case "+":
        this.total += operando2;
        break;
      case "-":
        this.total -= operando2;
        break;
      case "x":
        this.total *= operando2;
        break;
      case "/":
        this.total /= operando2;
        break;
      case "%":
        this.total %= operando2;
        break;
      case "=":
        break;
      default:
        throw new Error("Operación no soportada.");
    }
    this.operadorPendiente = nuevoOperador;
    return this.getTotal();
  }
}
