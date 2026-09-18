package com.textileERP.textileSys.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sizing_units")
public class SizingUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sizing_id")
    private Long sizingId;

    @Column(name = "sizing_name", nullable = false, unique = true)
    private String sizingName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "party_id")
    private Parties party;

    @Column(name = "active")
    private Boolean active = true;
}
