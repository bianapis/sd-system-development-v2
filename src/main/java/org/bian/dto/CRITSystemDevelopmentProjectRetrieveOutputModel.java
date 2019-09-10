package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord;
import org.bian.dto.CRITSystemDevelopmentProjectRetrieveOutputModelITSystemDevelopmentProjectInstanceAnalysis;
import org.bian.dto.CRITSystemDevelopmentProjectRetrieveOutputModelITSystemDevelopmentProjectInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRITSystemDevelopmentProjectRetrieveOutputModel
 */
public class CRITSystemDevelopmentProjectRetrieveOutputModel   {
  private CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord iTSystemDevelopmentProjectInstanceRecord = null;

  private String iTSystemDevelopmentProjectRetrieveActionTaskReference = null;

  private Object iTSystemDevelopmentProjectRetrieveActionTaskRecord = null;

  private String iTSystemDevelopmentProjectRetrieveActionResponse = null;

  private CRITSystemDevelopmentProjectRetrieveOutputModelITSystemDevelopmentProjectInstanceReportRecord iTSystemDevelopmentProjectInstanceReportRecord = null;

  private CRITSystemDevelopmentProjectRetrieveOutputModelITSystemDevelopmentProjectInstanceAnalysis iTSystemDevelopmentProjectInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a IT System Development Project instance retrieve service call 
   * @return iTSystemDevelopmentProjectRetrieveActionTaskReference
  **/

  public String getITSystemDevelopmentProjectRetrieveActionTaskReference() {
    return iTSystemDevelopmentProjectRetrieveActionTaskReference;
  }
  @JsonProperty("iTSystemDevelopmentProjectRetrieveActionTaskReference")
  public void setITSystemDevelopmentProjectRetrieveActionTaskReference(String iTSystemDevelopmentProjectRetrieveActionTaskReference) {
    this.iTSystemDevelopmentProjectRetrieveActionTaskReference = iTSystemDevelopmentProjectRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return iTSystemDevelopmentProjectRetrieveActionTaskRecord
  **/

  public Object getITSystemDevelopmentProjectRetrieveActionTaskRecord() {
    return iTSystemDevelopmentProjectRetrieveActionTaskRecord;
  }
   @JsonProperty("iTSystemDevelopmentProjectRetrieveActionTaskRecord")
  public void setITSystemDevelopmentProjectRetrieveActionTaskRecord(Object iTSystemDevelopmentProjectRetrieveActionTaskRecord) {
    this.iTSystemDevelopmentProjectRetrieveActionTaskRecord = iTSystemDevelopmentProjectRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return iTSystemDevelopmentProjectRetrieveActionResponse
  **/

  public String getITSystemDevelopmentProjectRetrieveActionResponse() {
    return iTSystemDevelopmentProjectRetrieveActionResponse;
  }
   
  @JsonProperty("iTSystemDevelopmentProjectRetrieveActionResponse")
  public void setITSystemDevelopmentProjectRetrieveActionResponse(String iTSystemDevelopmentProjectRetrieveActionResponse) {
    this.iTSystemDevelopmentProjectRetrieveActionResponse = iTSystemDevelopmentProjectRetrieveActionResponse;
  }


  /**
   * Get iTSystemDevelopmentProjectInstanceReportRecord
   * @return iTSystemDevelopmentProjectInstanceReportRecord
  **/

  public CRITSystemDevelopmentProjectRetrieveOutputModelITSystemDevelopmentProjectInstanceReportRecord getITSystemDevelopmentProjectInstanceReportRecord() {
    return iTSystemDevelopmentProjectInstanceReportRecord;
  }
  @JsonProperty("iTSystemDevelopmentProjectInstanceReportRecord")
  public void setITSystemDevelopmentProjectInstanceReportRecord(CRITSystemDevelopmentProjectRetrieveOutputModelITSystemDevelopmentProjectInstanceReportRecord iTSystemDevelopmentProjectInstanceReportRecord) {
    this.iTSystemDevelopmentProjectInstanceReportRecord = iTSystemDevelopmentProjectInstanceReportRecord;
  }


  /**
   * Get iTSystemDevelopmentProjectInstanceAnalysis
   * @return iTSystemDevelopmentProjectInstanceAnalysis
  **/

  public CRITSystemDevelopmentProjectRetrieveOutputModelITSystemDevelopmentProjectInstanceAnalysis getITSystemDevelopmentProjectInstanceAnalysis() {
    return iTSystemDevelopmentProjectInstanceAnalysis;
  }
  
  @JsonProperty("iTSystemDevelopmentProjectInstanceAnalysis")
  public void setITSystemDevelopmentProjectInstanceAnalysis(CRITSystemDevelopmentProjectRetrieveOutputModelITSystemDevelopmentProjectInstanceAnalysis iTSystemDevelopmentProjectInstanceAnalysis) {
    this.iTSystemDevelopmentProjectInstanceAnalysis = iTSystemDevelopmentProjectInstanceAnalysis;
  }


}

