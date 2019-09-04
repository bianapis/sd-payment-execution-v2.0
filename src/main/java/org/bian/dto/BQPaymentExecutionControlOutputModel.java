package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentExecutionControlOutputModel
 */
public class BQPaymentExecutionControlOutputModel   {
  private String paymentExecutionControlActionTaskReference = null;

  private Object paymentExecutionControlActionTaskRecord = null;

  private String paymentExecutionControlActionResponse = null;

  private String paymentExecutionInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Payment Execution instance control processing service call 
   * @return paymentExecutionControlActionTaskReference
  **/

  public String getPaymentExecutionControlActionTaskReference() {
    return paymentExecutionControlActionTaskReference;
  }

  public void setPaymentExecutionControlActionTaskReference(String paymentExecutionControlActionTaskReference) {
    this.paymentExecutionControlActionTaskReference = paymentExecutionControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return paymentExecutionControlActionTaskRecord
  **/

  public Object getPaymentExecutionControlActionTaskRecord() {
    return paymentExecutionControlActionTaskRecord;
  }

  public void setPaymentExecutionControlActionTaskRecord(Object paymentExecutionControlActionTaskRecord) {
    this.paymentExecutionControlActionTaskRecord = paymentExecutionControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return paymentExecutionControlActionResponse
  **/

  public String getPaymentExecutionControlActionResponse() {
    return paymentExecutionControlActionResponse;
  }

  public void setPaymentExecutionControlActionResponse(String paymentExecutionControlActionResponse) {
    this.paymentExecutionControlActionResponse = paymentExecutionControlActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Payment Execution instance (e.g. initialised, pending, active) 
   * @return paymentExecutionInstanceStatus
  **/

  public String getPaymentExecutionInstanceStatus() {
    return paymentExecutionInstanceStatus;
  }

  public void setPaymentExecutionInstanceStatus(String paymentExecutionInstanceStatus) {
    this.paymentExecutionInstanceStatus = paymentExecutionInstanceStatus;
  }


}

