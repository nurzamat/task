package com.sago.task.domain.models;

import lombok.Getter;
import lombok.Setter;
import java.util.Map;


@Getter
@Setter
public class ApplicationFilter {

    private Integer positionId;
    private String firstName;
    private String lastName;
    private String email;
    private Map<String, String> attributes;

    public ApplicationFilter(){
    }
}
