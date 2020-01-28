Feature: Reserva de Hora
  Como Usuario quiero agendar una hora en medicina general en la pagina del Hospital del Trabajador ACHS.

  Scenario: Se debe automatizar el agendamiento de hora online en ACHS..
    Given El Usuario Se encuentra con la pagina home de Google.
    When En google buscar la palabra ACHS y del listado que aparece, presionar en el texto que dice Hospital del Trabajador.
    And En pagina ACHS presionar botón Reserva tu Hora luego clic en agendar hora ingresar un N° documento válido, seleccionar previsión “Fonasa” y darle clic a siguiente.
    And En especialidad, escribir Medicina General darle siguiente Finalmente validar que el texto en pantalla diga Medicina General.
    Then Finalmente tomar un Screenshot para validar el término del flujo.
