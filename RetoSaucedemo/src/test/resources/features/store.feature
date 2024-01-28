Feature:Registration and purchase of items on the Store page
  It is expected that the user will be able to make different purchases of items.

  Background:
    Given Juan wants to join Store

  Scenario Outline:
    Given the user enters the login section and enters "<email>" and "<password>".
    When the user selects 2 products
    And go to the shopping cart and enter the data "<name>" "<country>" "<city>" "<card>" "<month>" "<year>"
    Then You should see a dialog stating "<purchase>".

    Examples:
      |email | password |name|country|city|card|month|year|purchase|
      |correopruebadevsu|Demo123|Juan  |Colombia|Cali|4111111|02|27 |  Thank you for your purchase!   |



