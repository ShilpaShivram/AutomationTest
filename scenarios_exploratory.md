Scenario 1: Testing the search box under 'Companies in the news' with valid values.
Given open the URL https://www.afr.com/companies
when enter 3 char <input> values in the search box
then the list of the relevant companies should be displayed.
|input|
|CBA|
|Wes|
|NAB|
|nab|
|Nab|

Scenario 2: Testing the search box under 'Companies in the news' with invalid values.
Given open the URL https://www.afr.com/companies
when enter 2 char <input> values in the search box
then please enter 3 or more characters should be displayed
|input|
|12|
|ab|
|22|

Scenario 3: Testing the search box under 'Companies in the news' with no value.
Given open the URL https://www.afr.com/companies
when nothing is entered in the search box and search button is clicked
then Please fill in this field should be displayed

Scenario 4: Testing the search box under 'Companies in the news' with invalid value.
Given open the URL https://www.afr.com/companies
when special characters '@#$' are entered
then Please fill valid values in this field should be displayed

Scenario 5: Testing the links under section 'Companies in the News' Section
Given open the URL https://www.afr.com/companies
when click on the 'All Companies' 
then Companies Index page shall be displayed

Scenario 6: Testing the links under section 'Companies in the News' Section
Given open the URL https://www.afr.com/companies
when click on the <Links>
then the respective company page shall be displayed
|Links|
|WBC|
|Westpac Banking Corporation|
|WES|
|Wesfarmers|
|ANZ|
|NAB|

Scenario 7: Testing the font color under section 'Companies in the News' Section
Given open the URL https://www.afr.com/companies
when the page is open successfully
then the raise in the share percentage should be in green 
and drop in the share percentage should be displayed in red.

