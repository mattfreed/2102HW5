import java.util.Calendar;
import java.util.GregorianCalendar;


class DailyWeatherReport{
	
	private GregorianCalendar date;
	private int lowTemp;
	private int highTemp;
	
	DailyWeatherReport(GregorianCalendar date, int lowTemp, int highTemp){
		this.date = date;
		this.lowTemp = lowTemp;
		this.highTemp = highTemp;	
	}
	//returns the date
	public GregorianCalendar getDate() {
		return this.date;
	}
	//returns the low temp
	public int getLowTemp() {
		return this.lowTemp;
	}
	//returns the high temp
	public int getHighTemp() {
		return this.highTemp;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DailyWeatherReport other = (DailyWeatherReport) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (highTemp != other.highTemp)
			return false;
		if (lowTemp != other.lowTemp)
			return false;
		return true;
	}
}
