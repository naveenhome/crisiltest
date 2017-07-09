Feature: Registration
New patient has to register before upload new prescription
Scenario: Valid registration with OTP
Given "Naveen" register using phone "9810547500" and email "naveenhome@gmail.com"
When click on "Register"
Then New OPT has to be sent on phone number
And System should display "Please check email for OTP"
#New scanrio added
Scenario: Duplicate email 
Given "Naveen" register using phone "9810547500" and email "naveen@gmail.com"
When click on "Register"
Then System provide option for "Forget Password"
And System should display "Email already exist."

Scenario: Register New user 
Given user register using phone and email
And Email already exist
When click on Register
Then System provide option for Forget Password
And System should display failed message