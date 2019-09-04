package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentMechanismRetrieveOutputModelPaymentMechanismInstanceAnalysis
 */
public class BQPaymentMechanismRetrieveOutputModelPaymentMechanismInstanceAnalysis   {
  private Object paymentMechanismInstanceAnalysisRecord = null;

  private String paymentMechanismInstanceAnalysisReportType = null;

  private String paymentMechanismInstanceAnalysisParameters = null;

  private Object paymentMechanismInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return paymentMechanismInstanceAnalysisRecord
  **/

  public Object getPaymentMechanismInstanceAnalysisRecord() {
    return paymentMechanismInstanceAnalysisRecord;
  }

  public void setPaymentMechanismInstanceAnalysisRecord(Object paymentMechanismInstanceAnalysisRecord) {
    this.paymentMechanismInstanceAnalysisRecord = paymentMechanismInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return paymentMechanismInstanceAnalysisReportType
  **/

  public String getPaymentMechanismInstanceAnalysisReportType() {
    return paymentMechanismInstanceAnalysisReportType;
  }

  public void setPaymentMechanismInstanceAnalysisReportType(String paymentMechanismInstanceAnalysisReportType) {
    this.paymentMechanismInstanceAnalysisReportType = paymentMechanismInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return paymentMechanismInstanceAnalysisParameters
  **/

  public String getPaymentMechanismInstanceAnalysisParameters() {
    return paymentMechanismInstanceAnalysisParameters;
  }

  public void setPaymentMechanismInstanceAnalysisParameters(String paymentMechanismInstanceAnalysisParameters) {
    this.paymentMechanismInstanceAnalysisParameters = paymentMechanismInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return paymentMechanismInstanceAnalysisReport
  **/

  public Object getPaymentMechanismInstanceAnalysisReport() {
    return paymentMechanismInstanceAnalysisReport;
  }

  public void setPaymentMechanismInstanceAnalysisReport(Object paymentMechanismInstanceAnalysisReport) {
    this.paymentMechanismInstanceAnalysisReport = paymentMechanismInstanceAnalysisReport;
  }


}

