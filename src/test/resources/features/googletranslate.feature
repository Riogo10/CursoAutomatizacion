Feature: Google translate
  As a web user
  I want to use google translate
  to translate words between different languages
  Scenario: Translate from English to Spanish
    Given that Susan wants to translate a word
    When she translates the word "riogo10@homail.com" from English to Spanish
    Then she should see the word "PruebasQA" in the screen