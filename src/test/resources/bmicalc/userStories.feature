#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step


@Tag
Feature: Calcular el IMC

  Como entrenador de fitness
  Quiero calcular el IMC de mis clientes
  Para hacer un seguimiento de su progreso con el tiempo y ajustar su plan de fitness en consecuencia.

	@Tag1
  Scenario: Calcular el IMC con valores válidos
    Given una persona con una masa de 70 kg y una altura de 1.7 m
    When calculo su IMC
    Then debo obtener un resultado de 24.22

	@Tag2
  Scenario: Intentar calcular el IMC con valores inválidos
    Given una persona con una masa de 0 kg y una altura de 1.7 m
    When intento calcular su IMC
    Then debo obtener una excepción "No puede ser 0"


@Tag
Feature: Clasificar el IMC

  Como médico
  Quiero clasificar el IMC de un paciente en una categoría
  Para determinar su riesgo de ciertas condiciones de salud.

	@Tag1
  Scenario: Clasificar un IMC en la categoría "BAJO PESO"
    Given el un BMI de <values_BMI>
    When quiero comprobar el valor inferior
    Then debo obtener un resultado de <status>

	@Tag2
  Scenario: Clasificar un IMC en la categoría "NORMAL"
    Given un BMI de <values_BMI>
    When compruebo el segundo intervalo del metodo
    Then debo obtener un resultado de <status>

	@Tag3
  Scenario: Clasificar un IMC en la categoría "OBESO"
    Given un BMI de <values_BMI>
    When comrpuebo su intervalo superior
    Then debo obtener un resultado de <status>

Examples: 
      | name  | values_BMI | status       |
      | name1 |  17        | "BAJO PESO"  |
      | name2 |  23.1      | "NORMAL"     |
      | name3 |  33        | "OBESO"      |


@Tag
Feature: Verificar obesidad abdominal

  Como investigador de la salud
  Quiero verificar si una persona tiene obesidad abdominal
  Basándome en su circunferencia de cintura y género.

	@Tag1
  Scenario: Verificar la obesidad abdominal en un hombre sin obesidad
    Given un hombre con una circunferencia de cintura de 80 cm
    When verifico si tiene obesidad abdominal
    Then debo obtener un resultado de false
	@Tag2
  Scenario: Verificar la obesidad abdominal en una mujer con obesidad
    Given una mujer con una circunferencia de cintura de 90 cm
    When verifico si tiene obesidad abdominal
    Then debo obtener un resultado de true

	@Tag3
  Scenario: Intentar verificar obesidad abdominal con género inválido
    Given un género que no es 'M' o 'F'
    When intento verificar la obesidad abdominal
    Then debo obtener una excepción "Argumento incorrecto"

