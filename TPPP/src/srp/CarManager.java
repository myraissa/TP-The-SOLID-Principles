package srp;

import java.util.List;

public class CarManager {
	
	 private List<Car> _carsDb;

	    public CarManager(List<Car> carsDb)
	    {
	        _carsDb = carsDb;
	    }

	    public String getCarsNames()
	    {
	        StringBuilder sb = new StringBuilder();
	        for (Car car : _carsDb) {
	            sb.append(car.getBrand());
	            sb.append(" ");
	            sb.append(car.getModel());
	            sb.append(", ");
	        }
	        return sb.substring(0, sb.length() - 2);
	    }

	    public Car getBestCar()
	    {
	        Car bestCar = null;
	        for (Car car : _carsDb) {
	            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
	                bestCar = car;
	            }
	        }
	        return bestCar;
	    }

}
