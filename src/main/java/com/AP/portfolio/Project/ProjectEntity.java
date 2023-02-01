package com.AP.portfolio.Project;

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
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 0, max = 20, message = "cant save that size")
    private String title;

    @NotNull
    private String repo_url;

    private String live_url;

    @NotNull
    @Size(min = 0, max = 200, message = "cant save that size")
    private String description;

    @NotNull
    private String img_url;
}
