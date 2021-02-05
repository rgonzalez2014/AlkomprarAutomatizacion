Feature: Realizar el registro de una campana

  @PredictivaCartera
  Scenario Outline: Registrar una campana de cartera predictiva
    Given Se despliega la pagina CRM Alkomprar
    And El administrador ingresa las credenciales
      | usuario   | password   |
      | <Usuario> | <Password> |
    When Se ingresa al modulo campanas
    And Se hace clic en crear
    Then Se registran los datos de la campana de cartera predictiva
      | nombre   | fechainicio   | fechafin   | horainicio   | horafin   | dias   | actualizar   | area   | canal   | responsable   | gestion   | campanavicidial   | observaciones   |
      | <Nombre> | <FechaInicio> | <FechaFin> | <HoraInicio> | <HoraFin> | <Dias> | <Actualizar> | <Area> | <Canal> | <Responsable> | <Gestion> | <CampanaVicidial> | <Observaciones> |
    And Y al guardar se presenta la pagina principal

    Examples:
      | Usuario  | Password | Nombre             | FechaInicio | FechaFin   | HoraInicio | HoraFin | Dias | Actualizar | Area    | Canal | Responsable         | Gestion | CampanaVicidial                | Observaciones  |
      | adminpqr | 123      | Cartera Predictiva | 2020-12-15  | 2020-12-15 | 0800am     | 0600pm  | 1    | SI         | Cartera | 1     | Administrador Pqr 1 | 419     | MED Campaña Cartera Predictiva | automatizacion |


  @ProgresivaCartera
  Scenario Outline: Registrar una campana de cartera progresiva
    Given Se despliega la pagina CRM Alkomprar
    And El administrador ingresa las credenciales
      | usuario   | password   |
      | <Usuario> | <Password> |
    When Se ingresa al modulo campanas
    And Se hace clic en crear
    Then Se registran los datos de la campana de cartera progresiva
      | nombre   | fechainicio   | fechafin   | horainicio   | horafin   | dias   | actualizar   | area   | canal   | responsable   | gestion   | campanavicidial   | observaciones   |
      | <Nombre> | <FechaInicio> | <FechaFin> | <HoraInicio> | <HoraFin> | <Dias> | <Actualizar> | <Area> | <Canal> | <Responsable> | <Gestion> | <CampanaVicidial> | <Observaciones> |
    And Y al guardar se presenta la pagina principal

    Examples:
      | Usuario  | Password | Nombre             | FechaInicio | FechaFin   | HoraInicio | HoraFin | Dias | Actualizar | Area    | Canal | Responsable         | Gestion | CampanaVicidial                | Observaciones  |
      | adminpqr | 123      | cartera progresiva | 2020-12-16  | 2020-12-16 | 0800am     | 0600pm  | 1    | SI         | Cartera | 2     | Administrador Pqr 1 | 383     | MED Campaña Cartera Progresiva | automatizacion |

  @MensajesCartera
  Scenario Outline: Registrar una campana de cartera mensajes
    Given Se despliega la pagina CRM Alkomprar
    And El administrador ingresa las credenciales
      | usuario   | password   |
      | <Usuario> | <Password> |
    When Se ingresa al modulo campanas
    And Se hace clic en crear
    Then Se registran los datos de la campana de cartera mensajes
      | nombre   | fechainicio   | fechafin   | horainicio   | horafin   | dias   | actualizar   | area   | canal   | responsable   | plantilla   | observaciones   |
      | <Nombre> | <FechaInicio> | <FechaFin> | <HoraInicio> | <HoraFin> | <Dias> | <Actualizar> | <Area> | <Canal> | <Responsable> | <Plantilla> | <Observaciones> |
    And Y al guardar se presenta la pagina principal

    Examples:
      | Usuario  | Password | Nombre           | FechaInicio | FechaFin   | HoraInicio | HoraFin | Dias | Actualizar | Area    | Canal | Responsable         | Plantilla    | Observaciones  |
      | adminpqr | 123      | cartera mensajes | 2020-12-16  | 2020-12-16 | 0800am     | 0600pm  | 1    | SI         | Cartera | 5     | Administrador Pqr 1 | CON VARIABLE | automatizacion |

  @GrabacionesCartera
  Scenario Outline: Registrar una campana de cartera grabaciones
    Given Se despliega la pagina CRM Alkomprar
    And El administrador ingresa las credenciales
      | usuario   | password   |
      | <Usuario> | <Password> |
    When Se ingresa al modulo campanas
    And Se hace clic en crear
    Then Se registran los datos de la campana de cartera grabaciones
      | nombre   | fechainicio   | fechafin   | horainicio   | horafin   | dias   | actualizar   | area   | canal   | responsable   | campanavicidial   | observaciones   |
      | <Nombre> | <FechaInicio> | <FechaFin> | <HoraInicio> | <HoraFin> | <Dias> | <Actualizar> | <Area> | <Canal> | <Responsable> | <CampanaVicidial> | <Observaciones> |
    And Y al guardar se presenta la pagina principal

    Examples:
      | Usuario  | Password | Nombre              | FechaInicio | FechaFin   | HoraInicio | HoraFin | Dias | Actualizar | Area    | Canal | Responsable         | CampanaVicidial                   | Observaciones  |
      | adminpqr | 123      | cartera grabaciones | 2020-12-17  | 2020-12-17 | 0800am     | 0600pm  | 1    | SI         | Cartera | 4     | Administrador Pqr 1 | Grabaciones automáticas CARTERA 1 | automatizacion |

  @ManCartera
  Scenario Outline: Registrar una campana de cartera manual
    Given Se despliega la pagina CRM Alkomprar
    And El administrador ingresa las credenciales
      | usuario   | password   |
      | <Usuario> | <Password> |
    When Se ingresa al modulo campanas
    And Se hace clic en crear
    Then Se registran los datos de la campana de cartera m
      | nombre   | fechainicio   | fechafin   | horainicio   | horafin   | dias   | actualizar   | area   | canal   | responsable   | gestion   | observaciones   |
      | <Nombre> | <FechaInicio> | <FechaFin> | <HoraInicio> | <HoraFin> | <Dias> | <Actualizar> | <Area> | <Canal> | <Responsable> | <Gestion> | <Observaciones> |
    And Y al guardar se presenta la pagina principal

    Examples:
      | Usuario  | Password | Nombre         | FechaInicio | FechaFin   | HoraInicio | HoraFin | Dias | Actualizar | Area    | Canal | Responsable         | Gestion | Observaciones  |
      | adminpqr | 123      | cartera manual | 2020-12-18  | 2020-12-18 | 0800am     | 0600pm  | 1    | SI         | Cartera | 3     | Administrador Pqr 1 | 419     | automatizacion |


  @PredictivaSac
  Scenario Outline: Registrar una campana de servicio al cliente predictiva
    Given Se despliega la pagina CRM Alkomprar
    And El administrador ingresa las credenciales
      | usuario   | password   |
      | <Usuario> | <Password> |
    When Se ingresa al modulo campanas
    And Se hace clic en crear
    Then Se registran los datos de la campana de servicio al cliente predictiva
      | nombre   | fechainicio   | fechafin   | horainicio   | horafin   | dias   | actualizar   | area   | canal   | responsable   | gestion   | campanavicidial   | observaciones   |
      | <Nombre> | <FechaInicio> | <FechaFin> | <HoraInicio> | <HoraFin> | <Dias> | <Actualizar> | <Area> | <Canal> | <Responsable> | <Gestion> | <CampanaVicidial> | <Observaciones> |
    And Y al guardar se presenta la pagina principal

    Examples:
      | Usuario  | Password | Nombre                         | FechaInicio | FechaFin   | HoraInicio | HoraFin | Dias | Actualizar | Area                | Canal      | Responsable         | Gestion  | CampanaVicidial         | Observaciones  |
      | adminpqr | 123      | servicio al cliente predictiva | 2020-09-27  | 2020-09-27 | 0800am     | 0600pm  | 1    | SI         | Servicio al cliente | Predictiva | Administrador Pqr 1 | Aprobado | Campana Predictiva SAC1 | automatizacion |

  @ProgresivaSac
  Scenario Outline: Registrar una campana de servicio al cliente progresiva
    Given Se despliega la pagina CRM Alkomprar
    And El administrador ingresa las credenciales
      | usuario   | password   |
      | <Usuario> | <Password> |
    When Se ingresa al modulo campanas
    And Se hace clic en crear
    Then Se registran los datos de la campana de servicio al cliente progresiva
      | nombre   | fechainicio   | fechafin   | horainicio   | horafin   | dias   | actualizar   | area   | canal   | responsable   | gestion   | campanavicidial   | observaciones   |
      | <Nombre> | <FechaInicio> | <FechaFin> | <HoraInicio> | <HoraFin> | <Dias> | <Actualizar> | <Area> | <Canal> | <Responsable> | <Gestion> | <CampanaVicidial> | <Observaciones> |
    And Y al guardar se presenta la pagina principal

    Examples:
      | Usuario  | Password | Nombre                         | FechaInicio | FechaFin   | HoraInicio | HoraFin | Dias | Actualizar | Area                | Canal      | Responsable         | Gestion      | CampanaVicidial                | Observaciones  |
      | adminpqr | 123      | servicio al cliente progresiva | 2020-09-26  | 2020-09-26 | 0800am     | 0600pm  | 1    | SI         | Servicio al cliente | Progresiva | Administrador Pqr 1 | Buzon de voz | MED Campana Cartera Progresiva | automatizacion |


  @MensajesSac
  Scenario Outline: Registrar una campana de servicio al cliente mensajes
    Given Se despliega la pagina CRM Alkomprar
    And El administrador ingresa las credenciales
      | usuario   | password   |
      | <Usuario> | <Password> |
    When Se ingresa al modulo campanas
    And Se hace clic en crear
    Then Se registran los datos de la campana de servicio al cliente mensajes
      | nombre   | fechainicio   | fechafin   | horainicio   | horafin   | dias   | actualizar   | area   | canal   | responsable   | plantilla   | observaciones   |
      | <Nombre> | <FechaInicio> | <FechaFin> | <HoraInicio> | <HoraFin> | <Dias> | <Actualizar> | <Area> | <Canal> | <Responsable> | <Plantilla> | <Observaciones> |
    And Y al guardar se presenta la pagina principal

    Examples:
      | Usuario  | Password | Nombre                       | FechaInicio | FechaFin   | HoraInicio | HoraFin | Dias | Actualizar | Area                | Canal            | Responsable         | Plantilla                | Observaciones  |
      | adminpqr | 123      | servicio al cliente mensajes | 2020-09-25  | 2020-09-25 | 0800am     | 0600pm  | 1    | SI         | Servicio al cliente | Mensaje de Texto | Administrador Pqr 1 | Mensaje cartera 22052020 | automatizacion |

  @GrabacionesSac
  Scenario Outline: Registrar una campana de sac grabaciones
    Given Se despliega la pagina CRM Alkomprar
    And El administrador ingresa las credenciales
      | usuario   | password   |
      | <Usuario> | <Password> |
    When Se ingresa al modulo campanas
    And Se hace clic en crear
    Then Se registran los datos de la campana de servicio al cliente grabaciones
      | nombre   | fechainicio   | fechafin   | horainicio   | horafin   | dias   | actualizar   | area   | canal   | responsable   | campanavicidial   | observaciones   |
      | <Nombre> | <FechaInicio> | <FechaFin> | <HoraInicio> | <HoraFin> | <Dias> | <Actualizar> | <Area> | <Canal> | <Responsable> | <CampanaVicidial> | <Observaciones> |
    And Y al guardar se presenta la pagina principal

    Examples:
      | Usuario  | Password | Nombre                          | FechaInicio | FechaFin   | HoraInicio | HoraFin | Dias | Actualizar | Area    | Canal            | Responsable         | CampanaVicidial                 | Observaciones  |
      | adminpqr | 123      | servicio al cliente grabaciones | 2020-09-24  | 2020-09-24 | 0800am     | 0600pm  | 1    | SI         | Cartera | Mensaje de Texto | Administrador Pqr 1 | campana Grabacion Retorno al PV | automatizacion |
