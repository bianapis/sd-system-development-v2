package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRITSystemDevelopmentProjectUpdateOutputModel
 */
public class CRITSystemDevelopmentProjectUpdateOutputModel   {
  private CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord iTSystemDevelopmentProjectInstanceRecord = null;

  private String iTSystemDevelopmentProjectUpdateActionTaskReference = null;

  private Object iTSystemDevelopmentProjectUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return iTSystemDevelopmentProjectUpdateActionTaskReference
  **/

  public String getITSystemDevelopmentProjectUpdateActionTaskReference() {
    return iTSystemDevelopmentProjectUpdateActionTaskReference;
  }
   
  @JsonProperty("iTSystemDevelopmentProjectUpdateActionTaskReference")
  public void setITSystemDevelopmentProjectUpdateActionTaskReference(String iTSystemDevelopmentProjectUpdateActionTaskReference) {
    this.iTSystemDevelopmentProjectUpdateActionTaskReference = iTSystemDevelopmentProjectUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return iTSystemDevelopmentProjectUpdateActionTaskRecord
  **/

  public Object getITSystemDevelopmentProjectUpdateActionTaskRecord() {
    return iTSystemDevelopmentProjectUpdateActionTaskRecord;
  }
   @JsonProperty("iTSystemDevelopmentProjectUpdateActionTaskRecord")
  public void setITSystemDevelopmentProjectUpdateActionTaskRecord(Object iTSystemDevelopmentProjectUpdateActionTaskRecord) {
    this.iTSystemDevelopmentProjectUpdateActionTaskRecord = iTSystemDevelopmentProjectUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

