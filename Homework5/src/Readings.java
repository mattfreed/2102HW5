
class Readings {
	
	private Time currentTime;
	private int temp;
	
	public Readings(Time currentTime, int temp){
		this.currentTime = currentTime;
		this.temp = temp;
	}
	//returns the temperature
	public int getTemp() {
        return temp;
    }
	//returns the current time
    public Time getCurrentTime() {
        return currentTime;
    }
}
