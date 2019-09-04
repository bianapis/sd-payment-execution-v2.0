package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPaymentExecutionProcedureRetrieveInputModelPaymentExecutionProcedureInstanceReportRecord
 */
public class CRPaymentExecutionProcedureRetrieveInputModelPaymentExecutionProcedureInstanceReportRecord   {
  private String paymentExecutionProcedureInstanceReportReference = null;

  private String paymentExecutionProcedureInstanceReportType = null;

  private String paymentExecutionProcedureInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return paymentExecutionProcedureInstanceReportReference
  **/

  public String getPaymentExecutionProcedureInstanceReportReference() {
    return paymentExecutionProcedureInstanceReportReference;
  }

  public void setPaymentExecutionProcedureInstanceReportReference(String paymentExecutionProcedureInstanceReportReference) {
    this.paymentExecutionProcedureInstanceReportReference = paymentExecutionProcedureInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return paymentExecutionProcedureInstanceReportType
  **/

  public String getPaymentExecutionProcedureInstanceReportType() {
    return paymentExecutionProcedureInstanceReportType;
  }

  public void setPaymentExecutionProcedureInstanceReportType(String paymentExecutionProcedureInstanceReportType) {
    this.paymentExecutionProcedureInstanceReportType = paymentExecutionProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return paymentExecutionProcedureInstanceReportParameters
  **/

  public String getPaymentExecutionProcedureInstanceReportParameters() {
    return paymentExecutionProcedureInstanceReportParameters;
  }

  public void setPaymentExecutionProcedureInstanceReportParameters(String paymentExecutionProcedureInstanceReportParameters) {
    this.paymentExecutionProcedureInstanceReportParameters = paymentExecutionProcedureInstanceReportParameters;
  }


}

