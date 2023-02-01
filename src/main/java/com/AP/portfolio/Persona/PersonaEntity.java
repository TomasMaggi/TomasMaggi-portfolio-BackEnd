package com.AP.portfolio.Persona;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@Entity
public class PersonaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 0, max = 50, message = "cant save that size")
    private String first_name;

    @NotNull
    @Size(min = 0, max = 50, message = "cant save that size")
    private String last_name;

    @NotNull
    @Size(min = 0, max = 200, message = "cant save that size")
    private String about_me_text;

    @NotNull
    private String img_route;
}
