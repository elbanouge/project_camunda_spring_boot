package com.camunda.bpm.workflow.listener;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins ="*")
public class SaisirOTPMotPass implements ExecutionListener {
    @Override
    public void notify(DelegateExecution delegateExecution) throws Exception {

    }
}
