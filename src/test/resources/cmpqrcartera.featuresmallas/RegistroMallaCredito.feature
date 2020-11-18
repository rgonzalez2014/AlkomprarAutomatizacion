Feature: Realizar el registro de un turno de credito

  Scenario Outline: Registrar un turno para el area de credito
    Given Se despliega la pagina CRM Alkomprar
    And El administrador ingresa las credenciales
      | usuario   | password   |
      | <Usuario> | <Password> |
    When Se ingresa al modulo mallas de turno
    And Se hace clic en agregar
    Then  Se registran los datos del turno para credito
      | area   | asesor   | fechainicio   | fechafin   | horainicio   | horafin   | pausa   | horainiciopausa   | horafinpausa   |
      | <Area> | <Asesor> | <Fechainicio> | <Fechafin> | <Horainicio> | <Horafin> | <Pausa> | <Horainiciopausa> | <Horafinpausa> |
    And Se genera un mensaje

    Examples:
      | Usuario  | Password | Area    | Asesor                | Fechainicio | Fechafin   | Horainicio | Horafin | Pausa    | Horainiciopausa | Horafinpausa |
      | adminpqr | 123      | Credito | Asesor malla turnos 1 | 2020-06-20  | 2020-06-20 | 0800am     | 0400pm  | Almuerzo | 1400pm          | 1420pm       |
