package z.usecase.com.emc.entities;

public class Event extends EMBase {
	
	private String description;
	private String startTime;
	private String endTime;
	private Boolean startFlag;
	
	public Event(Long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Boolean getStartFlag() {
		return startFlag;
	}

	public void setStartFlag(Boolean startFlag) {
		this.startFlag = startFlag;
	}
	
	

}
