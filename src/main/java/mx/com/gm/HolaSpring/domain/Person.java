package mx.com.gm.HolaSpring.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@Entity
@Table(name = "person")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_person", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_person;
    @NotEmpty
    private String name;
    @NotEmpty
    private String last_name;
    @NotEmpty
    private String email;
    private String phone;
}