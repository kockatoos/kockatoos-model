package com.kockatoos.model.weblogic;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WebLogicQueue {

    private String queueName;
    private String queueJndi;
    private String queueServer;

}
