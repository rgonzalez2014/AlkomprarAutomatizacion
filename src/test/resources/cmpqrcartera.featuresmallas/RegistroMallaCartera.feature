Feature: Realizar el registro de un turno de cartera

  Scenario Outline: Registrar un turno para el area de cartera
    Given Se despliega la pagina CRM Alkomprar
    And El administrador ingresa las credenciales
      | usuario   | password   |
      | <Usuario> | <Password> |
    When Se ingresa al modulo mallas de turno
    And Se hace clic en agregar
    Then  Se registran los datos del turno de cartera
      | area   | asesor   | fechainicio   | fechafin   | horainicio   | horafin   | pausa   | horainiciopausa   | horafinpausa   |
      | <Area> | <Asesor> | <Fechainicio> | <Fechafin> | <Horainicio> | <Horafin> | <Pausa> | <Horainiciopausa> | <Horafinpausa> |
    And Se genera un mensaje

    Examples:
      | Usuario  | Password | Area    | Asesor                | Fechainicio | Fechafin   | Horainicio | Horafin | Pausa    | Horainiciopausa | Horafinpausa |
      | adminpqr | 123      | Cartera | Asesor malla turnos 1 | 2020-06-14  | 2020-06-14 | 0800am     | 0600pm  | Almuerzo | 1300pm          | 1400pm       |

