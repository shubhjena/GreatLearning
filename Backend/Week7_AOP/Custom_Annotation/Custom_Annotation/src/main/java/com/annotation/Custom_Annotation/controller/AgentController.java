package com.annotation.Custom_Annotation.controller;

import com.annotation.Custom_Annotation.model.Agent;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgentController {

    @GetMapping("/get")
    public Agent getAgent(@Valid @RequestBody Agent agent){
        Agent agent1 = new Agent();
        agent1.setName(agent.getName());
        agent1.setCode(agent.getCode());

        return agent1;
    }
}
