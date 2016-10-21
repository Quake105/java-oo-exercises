
public class Computer {
	
	private int memory;
	private double processor;
	private double size;
	private String brand;
	
	public Computer (int memory, double processor, double size, String brand )
	{
		this.memory = memory;
		this.processor = processor;
		this.size = size;
		this.brand = brand;
	}
	
	

	public double getProcessor() {
		return processor;
	}



	public void setProcessor(double processor) {
		this.processor = processor;
	}



	public int getMemory() {
		return memory;
	}

	public void addMemory(int newMemory)
	{
		if(this.memory + newMemory > 8)
		{
			return;
		}
		else
		{
			 this.memory = this.memory + 8;
		}
	}


	public double getSize() {
		return size;
	}



	public String getBrand() {
		return brand;
	}

	public String toString()
	{
		return "Memory: " + this.memory + " Processor: " + this.processor + " Size: " + this.size + " Brand: " + this.brand;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer myComputer = new Computer(8,2.4,15.5,"Lenovo");
		System.out.println(myComputer.getMemory());
		System.out.println(myComputer);
	}

}
