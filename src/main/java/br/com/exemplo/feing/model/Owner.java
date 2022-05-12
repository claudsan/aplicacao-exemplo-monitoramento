package br.com.exemplo.feing.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Owner {

    private Integer id;
    private String login;
    private String avatarUrl;
}
