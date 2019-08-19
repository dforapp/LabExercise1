Feature: Develop a RPN Calculator application in Java.

	Scenario: Simple additon
		Given I have deployment the RPNCalculator SOAP api at URL :http://localhost:8080/rpncalculator-ws/services/RPNClaculator?wsd
		And the input is "10 15 +"
		When I invoke the SOAP API
		Then I expect the response as "25.0"