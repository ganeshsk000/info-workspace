package com.project.transportationdto;

public class TransportationDTO implements Comparable<TransportationDTO> {
	private int transportaionId;
	private String name;
	private String typeOfMode;
	public TransportationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransportationDTO(int transportaionId, String name, String typeOfMode) {
		super();
		this.transportaionId = transportaionId;
		this.name = name;
		this.typeOfMode = typeOfMode;
	}
	public int getTransportaionId() {
		return transportaionId;
	}
	public void setTransportaionId(int transportaionId) {
		this.transportaionId = transportaionId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTypeOfMode() {
		return typeOfMode;
	}
	public void setTypeOfMode(String typeOfMode) {
		this.typeOfMode = typeOfMode;
	}
	@Override
	public String toString() {
		return "TransportationDTO [transportaionId=" + transportaionId + ", name=" + name + ", typeOfMode=" + typeOfMode
				+ "]";
	}
	@Override
	public int compareTo(TransportationDTO o) {
		// TODO Auto-generated method stub
		return this.getTransportaionId()-o.getTransportaionId();
	}
	
	

}
