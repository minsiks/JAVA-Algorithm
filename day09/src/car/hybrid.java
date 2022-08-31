package car;

public class hybrid extends Car {

	private double ebattery;
	private double gbattery;
	private String mod;
	private double maxesize;
	private double maxgsize;
	private double gsize;
	private double esize;
	
	public hybrid() {
		
	}

	public hybrid(String carname, String company, String color, String status) {
		super(carname, company, color, status);
		
	}

	public hybrid(String carname, String company, String color, String status, double ebattery, double gbattery,
			String mod, double maxesize, double maxgsize, double gsize, double esize) {
		super(carname, company, color, status);
		this.ebattery = ebattery;
		this.gbattery = gbattery;
		this.mod = mod;
		this.maxesize = maxesize;
		this.maxgsize = maxgsize;
		this.gsize = gsize;
		this.esize = esize;
	}

	public double getEbattery() {
		return ebattery;
	}

	public void setEbattery(double ebattery) {
		this.ebattery = ebattery;
	}

	public double getGbattery() {
		return gbattery;
	}

	public void setGbattery(double gbattery) {
		this.gbattery = gbattery;
	}

	public String getMod() {
		return mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

	public double getMaxesize() {
		return maxesize;
	}

	public void setMaxesize(double maxesize) {
		this.maxesize = maxesize;
	}

	public double getMaxgsize() {
		return maxgsize;
	}

	public void setMaxgsize(double maxgsize) {
		this.maxgsize = maxgsize;
	}

	public double getGsize() {
		return gsize;
	}

	public void setGsize(double gsize) {
		this.gsize = gsize;
	}

	public double getEsize() {
		return esize;
	}

	public void setEsize(double esize) {
		this.esize = esize;
	}

	@Override
	public String toString() {
		return "hybrid [ebattery=" + ebattery + ", gbattery=" + gbattery + ", mod=" + mod + ", maxesize=" + maxesize
				+ ", maxgsize=" + maxgsize + ", gsize=" + gsize + ", esize=" + esize + ", toString()="
				+ super.toString() + "]";
	}

	public void adde(double electric) {
		if(this.maxgsize>=electric+this.esize) {
			this.gbattery += electric;
		}else if (this.maxesize<electric+this.gsize) {
			System.out.println("숫자 및 배터리양 이내의 값만 입력하세요");
		}
	}
	public void addg(double gas) {
		if(this.maxgsize>=gas+this.gsize) {
			this.gbattery += gas;
		}else if (this.maxesize<gas+this.gsize) {
			System.out.println("숫자 및 배터리양 이내의 값만 입력하세요");
		}
	}
	public void switchmode() {
		if(this.mod.equals("Gasoline")) {
			this.mod = "Electric";
		}else {
			this.mod = "Gasoline";
		}
	}
	@Override
	public void cfuel() {
		System.out.printf("현재연료 가스: %.0f 전기 : %.0f \n",this.gbattery,this.ebattery );
	}

}
