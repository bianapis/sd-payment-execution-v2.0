package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRPaymentExecutionProcedureRetrieveOutputModelPaymentExecutionProcedureInstanceAnalysis
 */
public class CRPaymentExecutionProcedureRetrieveOutputModelPaymentExecutionProcedureInstanceAnalysis   {
  private String paymentExecutionProcedureInstanceAnalysisData = null;

  private String paymentExecutionProcedureInstanceAnalysisReportType = null;

  private Object paymentExecutionProcedureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return paymentExecutionProcedureInstanceAnalysisData
  **/

  public String getPaymentExecutionProcedureInstanceAnalysisData() {
    return paymentExecutionProcedureInstanceAnalysisData;
  }

  public void setPaymentExecutionProcedureInstanceAnalysisData(String paymentExecutionProcedureInstanceAnalysisData) {
    this.paymentExecutionProcedureInstanceAnalysisData = paymentExecutionProcedureInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return paymentExecutionProcedureInstanceAnalysisReport
  **/

  public Object getPaymentExecutionProcedureInstanceAnalysisReport() {
    return paymentExecutionProcedureInstanceAnalysisReport;
  }

  public void setPaymentExecutionProcedureInstanceAnalysisReport(Object paymentExecutionProcedureInstanceAnalysisReport) {
    this.paymentExecutionProcedureInstanceAnalysisReport = paymentExecutionProcedureInstanceAnalysisReport;
  }


}

