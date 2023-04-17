# elkin.palacios.qa@gmail.com

Feature:as a quality analyst
  I want to test the selection flow of a credit product.
  to confirm its correct operation

  @FreeInvestment
  Scenario: select the product free investmnet
    When : I see the option "free investmnet"
    Then : I see the all information "Línea Antioquia"

  @ConsumerCreditCards
  Scenario: select the product  consumer credit cards
    When : I see the option "consumer credit cards"
    Then : I see the all information "Línea Antioquia"


  @MoreQuota
  Scenario: select the product more quota
    When : I see the option "more quota"
    Then : I see the all information "Línea Antioquia"