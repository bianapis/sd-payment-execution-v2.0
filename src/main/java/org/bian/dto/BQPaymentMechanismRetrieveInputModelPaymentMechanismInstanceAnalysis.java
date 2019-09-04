package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentMechanismRetrieveInputModelPaymentMechanismInstanceAnalysis
 */
public class BQPaymentMechanismRetrieveInputModelPaymentMechanismInstanceAnalysis   {
  private String paymentMechanismInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return paymentMechanismInstanceAnalysisReference
  **/

  public String getPaymentMechanismInstanceAnalysisReference() {
    return paymentMechanismInstanceAnalysisReference;
  }

  public void setPaymentMechanismInstanceAnalysisReference(String paymentMechanismInstanceAnalysisReference) {
    this.paymentMechanismInstanceAnalysisReference = paymentMechanismInstanceAnalysisReference;
  }


}

