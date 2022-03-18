/*Ejercicio0*/
function Ejercicio0() {
  let cad = prompt("Introduce el nombre");
  alert(`La cadena es ${cad}`);
}

/*Ejercicio1*/
function Ejercicio1(min, max) {
  if (!min || !Number.isInteger(min)) throw new Error("Falta el valor minimo")
  if (!max || !Number.isInteger(max)) throw new Error("Falta el valor maximo")
  if (min >= max) throw new Error("El valor minimo debe ser mayor o igual al maximo")
  return Math.floor(Math.random() * max + min);
}

/*Ejercicio2*/
function Ejercicio2() {
  let numeroAleatorio = Ejercicio1(0, 100);
  let numeroIntentos = 1;
  let terminado = false;
  let numeroIntroducido;

  do {
    while (true) {
      numeroIntroducido = parseInt(
        prompt(
          "INTENTO Nº" + numeroIntentos + "\nIntroduce un número del 1 al 100"
        )
      );

      if (Number.isInteger(numeroIntroducido)) 
        break;
    }

    if (numeroAleatorio == numeroIntroducido) {
      alert("CORRECTO!");
      terminado = true;
    } else {
      numeroIntentos++;
      if (numeroIntroducido > numeroAleatorio)
        alert("**INCORRECTO**\nEl número es más pequeño");
      else alert("**INCORRECTO**\nEl número es más grande");
    }
  } while (!terminado && numeroIntentos <= 10);

  if (numeroIntentos > 10) {
    alert(
      "**INCORRECTO**\nTe has quedado sin intentos!\nEl número secreto era: " +
        numeroAleatorio
    );
    terminado = true;
  }
}

/*Ejercicio3*/
function Ejercicio3(elementos, valor) {
  let array = [];

  for (let i = 0; i < elementos; i++) {
    array[i] = valor;
  }

  return array;
}

/*Ejercicio4*/
function Ejercicio4(cantidad) {
  let cont = 0;
  let numero = 2;
  let numeroPrimo = [];

  function esPrimo(numero) {
    for (i = 2; i < numero; i++) {
      if (numero % i == 0) {
        return false;
      }
    }
    return numero !== 1;
  }

  while (cont !== cantidad) {
    if (esPrimo(numero)) {
      cont++;
      numeroPrimo.push(numero);
    }
    numero++;
  }

  return numeroPrimo;
}

/*Ejercicio5*/
function Ejercicio5(nif) {
  let re = /^\d{1,8}[A-Z]$/;

  if (nif == null) return true;
  nif = nif.toUpperCase();
  if (!nif.match(re)) return false;
  return (
    "TRWAGMYFPDXBNJZSQVHLCKE".charAt(
      parseInt(nif.substring(0, nif.length - 1)) % 23
    ) == nif.charAt(nif.length - 1)
  );
}

/*Ejercicio6*/
function Ejercicio6(cadena) {
  cadena = cadena
    .toLowerCase()
    .normalize("NFD")
    .replace(/[\u0300-\u036f]/g, "")
    .match(/[a-z]/g)
    .join("");
  return cadena === cadena.split("").reverse().join("");
}

/*Ejercicio7*/
function Ejercicio7() {
  this.inicializar = function () {
    this.numeroBuscado = Ejercicio1(0, 100);
    this.intentos = 0;
    this.encontrado = false;
  };

  this.inicializar();

  this.jugada = function (numeroIntroducido) {
    this.intentos += 1;
    if (this.numeroBuscado == numeroIntroducido) {
      this.encontrado = true;
      this.resultado = "Bieeen!!! Acertaste.";
    } else if (this.intentos >= 10) {
      this.resultado =
        "Upsss! Se acabaron los intentos, el número era el " +
        this.numeroBuscado;
    } else if (this.numeroBuscado > numeroIntroducido) {
      this.resultado = "Mi número es mayor.";
    } else {
      this.resultado = "Mi número es menor.";
    }
  };

  this.getResultado = function () {
    return this.resultado;
  };

  this.getFinalizado = function () {
    return this.intentos >= 10 || this.encontrado;
  };

  this.getJugada = function () {
    return this.intentos;
  };
}

/*Ejercicio8*/
class JuegoConClase {
  constructor() {
    this.inicializar();
  }

  inicializar() {
    this.numeroBuscado = Ejercicio1(0, 100);
    this.intentos = 0;
    this.encontrado = false;
  }

  jugada(numeroIntroducido) {
    this.intentos += 1;
    if (this.numeroBuscado == numeroIntroducido) {
      this.encontrado = true;
      this.resultado = "Bieeen!!! Acertaste.";
    } else if (this.intentos >= 10) {
      this.resultado =
        "Upsss! Se acabaron los intentos, el número era el " +
        this.numeroBuscado;
    } else if (this.numeroBuscado > numeroIntroducido) {
      this.resultado = "Mi número es mayor.";
    } else {
      this.resultado = "Mi número es menor.";
    }
  }
  getResultado() {
    return this.resultado;
  }

  getFinalizado() {
    return this.intentos >= 10 || this.encontrado;
  }

  getJugada() {
    return this.intentos;
  }
}
