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


    describe('Ejercicio3', () => {
        describe('Array OK', () => {
            it('Genera array', () => {
                let array = Ejercicio3(4,9);
                expect(array.length).toEqual(4);
                expect(array).toEqual([9,9,9,9])
            })
        })


        describe('Array KO', () => {
            it('Falta el parámetro', () => {
                expect(() => Ejercicio3(4)).toThrow();
                expect(() => Ejercicio3()).toThrow();
            });

            it('Parámetro no es válido', () => {
                expect(() => Ejercicio3(4,"a")).toThrow();
                expect(() => Ejercicio3("a",4)).toThrow();
                expect(() => Ejercicio3("a","d")).toThrow();
            })
        })
    })


    describe('Ejercicio4',() => {
        let primos1 = Ejercicio4(5);
        let primos2 = Ejercicio4(10);

        describe ('Primo OK', () => {
            it('Primos válidos', () => {
                expect(primos1).toEqual([2, 3, 5, 7, 11])
                expect(primos2).toEqual([2, 3, 5, 7, 11, 13, 17, 19, 23, 29])
            })

            it('Longitud válida', () => {
                expect(primos1.length).toEqual(5);
                expect(primos2.length).toEqual(10);
            })
        })

        describe('Primo KO', () => {
            it('Falta el parámetro', () => {
                expect(() => Ejercicio4()).toThrow();
            });

            it('Parámetro no es válido', () => {
                expect(() => Ejercicio4("a")).toThrow();
            })

        })
        
    })


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


    describe('Ejercicio6', () => {
        describe('Palindromo OK', () => {
            ['A Bali su flan anal fusilaba','No subas, abusón','¿Será lodo o dólares?','Adivina ya te opina,' + 
            ' ya ni miles origina, ya ni cetro me domina, ya ni monarcas, a repaso ni mulato carreta, acaso nicotina,' + 
            ' ya ni cita vecino, anima cocina, pedazo gallina, cedazo terso nos retoza de canilla goza, de pánico camina,' + 
            ' ónice vaticina, ya ni tocino saca, a terracota luminosa pera, sacra nómina y ánimo de mortecina, ya ni giros elimina,' + 
            ' ya ni poeta, ya ni vida'].forEach(caso => {
                it (`Palindromo: ${caso}`, () => {
                    expect(Ejercicio6(caso)).toBeTrue();
                })
            })
        })

        describe('Palindromo KO', () => {
            ['Yo no soy un palíndromo','Hola caracola',
            'No bajes, abusón','¿Serán lodo o dólares?'].forEach(caso => {
                it(`Palindromo: ${caso}`, () => {
                    expect(Ejercicio6(caso)).toBeFalse();
                })
            })
        })



    })
    
})