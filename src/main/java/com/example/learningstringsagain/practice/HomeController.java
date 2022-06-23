package com.example.learningstringsagain.practice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
@CrossOrigin (origins = "http://localhost:4200")
public class HomeController {
    
    private static Logger LOGGER = LogManager.getLogger();
    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public ArrayList<RaceCar> getRaceCar(Model model) {
        ArrayList<RaceCar> raceCarList = new ArrayList<RaceCar>();
        RaceCar rc1 = new RaceCar (22446688, 2, 78000, "Ford Fusion", "Brad Keselowski", 220.8F,"Miller Lite");
        RaceCar rc2 = new RaceCar (88664422, 1, 84000, "Chevrolet SS", "Jimmie Johnson", 212.4F,"Lowe's");
        raceCarList.add(rc1);
        LOGGER.info("Added to the RaceCar List - VIN: " + rc1.getVin() + ", Seats: " + rc1.getNumSeats() + ", Price: " + rc1.getPrice() + ", Make/Model: " + rc1.getMakeAndModel() + ", Driver: " + rc1.getDriverName() + ", Top Speed: " + rc1.getTopSpeed() + ", Sponsor: " + rc1.getPrimarySponsor());
        raceCarList.add(rc2);
        LOGGER.info("Added to the RaceCar List - VIN: " + rc2.getVin() + ", Seats: " + rc2.getNumSeats() + ", Price: " + rc2.getPrice() + ", Make/Model: " + rc2.getMakeAndModel() + ", Driver: " + rc2.getDriverName() + ", Top Speed: " + rc2.getTopSpeed() + ", Sponsor: " + rc2.getPrimarySponsor());
        LOGGER.trace("RaceCar List contains " + raceCarList.size() + " racecars in the system.");
        LOGGER.error("" + raceCarList.size());
        LOGGER.warn("" + raceCarList.size());
        return raceCarList;
    }
    public ArrayList<Truck> getTruck(Model model) {
        ArrayList<Truck> truckList = new ArrayList<Truck>();
        Truck t1 = new Truck (22664488, 6, 75835, "Ford F-150", 8.0F, 14000);
        Truck t2 = new Truck (66228844, 5, 59460, "Ram 1500", 6.33F, 12750);
        truckList.add(t1);
        LOGGER.info("Added to the RaceCar List - VIN: " + t1.getVin() + ", Seats: " + t1.getNumSeats() + ", Price: " + t1.getPrice() + ", Make/Model: " + t1.getMakeAndModel() + ", Truck Bed Length: " + t1.getTruckBedLength() + ", Towing Capacity: " + t1.getTowingCapacity());
        truckList.add(t2);
        LOGGER.info("Added to the RaceCar List - VIN: " + t2.getVin() + ", Seats: " + t2.getNumSeats() + ", Price: " + t2.getPrice() + ", Make/Model: " + t2.getMakeAndModel() + ", Truck Bed Length: " + t2.getTruckBedLength() + ", Towing Capacity: " + t2.getTowingCapacity());
        LOGGER.trace("Truck List contains " + truckList.size() + " trucks in the system.");
        LOGGER.error("" + truckList.size());
        LOGGER.warn("" + truckList.size());
        return truckList;
    }
}