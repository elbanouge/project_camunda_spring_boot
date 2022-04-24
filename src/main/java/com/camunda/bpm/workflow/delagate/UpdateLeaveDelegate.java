package com.camunda.bpm.workflow.delagate;

import lombok.extern.log4j.Log4j2;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

@Log4j2
public class UpdateLeaveDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        log.info("\n\n ... LoggerDelegate invoked by "
                + " activtyName='" + execution.getCurrentActivityName()
                + " activtyId=" + execution.getCurrentActivityId()
                + "  processDefinitionId=" + execution.getProcessDefinitionId()
                + "   processInstanceId=" + execution.getProcessInstanceId()
                + "  businesskey=" + execution.getProcessBusinessKey()
                + "    executionId=" + execution.getId()
                + "    variables=" + execution.getVariables());
    }
}
