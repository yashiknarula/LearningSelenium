@TestGroups
Feature: Create lead for leaftaps:

Background: Open the url
And Enter the username as DemoSalesManager
And Enter the password as crmsfa
And Click on the login button
And Click on the CRM/SFA

@Create
Scenario Outline: Create lead for leaftap positive
And Click on the Lead tab
And click on Create Lead link button
And Enter the company name<cname>
And Enter the first name<fname>
And Enter the Last name <lname>
And Enter phone number<pnum>
When Click on the create lead
Then Verify create lead is successful
Examples:
|cname|fname|lname|pnum|
|CTS|yashik|narula| 94161|

@Delete
Scenario: Delete lead for leaf tap
And Click on the Lead tab
And click on find lead
And click on the phone tab
And Enter phn number as 94161
And click on the find lead button
And click on the first lead ID
When click on the delete
Then Verify deletion of lead is successful

@Edit
Scenario Outline: Edit the lead
And Click on the Lead tab
And click on find lead
And Enter value in the first name as<fname>
And click on the find lead button
And click on the first lead ID
And click on the edit button
And Edit the company name as<Edcname>
When click on the update button
Then Verify updation is correct as TCS
Examples:
|fname|Edcname|
|yashik|TCS|

@Merge
Scenario Outline:Merge lead on test leaf
And Click on the Lead tab
And click on merge lead link
And click on from lead image
And Enter merge lead id as <mlId>
And click on merge page find lead button
And click on merge page first lead id
And click on to lead image
And Enter merge lead id as <mlId1>
And click on merge page find lead button
And click on merge page first lead id
Examples:
|mlId|mlId1|
|13493|13498|

