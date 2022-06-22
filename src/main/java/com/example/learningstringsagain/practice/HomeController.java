package com.example.learningstringsagain.practice;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.learningstringsagain.practice.Car;
import com.example.learningstringsagain.practice.RaceCar;
import com.example.learningstringsagain.practice.Truck;

import java.util.ArrayList;

@RestController
@CrossOrigin (origins = "http://localhost:8080")
public class HomeController {

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public ArrayList<RaceCar> getRaceCar(Model model) {
        ArrayList<RaceCar> raceCarList = new ArrayList<RaceCar>();
        raceCarList.add(new RaceCar(22446688, 2, 78000, "Ford Fusion", "Brad Keselowski", 220.8F,"Miller Lite"));
        raceCarList.add(new RaceCar(88664422, 1, 84000, "Chevrolet SS", "Jimmie Johnson", 212.4F,"Lowe's"));
        return raceCarList;
    }
    public ArrayList<Truck> getTruck(Model model) {
        ArrayList<Truck> truckList = new ArrayList<Truck>();
        truckList.add(new Truck(22664488, 6, 75835, "Ford F-150", 8.0F, 14000));
        truckList.add(new Truck(66228844, 5, 59460, "Ram 1500", 6.33F, 12750));
        return truckList;
    }
}