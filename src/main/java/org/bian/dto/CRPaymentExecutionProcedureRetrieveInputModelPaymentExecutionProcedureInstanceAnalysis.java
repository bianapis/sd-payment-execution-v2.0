package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPaymentExecutionProcedureRetrieveInputModelPaymentExecutionProcedureInstanceAnalysis
 */
public class CRPaymentExecutionProcedureRetrieveInputModelPaymentExecutionProcedureInstanceAnalysis   {
  private String paymentExecutionProcedureInstanceAnalysisReference = null;

  private String paymentExecutionProcedureInstanceAnalysisReportType = null;

  private String paymentExecutionProcedureInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return paymentExecutionProcedureInstanceAnalysisReference
  **/

  public String getPaymentExecutionProcedureInstanceAnalysisReference() {
    return paymentExecutionProcedureInstanceAnalysisReference;
  }

  public void setPaymentExecutionProcedureInstanceAnalysisReference(String paymentExecutionProcedureInstanceAnalysisReference) {
    this.paymentExecutionProcedureInstanceAnalysisReference = paymentExecutionProcedureInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return paymentExecutionProcedureInstanceAnalysisReportType
  **/

  public String getPaymentExecutionProcedureInstanceAnalysisReportType() {
    return paymentExecutionProcedureInstanceAnalysisReportType;
  }

  public void setPaymentExecutionProcedureInstanceAnalysisReportType(String paymentExecutionProcedureInstanceAnalysisReportType) {
    this.paymentExecutionProcedureInstanceAnalysisReportType = paymentExecutionProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return paymentExecutionProcedureInstanceAnalysisParameters
  **/

  public String getPaymentExecutionProcedureInstanceAnalysisParameters() {
    return paymentExecutionProcedureInstanceAnalysisParameters;
  }

  public void setPaymentExecutionProcedureInstanceAnalysisParameters(String paymentExecutionProcedureInstanceAnalysisParameters) {
    this.paymentExecutionProcedureInstanceAnalysisParameters = paymentExecutionProcedureInstanceAnalysisParameters;
  }


}

