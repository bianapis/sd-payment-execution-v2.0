package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentExecutionRetrieveInputModelPaymentExecutionInstanceReport
 */
public class BQPaymentExecutionRetrieveInputModelPaymentExecutionInstanceReport   {
  private String paymentExecutionInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return paymentExecutionInstanceReportReference
  **/

  public String getPaymentExecutionInstanceReportReference() {
    return paymentExecutionInstanceReportReference;
  }

  public void setPaymentExecutionInstanceReportReference(String paymentExecutionInstanceReportReference) {
    this.paymentExecutionInstanceReportReference = paymentExecutionInstanceReportReference;
  }


}

