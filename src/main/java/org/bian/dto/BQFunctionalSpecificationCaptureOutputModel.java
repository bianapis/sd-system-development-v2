package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalSpecificationCaptureInputModelFunctionalSpecificationInstanceRecord;
import org.bian.dto.CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFunctionalSpecificationCaptureOutputModel
 */
public class BQFunctionalSpecificationCaptureOutputModel   {
  private CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord iTSystemDevelopmentProjectInstanceRecord = null;

  private BQFunctionalSpecificationCaptureInputModelFunctionalSpecificationInstanceRecord functionalSpecificationInstanceRecord = null;

  private String functionalSpecificationCaptureActionTaskReference = null;

  private Object functionalSpecificationCaptureActionTaskRecord = null;

  private String functionalSpecificationCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * Get iTSystemDevelopmentProjectInstanceRecord
   * @return iTSystemDevelopmentProjectInstanceRecord
  **/

  public CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord getITSystemDevelopmentProjectInstanceRecord() {
    return iTSystemDevelopmentProjectInstanceRecord;
  }
  
  @JsonProperty("iTSystemDevelopmentProjectInstanceRecord")
  public void setITSystemDevelopmentProjectInstanceRecord(CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord iTSystemDevelopmentProjectInstanceRecord) {
    this.iTSystemDevelopmentProjectInstanceRecord = iTSystemDevelopmentProjectInstanceRecord;
  }


  /**
   * Get functionalSpecificationInstanceRecord
   * @return functionalSpecificationInstanceRecord
  **/

  public BQFunctionalSpecificationCaptureInputModelFunctionalSpecificationInstanceRecord getFunctionalSpecificationInstanceRecord() {
    return functionalSpecificationInstanceRecord;
  }

  public void setFunctionalSpecificationInstanceRecord(BQFunctionalSpecificationCaptureInputModelFunctionalSpecificationInstanceRecord functionalSpecificationInstanceRecord) {
    this.functionalSpecificationInstanceRecord = functionalSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Functional Specification instance capture service call 
   * @return functionalSpecificationCaptureActionTaskReference
  **/

  public String getFunctionalSpecificationCaptureActionTaskReference() {
    return functionalSpecificationCaptureActionTaskReference;
  }

  public void setFunctionalSpecificationCaptureActionTaskReference(String functionalSpecificationCaptureActionTaskReference) {
    this.functionalSpecificationCaptureActionTaskReference = functionalSpecificationCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return functionalSpecificationCaptureActionTaskRecord
  **/

  public Object getFunctionalSpecificationCaptureActionTaskRecord() {
    return functionalSpecificationCaptureActionTaskRecord;
  }

  public void setFunctionalSpecificationCaptureActionTaskRecord(Object functionalSpecificationCaptureActionTaskRecord) {
    this.functionalSpecificationCaptureActionTaskRecord = functionalSpecificationCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Functional Specification structured input transaction/record 
   * @return functionalSpecificationCaptureRecordReference
  **/

  public String getFunctionalSpecificationCaptureRecordReference() {
    return functionalSpecificationCaptureRecordReference;
  }

  public void setFunctionalSpecificationCaptureRecordReference(String functionalSpecificationCaptureRecordReference) {
    this.functionalSpecificationCaptureRecordReference = functionalSpecificationCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

