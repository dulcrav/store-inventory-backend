package pl.marcinzubrzycki.storeinventorybackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.marcinzubrzycki.storeinventorybackend.model.Pc;
import pl.marcinzubrzycki.storeinventorybackend.repository.PcRepository;

import java.util.List;

@RestController
public class PcController {

    @Autowired
    private PcRepository pcRepository;

    @GetMapping("/allPcs")
    public List<Pc> getAllPcs() {
        return pcRepository.findAll();
    }
}
