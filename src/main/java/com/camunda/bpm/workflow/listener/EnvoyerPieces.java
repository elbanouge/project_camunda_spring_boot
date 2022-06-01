package com.camunda.bpm.workflow.listener;

import lombok.extern.log4j.Log4j2;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins ="*")
@Log4j2
public class EnvoyerPieces implements ExecutionListener {
    @Override
    public void notify(DelegateExecution delegateExecution) throws Exception {
        log.info("Transition passed ");

    }
}
