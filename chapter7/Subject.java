package chapter7;

public class Subject {		// Subject 클래스 멤버 변수
	private String name;	// 과목 이름
	private int scorePoint;	// 과목 점수
	
	public String getName( ) {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScorePoint( ) {
		return scorePoint;
	}
	
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
}
