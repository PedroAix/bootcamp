class Calculadora {
  constructor(pantalla, historial) {
    this.pantalla = pantalla;
    this.historial = historial;
    this.inicializar();
  }

  inicializar() {
    this.acumulado = 0;
    this.operadorPendiente = "+";
    this.sustituir = false;
    this.igual = false;
  }

  ponerDigito(digito) {
    if (this.pantalla.textContent == "0") {
      this.pantalla.textContent = digito;
    } else {
      this.pantalla.textContent += digito;
    }
  }

  ponerHistorial() {
    this.historial.textContent =
      this.getAcumulado() + " " + this.operadorPendiente;
  }

  ponerHistorialResultado(acumulado,operador,operando,signo) {
    return acumulado + " " + operador + " " + operando + " " + signo;
  }

  ponerDecimal() {
    if (!this.igual) {
      if (this.sustituir) {
        this.borrarPantalla();
        this.sustituir = false;
      } else {
        if (this.pantalla.textContent.match(/\d+\.\d*/))
          throw Error("Ya existe un valor decimal");
      }
      this.pantalla.textContent += ".";
    }
  }

  cambiarSigno() {
    if (this.pantalla.textContent == "0")
      throw Error("No se puede cambiar de signo al 0");
    if (!this.igual) {
      if (this.pantalla.textContent.match(/^-/)) {
        this.pantalla.textContent = this.pantalla.textContent.replace(/^-/, "");
      } else {
        this.pantalla.textContent = "-" + this.pantalla.textContent;
      }
    }
  }

  sustituirOperando() {
    if (this.sustituir) {
      this.borrarPantalla();
      this.sustituir = false;
    }
  }

  reiniciarCalculadora() {
    this.inicializar();
    this.historial.textContent = "";
    this.pantalla.textContent = "0";
  }

  borrarDigito() {
    if (!this.sustituir) {
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
  }

  borrarPantalla() {
    this.pantalla.textContent = "0";
  }

  getAcumulado() {
    return this.acumulado;
  }

  calcula(operando2, nuevoOperador) {
    this.operando = operando2;
    switch (this.operadorPendiente) {
      case "+":
        this.acumulado += operando2;
        break;
      case "-":
        this.acumulado -= operando2;
        break;
      case "x":
        this.acumulado *= operando2;
        break;
      case "/":
        this.acumulado /= operando2;
        break;
      case "=":
        break;
      default:
        throw new Error("Operación no soportada.");
    }
    this.operadorPendiente = nuevoOperador;
    return this.getAcumulado();
  }
}
