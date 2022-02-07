package com.enrol

class Student {
	String studentName
	String studentID
	Date dob
	Boolean isFundingAvailable
	String studentEmail
	String studentUsername
	String studentPassword
	String course

    static constraints = {
	studentName nullable: false, blank: false
	studentID nullable: false, blank: false
	dob nullable: false, blank: false
	isFundingAvailable nullable: false, blank: false
	studentEmail nullable: false, blank: false, email: true
	studentUsername nullable: false, blank: false, unique: true
	studentPassword nullable: false, blank: false
	course nullable: false, blank: false
    }
}
