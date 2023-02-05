package dat3.cars.repository;

import dat3.cars.entity.Car;
import dat3.cars.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
