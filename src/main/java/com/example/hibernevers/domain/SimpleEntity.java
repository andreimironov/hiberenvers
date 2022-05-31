package com.example.hibernevers.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class SimpleEntity {
    @Id
    @GenericGenerator(
            name = "simple_entity_generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = "sequence_name", value = "simple_entity_simple_entity_id_seq")
            }
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "simple_entity_generator")
    @Access(AccessType.PROPERTY)
    @Column(name = "simple_entity_id")
    private Long id;

    private String name;
}
