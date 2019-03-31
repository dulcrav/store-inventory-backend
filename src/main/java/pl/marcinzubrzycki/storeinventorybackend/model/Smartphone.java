package pl.marcinzubrzycki.storeinventorybackend.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "SMARTPHONE")
@Data
public class Smartphone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String producer;
    private Double display;
    private String processor;
    private Integer ram;
    private String graphics;
    private Integer memory;
    private Double cameraFront;
    private Double cameraBack;
    private Integer battery;
    private Boolean fingerprintScanner;
    private String os;
    private Integer quantity;
}
