package dat3.cars.service;

import dat3.cars.dto.CarResponse;
import dat3.cars.entity.Car;
import dat3.cars.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<CarResponse> getCars() {
        List<Car> cars = carRepository.findAll();
        List<CarResponse> carResponses = new ArrayList<>();
        for (Car c : cars) {
            CarResponse cr = new CarResponse(c);
            carResponses.add(cr);
        }
        return carResponses;
    }

}
