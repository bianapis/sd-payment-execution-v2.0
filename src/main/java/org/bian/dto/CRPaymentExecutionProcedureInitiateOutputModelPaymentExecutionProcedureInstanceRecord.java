package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPaymentExecutionProcedureInitiateInputModelPaymentExecutionProcedureInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * CRPaymentExecutionProcedureInitiateOutputModelPaymentExecutionProcedureInstanceRecord
 */
public class CRPaymentExecutionProcedureInitiateOutputModelPaymentExecutionProcedureInstanceRecord   {
  private String aCHAccessServiceSessionReference = null;

  private String aCHAccessSchedule = null;

  private String correspondentServiceSessionReference = null;

  private String correspondentServiceAccessSchedule = null;

  private CRPaymentExecutionProcedureInitiateInputModelPaymentExecutionProcedureInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the ACH financial gateway service used to execute payments 
   * @return aCHAccessServiceSessionReference
  **/

  public String getACHAccessServiceSessionReference() {
    return aCHAccessServiceSessionReference;
  }
  @JsonProperty("aCHAccessServiceSessionReference")
  public void setACHAccessServiceSessionReference(String aCHAccessServiceSessionReference) {
    this.aCHAccessServiceSessionReference = aCHAccessServiceSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The published gateway service availability 
   * @return aCHAccessSchedule
  **/

  public String getACHAccessSchedule() {
    return aCHAccessSchedule;
  }

  @JsonProperty("aCHAccessSchedule")
  public void setACHAccessSchedule(String aCHAccessSchedule) {
    this.aCHAccessSchedule = aCHAccessSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the SWIFT gateway service used to execute correspondent payments 
   * @return correspondentServiceSessionReference
  **/

  public String getCorrespondentServiceSessionReference() {
    return correspondentServiceSessionReference;
  }

  public void setCorrespondentServiceSessionReference(String correspondentServiceSessionReference) {
    this.correspondentServiceSessionReference = correspondentServiceSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The published gateway service availability 
   * @return correspondentServiceAccessSchedule
  **/

  public String getCorrespondentServiceAccessSchedule() {
    return correspondentServiceAccessSchedule;
  }

  public void setCorrespondentServiceAccessSchedule(String correspondentServiceAccessSchedule) {
    this.correspondentServiceAccessSchedule = correspondentServiceAccessSchedule;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRPaymentExecutionProcedureInitiateInputModelPaymentExecutionProcedureInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRPaymentExecutionProcedureInitiateInputModelPaymentExecutionProcedureInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

