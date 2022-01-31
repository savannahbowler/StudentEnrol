package com.enrol

class Course {


	String department
	String courseTitle
	String courseLeader
	String courseCode
	Date startDate
	Date endDate
	String description
	int numberOfStudents
	double tuitionFees
	String studyMode

    static constraints = {
	
	courseTitle blank:false, nullable:false
	department blank:false, nullable:false
	courseLeader blank:false, nullable:false
	courseCode blank:false, nullable:false
	numberOfStudents blank:false, nullable:false, minSize:20, maxSize:60
	startDate blank:false, nullable:false
	endDate blank:false, nullable:false
	studyMode blank:false, nullable:false, maxSize:20
	description blank:false, nullable:false, maxSize:5000
	tuitionFees blank:false, nullable:false, scale:2
    }
}
