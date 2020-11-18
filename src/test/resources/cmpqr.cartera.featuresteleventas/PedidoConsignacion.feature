@CedulaCiudadania
Feature: Realizar el registro de un pedido con medio de pago Consignacion

  Scenario Outline: Crear un pedido con pago Consignacion
    Given Se despliega la pagina CRM Alkomprar y se ingresan las credenciales
      | usuario   | password   |
      | <Usuario> | <Password> |
    When Se ingresa al modulo de Televentas y se hace clic en Crear
    Then Se registra el formulario Cliente Factura con una CC
      | unidadventa   | facturacionelectronica   | tipodocumento   | numerodocumento   | primernombre   | segundonombre   | primerapellido   | segundoapellido   | ciudad   | direccion   | barrio   | celular   | fijo   | email   | genero   | habeas   |
      | <UnidadVenta> | <FacturacionElectronica> | <TipoDocumento> | <NumeroDocumento> | <PrimerNombre> | <SegundoNombre> | <PrimerApellido> | <SegundoApellido> | <Ciudad> | <Direccion> | <Barrio> | <Celular> | <Fijo> | <Email> | <Genero> | <Habeas> |
    And Se registra el formulario Cliente Envio con una CC
      | tipodocumento_2   | numerodocumento_2   | primernombre_2   | segundonombre_2   | primerapellido_2   | segundoapellido_2   | ciudad_2   | direccion_2   | barrio_2   | celular_2   | fijo_2   | email_2   | genero_2   |
      | <TipoDocumento_2> | <NumeroDocumento_2> | <PrimerNombre_2> | <SegundoNombre_2> | <PrimerApellido_2> | <SegundoApellido_2> | <Ciudad_2> | <Direccion_2> | <Barrio_2> | <Celular_2> | <Fijo_2> | <Email_2> | <Genero_2> |
    And Se agregan los productos al pedido
      | ean   | cantidad   |
      | <Ean> | <Cantidad> |
    And Se seleccionan las fechas y el medio de pago consignacion
      | consignacion   | observaciones   |
      | <Consignacion> | <Observaciones> |
    Then El pedido queda creado

    Examples:
      | Usuario      | Password | UnidadVenta | FacturacionElectronica | TipoDocumento | NumeroDocumento | PrimerNombre | SegundoNombre | PrimerApellido | SegundoApellido | Ciudad | Direccion             | Barrio                     | Celular    | Fijo    | Email                                 | Genero    | Habeas | TipoDocumento_2 | NumeroDocumento_2 | PrimerNombre_2 | SegundoNombre_2 | PrimerApellido_2 | SegundoApellido_2 | Ciudad_2 | Direccion_2           | Barrio_2                   | Celular_2  | Fijo_2  | Email_2                | Genero_2 | Ean           | Cantidad | Consignacion | Observaciones          |
      | asesor_roger | 123      | ALFLO       | Si                     | C.C           | 31505117        | Miguel       | Santiago      | Nunez          | Ruiz            | Bogotá | CL 35 SUR # 78 Q - 29 | Super Manzana 9B - Kennedy | 3214072323 | 6812121 | roger.gonzalez.ext@colcomercio.com.co | Masculino | NO     | C.C             | 1010111186        | Camila         | Ines            | Martinez         | Perez             | Bogotá   | CL 35 SUR # 78 Q - 29 | Super Manzana 9B - Kennedy | 3114997098 | 8056776 | dianatrivi@hotmail.com | Femenino | 7705946463560 | 1        | 7            | test cedula ciudadania |

  @GestionCedula
  Scenario Outline: Asignar el estado casa cliente pendiente al pedido
    Given Se despliega la pagina CRM Alkomprar y se ingresan las credenciales de confirmador
      | usuario   | password   |
      | <Usuario> | <Password> |
    When Se ingresa al modulo de televentas y se busca el pedido
    Then Se dirige a la pestana gestionar y registra los datos
      | casaclientependiente   | valorconsignacion   | observaciones_2   |
      | <CasaClientePendiente> | <ValorConsignacion> | <Observaciones_2> |
    And Se guardan los cambios
    Then El pedido queda gestionado

    Examples:
      | Usuario           | Password | CasaClientePendiente | ValorConsignacion | Observaciones_2                         |
      | confirmador_roger | 123      | 3                    | 30000             | se asigno estado casa cliente pendiente |

  @CedulaExtranjeria
  Scenario Outline: Crear un pedido con pago Consignacion
    Given Se despliega la pagina CRM Alkomprar y se ingresan las credenciales
      | usuario   | password   |
      | <Usuario> | <Password> |
    When Se ingresa al modulo de Televentas y se hace clic en Crear
    Then Se registra el formulario Cliente Factura con una CE
      | unidadventa   | facturacionelectronica   | tipodocumento   | numerodocumento   | primernombre   | segundonombre   | primerapellido   | segundoapellido   | ciudad   | direccion   | barrio   | celular   | fijo   | email   | genero   | habeas   |
      | <UnidadVenta> | <FacturacionElectronica> | <TipoDocumento> | <NumeroDocumento> | <PrimerNombre> | <SegundoNombre> | <PrimerApellido> | <SegundoApellido> | <Ciudad> | <Direccion> | <Barrio> | <Celular> | <Fijo> | <Email> | <Genero> | <Habeas> |
    And Se registra el formulario Cliente Envio con una CE
      | tipodocumento_2   | numerodocumento_2   | primernombre_2   | segundonombre_2   | primerapellido_2   | segundoapellido_2   | ciudad_2   | direccion_2   | barrio_2   | celular_2   | fijo_2   | email_2   | genero_2   |
      | <TipoDocumento_2> | <NumeroDocumento_2> | <PrimerNombre_2> | <SegundoNombre_2> | <PrimerApellido_2> | <SegundoApellido_2> | <Ciudad_2> | <Direccion_2> | <Barrio_2> | <Celular_2> | <Fijo_2> | <Email_2> | <Genero_2> |
    And Se agregan los productos al pedido
      | ean   | cantidad   |
      | <Ean> | <Cantidad> |
    And Se seleccionan las fechas y el medio de pago consignacion
      | consignacion   | observaciones   |
      | <Consignacion> | <Observaciones> |
    Then El pedido queda creado

    Examples:
      | Usuario        | Password | UnidadVenta | FacturacionElectronica | TipoDocumento | NumeroDocumento | PrimerNombre | SegundoNombre | PrimerApellido | SegundoApellido | Ciudad | Direccion                | Barrio                       | Celular    | Fijo    | Email                                 | Genero    | Habeas | TipoDocumento_2 | NumeroDocumento_2 | PrimerNombre_2 | SegundoNombre_2 | PrimerApellido_2 | SegundoApellido_2 | Ciudad_2 | Direccion_2             | Barrio_2              | Celular_2  | Fijo_2  | Email_2                | Genero_2 | Ean           | Cantidad | Consignacion | Observaciones           |
      | asesor_gabriel | 123      | ALAPA       | No                     | C.E           | 031505          | Jose         | Miguel        | Blanco         | Sire            | Cali   | carrera 100 numero 11 60 | Comuna 22 - Ciudad Campestre | 3104473800 | 5373800 | roger.gonzalez.ext@colcomercio.com.co | Masculino | NO     | C.E             | 25678             | Mary           | Antonia         | Bermudez         | Sanchez           | Cali     | Calle 52 numero 1 b 160 | Comuna 4 - La Alianza | 3114997098 | 8056776 | dianatrivi@hotmail.com | Femenino | 8801643782634 | 1        | 7            | test cedula extranjeria |


  @Nit
  Scenario Outline: Crear un pedido con pago Consignacion
    Given Se despliega la pagina CRM Alkomprar y se ingresan las credenciales
      | usuario   | password   |
      | <Usuario> | <Password> |
    When Se ingresa al modulo de Televentas y se hace clic en Crear
    Then Se registra el formulario Cliente Factura con un NIT
      | unidadventa   | facturacionelectronica   | tipodocumento   | numerodocumento   | razonsocial   | ciudad   | direccion   | barrio   | celular   | fijo   | email   | habeas   |
      | <UnidadVenta> | <FacturacionElectronica> | <TipoDocumento> | <NumeroDocumento> | <RazonSocial> | <Ciudad> | <Direccion> | <Barrio> | <Celular> | <Fijo> | <Email> | <Habeas> |
    And Se registra el formulario Cliente Envio con un NIT
      | tipodocumento_2   | numerodocumento_2   | razonsocial_2   | ciudad_2   | direccion_2   | barrio_2   | celular_2   | fijo_2   | email_2   |
      | <TipoDocumento_2> | <NumeroDocumento_2> | <RazonSocial_2> | <Ciudad_2> | <Direccion_2> | <Barrio_2> | <Celular_2> | <Fijo_2> | <Email_2> |
    And Se agregan los productos al pedido
      | ean   | cantidad   |
      | <Ean> | <Cantidad> |
    And Se seleccionan las fechas y el medio de pago consignacion
      | consignacion   | observaciones   |
      | <Consignacion> | <Observaciones> |
    Then El pedido queda creado

    Examples:
      | Usuario        | Password | UnidadVenta | FacturacionElectronica | TipoDocumento | NumeroDocumento | RazonSocial | Ciudad | Direccion      | Barrio            | Celular    | Fijo    | Email                                 | Habeas | TipoDocumento_2 | NumeroDocumento_2 | RazonSocial_2 | Ciudad_2 | Direccion_2    | Barrio_2          | Celular_2  | Fijo_2  | Email_2                               | Ean           | Cantidad | Consignacion | Observaciones |
      | asesor_xiomara | 123      | ALAPA       | No                     | NIT           | 8600073361      | Colsubsidio | Bogotá | Cra 92 #145-15 | Suba - Las Flores | 3154473800 | 6813271 | roger.gonzalez.ext@colcomercio.com.co | NO     | NIT             | 8600073361        | Colsubsidio   | Bogotá   | Cra 92 #145-15 | Suba - Las Flores | 3154473800 | 6813271 | roger.gonzalez.ext@colcomercio.com.co | 7705946463560 | 1        | 7            | test nit      |


  @Rut
  Scenario Outline: Crear un pedido con pago Consignacion
    Given Se despliega la pagina CRM Alkomprar y se ingresan las credenciales
      | usuario   | password   |
      | <Usuario> | <Password> |
    When Se ingresa al modulo de Televentas y se hace clic en Crear
    Then Se registra el formulario Cliente Factura con un RUT
      | unidadventa   | facturacionelectronica   | tipodocumento   | numerodocumento   | primernombre   | segundonombre   | primerapellido   | segundoapellido   | ciudad   | direccion   | barrio   | celular   | fijo   | email   | genero   | habeas   |
      | <UnidadVenta> | <FacturacionElectronica> | <TipoDocumento> | <NumeroDocumento> | <PrimerNombre> | <SegundoNombre> | <PrimerApellido> | <SegundoApellido> | <Ciudad> | <Direccion> | <Barrio> | <Celular> | <Fijo> | <Email> | <Genero> | <Habeas> |
    And Se registra el formulario Cliente Envio con un RUT
      | tipodocumento_2   | numerodocumento_2   | primernombre_2   | segundonombre_2   | primerapellido_2   | segundoapellido_2   | ciudad_2   | direccion_2   | barrio_2   | celular_2   | fijo_2   | email_2   | genero_2   |
      | <TipoDocumento_2> | <NumeroDocumento_2> | <PrimerNombre_2> | <SegundoNombre_2> | <PrimerApellido_2> | <SegundoApellido_2> | <Ciudad_2> | <Direccion_2> | <Barrio_2> | <Celular_2> | <Fijo_2> | <Email_2> | <Genero_2> |
    And Se agregan los productos al pedido
      | ean   | cantidad   |
      | <Ean> | <Cantidad> |
    And Se seleccionan las fechas y el medio de pago consignacion
      | consignacion   | observaciones   |
      | <Consignacion> | <Observaciones> |
    Then El pedido queda creado

    Examples:
      | Usuario        | Password | UnidadVenta | FacturacionElectronica | TipoDocumento | NumeroDocumento | PrimerNombre | SegundoNombre | PrimerApellido | SegundoApellido | Ciudad | Direccion      | Barrio            | Celular    | Fijo    | Email                                 | Genero   | Habeas | TipoDocumento_2 | NumeroDocumento_2 | PrimerNombre_2 | SegundoNombre_2 | PrimerApellido_2 | SegundoApellido_2 | Ciudad_2 | Direccion_2    | Barrio_2          | Celular_2  | Fijo_2  | Email_2                               | Genero_2 | Ean           | Cantidad | Consignacion | Observaciones |
      | asesor_xiomara | 123      | ALAPA       | No                     | RUT           | 873361900       | Diana        | Maria         | Ramirez        | Suarez          | Bogotá | Cra 92 #145-15 | Suba - Las Flores | 3154473800 | 6813271 | roger.gonzalez.ext@colcomercio.com.co | Femenino | NO     | RUT             | 873361900         | Diana          | Maria           | Ramirez          | Suarez            | Bogotá   | Cra 92 #145-15 | Suba - Las Flores | 3154473800 | 6813271 | roger.gonzalez.ext@colcomercio.com.co | Femenino | 7705946463560 | 1        | 7            | test rut      |
