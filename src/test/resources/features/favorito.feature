# language: es

  Característica: Verificar agregar producto a la lista de deseos
    Escenario: Usuario agrega producto a la lista de deseos
      Dado que el usuario ingresa a la pagina de OpenCart
      Y el usuario ingresa al login
      Cuando el usuario ingresa credenciales validas
      Entonces puede agregar un producto a la lista de deseos
      Y se muestra la alerta indicando que se agregó el producto Ok
