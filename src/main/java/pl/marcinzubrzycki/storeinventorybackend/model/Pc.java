package pl.marcinzubrzycki.storeinventorybackend.model;

import javax.persistence.*;

@Entity
@Table(name = "PC")
public class Pc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String year;

}
