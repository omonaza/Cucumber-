Feature: Login 
    Given url adress to web page
    When user logs in with following credentals 
    |userName|password|age|
    |aza |omonazatest123|45|
    Then user should be landed on "home page"
    