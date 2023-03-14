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
  Scenario: Clasificar un IMC en la categoría <categoria>"BAJO PESO"
    Given el un BMI de <values_BMI>
    When quiero comprobar el valor inferior
    Then debo obtener un resultado de <status>


					Examples: 
	 categoria    | values_BMI | status       |
	 "BAJO PESO"  |  17        | "BAJO PESO"  |
	 "NORMAL"     |  23.1      | "NORMAL"     |
	 "OBESIDAD"   |  33        | "OBESO"      |

