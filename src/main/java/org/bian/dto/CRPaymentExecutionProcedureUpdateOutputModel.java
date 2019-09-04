package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPaymentExecutionProcedureUpdateInputModelPaymentExecutionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPaymentExecutionProcedureUpdateOutputModel
 */
public class CRPaymentExecutionProcedureUpdateOutputModel   {
  private CRPaymentExecutionProcedureUpdateInputModelPaymentExecutionProcedureInstanceRecord paymentExecutionProcedureInstanceRecord = null;

  private String paymentExecutionProcedureUpdateActionTaskReference = null;

  private Object paymentExecutionProcedureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get paymentExecutionProcedureInstanceRecord
   * @return paymentExecutionProcedureInstanceRecord
  **/

  public CRPaymentExecutionProcedureUpdateInputModelPaymentExecutionProcedureInstanceRecord getPaymentExecutionProcedureInstanceRecord() {
    return paymentExecutionProcedureInstanceRecord;
  }

  public void setPaymentExecutionProcedureInstanceRecord(CRPaymentExecutionProcedureUpdateInputModelPaymentExecutionProcedureInstanceRecord paymentExecutionProcedureInstanceRecord) {
    this.paymentExecutionProcedureInstanceRecord = paymentExecutionProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return paymentExecutionProcedureUpdateActionTaskReference
  **/

  public String getPaymentExecutionProcedureUpdateActionTaskReference() {
    return paymentExecutionProcedureUpdateActionTaskReference;
  }

  public void setPaymentExecutionProcedureUpdateActionTaskReference(String paymentExecutionProcedureUpdateActionTaskReference) {
    this.paymentExecutionProcedureUpdateActionTaskReference = paymentExecutionProcedureUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return paymentExecutionProcedureUpdateActionTaskRecord
  **/

  public Object getPaymentExecutionProcedureUpdateActionTaskRecord() {
    return paymentExecutionProcedureUpdateActionTaskRecord;
  }

  public void setPaymentExecutionProcedureUpdateActionTaskRecord(Object paymentExecutionProcedureUpdateActionTaskRecord) {
    this.paymentExecutionProcedureUpdateActionTaskRecord = paymentExecutionProcedureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

