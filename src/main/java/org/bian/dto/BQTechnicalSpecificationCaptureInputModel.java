package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalSpecificationCaptureInputModelCaptureRecordType;
import org.bian.dto.BQTechnicalSpecificationCaptureInputModelTechnicalSpecificationInstanceRecord;
import org.bian.dto.CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTechnicalSpecificationCaptureInputModel
 */
public class BQTechnicalSpecificationCaptureInputModel   {
  private CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord iTSystemDevelopmentProjectInstanceRecord = null;

  private String iTSystemDevelopmentProjectInstanceReference = null;

  private String technicalSpecificationInstanceReference = null;

  private BQTechnicalSpecificationCaptureInputModelTechnicalSpecificationInstanceRecord technicalSpecificationInstanceRecord = null;

  private Object technicalSpecificationCaptureActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Technical Specification instance 
   * @return technicalSpecificationInstanceReference
  **/

  public String getTechnicalSpecificationInstanceReference() {
    return technicalSpecificationInstanceReference;
  }

  public void setTechnicalSpecificationInstanceReference(String technicalSpecificationInstanceReference) {
    this.technicalSpecificationInstanceReference = technicalSpecificationInstanceReference;
  }


  /**
   * Get technicalSpecificationInstanceRecord
   * @return technicalSpecificationInstanceRecord
  **/

  public BQTechnicalSpecificationCaptureInputModelTechnicalSpecificationInstanceRecord getTechnicalSpecificationInstanceRecord() {
    return technicalSpecificationInstanceRecord;
  }

  public void setTechnicalSpecificationInstanceRecord(BQTechnicalSpecificationCaptureInputModelTechnicalSpecificationInstanceRecord technicalSpecificationInstanceRecord) {
    this.technicalSpecificationInstanceRecord = technicalSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return technicalSpecificationCaptureActionTaskRecord
  **/

  public Object getTechnicalSpecificationCaptureActionTaskRecord() {
    return technicalSpecificationCaptureActionTaskRecord;
  }

  public void setTechnicalSpecificationCaptureActionTaskRecord(Object technicalSpecificationCaptureActionTaskRecord) {
    this.technicalSpecificationCaptureActionTaskRecord = technicalSpecificationCaptureActionTaskRecord;
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

