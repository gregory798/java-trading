# Language: en

Feature: Portfolio management by a trader
  As a trader
  I want to manage my asset portfolio
  So that I can track my profit and loss (PnL) and adjust it according to the market

  Scenario Outline: Adding a new asset to the portfolio
    Given a trader with a portfolio containing <arg0> and <arg1>
    When the trader adds the asset "Microsoft" to his portfolio
    Then the portfolio should now contain "Apple", "Google", and "Microsoft"
    Examples:
      | arg0    | arg1     |
      | "Apple" | "Google" |

  Scenario Outline: Calculating adjusted PnL based on the market
    Given a trader with a PnL of <arg0> and associated with the <arg1> market with a market factor of <arg2>
    When the trader calculates his adjusted PnL
    Then the adjusted PnL should be 10500.0
    Examples:
      | arg0    | arg1     | arg2 |
      | 10000.0 | "NASDAQ" | 1.05 |