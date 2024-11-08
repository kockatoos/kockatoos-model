package com.kockatoos.model;

import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Infrastructure {

    private String infrastructureName;
    private String infrastructureType;
    private List<Cluster> infrastructureClusters;

}
