package com.textileERP.textileSys.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "yarn_counts")
public class YarnCount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "count_id")
    private Long countId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tickit_id", nullable = false)
    private Tickits tickit;

    @Column(name = "count_name", nullable = false, unique = true)
    private String countName;

    @Column(name = "count_type")
    private String countType;

    @Column(name = "description")
    private String description;

    @Column(name = "active")
    private Boolean active = true;
}
