package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRITSystemDevelopmentProjectUpdateInputModel
 */
public class CRITSystemDevelopmentProjectUpdateInputModel   {
  private String systemDevelopmentServicingSessionReference = null;

  private String iTSystemDevelopmentProjectInstanceReference = null;

  private CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord iTSystemDevelopmentProjectInstanceRecord = null;

  private Object iTSystemDevelopmentProjectUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return iTSystemDevelopmentProjectUpdateActionTaskRecord
  **/

  public Object getITSystemDevelopmentProjectUpdateActionTaskRecord() {
    return iTSystemDevelopmentProjectUpdateActionTaskRecord;
  }

  public void setITSystemDevelopmentProjectUpdateActionTaskRecord(Object iTSystemDevelopmentProjectUpdateActionTaskRecord) {
    this.iTSystemDevelopmentProjectUpdateActionTaskRecord = iTSystemDevelopmentProjectUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

