package com.camunda.bpm.workflow.repositories;

import com.camunda.bpm.workflow.models.FlowStepHistory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowStepHistoryRepository extends CrudRepository<FlowStepHistory, Long> {

}