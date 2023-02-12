package dat3.cars.config;

import dat3.cars.entity.Car;
import dat3.cars.entity.Member;
import dat3.cars.repository.CarRepository;
import dat3.cars.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DeveloperData implements ApplicationRunner {

    @Autowired
    CarRepository carRepository;

    @Autowired
    MemberRepository memberRepository;

    private final String passwordUsedByAll = "test12";

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Car c1 = new Car("brand1", "model1", 99.95, 10);
        Car c2 = new Car("brand2", "model2", 199.95, 5);

        carRepository.save(c1);
        carRepository.save(c2);

        Member m1 = new Member("member1", passwordUsedByAll, "memb1@a.dk", "Kurt", "Wonnegut", "Lyngbyvej 2", "Lyngby", "2800");
        Member m2 = new Member("member2", passwordUsedByAll, "aaa@dd.dk", "Hanne", "Wonnegut", "Lyngbyvej 2", "Lyngby", "2800");

        memberRepository.save(m1);
        memberRepository.save(m2);
    }

}
