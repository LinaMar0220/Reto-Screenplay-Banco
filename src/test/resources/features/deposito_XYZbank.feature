Feature: Deposito XYZ Bank
  yo como usuario de XYZ Bank
  Quiero autenticarme
  para realizar un deposito en la pagina

  Background: Abrir XYZ Bank
    Given que Lina se encuentra en la pagina principal

  Scenario Outline: Deposito exitoso
    When ella ingresa a la opcion de cliente
    And ingresa la informacion para la creacion del ciente "<nombre>" "<apellido>" y "<codigo>"
    And diligencie la informacion requerida para la creacion de cuenta asociada al cliente creado "<ingreso>"
    And realiza el deposito "<monto>"
    Then el usuario deberia ingresar a la transaccion y verla de forma exitosa
    Examples:
      | nombre  | apellido  | codigo | ingreso | monto |
      | Juanita | Perez     | 0525   | Dollar  | 2500  |
      | Andres  | Sanchez   | 0256   | Pound   | 1350  |
      | Claudia | Fernandez | 0789   | Rupee   | 3864  |

