package com.example.CarRental;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class CarRentalService {
	
	private List<Car> cars = new ArrayList<Car>();
	
	public CarRentalService() {
		cars.add(new Car("11AA22", "Ferrari", 1000));
		cars.add(new Car("33BB44", "Porshe", 2222));
	}
	
	@GetMapping("/cars")
	public List<Car> getListOfCars(){
		return cars;
	}
	
	@PostMapping("/cars")
	public void addCar(@RequestBody Car car) throws Exception{
		System.out.println(car);
		cars.add(car);
	}

	@GetMapping("/cars/{plateNumber}")
	public Car getCar(@PathVariable(value = "plateNumber") String plateNumber){
		for(Car car: cars){
			if(car.getPlateNumber().equals(plateNumber)){
				return car;
			}
		}
		return null;
	}

	@PutMapping(value = "/cars/{plateNumber}")
	public void rent(@PathVariable("plateNumber") String plaque,
					 @RequestParam(value="rent", required = true)boolean rented,
					 @RequestBody(required = false) Dates dates){
		System.out.println(plaque);
		System.out.println(rented);
		System.out.println(dates);
		// parcourir le tablea à la recherche d'une voiture de plaque plaque
		// si voiture trouvé
		//		si rented = true => louer
		//		sinon ramener
		// si voiture non trouvé
		// 	envoyer HttsStattus NOT-FOUND
		if(rented == false){
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Foo Not Found");
		}
	}

}
