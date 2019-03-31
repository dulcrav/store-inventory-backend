package pl.marcinzubrzycki.storeinventorybackend.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "LAPTOP")
@Data
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
