package com.amdocs;

import cucumber.api.java.en.Given;

public class Steps {

	@Given("I have deployment the RPNCalculator SOAP api at URL :http:\\/\\/localhost:{int}\\/rpncalculator-ws\\/services\\/RPNClaculator?wsd")
	public void i_have_deployment_the_RPNCalculator_SOAP_api_at_URL_http_localhost_rpncalculator_ws_services_RPNClaculator_wsd(Integer int1) {
	    soapWSDLURL =wsdlURL;
	}

	@Given("the input is {string}")
	public void the_input_is(String string) {
	    this.rpnMathExpression = rpnMathExpression;
	}

	@When("I invoke the SOAP API")
	public void i_invoke_the_SOAP_API() {
	    RPNCalculatorService rpmWebService = new RPNCalculatorService();
	    RPNCalculator rpnCalculator = rpnCalculator
	}

	@Then("I expect the response as {string}")
	public void i_expect_the_response_as(String string) {
	    assertEquals(actualResponse, expectedResponse);
	}
}
