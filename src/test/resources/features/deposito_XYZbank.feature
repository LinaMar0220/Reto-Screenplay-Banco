Feature: Deposito XYZ Bank
  yo como usuario de XYZ Bank
  Quiero autenticarme
  para realizar un deposito en la pagina

  Background : Abrir XYZ Bank
    Given que Lina se encuentra en la pagina principal

  Scenario: Deposito exitoso
    When ella ingresa a la opcion de cliente
    And ingresa la informacion para la creacion del ciente
    And diligencie la informacion requerida para la creacion de cuenta asociada al cliente creado
    Then el usuario deberia ingresar a la transaccion y verla de forma exitosa
