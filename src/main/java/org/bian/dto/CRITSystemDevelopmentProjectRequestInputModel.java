package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord;
import org.bian.dto.CRITSystemDevelopmentProjectRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRITSystemDevelopmentProjectRequestInputModel
 */
public class CRITSystemDevelopmentProjectRequestInputModel   {
  private String systemDevelopmentServicingSessionReference = null;

  private String iTSystemDevelopmentProjectInstanceReference = null;

  private CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord iTSystemDevelopmentProjectInstanceRecord = null;

  private Object iTSystemDevelopmentProjectRequestActionTaskRecord = null;

  private CRITSystemDevelopmentProjectRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return systemDevelopmentServicingSessionReference
  **/

  public String getSystemDevelopmentServicingSessionReference() {
    return systemDevelopmentServicingSessionReference;
  }

  public void setSystemDevelopmentServicingSessionReference(String systemDevelopmentServicingSessionReference) {
    this.systemDevelopmentServicingSessionReference = systemDevelopmentServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the IT System Development Project instance 
   * @return iTSystemDevelopmentProjectInstanceReference
  **/

  public String getITSystemDevelopmentProjectInstanceReference() {
    return iTSystemDevelopmentProjectInstanceReference;
  }

  public void setITSystemDevelopmentProjectInstanceReference(String iTSystemDevelopmentProjectInstanceReference) {
    this.iTSystemDevelopmentProjectInstanceReference = iTSystemDevelopmentProjectInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return iTSystemDevelopmentProjectRequestActionTaskRecord
  **/

  public Object getITSystemDevelopmentProjectRequestActionTaskRecord() {
    return iTSystemDevelopmentProjectRequestActionTaskRecord;
  }

  public void setITSystemDevelopmentProjectRequestActionTaskRecord(Object iTSystemDevelopmentProjectRequestActionTaskRecord) {
    this.iTSystemDevelopmentProjectRequestActionTaskRecord = iTSystemDevelopmentProjectRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRITSystemDevelopmentProjectRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRITSystemDevelopmentProjectRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

