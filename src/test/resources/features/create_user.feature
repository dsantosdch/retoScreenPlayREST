Feature: Create an user on reqres.in
  I want to create a user on reqres.in

  Scenario: Create a user

    When you crate a user
      | name    | job  |
      | brandon | java |
      | Dionisio | Analista de pruebas |

    Then I should see a user created