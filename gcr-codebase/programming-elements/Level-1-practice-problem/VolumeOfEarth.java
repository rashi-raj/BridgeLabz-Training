// Create VolumeOfEarth class to calculate the volume of the Earth

public class VolumeOfEarth{
	public static void main(String[] args){

		int earthRadius = 6378;

		// Calculate the volume of the Earth in cubic kilometers
		double earthVolumeInKilometer = 4/3 * 22/7 * earthRadius;

		// Calculate the volume of the Earth in miles
		double earthVolumeInMile = earthVolumeInKilometer * 0.621371;


		System.out.print("The volume of earth in cubic kilometers is " + earthVolumeInKilometer + " and cubic miles is " +
		                 earthVolumeInMile);
	}
}