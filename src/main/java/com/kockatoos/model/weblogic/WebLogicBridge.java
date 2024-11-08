package com.kockatoos.model.weblogic;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WebLogicBridge {

    private String bridgeName;
    private String bridgeServer;

    private String bridgeSourceName;
    private String bridgeSourceJndi;
    private String bridgeSourceUserName;
    private String bridgeSourceServer;

    private String bridgeTargetName;
    private String bridgeTargetJndi;
    private String bridgeTargetUserName;
    private String bridgeTargetServer;


}
