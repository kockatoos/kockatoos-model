package com.kockatoos.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cluster {

    private String clusterName;
    private List<Server> servers;
}
