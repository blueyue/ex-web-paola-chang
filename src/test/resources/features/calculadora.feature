#language: es

  @testfeature
  Característica: Operando con la calculadora
          Como un usuario
          Deseo operar con diferentes valores en la calculadora
          Para asi poder sacar mis cuentas

    Antecedentes:
      Dado que me encuentro en la pagina de la calculadora

    Escenario: Operando con el operador suma exitosamente
      Cuando sumo el nro 2 y el 3
      Entonces obtendré como respuesta 5

    Escenario: Operando con el operador resta exitosamente
      Cuando resto el nro 5 y el 3
      Entonces obtendré como respuesta 2

    Escenario: Operando con el operador multiplicacion exitosamente
      Cuando multiplico el nro 2 y el 3
      Entonces obtendré como respuesta 6

    Escenario: Operando con el operador division exitosamente
      Cuando divido el nro 22 y el 11
      Entonces obtendré como respuesta 2

    Escenario: Operando con el operador resta exitosamente
      Cuando resto el nro "dds" y el 5 de forma erronea
      Entonces obtendré como respuesta error



