package pl.marcinzubrzycki.storeinventorybackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.marcinzubrzycki.storeinventorybackend.dto.PcDto;
import pl.marcinzubrzycki.storeinventorybackend.service.PcService;

import java.util.List;

@RestController
public class PcController {

    private final PcService pcService;

    public PcController(PcService pcService) {
        this.pcService = pcService;
    }

    @GetMapping("/pc")
    public List<PcDto> getAllPcs() {
        return pcService.getAllPcs();
    }

    @GetMapping("/pc/{id}")
    public PcDto getPcById(@PathVariable("id") Long id) {
        return pcService.getPcById(id);
    }
}
