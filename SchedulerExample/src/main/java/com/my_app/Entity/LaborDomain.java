package com.my_app.Entity;



import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "labor_domains")
public class LaborDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long domainId;

    @Column(nullable = false)
    private String domainName;

    @ManyToMany(mappedBy = "laborDomains")
    private List<JobPost> jobPostings;


}
