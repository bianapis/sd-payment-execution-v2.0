package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentExecutionRetrieveOutputModelPaymentExecutionInstanceAnalysis
 */
public class BQPaymentExecutionRetrieveOutputModelPaymentExecutionInstanceAnalysis   {
  private Object paymentExecutionInstanceAnalysisRecord = null;

  private String paymentExecutionInstanceAnalysisReportType = null;

  private String paymentExecutionInstanceAnalysisParameters = null;

  private Object paymentExecutionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return paymentExecutionInstanceAnalysisRecord
  **/

  public Object getPaymentExecutionInstanceAnalysisRecord() {
    return paymentExecutionInstanceAnalysisRecord;
  }

  public void setPaymentExecutionInstanceAnalysisRecord(Object paymentExecutionInstanceAnalysisRecord) {
    this.paymentExecutionInstanceAnalysisRecord = paymentExecutionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return paymentExecutionInstanceAnalysisReportType
  **/

  public String getPaymentExecutionInstanceAnalysisReportType() {
    return paymentExecutionInstanceAnalysisReportType;
  }

  public void setPaymentExecutionInstanceAnalysisReportType(String paymentExecutionInstanceAnalysisReportType) {
    this.paymentExecutionInstanceAnalysisReportType = paymentExecutionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return paymentExecutionInstanceAnalysisParameters
  **/

  public String getPaymentExecutionInstanceAnalysisParameters() {
    return paymentExecutionInstanceAnalysisParameters;
  }

  public void setPaymentExecutionInstanceAnalysisParameters(String paymentExecutionInstanceAnalysisParameters) {
    this.paymentExecutionInstanceAnalysisParameters = paymentExecutionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return paymentExecutionInstanceAnalysisReport
  **/

  public Object getPaymentExecutionInstanceAnalysisReport() {
    return paymentExecutionInstanceAnalysisReport;
  }

  public void setPaymentExecutionInstanceAnalysisReport(Object paymentExecutionInstanceAnalysisReport) {
    this.paymentExecutionInstanceAnalysisReport = paymentExecutionInstanceAnalysisReport;
  }


}

