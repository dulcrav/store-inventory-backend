package pl.marcinzubrzycki.storeinventorybackend.service;

import ma.glasnost.orika.MapperFacade;
import org.springframework.stereotype.Service;
import pl.marcinzubrzycki.storeinventorybackend.dto.PcDto;
import pl.marcinzubrzycki.storeinventorybackend.model.Pc;
import pl.marcinzubrzycki.storeinventorybackend.repository.PcRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PcService {

    private final PcRepository pcRepository;
    private final MapperFacade mapper;

    public PcService(PcRepository pcRepository, MapperFacade mapper) {
        this.pcRepository = pcRepository;
        this.mapper = mapper;
    }

    public List<PcDto> getAllPcs() {
        return mapper.mapAsList(pcRepository.findAll(), PcDto.class);
    }

    public PcDto getPcById(Long id) {
        Optional<Pc> potentialPc = pcRepository.findById(id);
        return potentialPc.map(pc -> mapper.map(pc, PcDto.class)).orElse(null);
    }
}
