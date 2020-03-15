Feature: verify the ada hotel details
Scenario: books the hotel

Given user is on the adahotel page enters the user name ,password and clicks login

|summaemail|12345qwerty|
When user enters the location ,hotel name, room type,  noORooms, NoOfAdults, NoOfChild and clicks search
|Melbourne|Hotel Sunshine|Double|4 - Four|4 - Four|4 - Four|

And user enters the first name, last name, billing address, credit card no , credit card type an ccv 
|praveena|zorro|greens|1234567891012131|Master Card|February|2014|123|

Then user should click the login button

