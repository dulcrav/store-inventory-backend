package pl.marcinzubrzycki.storeinventorybackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.marcinzubrzycki.storeinventorybackend.dto.SmartphoneDto;
import pl.marcinzubrzycki.storeinventorybackend.service.SmartphoneService;

import java.util.List;

@RestController
public class SmartphoneController {

    private final SmartphoneService smartphoneService;

    public SmartphoneController(SmartphoneService smartphoneService) {
        this.smartphoneService = smartphoneService;
    }

    @GetMapping("/smartphone")
    public List<SmartphoneDto> getAllSmartphones() {
        return smartphoneService.getAllSmarthpones();
    }

    @GetMapping("/smartphone/{id}")
    public SmartphoneDto getSmartphoneById(@PathVariable("id") Long id) {
        return smartphoneService.getSmartphoneById(id);
    }

}
