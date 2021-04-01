package com.sago.task.domain.entities;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "customer_feature_values")
public class CustomerFeatureValue {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "feature_id")
    private Integer featureId;

    @Column(name = "key")
    private String key;

    @Column(name = "value")
    private String value;
}