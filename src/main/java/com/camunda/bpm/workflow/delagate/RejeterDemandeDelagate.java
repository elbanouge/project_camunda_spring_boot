package com.camunda.bpm.workflow.delagate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins ="*")
public class RejeterDemandeDelagate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

    }
}
