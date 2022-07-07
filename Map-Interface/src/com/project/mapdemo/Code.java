package com.project.mapdemo;

public class Code {
//implements Comparable<Code> {
	String sectionNo;
	String lectureNo;
	
	public Code() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Code(String sectionNo, String lectureNo) {
		super();
		this.sectionNo = sectionNo;
		this.lectureNo = lectureNo;
	}

	public String getSectionNo() {
		return sectionNo;
	}

	public void setSectionNo(String sectionNo) {
		this.sectionNo = sectionNo;
	}

	public String getLectureNo() {
		return lectureNo;
	}

	public void setLectureNo(String lectureNo) {
		this.lectureNo = lectureNo;
	}

	@Override
	public String toString() {
		return "Code [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
	}

//	@Override
//	public int compareTo(Code o) {
//		String code1=sectionNo.concat(lectureNo);
//		String code2=o.getSectionNo()+o.getLectureNo();
//		
//		return code1.compareTo(code2);
//	}
	
	

}
