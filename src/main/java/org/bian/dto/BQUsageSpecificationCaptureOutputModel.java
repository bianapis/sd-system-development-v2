package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQUsageSpecificationCaptureInputModelUsageSpecificationInstanceRecord;
import org.bian.dto.CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQUsageSpecificationCaptureOutputModel
 */
public class BQUsageSpecificationCaptureOutputModel   {
  private CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord iTSystemDevelopmentProjectInstanceRecord = null;

  private BQUsageSpecificationCaptureInputModelUsageSpecificationInstanceRecord usageSpecificationInstanceRecord = null;

  private String usageSpecificationCaptureActionTaskReference = null;

  private Object usageSpecificationCaptureActionTaskRecord = null;

  private String usageSpecificationCaptureRecordReference = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Usage Specification instance capture service call 
   * @return usageSpecificationCaptureActionTaskReference
  **/

  public String getUsageSpecificationCaptureActionTaskReference() {
    return usageSpecificationCaptureActionTaskReference;
  }

  public void setUsageSpecificationCaptureActionTaskReference(String usageSpecificationCaptureActionTaskReference) {
    this.usageSpecificationCaptureActionTaskReference = usageSpecificationCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Usage Specification structured input transaction/record 
   * @return usageSpecificationCaptureRecordReference
  **/

  public String getUsageSpecificationCaptureRecordReference() {
    return usageSpecificationCaptureRecordReference;
  }

  public void setUsageSpecificationCaptureRecordReference(String usageSpecificationCaptureRecordReference) {
    this.usageSpecificationCaptureRecordReference = usageSpecificationCaptureRecordReference;
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

