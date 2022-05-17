package com.camunda.bpm.workflow.delagate;

import lombok.extern.log4j.Log4j2;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

@Log4j2
public class EnvoiOTPDelagate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        log.info("\n\n ... LoggerDelegate invoked by "
                + " activtyName='" + delegateExecution.getCurrentActivityName()
                + " activtyId=" + delegateExecution.getCurrentActivityId()
                + "  processDefinitionId=" + delegateExecution.getProcessDefinitionId()
                + "   processInstanceId=" + delegateExecution.getProcessInstanceId()
                + "  businesskey=" + delegateExecution.getProcessBusinessKey()
                + "    executionId=" + delegateExecution.getId()
                + "    variables=" + delegateExecution.getVariables());
    }
}
