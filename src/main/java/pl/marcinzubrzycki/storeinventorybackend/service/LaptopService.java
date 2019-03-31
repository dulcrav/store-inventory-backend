package pl.marcinzubrzycki.storeinventorybackend.service;

import ma.glasnost.orika.MapperFacade;
import org.springframework.stereotype.Service;
import pl.marcinzubrzycki.storeinventorybackend.dto.LaptopDto;
import pl.marcinzubrzycki.storeinventorybackend.model.Laptop;
import pl.marcinzubrzycki.storeinventorybackend.repository.LaptopRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LaptopService {

    private final LaptopRepository laptopRepository;
    private final MapperFacade mapper;

    public LaptopService(LaptopRepository laptopRepository, MapperFacade mapper) {
        this.laptopRepository = laptopRepository;
        this.mapper = mapper;
    }

    public List<LaptopDto> getAllLaptops() {
        return mapper.mapAsList(laptopRepository.findAll(), LaptopDto.class);
    }

    public LaptopDto getLaptopById(Long id) {
        Optional<Laptop> potentialLaptop = laptopRepository.findById(id);
        return potentialLaptop.map(laptop -> mapper.map(laptop, LaptopDto.class)).orElse(null);
    }
}
