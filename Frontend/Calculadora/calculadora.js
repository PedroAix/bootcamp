

class Calculadora {
  
    constructor(pantalla, historial) {
    this.pantalla = pantalla;
    this.historial = historial;
    this.total = 0;
    this.operadorPendiente = "+";
  }

  


  ponDigito(digito) {
    //CONSEGUIR QUE LOS NÚMEROS NO SE SALGAN DE LA PANTALLA
    if (this.pantalla.textContent == "0") {
      this.pantalla.textContent = digito;
    } else {
      this.pantalla.textContent += digito;
    }
  }

  ponDecimal() {
    this.pantalla.textContent += ",";
  }

  borraDigito() {
    let longitud = this.pantalla.textContent.length;

    if (longitud <= 1) {
      this.pantalla.textContent = "0";
    } else {
      this.pantalla.textContent = this.pantalla.textContent.substr(
        0,
        longitud - 1
      );
    }
  }

  limpiarPantalla() {
    this.pantalla.textContent = "0";
  }

  ponHistorial() {
      this.historial.textContent = this.total + " " + this.operadorPendiente;
  }

  getTotal() {
    console.log("total: " + this.total);
    return this.total;
    
  }

  calcula(operando2, nuevoOperador) {
    this.operando = operando2;
    this.operadorPendiente = nuevoOperador
    console.log(operando2 + " " + nuevoOperador)

    switch (this.operadorPendiente) {
      case "+":
        this.total += operando2;
        break;
      case "-":
        this.total -= operando2;
        break;
      case "x":
        this.total *= operando2
        break;
      case "/":
        this.total /= operando2
        break;
      case "%":
        this.total %= operando2
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
