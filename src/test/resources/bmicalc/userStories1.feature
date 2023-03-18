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
    Given unos datos erroneos
    When introduzco masa 0 kg y algura 1.61 m
    Then debo obtener una excepción "No puede ser 0"




