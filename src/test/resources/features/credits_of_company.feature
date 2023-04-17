# elkin.palacios.qa@gmail.com

Feature:as a quality analyst
  I want to test the selection flow of a credit product.
  to confirm its correct operation

  @ProductiveCredit
  Scenario: select the product productive credit
    When : I see the business option "productive credit"
    Then : I see the all business information "Línea Antioquia"

  @ProductiveCreditForAgricultureAndRural
  Scenario: select the product Productive Credit for Agriculture and Rural
    When : I see the business option "Productive Credit for Agriculture and Rural"
    Then : I see the all business information "Línea Antioquia"

