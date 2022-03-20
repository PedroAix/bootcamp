describe("Calculadora", () => {
  beforeEach(() => {
    this.calculadora = new Calculadora(
      document.querySelector(".pantalla"),
      document.querySelector(".historial")
    );
  });

  describe("Calcula OK", () => {
    it("Calcula sumas", () => {
      this.calculadora.calcula(5, "+");
      this.calculadora.calcula(8, "=");

      expect(this.calculadora.getAcumulado()).toEqual(13);
    });

    it("Calcula restas", () => {
      this.calculadora.calcula(5, "-");
      this.calculadora.calcula(8, "=");

      expect(this.calculadora.getAcumulado()).toEqual(-3);
    });

    it("Calcula multiplicaciones", () => {
      this.calculadora.calcula(5, "x");
      this.calculadora.calcula(8, "=");

      expect(this.calculadora.getAcumulado()).toEqual(40);
    });

    it("Calcula divisiones", () => {
      this.calculadora.calcula(5, "/");
      this.calculadora.calcula(8, "=");

      expect(this.calculadora.getAcumulado()).toEqual(0.625);
    });
  });

  describe('Calcula KO', () => {
      it('Operación no soportada', () => {
        this.calculadora.calcula(3,7)

        expect(() => this.calculadora.calcula(3,"=")).toThrow();
    })
  })
});
