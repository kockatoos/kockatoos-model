package com.kockatoos.model.artemis;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ArtemisQueue {

    private String queueName;
    private String queueJndi;
    private String queueServer;

}
