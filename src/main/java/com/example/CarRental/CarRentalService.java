package com.example.CarRental;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;

@RestController
public class CarRentalService {
	
	private List<Car> cars = new ArrayList<Car>();
	
	public CarRentalService() {
		cars.add(new Car("11AA22", "Ferrari", 1000));
		cars.add(new Car("33BB44", "Porshe", 2222));
	}
	
	@GetMapping("/cars")
	public List<Car> getListOfCars(){
		
		RestTemplate restTemplate = new RestTemplate();
		
        List cars = restTemplate.getForObject("http://localhost:8080/voitures", List.class);
		
        System.out.println("Premier WS retourne : " + cars);
        
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
	

}
