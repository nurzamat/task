package com.sago.task.domain.entities;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "application_attribute_values")
public class ApplicationAttributeValue {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "application_id")
    private Long applicationId;

    @Column(name = "attribute_id")
    private Integer attributeId;

    @Column(name = "value")
    private String value;
}