package com.camunda.bpm.workflow.services;

import com.camunda.bpm.workflow.models.FlowStepHistory;
import com.camunda.bpm.workflow.repositories.FlowStepHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomHistoryService {

    @Autowired
    private FlowStepHistoryRepository flowStepHistoryRepository;

    public void saveStep(String rootProcessInstanceId, String processInstanceId, String processName,
                         String stepType, String stepName){

        FlowStepHistory flowStepHistory = new FlowStepHistory();
        flowStepHistory.setRootProcessInstanceId(rootProcessInstanceId);
        flowStepHistory.setProcessInstanceId(processInstanceId);
        flowStepHistory.setProcessName(processName);
        flowStepHistory.setStepType(stepType);
        flowStepHistory.setStepName(stepName);
        flowStepHistoryRepository.save(flowStepHistory);
    }
}