# elkin.palacios.qa@gmail.com

Feature:as a quality analyst
  I want to test the frequent questions selection flow.
  to confirm its correct operation

  @FrequentQuestions
  Scenario: select the frequently asked questions option
    When : I see the button at your service
    Then : I see information bar "Preguntas frecuentes"

