# language: es

Característica: Verificar agregar producto a la lista de deseos
  Escenario: Usuario agrega producto a la lista de deseos
    Dado que el usuario ingresa a la pagina de OpenCart
    Y el usuario ingresa al login
    Cuando el usuario ingresa credenciales validas
    Entonces puede agregar un producto a la lista de deseos
    Y puede agregar un producto al carrito
    Y valida que se agrego ok al carrito