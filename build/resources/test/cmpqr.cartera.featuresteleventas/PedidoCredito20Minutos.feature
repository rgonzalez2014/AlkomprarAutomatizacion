Feature: Realizar el registro de un pedido con medio de pago Credito

  @CedulaCiudadania
  Scenario Outline: Crear un pedido con pago Credito 20 minutos
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
    And Se seleccionan las fechas y el medio de pago credito
      | credito   | fechaexpedicion   | actividad   | descripcion   | profesion   | cuotas   | periodicidad   | valorcuota   | observaciones   |
      | <Credito> | <FechaExpedicion> | <Actividad> | <Descripcion> | <Profesion> | <Cuotas> | <Periodicidad> | <ValorCuota> | <Observaciones> |
    Then El pedido queda creado

    Examples:
      | Usuario      | Password | UnidadVenta | FacturacionElectronica | TipoDocumento | NumeroDocumento | PrimerNombre | SegundoNombre | PrimerApellido | SegundoApellido | Ciudad | Direccion      | Barrio              | Celular    | Fijo    | Email                                 | Genero    | Habeas | TipoDocumento_2 | NumeroDocumento_2 | PrimerNombre_2 | SegundoNombre_2 | PrimerApellido_2 | SegundoApellido_2 | Ciudad_2 | Direccion_2             | Barrio_2              | Celular_2  | Fijo_2  | Email_2                | Genero_2 | Ean           | Cantidad | Credito | FechaExpedicion | Actividad | Descripcion             | Profesion   | Cuotas | Periodicidad | ValorCuota | Observaciones          |
      | asesor_roger | 123      | ALKUN       | Si                     | C.C           | 1098719449      | Miguel       | Santiago      | Nuñez          | Ruiz            | Bogotá | cr 91 # 134 78 | Suba - Los Naranjos | 3214072323 | 6812121 | roger.gonzalez.ext@colcomercio.com.co | Masculino | NO     | C.C             | 1010111186        | Camila         | Ines            | Martinez         | Perez             | Cali     | Calle 52 numero 1 b 160 | Comuna 4 - La Alianza | 3114997098 | 8056776 | dianatrivi@hotmail.com | Femenino | 7705946463560 | 1        | 6       | 01121999        | Empleado  | CRÍA DE GANADO PORCINO. | veterinario | 3      | 56           | 30000      | test cedula ciudadania |

  @GestionCedula
  Scenario Outline: Aprobar credito enviado por televentas
    Given Se despliega la pagina fabrica de creditos y se ingresan las credenciales
      | usuario   | password   |
      | <Usuario> | <Password> |
    When Se visualiza la cola de creditos y se busca el credito
    Then Se gestiona y aprueba el credito
    And El credito queda aprobado

    Examples:
      | Usuario | Password |
      | Pys1    | 123      |


