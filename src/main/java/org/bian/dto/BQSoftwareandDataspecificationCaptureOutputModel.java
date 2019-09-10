package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSoftwareandDataspecificationCaptureInputModelSoftwareandDataSpecificationInstanceRecord;
import org.bian.dto.CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSoftwareandDataspecificationCaptureOutputModel
 */
public class BQSoftwareandDataspecificationCaptureOutputModel   {
  private CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord iTSystemDevelopmentProjectInstanceRecord = null;

  private BQSoftwareandDataspecificationCaptureInputModelSoftwareandDataSpecificationInstanceRecord softwareandDataSpecificationInstanceRecord = null;

  private String softwareandDataspecificationCaptureActionTaskReference = null;

  private Object softwareandDataspecificationCaptureActionTaskRecord = null;

  private String softwareandDataspecificationCaptureRecordReference = null;

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
   * Get softwareandDataSpecificationInstanceRecord
   * @return softwareandDataSpecificationInstanceRecord
  **/

  public BQSoftwareandDataspecificationCaptureInputModelSoftwareandDataSpecificationInstanceRecord getSoftwareandDataSpecificationInstanceRecord() {
    return softwareandDataSpecificationInstanceRecord;
  }

  public void setSoftwareandDataSpecificationInstanceRecord(BQSoftwareandDataspecificationCaptureInputModelSoftwareandDataSpecificationInstanceRecord softwareandDataSpecificationInstanceRecord) {
    this.softwareandDataSpecificationInstanceRecord = softwareandDataSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Software and Data specification instance capture service call 
   * @return softwareandDataspecificationCaptureActionTaskReference
  **/

  public String getSoftwareandDataspecificationCaptureActionTaskReference() {
    return softwareandDataspecificationCaptureActionTaskReference;
  }

  public void setSoftwareandDataspecificationCaptureActionTaskReference(String softwareandDataspecificationCaptureActionTaskReference) {
    this.softwareandDataspecificationCaptureActionTaskReference = softwareandDataspecificationCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return softwareandDataspecificationCaptureActionTaskRecord
  **/

  public Object getSoftwareandDataspecificationCaptureActionTaskRecord() {
    return softwareandDataspecificationCaptureActionTaskRecord;
  }

  public void setSoftwareandDataspecificationCaptureActionTaskRecord(Object softwareandDataspecificationCaptureActionTaskRecord) {
    this.softwareandDataspecificationCaptureActionTaskRecord = softwareandDataspecificationCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Software and Data specification structured input transaction/record 
   * @return softwareandDataspecificationCaptureRecordReference
  **/

  public String getSoftwareandDataspecificationCaptureRecordReference() {
    return softwareandDataspecificationCaptureRecordReference;
  }

  public void setSoftwareandDataspecificationCaptureRecordReference(String softwareandDataspecificationCaptureRecordReference) {
    this.softwareandDataspecificationCaptureRecordReference = softwareandDataspecificationCaptureRecordReference;
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

