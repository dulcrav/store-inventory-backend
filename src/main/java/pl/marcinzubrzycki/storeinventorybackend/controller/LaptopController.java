package pl.marcinzubrzycki.storeinventorybackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.marcinzubrzycki.storeinventorybackend.dto.LaptopDto;
import pl.marcinzubrzycki.storeinventorybackend.service.LaptopService;

import java.util.List;

@RestController
public class LaptopController {

    private final LaptopService laptopService;

    public LaptopController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @GetMapping("/laptop")
    public List<LaptopDto> getAllLaptops() {
        return laptopService.getAllLaptops();
    }

    @GetMapping("/laptop/{id}")
    public LaptopDto getLaptopById(@PathVariable("id") Long id) {
        return laptopService.getLaptopById(id);
    }
}
