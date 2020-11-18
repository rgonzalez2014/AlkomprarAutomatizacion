Feature: Realizar el registro de un turno de despachos

  Scenario Outline: Registrar un turno para el area de despachos
    Given Se despliega la pagina CRM Alkomprar
    And El administrador ingresa las credenciales
      | usuario   | password   |
      | <Usuario> | <Password> |
    When Se ingresa al modulo mallas de turno
    And Se hace clic en agregar
    Then  Se registran los datos del turno para despachos
      | area   | asesor   | fechainicio   | fechafin   | horainicio   | horafin   |
      | <Area> | <Asesor> | <Fechainicio> | <Fechafin> | <Horainicio> | <Horafin> |
    And Se genera un mensaje

    Examples:
      | Usuario   | Password | Area      | Asesor                | Fechainicio | Fechafin   | Horainicio | Horafin |
      | adminpqr | 123      | Despachos | Asesor malla turnos 1 | 2020-06-16  | 2020-06-16 | 0800am     | 0800pm  |

