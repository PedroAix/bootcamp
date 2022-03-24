import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculadora',
  templateUrl: './calculadora.component.html',
  styleUrls: ['./calculadora.component.css'],
})
export class CalculadoraComponent implements OnInit {
  public pantalla: string = '0';
  public historial: string = '';
  public acumulado: number;
  public operando: number;
  public operadorPendiente: string;
  public sustituir: boolean;
  public igual: boolean;

  constructor() {
    this.acumulado = 0;
    this.operando = 0;
    this.operadorPendiente = '+';
    this.sustituir = false;
    this.igual = false;
  }

  inicializar() {
    this.acumulado = 0;
    this.operadorPendiente = '+';
    this.sustituir = false;
    this.igual = false;
  }

  ponDigito(digito: number): void {
    if (this.igual) this.reiniciarCalculadora();
    this.sustituirOperando();
    if (this.pantalla == '0') this.pantalla = digito.toString();
    else this.pantalla += digito.toString();
  }

  ponerHistorial() {
    this.historial =
      this.getAcumulado() + " " + this.operadorPendiente;
  }

  ponerHistorialResultado(acumulado: number,operador: string, operando: string, signo: string) {
    this.historial = acumulado + " " + operador + " " + operando + " " + "=";
  }

  ponerDecimal() {
    if (!this.igual) {
      if (this.sustituir) {
        this.borrarPantalla();
        this.sustituir = false;
      } else {
        if (this.pantalla.match(/\d+\.\d*/))
          throw Error("Ya existe un valor decimal");
      }
      this.pantalla += ".";
    }
  }

pulsarOperador(operando: string, operador: string): void {
  if (!this.igual) {
    this.sustituir = true;
    this.calcula(operando, operador)
    this.pantalla = this.getAcumulado().toString();
    this.ponerHistorial();
  }
}

  pulsarIgual(operando: string): void {
    if(!this.igual){
      this.sustituir = true;
      this.ponerHistorialResultado(this.getAcumulado(),this.operadorPendiente,operando,'=');
      this.calcula(operando,this.operadorPendiente)
      this.igual = true;
      this.pantalla = this.getAcumulado().toString();
    }
  }

  cambiarSigno() {
    if (this.pantalla == "0")
      throw Error("No se puede cambiar de signo al 0");
    if (!this.igual) {
      if (this.pantalla.match(/^-/)) {
        this.pantalla = this.pantalla.replace(/^-/, "");
      } else {
        this.pantalla = "-" + this.pantalla;
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
    this.historial = "";
    this.pantalla = "0";
  }

  borrarDigito() {
    if (!this.sustituir) {
      let longitud = this.pantalla.length;
      if (longitud <= 1) {
        this.pantalla = "0";
      } else {
        this.pantalla = this.pantalla.substr(
          0,
          longitud - 1
        );
      }
    }
  }

  borrarPantalla() {
    this.pantalla = "0";
  }

  getAcumulado() {
    return this.acumulado;
  }

  calcula(operando2: string, nuevoOperador: string): void {
    if(!this.igual) {
      this.sustituir = true;
    let operando3: number = Number(operando2);
    this.operando = operando3;
    switch (this.operadorPendiente) {
      case "+":
        this.acumulado += operando3;
        break;
      case "-":
        this.acumulado -= operando3;
        break;
      case "x":
        this.acumulado *= operando3;
        break;
      case "/":
        this.acumulado /= operando3;
        break;
      case "=":
        break;
      default:
        throw new Error("Operación no soportada.");
    }
    this.operadorPendiente = nuevoOperador;
    this.getAcumulado();

    }
  }

  ngOnInit(): void {}
}
