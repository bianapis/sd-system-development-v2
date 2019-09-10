package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTechnicalSpecificationCaptureInputModelTechnicalSpecificationInstanceRecord;
import org.bian.dto.CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTechnicalSpecificationCaptureOutputModel
 */
public class BQTechnicalSpecificationCaptureOutputModel   {
  private CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord iTSystemDevelopmentProjectInstanceRecord = null;

  private BQTechnicalSpecificationCaptureInputModelTechnicalSpecificationInstanceRecord technicalSpecificationInstanceRecord = null;

  private String technicalSpecificationCaptureActionTaskReference = null;

  private Object technicalSpecificationCaptureActionTaskRecord = null;

  private String technicalSpecificationCaptureRecordReference = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Technical Specification instance capture service call 
   * @return technicalSpecificationCaptureActionTaskReference
  **/

  public String getTechnicalSpecificationCaptureActionTaskReference() {
    return technicalSpecificationCaptureActionTaskReference;
  }

  public void setTechnicalSpecificationCaptureActionTaskReference(String technicalSpecificationCaptureActionTaskReference) {
    this.technicalSpecificationCaptureActionTaskReference = technicalSpecificationCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Technical Specification structured input transaction/record 
   * @return technicalSpecificationCaptureRecordReference
  **/

  public String getTechnicalSpecificationCaptureRecordReference() {
    return technicalSpecificationCaptureRecordReference;
  }

  public void setTechnicalSpecificationCaptureRecordReference(String technicalSpecificationCaptureRecordReference) {
    this.technicalSpecificationCaptureRecordReference = technicalSpecificationCaptureRecordReference;
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

