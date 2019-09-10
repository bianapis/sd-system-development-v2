package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalSpecificationCaptureInputModelCaptureRecordType;
import org.bian.dto.BQFunctionalSpecificationCaptureInputModelFunctionalSpecificationInstanceRecord;
import org.bian.dto.CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFunctionalSpecificationCaptureInputModel
 */
public class BQFunctionalSpecificationCaptureInputModel   {
  private CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord iTSystemDevelopmentProjectInstanceRecord = null;

  private String iTSystemDevelopmentProjectInstanceReference = null;

  private String functionalSpecificationInstanceReference = null;

  private BQFunctionalSpecificationCaptureInputModelFunctionalSpecificationInstanceRecord functionalSpecificationInstanceRecord = null;

  private Object functionalSpecificationCaptureActionTaskRecord = null;

  private BQFunctionalSpecificationCaptureInputModelCaptureRecordType captureRecordType = null;


  /**
   * Get iTSystemDevelopmentProjectInstanceRecord
   * @return iTSystemDevelopmentProjectInstanceRecord
  **/

  public CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord getITSystemDevelopmentProjectInstanceRecord() {
    return iTSystemDevelopmentProjectInstanceRecord;
  }

  public void setITSystemDevelopmentProjectInstanceRecord(CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord iTSystemDevelopmentProjectInstanceRecord) {
    this.iTSystemDevelopmentProjectInstanceRecord = iTSystemDevelopmentProjectInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent IT System Development Project instance 
   * @return iTSystemDevelopmentProjectInstanceReference
  **/

  public String getITSystemDevelopmentProjectInstanceReference() {
    return iTSystemDevelopmentProjectInstanceReference;
  }

  public void setITSystemDevelopmentProjectInstanceReference(String iTSystemDevelopmentProjectInstanceReference) {
    this.iTSystemDevelopmentProjectInstanceReference = iTSystemDevelopmentProjectInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Functional Specification instance 
   * @return functionalSpecificationInstanceReference
  **/

  public String getFunctionalSpecificationInstanceReference() {
    return functionalSpecificationInstanceReference;
  }

  public void setFunctionalSpecificationInstanceReference(String functionalSpecificationInstanceReference) {
    this.functionalSpecificationInstanceReference = functionalSpecificationInstanceReference;
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
   * Get captureRecordType
   * @return captureRecordType
  **/

  public BQFunctionalSpecificationCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(BQFunctionalSpecificationCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

