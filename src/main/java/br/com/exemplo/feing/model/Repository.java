package br.com.exemplo.feing.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Repository {
    private Integer id;
    private String name;
    private String fullName;
    private String description;
    private String stargazersCount;
    private String forksCount;
    private String url;
    private Owner owner;
}
