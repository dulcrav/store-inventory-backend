package pl.marcinzubrzycki.storeinventorybackend.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "PC")
@Data
public class Pc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String producer;
    private String processor;
    private Integer ram;
    private String graphics;
    private Integer hdd;
    private Integer ssd;
    private String os;
    private Integer quantity;
}
