package com.camunda.bpm.workflow.delagate;

import com.camunda.bpm.workflow.models.Post;
import com.camunda.bpm.workflow.services.LeaveService;
import com.google.gson.Gson;
import lombok.extern.log4j.Log4j2;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.connect.Connectors;
import org.camunda.connect.httpclient.HttpConnector;
import org.camunda.connect.httpclient.HttpRequest;
import org.camunda.connect.httpclient.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class ValidateBalanceDelegate implements JavaDelegate {

    @Autowired
    private LeaveService leaveService;

    @Override
    public void execute(DelegateExecution execution) throws Exception {

        /*String leaveType = (String) execution.getVariable("leaveType");
        log.info("leaveType is >>> " + leaveType);
        log.info("\n\n ... LoggerDelegate invoked by "
                + " activtyName='" + execution.getCurrentActivityName()
                + " activtyId=" + execution.getCurrentActivityId()
                + "  processDefinitionId=" + execution.getProcessDefinitionId()
                + "   processInstanceId=" + execution.getProcessInstanceId()
                + "  businesskey=" + execution.getProcessBusinessKey()
                + "    executionId=" + execution.getId()
                + "    variables=" + execution.getVariables());*/

        /*HttpConnector http = Connectors. getConnector (HttpConnector.ID);

        HttpRequest req= http.createRequest();
        req.get()
                .url("https://jsonplaceholder.typicode.com/posts/20")
                .header ("Accept", "application/json");
        HttpResponse res = req.execute();
        log.info("Post response is >» " + res.getResponse());
        Gson json= new Gson();
        Post dto = json.fromJson(res.getResponse(), Post.class);
        log.info("post id is " + dto.getId() + " post body is » " + dto.getBody());*/

        leaveService.getLeaveName("hello leave service");

    }
}
