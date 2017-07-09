Feature: Data Driven Testing

  Scenario Outline: Regression Test
    Given user<name> enter <phone> and <email>
    When click on <button>
    Then System should display <message>

    Examples: 
      | name  | phone   | email     | button     | message   |
      | "Abc" | "98999" | "a@a.com" | "Register" | "Success" |
      | "Abc" | " "     | "a@a.com" | "Register" | "fail"    |
      | "Abc" | "98999" | "a$a.com" | "Register" | "fail"    |
