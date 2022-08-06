#Author: Anna Gallo
@web
Feature: Automacao Teste Accenture

  @CT-001
  Scenario: Validar envio dos dados do veículo pelo formulário
    Given que estou logado no site "http://sampleapp.tricentis.com/101/app.php"
    When preencho os dados do formulário Enter Vehicle Data
    And preencho os dados do formulário Enter Insurant Data
    And preencho os dados do formulário Enter Product Data
    And preencho os dados do formulário Select Price Option
    And preencho os dados do formulário Send Quote
    Then valido mensagem "Sending e-mail success!" de confirmação na tela
