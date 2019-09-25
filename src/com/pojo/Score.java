package com.pojo;

public class Score {
	
	private int sourseId;
	private int userId;
	private String sourseName;
	private String scoreGrade;
	
	
	public Score() {
	}
	public Score(int sourseId, int userId, String sourseName, String scoreGrade) {
		this.sourseId = sourseId;
		this.userId = userId;
		this.sourseName = sourseName;
		this.scoreGrade = scoreGrade;
	}
	public int getSourseId() {
		return sourseId;
	}
	public void setSourseId(int sourseId) {
		this.sourseId = sourseId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getSourseName() {
		return sourseName;
	}
	public void setSourseName(String sourseName) {
		this.sourseName = sourseName;
	}
	public String getScoreGrade() {
		return scoreGrade;
	}
	public void setScoreGrade(String scoreGrade) {
		this.scoreGrade = scoreGrade;
	}
	
	@Override
	public String toString() {
		return sourseId+ userId +   sourseName +scoreGrade ;
	}
}
