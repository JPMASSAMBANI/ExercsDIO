package SistemaCarro;

public class Carro {

	private String[] Status= {"on", "off"};
	private Integer Accelerometer;
	private String[] Direction= {"right", "left", "center"};
	private static Integer Gear;
	
	public Integer changeGear() {
		
		if(Gear == 1) {

		}
		
		return 0;
	}

	public String[] getStatus() {
		return Status;
	}

	public void setStatus(String[] status) {
		Status = status;
	}
	
	
}
