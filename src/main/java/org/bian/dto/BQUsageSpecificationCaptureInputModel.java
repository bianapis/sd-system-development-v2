package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalSpecificationCaptureInputModelCaptureRecordType;
import org.bian.dto.BQUsageSpecificationCaptureInputModelUsageSpecificationInstanceRecord;
import org.bian.dto.CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQUsageSpecificationCaptureInputModel
 */
public class BQUsageSpecificationCaptureInputModel   {
  private CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord iTSystemDevelopmentProjectInstanceRecord = null;

  private String iTSystemDevelopmentProjectInstanceReference = null;

  private String usageSpecificationInstanceReference = null;

  private BQUsageSpecificationCaptureInputModelUsageSpecificationInstanceRecord usageSpecificationInstanceRecord = null;

  private Object usageSpecificationCaptureActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Usage Specification instance 
   * @return usageSpecificationInstanceReference
  **/

  public String getUsageSpecificationInstanceReference() {
    return usageSpecificationInstanceReference;
  }

  public void setUsageSpecificationInstanceReference(String usageSpecificationInstanceReference) {
    this.usageSpecificationInstanceReference = usageSpecificationInstanceReference;
  }


  /**
   * Get usageSpecificationInstanceRecord
   * @return usageSpecificationInstanceRecord
  **/

  public BQUsageSpecificationCaptureInputModelUsageSpecificationInstanceRecord getUsageSpecificationInstanceRecord() {
    return usageSpecificationInstanceRecord;
  }

  public void setUsageSpecificationInstanceRecord(BQUsageSpecificationCaptureInputModelUsageSpecificationInstanceRecord usageSpecificationInstanceRecord) {
    this.usageSpecificationInstanceRecord = usageSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return usageSpecificationCaptureActionTaskRecord
  **/

  public Object getUsageSpecificationCaptureActionTaskRecord() {
    return usageSpecificationCaptureActionTaskRecord;
  }

  public void setUsageSpecificationCaptureActionTaskRecord(Object usageSpecificationCaptureActionTaskRecord) {
    this.usageSpecificationCaptureActionTaskRecord = usageSpecificationCaptureActionTaskRecord;
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

