# Task: Need to automate test scenario for product search functionality

## Preparation steps:
To call Walmart API it is required to provide unique **apiKey**
1. Go to [Walmart developer register page](https://developer.walmartlabs.com/member/register)
2. Register account

**Note**: confirmation email might be in *Spam* folder
3. Go to your [developer account page](https://developer.walmartlabs.com/apps/mykeys/) and generate your **apiKey**

It should look something like *vj4fu5gfvyk42fyvq64jiikq*

## Test scenario: compare search results
**Note**: use [Walmart Search API](https://developer.walmartlabs.com/docs/read/Search_API) to define API query
- Make API call for products containing *Shell Scripting* in name
- Go to https://www.walmart.com on web browser
- Search for *Shell Scripting* in lookup input
- Check **top 3 results** (*name* & *salePrice* values) to match with the API response (step 1)
- Repeat step 1 but with **sort by price**
- Apply sort by price *low to high* on web browser
- Check **top 3 results** (*name* & *salePrice* values) to match the API response (step 5)

## Requirements:
- Use any *object-oriented language*
- Use *Selenium WebDriver* for web interactions, any Http client for API requests
- Use automation patterns like *PageObject*, *data-driven* tests, etc.
- provide code and clear instructions how to run it

**Note**: please don’t put your code in public repository

**Note**: push completed task to this repo when you are done

## Instructions how to run:
Execute command 
to run test ```gradle clean test```
to generate report ```gradle allureServe```

The appropriate task will start (it starts SearchTest class) and the result you can find in the build/reports folder.
'Reports' folder contains snapshots and test report with all information about test statuses ('index.html').

**The next list of technologies**: Java 8, Gradle, TestNG, Rest-assured, Selenium, WebDriverManager, PageObject
**Note**: You should have installed Chrome browser, Gradle.