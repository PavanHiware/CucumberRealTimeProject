Feature: Search functionality

@SearchTest
Scenario Outline: Searching product in search box

Given User should be on home page
When User should be able to enter <product name> and search
Then User should be able to view correct <product name>

Examples:
| product name |
| iMac |
| Fitbit |
