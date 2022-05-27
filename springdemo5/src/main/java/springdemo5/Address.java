package springdemo5;

import org.springframework.stereotype.Component;

@Component(value="address")
public class Address {
private int hno;
private String streetName;
private String cityName;
public int getHno() {
	return hno;
}
public void setHno(int hno) {
	this.hno = hno;
}
public String getStreetName() {
	return streetName;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}
public String getCityName() {
	return cityName;
}
public void setCityName(String cityName) {
	this.cityName = cityName;
}
@Override
public String toString() {
	return "Address [hno=" + hno + ", streetName=" + streetName + ", cityName=" + cityName + ", getHno()=" + getHno()
			+ ", getStreetName()=" + getStreetName() + ", getCityName()=" + getCityName() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
