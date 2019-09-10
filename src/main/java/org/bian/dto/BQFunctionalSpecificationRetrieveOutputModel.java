package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalSpecificationRetrieveOutputModelFunctionalSpecificationInstanceAnalysis;
import org.bian.dto.BQFunctionalSpecificationRetrieveOutputModelFunctionalSpecificationInstanceRecord;
import org.bian.dto.BQFunctionalSpecificationRetrieveOutputModelFunctionalSpecificationInstanceReport;
import org.bian.dto.CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFunctionalSpecificationRetrieveOutputModel
 */
public class BQFunctionalSpecificationRetrieveOutputModel   {
  private CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord iTSystemDevelopmentProjectInstanceRecord = null;

  private BQFunctionalSpecificationRetrieveOutputModelFunctionalSpecificationInstanceRecord functionalSpecificationInstanceRecord = null;

  private String functionalSpecificationRetrieveActionTaskReference = null;

  private Object functionalSpecificationRetrieveActionTaskRecord = null;

  private String functionalSpecificationRetrieveActionResponse = null;

  private BQFunctionalSpecificationRetrieveOutputModelFunctionalSpecificationInstanceReport functionalSpecificationInstanceReport = null;

  private BQFunctionalSpecificationRetrieveOutputModelFunctionalSpecificationInstanceAnalysis functionalSpecificationInstanceAnalysis = null;


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
   * Get functionalSpecificationInstanceRecord
   * @return functionalSpecificationInstanceRecord
  **/

  public BQFunctionalSpecificationRetrieveOutputModelFunctionalSpecificationInstanceRecord getFunctionalSpecificationInstanceRecord() {
    return functionalSpecificationInstanceRecord;
  }

  public void setFunctionalSpecificationInstanceRecord(BQFunctionalSpecificationRetrieveOutputModelFunctionalSpecificationInstanceRecord functionalSpecificationInstanceRecord) {
    this.functionalSpecificationInstanceRecord = functionalSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Functional Specification instance retrieve service call 
   * @return functionalSpecificationRetrieveActionTaskReference
  **/

  public String getFunctionalSpecificationRetrieveActionTaskReference() {
    return functionalSpecificationRetrieveActionTaskReference;
  }

  public void setFunctionalSpecificationRetrieveActionTaskReference(String functionalSpecificationRetrieveActionTaskReference) {
    this.functionalSpecificationRetrieveActionTaskReference = functionalSpecificationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return functionalSpecificationRetrieveActionTaskRecord
  **/

  public Object getFunctionalSpecificationRetrieveActionTaskRecord() {
    return functionalSpecificationRetrieveActionTaskRecord;
  }

  public void setFunctionalSpecificationRetrieveActionTaskRecord(Object functionalSpecificationRetrieveActionTaskRecord) {
    this.functionalSpecificationRetrieveActionTaskRecord = functionalSpecificationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return functionalSpecificationRetrieveActionResponse
  **/

  public String getFunctionalSpecificationRetrieveActionResponse() {
    return functionalSpecificationRetrieveActionResponse;
  }

  public void setFunctionalSpecificationRetrieveActionResponse(String functionalSpecificationRetrieveActionResponse) {
    this.functionalSpecificationRetrieveActionResponse = functionalSpecificationRetrieveActionResponse;
  }


  /**
   * Get functionalSpecificationInstanceReport
   * @return functionalSpecificationInstanceReport
  **/

  public BQFunctionalSpecificationRetrieveOutputModelFunctionalSpecificationInstanceReport getFunctionalSpecificationInstanceReport() {
    return functionalSpecificationInstanceReport;
  }

  public void setFunctionalSpecificationInstanceReport(BQFunctionalSpecificationRetrieveOutputModelFunctionalSpecificationInstanceReport functionalSpecificationInstanceReport) {
    this.functionalSpecificationInstanceReport = functionalSpecificationInstanceReport;
  }


  /**
   * Get functionalSpecificationInstanceAnalysis
   * @return functionalSpecificationInstanceAnalysis
  **/

  public BQFunctionalSpecificationRetrieveOutputModelFunctionalSpecificationInstanceAnalysis getFunctionalSpecificationInstanceAnalysis() {
    return functionalSpecificationInstanceAnalysis;
  }

  public void setFunctionalSpecificationInstanceAnalysis(BQFunctionalSpecificationRetrieveOutputModelFunctionalSpecificationInstanceAnalysis functionalSpecificationInstanceAnalysis) {
    this.functionalSpecificationInstanceAnalysis = functionalSpecificationInstanceAnalysis;
  }


}

