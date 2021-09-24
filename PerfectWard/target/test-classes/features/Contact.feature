Feature: Contact
@Testing
	Scenario Outline: As a user, I should be able to successfully complete the form except for Message field and error message appears 
			Given I am on the Home Page, I should see Free up time to care
			When Click on Contact section in header
			Then Validate Book a Demo button is displayed 
			And Validate Book a Demo button is enabled 
			Then I fill in the Contact details with "<FirstName>" "<LastName>" "<Email>" "<Telephone>" "<Role>" "<Sector>" "<Organiation>" "<How Did You Hear About Us>"
			Then I click on agree for Privacy and terms 
			And I click on submit button 
			And Validate the error for message
			
			
		Examples:	
			| FirstName		| LastName 		 | Email		 					 | Telephone      | Role		| Sector			| Organiation		| HowDidYouHearAboutUs |				
			| Darshan			| Nagabushan	 | darshan@gmail.com	 |	07919460043		| CFO			| NHS Others	| PerfectWard		| Google						|

			
			
			
