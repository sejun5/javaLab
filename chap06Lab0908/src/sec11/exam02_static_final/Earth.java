package sec11.exam02_static_final;

public class Earth {

	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SCARFACE_AREA;
	
	static {
		EARTH_SCARFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
		
	}
	
}
