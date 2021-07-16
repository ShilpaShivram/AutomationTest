Feature: Test pop up in the Landing Page

  
  Scenario: Pop-up is displayed for in landing page
    Given Landing page is loaded    
    When Subscription prompt is popped up
    Then Scroll to end of the page 
    And wait for ten sec max
    And pop up disappears
