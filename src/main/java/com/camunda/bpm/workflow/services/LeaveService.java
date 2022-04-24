package com.camunda.bpm.workflow.services;

import org.springframework.stereotype.Service;

@Service
public class LeaveService {

    public void getLeaveName(String name) {
        System.out.println("Leave name is >>>> " + name);;
    }
}
