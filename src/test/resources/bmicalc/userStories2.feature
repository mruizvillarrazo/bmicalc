
      
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
Feature: Clasificar el IMC

  Como médico
  Quiero clasificar el IMC de un paciente en una categoría
  Para determinar su riesgo de ciertas condiciones de salud.

	@Tag1
  Scenario Outline: Clasificar un IMC en la categoría 
    Given un BMI de <values>
    When quiero ver si la persona es <name>
    Then debo obtener un resultado de <status>
    
Examples: 
      | values       |    name     |         status    |
      |     17       |    Delgada  |         BAJO PESO |
      |     23.1     |    Normal   |         NORMAL    |
      |     33       |    Obeso    |         OBESIDAD    |

