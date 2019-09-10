package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemDevelopmentProjectRetrieveInputModelITSystemDevelopmentProjectInstanceAnalysis;
import org.bian.dto.CRITSystemDevelopmentProjectRetrieveInputModelITSystemDevelopmentProjectInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRITSystemDevelopmentProjectRetrieveInputModel
 */
public class CRITSystemDevelopmentProjectRetrieveInputModel   {
  private Object iTSystemDevelopmentProjectRetrieveActionTaskRecord = null;

  private String iTSystemDevelopmentProjectRetrieveActionRequest = null;

  private CRITSystemDevelopmentProjectRetrieveInputModelITSystemDevelopmentProjectInstanceReportRecord iTSystemDevelopmentProjectInstanceReportRecord = null;

  private CRITSystemDevelopmentProjectRetrieveInputModelITSystemDevelopmentProjectInstanceAnalysis iTSystemDevelopmentProjectInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return iTSystemDevelopmentProjectRetrieveActionTaskRecord
  **/

  public Object getITSystemDevelopmentProjectRetrieveActionTaskRecord() {
    return iTSystemDevelopmentProjectRetrieveActionTaskRecord;
  }

  public void setITSystemDevelopmentProjectRetrieveActionTaskRecord(Object iTSystemDevelopmentProjectRetrieveActionTaskRecord) {
    this.iTSystemDevelopmentProjectRetrieveActionTaskRecord = iTSystemDevelopmentProjectRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return iTSystemDevelopmentProjectRetrieveActionRequest
  **/

  public String getITSystemDevelopmentProjectRetrieveActionRequest() {
    return iTSystemDevelopmentProjectRetrieveActionRequest;
  }

  public void setITSystemDevelopmentProjectRetrieveActionRequest(String iTSystemDevelopmentProjectRetrieveActionRequest) {
    this.iTSystemDevelopmentProjectRetrieveActionRequest = iTSystemDevelopmentProjectRetrieveActionRequest;
  }


  /**
   * Get iTSystemDevelopmentProjectInstanceReportRecord
   * @return iTSystemDevelopmentProjectInstanceReportRecord
  **/

  public CRITSystemDevelopmentProjectRetrieveInputModelITSystemDevelopmentProjectInstanceReportRecord getITSystemDevelopmentProjectInstanceReportRecord() {
    return iTSystemDevelopmentProjectInstanceReportRecord;
  }

  public void setITSystemDevelopmentProjectInstanceReportRecord(CRITSystemDevelopmentProjectRetrieveInputModelITSystemDevelopmentProjectInstanceReportRecord iTSystemDevelopmentProjectInstanceReportRecord) {
    this.iTSystemDevelopmentProjectInstanceReportRecord = iTSystemDevelopmentProjectInstanceReportRecord;
  }


  /**
   * Get iTSystemDevelopmentProjectInstanceAnalysis
   * @return iTSystemDevelopmentProjectInstanceAnalysis
  **/

  public CRITSystemDevelopmentProjectRetrieveInputModelITSystemDevelopmentProjectInstanceAnalysis getITSystemDevelopmentProjectInstanceAnalysis() {
    return iTSystemDevelopmentProjectInstanceAnalysis;
  }

  public void setITSystemDevelopmentProjectInstanceAnalysis(CRITSystemDevelopmentProjectRetrieveInputModelITSystemDevelopmentProjectInstanceAnalysis iTSystemDevelopmentProjectInstanceAnalysis) {
    this.iTSystemDevelopmentProjectInstanceAnalysis = iTSystemDevelopmentProjectInstanceAnalysis;
  }


}

