package pl.marcinzubrzycki.storeinventorybackend.service;

import ma.glasnost.orika.MapperFacade;
import org.springframework.stereotype.Service;
import pl.marcinzubrzycki.storeinventorybackend.dto.SmartphoneDto;
import pl.marcinzubrzycki.storeinventorybackend.model.Smartphone;
import pl.marcinzubrzycki.storeinventorybackend.repository.SmartphoneRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SmartphoneService {

    private final SmartphoneRepository smartphoneRepository;
    private final MapperFacade mapper;

    public SmartphoneService(SmartphoneRepository smartphoneRepository, MapperFacade mapper) {
        this.smartphoneRepository = smartphoneRepository;
        this.mapper = mapper;
    }

    public List<SmartphoneDto> getAllSmarthpones() {
        return mapper.mapAsList(smartphoneRepository.findAll(), SmartphoneDto.class);
    }

    public SmartphoneDto getSmartphoneById(Long id) {
        Optional<Smartphone> potentialSmartphone = smartphoneRepository.findById(id);
        return potentialSmartphone.map(smartphone -> mapper.map(smartphone, SmartphoneDto.class)).orElse(null);
    }
}
