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
@Tag
Feature: Verificar obesidad abdominal

  Como investigador de la salud
  Quiero verificar si una persona tiene obesidad abdominal
  Basándome en su circunferencia de cintura y género.

	@Tag1
  Scenario: Verificar la obesidad abdominal en un hombre sin obesidad
    Given un hombre con una circunferencia de cintura de 80 cm
    When verifico si es obeso
    Then debo obtener un resultado de false
	@Tag2
  Scenario: Verificar la obesidad abdominal en una mujer con obesidad
    Given una mujer con una circunferencia de cintura de 90 cm
    When verifico si es obesa
    Then debo obtener un resultado de true

	@Tag3
  Scenario: Intentar verificar obesidad abdominal con género inválido
    Given un género que no es 'M' o 'F'
    When intento verificar la obesidad abdominal
    Then debo obtener una excepción "Argumento incorrecto"

