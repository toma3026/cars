package dat3.cars.service;

import dat3.cars.dto.CarResponse;
import dat3.cars.entity.Car;
import dat3.cars.repository.CarRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CarServiceH2Test {

    @Autowired
    public CarRepository carRepository;

    CarService carService;

    boolean dataIsReady = false;

    @BeforeEach
    void setUp() {
        if(!dataIsReady){
            carRepository.save(new Car("brand1", "model1", 99.95, 10));
            carRepository.save(new Car("brand2", "model2", 199.95, 5));
            dataIsReady = true;
            carService = new CarService(carRepository);
        }
    }

    @Test
    void getCars() {
        List<CarResponse> cars = carService.getCars();
        assertEquals(2, cars.size());
    }
}