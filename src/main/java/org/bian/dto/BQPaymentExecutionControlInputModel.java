package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentExecutionControlInputModelPaymentExecutionControlActionRequest;

import javax.validation.Valid;
  
/**
 * BQPaymentExecutionControlInputModel
 */
public class BQPaymentExecutionControlInputModel   {
  private String paymentExecutionProcedureInstanceReference = null;

  private String paymentExecutionInstanceReference = null;

  private Object paymentExecutionControlActionTaskRecord = null;

  private BQPaymentExecutionControlInputModelPaymentExecutionControlActionRequest paymentExecutionControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Payment Execution Procedure instance 
   * @return paymentExecutionProcedureInstanceReference
  **/

  public String getPaymentExecutionProcedureInstanceReference() {
    return paymentExecutionProcedureInstanceReference;
  }

  public void setPaymentExecutionProcedureInstanceReference(String paymentExecutionProcedureInstanceReference) {
    this.paymentExecutionProcedureInstanceReference = paymentExecutionProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Payment Execution instance 
   * @return paymentExecutionInstanceReference
  **/

  public String getPaymentExecutionInstanceReference() {
    return paymentExecutionInstanceReference;
  }

  public void setPaymentExecutionInstanceReference(String paymentExecutionInstanceReference) {
    this.paymentExecutionInstanceReference = paymentExecutionInstanceReference;
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
   * Get paymentExecutionControlActionRequest
   * @return paymentExecutionControlActionRequest
  **/

  public BQPaymentExecutionControlInputModelPaymentExecutionControlActionRequest getPaymentExecutionControlActionRequest() {
    return paymentExecutionControlActionRequest;
  }

  public void setPaymentExecutionControlActionRequest(BQPaymentExecutionControlInputModelPaymentExecutionControlActionRequest paymentExecutionControlActionRequest) {
    this.paymentExecutionControlActionRequest = paymentExecutionControlActionRequest;
  }


}

