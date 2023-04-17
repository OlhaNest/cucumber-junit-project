Feature: View columns on the Vehicle models page


 Scenario: Sales manager should see 10 columns on the Vehicle Model page
 Given login as "store manager" and "sales manager"
 When click the "Vehicle Model" under the "Fleet"
 Then managers should see following columns in the web-table
  |MODEL NAME | MAKE | CAN BE REQUESTED | CVVI | CO2 FEE (/MONTH) | COST (DEPRECIATED) | TOTAL COST (DEPRECIATED) | CO2 EMISSIONS | FUEL TYPE | VENDORS |

  Scenario: Drivers can NOT access the Vehicle Model page
  Given login as "drivers"
  When click the "Vehicle Model" under the "Fleet"
  Then drivers see the error message "You do not have permission to perform this action"







