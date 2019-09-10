package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalSpecificationCaptureInputModelCaptureRecordType;
import org.bian.dto.BQSoftwareandDataspecificationCaptureInputModelSoftwareandDataSpecificationInstanceRecord;
import org.bian.dto.CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSoftwareandDataspecificationCaptureInputModel
 */
public class BQSoftwareandDataspecificationCaptureInputModel   {
  private CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord iTSystemDevelopmentProjectInstanceRecord = null;

  private String iTSystemDevelopmentProjectInstanceReference = null;

  private String softwareandDataspecificationInstanceReference = null;

  private BQSoftwareandDataspecificationCaptureInputModelSoftwareandDataSpecificationInstanceRecord softwareandDataSpecificationInstanceRecord = null;

  private Object softwareandDataspecificationCaptureActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Software and Data specification instance 
   * @return softwareandDataspecificationInstanceReference
  **/

  public String getSoftwareandDataspecificationInstanceReference() {
    return softwareandDataspecificationInstanceReference;
  }

  public void setSoftwareandDataspecificationInstanceReference(String softwareandDataspecificationInstanceReference) {
    this.softwareandDataspecificationInstanceReference = softwareandDataspecificationInstanceReference;
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

