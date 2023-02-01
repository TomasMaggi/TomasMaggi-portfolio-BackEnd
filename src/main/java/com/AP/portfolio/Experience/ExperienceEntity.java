package com.AP.portfolio.Experience;

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
public class ExperienceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 0, max = 20, message = "cant save that size")
    private String company_name;

    @NotNull
    @Size(min = 0, max = 200, message = "cant save that size")
    private String job_description;

    @NotNull
    private String company_logo_url;

    private Date start_date;
    private Date finish_date;

}
