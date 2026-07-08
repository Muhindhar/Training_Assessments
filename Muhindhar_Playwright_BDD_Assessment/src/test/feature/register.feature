Feature:Register to the demo web shop site


Feature Description: As a new user i want to Register to the site and launch to the home page

        Scenario Outline: Register with valid credentials

            Given user is on the register page of the demo web shop website
              And user clicks on the register link
              And user clicks the gender as "<gender>"
              And user enters the valid first name as "<firstname>"
              And user enters the valid last name as "<lastname>"
              And user enters the valid email as "<email>"
              And user enters password "<password>"
              And user enters the confirm password "<conpassword>"
             When user clicks on the register button
             Then  user should be able to login successfully

        Examples:
                  | gender | firstname | lastname | email                          | password | conpassword |
                  | Male   | muhindhar | sv       | muhidemouser12443567@gmail.com | muhi2701 | muhi2701    |



