package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentExecutionRetrieveOutputModelPaymentExecutionInstanceRecord
 */
public class BQPaymentExecutionRetrieveOutputModelPaymentExecutionInstanceRecord   {
  private String paymentExecutionTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the execution transaction  
   * @return paymentExecutionTaskResult
  **/

  public String getPaymentExecutionTaskResult() {
    return paymentExecutionTaskResult;
  }

  public void setPaymentExecutionTaskResult(String paymentExecutionTaskResult) {
    this.paymentExecutionTaskResult = paymentExecutionTaskResult;
  }


}

