// class Calculadora {
//   constructor(pantalla) {
//     this.pantalla = pantalla;
//     this.activo = 0;
//     // this.OPERACIONES_SOPORTADAS = "+-*/%"
//     // this.acumulado = "0";
//     // this.operadorPendiente = "+";
//   }

//   imprimir(value) {
//     this.pantalla.textContent += value;
//   }

//   ponDigito(digito) {
//     //CONSEGUIR QUE LOS NÚMEROS NO SE SALGAN DE LA PANTALLA
//     if (this.pantalla.textContent == "0") {
//       this.pantalla.textContent = digito;
//     } else {
//       this.pantalla.textContent += digito;
//     }
//     console.log(this.pantalla.textContent);
//   }

//   borraDigito() {
//       let longitud = this.pantalla.textContent.length;

//     if (longitud <= 1) {
//       this.pantalla.textContent = "0";
//     } else {
//       if (this.pantalla.textContent.substr(longitud - 1) == ",") {
//         this.activo = 0;
//       }
//       this.pantalla.textContent = this.pantalla.textContent.substr(
//         0,
//         longitud - 1
//       );
//     }
//     console.log(this.pantalla.textContent);
//   }

//   limpiarPantalla() {
//     this.pantalla.textContent = "0";
//     this.activo = 0;
//   }

//   ponDecimal() {
//     if (!this.activo) {
//       this.pantalla.textContent += ",";
//       this.activo = 1;
//     }
//   }

//   isOperacion(operacion) {
//     return this.OPERACIONES_SOPORTADAS.indexOf(operacion) != -1
// }

//   calcula(operando2, nuevoOperador) {
//     if (!this.isOperacion(nuevoOperador)) {
//         throw new Error("Operación no soportada.");
//     }
//     let operando = new (operando2);
//     switch (operadorPendiente) {
//         case '+':
//             acumulado = acumulado.add(new BigDecimal(operando2));
//             break;
//         case '-':
//             acumulado = acumulado.subtract(new BigDecimal(operando2));
//             break;
//         case '*':
//             acumulado = acumulado.multiply(new BigDecimal(operando2));
//             break;
//         case '/':
//             acumulado = acumulado.divide(new BigDecimal(operando2), MathContext.DECIMAL64);
//             break;
//         case '%':
//             acumulado = acumulado.remainder(new BigDecimal(operando2));
//             break;
//         case '=':
//             break;
//         default:
//             throw new CalculadoraException("Operación no soportada.");
//     }
//     this.operadorPendiente = nuevoOperador;
//     return getAcumulado();
// }
// }

class Calculadora {
  constructor(pantalla) {
    this.pantalla = pantalla;
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
    this.activo = 0;
  }

  getTotal() {
    console.log(this.total);
    return this.total;
    
  }

  calcula(operando2, nuevoOperador) {
    operando2 = parseInt(operando2);

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
