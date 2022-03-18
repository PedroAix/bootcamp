describe('Pruebas de los ejercicios', () => {
    describe('Ejercicio1', () => {
        describe('OK', () => {
                it('Genera aleatorio', () => {
                    let spy = spyOn(Math, "random");
                    let num = Ejercicio1(1,100);
                    expect(spy).toHaveBeenCalled()
                    // expect(num).toBeGreaterThanOrEqual(1)
                    // expect(num).toBeLessThanOrEqual(100)

                })
        });

        describe('KO', () => {
            it('Falta parámetro', () => {
                    expect(() => Ejercicio1(1)).toThrow();
                })

            it('Parámetro no válido', () => {
                expect(() => Ejercicio1(1,"p")).toThrow();
            })
        })
    
    });

    describe('Ejercicio2', () => {
        it('Pendiente')
    });


    describe('Ejercicio5', () => {
        describe('NIF OK', () => {
            ["12345678Z","12345678z", "48730352E"].forEach(caso => {
                it(`NIF: ${caso}`, () => {
                    expect(Ejercicio5(caso)).toBeTrue();
                })
            })
        })

        describe('NIF KO', () => {
            ["12345678T","1234568z", "48730352F"].forEach(caso => {
                it(`NIF: ${caso}`, () => {
                    expect(Ejercicio5(caso)).toBeFalse();
                })
            })
        })
        
    });
    
})