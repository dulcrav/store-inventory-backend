package pl.marcinzubrzycki.storeinventorybackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LaptopDto {
    private Long id;
    private String name;
    private String producer;
    private Double display;
    private String processor;
    private Integer ram;
    private String graphics;
    private Integer hdd;
    private Integer ssd;
    private Boolean fingerprintScanner;
    private String os;
    private Integer quantity;
}
