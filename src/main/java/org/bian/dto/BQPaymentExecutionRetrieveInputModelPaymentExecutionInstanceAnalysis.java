package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentExecutionRetrieveInputModelPaymentExecutionInstanceAnalysis
 */
public class BQPaymentExecutionRetrieveInputModelPaymentExecutionInstanceAnalysis   {
  private String paymentExecutionInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return paymentExecutionInstanceAnalysisReference
  **/

  public String getPaymentExecutionInstanceAnalysisReference() {
    return paymentExecutionInstanceAnalysisReference;
  }

  public void setPaymentExecutionInstanceAnalysisReference(String paymentExecutionInstanceAnalysisReference) {
    this.paymentExecutionInstanceAnalysisReference = paymentExecutionInstanceAnalysisReference;
  }


}

