package com.AP.portfolio.Education;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity
public class EducationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 0, max = 50, message = "cant save that size")
    private String title;

    @NotNull
    private TypeOfTitle type;

    @NotNull
    @Size(min = 0, max = 50, message = "cant save that size")
    private String institution;

    @NotNull
    @Size(min = 0, max = 200, message = "cant save that size")
    private String description;

    // optionals
    private Date date_of_start;
    private Date date_of_finish;
}
