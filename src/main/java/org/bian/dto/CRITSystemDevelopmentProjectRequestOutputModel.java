package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRITSystemDevelopmentProjectRequestOutputModel
 */
public class CRITSystemDevelopmentProjectRequestOutputModel   {
  private CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord iTSystemDevelopmentProjectInstanceRecord = null;

  private String iTSystemDevelopmentProjectRequestActionTaskReference = null;

  private Object iTSystemDevelopmentProjectRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a IT System Development Project instance request service call 
   * @return iTSystemDevelopmentProjectRequestActionTaskReference
  **/

  public String getITSystemDevelopmentProjectRequestActionTaskReference() {
    return iTSystemDevelopmentProjectRequestActionTaskReference;
  }
   
  @JsonProperty("iTSystemDevelopmentProjectRequestActionTaskReference")
  public void setITSystemDevelopmentProjectRequestActionTaskReference(String iTSystemDevelopmentProjectRequestActionTaskReference) {
    this.iTSystemDevelopmentProjectRequestActionTaskReference = iTSystemDevelopmentProjectRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return iTSystemDevelopmentProjectRequestActionTaskRecord
  **/

  public Object getITSystemDevelopmentProjectRequestActionTaskRecord() {
    return iTSystemDevelopmentProjectRequestActionTaskRecord;
  }
   
  @JsonProperty("iTSystemDevelopmentProjectRequestActionTaskRecord")
  public void setITSystemDevelopmentProjectRequestActionTaskRecord(Object iTSystemDevelopmentProjectRequestActionTaskRecord) {
    this.iTSystemDevelopmentProjectRequestActionTaskRecord = iTSystemDevelopmentProjectRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

