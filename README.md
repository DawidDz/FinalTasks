# Test Automation Project
Write two scripts that perform the following actions on this site https://prod-course.coderslab.com/index.php?controller=authentication&back=addresses

First script:
- will log in to this created user,
- will enter by clicking on the Addresses tile after logging in (the address we should be at is: https://mystore-testlab.coderslab.pl/index.php?controller=addresses ),
- clicks on + Create new address,
- fill in the New address form - data should be taken from the Examples table in Gherkin (alias, address, city, zip/postal code, country, phone),
- will check whether the data in the added address is correct.

Second script:
- logs in with the same user from task 1,
- will choose Hummingbird Printed Sweater for purchase (additional option: check whether the discount on it is 20%),
- will choose size M (additional option: make it possible to parameterize the size and select S, M, L, XL),
- will select 5 pieces according to the parameter given in the test (additional option: make it so that the number of pieces can be parameterized),
- add product to cart,
- will go to the checkout option,
- confirms the address (you can add it manually first),
- will choose the pickup method - PrestaShop "pick up in store",
- chooses the payment option - Pay by Check,
- clicks on "order with an obligation to pay",
- will take a screenshot of the order confirmation and amount,
- will go to order history and details (first click on the logged in user, then click on the tile),
- check if the order is on the list with the status "Awaiting check payment" and the amount is the same as in the order two steps earlier.
