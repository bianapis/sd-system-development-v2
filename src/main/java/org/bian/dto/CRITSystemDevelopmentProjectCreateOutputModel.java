package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRITSystemDevelopmentProjectCreateOutputModel
 */
public class CRITSystemDevelopmentProjectCreateOutputModel   {
  private String iTSystemDevelopmentProjectInstanceReference = null;

  private String iTSystemDevelopmentProjectCreateActionReference = null;

  private Object iTSystemDevelopmentProjectCreateActionRecord = null;

  private String iTSystemDevelopmentProjectInstanceStatus = null;

  private CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord iTSystemDevelopmentProjectInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the IT System Development Project instance 
   * @return iTSystemDevelopmentProjectInstanceReference
  **/

  public String getITSystemDevelopmentProjectInstanceReference() {
    return iTSystemDevelopmentProjectInstanceReference;
  }
  @JsonProperty("iTSystemDevelopmentProjectInstanceReference")
  public void setITSystemDevelopmentProjectInstanceReference(String iTSystemDevelopmentProjectInstanceReference) {
    this.iTSystemDevelopmentProjectInstanceReference = iTSystemDevelopmentProjectInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Create service call 
   * @return iTSystemDevelopmentProjectCreateActionReference
  **/

  public String getITSystemDevelopmentProjectCreateActionReference() {
    return iTSystemDevelopmentProjectCreateActionReference;
  }
  @JsonProperty("iTSystemDevelopmentProjectCreateActionReference")
  public void setITSystemDevelopmentProjectCreateActionReference(String iTSystemDevelopmentProjectCreateActionReference) {
    this.iTSystemDevelopmentProjectCreateActionReference = iTSystemDevelopmentProjectCreateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return iTSystemDevelopmentProjectCreateActionRecord
  **/

  public Object getITSystemDevelopmentProjectCreateActionRecord() {
    return iTSystemDevelopmentProjectCreateActionRecord;
  }
  @JsonProperty("iTSystemDevelopmentProjectCreateActionRecord")
  public void setITSystemDevelopmentProjectCreateActionRecord(Object iTSystemDevelopmentProjectCreateActionRecord) {
    this.iTSystemDevelopmentProjectCreateActionRecord = iTSystemDevelopmentProjectCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the IT System Development Project instance (e.g. initialised, pending, active) 
   * @return iTSystemDevelopmentProjectInstanceStatus
  **/

  public String getITSystemDevelopmentProjectInstanceStatus() {
    return iTSystemDevelopmentProjectInstanceStatus;
  }
  @JsonProperty("iTSystemDevelopmentProjectInstanceStatus")
  public void setITSystemDevelopmentProjectInstanceStatus(String iTSystemDevelopmentProjectInstanceStatus) {
    this.iTSystemDevelopmentProjectInstanceStatus = iTSystemDevelopmentProjectInstanceStatus;
  }


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


}

