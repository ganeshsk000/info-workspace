package com.project.dto;

public class ArtifactDTO implements Comparable<ArtifactDTO>{
	private int artifactId;
	private String name;
	private int inventionIn;
	@Override
	public int compareTo(ArtifactDTO o) {
		// TODO Auto-generated method stub
		return this.getArtifactId()-o.getArtifactId();
	}
	
	public ArtifactDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ArtifactDTO(int artifactId, String name, int inventionIn) {
		super();
		this.artifactId = artifactId;
		this.name = name;
		this.inventionIn = inventionIn;
	}
	public int getArtifactId() {
		return artifactId;
	}
	public void setArtifactId(int artifactId) {
		this.artifactId = artifactId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getInventionIn() {
		return inventionIn;
	}
	public void setInventionIn(int inventionIn) {
		this.inventionIn = inventionIn;
	}
	@Override
	public String toString() {
		return "ArtifactDTO [artifactId=" + artifactId + ", name=" + name + ", inventionIn=" + inventionIn + "]";
	}
	

}
