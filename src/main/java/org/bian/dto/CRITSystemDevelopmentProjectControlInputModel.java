package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemDevelopmentProjectControlInputModelITSystemDevelopmentProjectControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRITSystemDevelopmentProjectControlInputModel
 */
public class CRITSystemDevelopmentProjectControlInputModel   {
  private String systemDevelopmentServicingSessionReference = null;

  private String iTSystemDevelopmentProjectInstanceReference = null;

  private Object iTSystemDevelopmentProjectControlActionTaskRecord = null;

  private CRITSystemDevelopmentProjectControlInputModelITSystemDevelopmentProjectControlActionRequest iTSystemDevelopmentProjectControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return iTSystemDevelopmentProjectControlActionTaskRecord
  **/

  public Object getITSystemDevelopmentProjectControlActionTaskRecord() {
    return iTSystemDevelopmentProjectControlActionTaskRecord;
  }

  public void setITSystemDevelopmentProjectControlActionTaskRecord(Object iTSystemDevelopmentProjectControlActionTaskRecord) {
    this.iTSystemDevelopmentProjectControlActionTaskRecord = iTSystemDevelopmentProjectControlActionTaskRecord;
  }


  /**
   * Get iTSystemDevelopmentProjectControlActionRequest
   * @return iTSystemDevelopmentProjectControlActionRequest
  **/

  public CRITSystemDevelopmentProjectControlInputModelITSystemDevelopmentProjectControlActionRequest getITSystemDevelopmentProjectControlActionRequest() {
    return iTSystemDevelopmentProjectControlActionRequest;
  }

  public void setITSystemDevelopmentProjectControlActionRequest(CRITSystemDevelopmentProjectControlInputModelITSystemDevelopmentProjectControlActionRequest iTSystemDevelopmentProjectControlActionRequest) {
    this.iTSystemDevelopmentProjectControlActionRequest = iTSystemDevelopmentProjectControlActionRequest;
  }


}

