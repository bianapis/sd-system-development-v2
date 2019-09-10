package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTechnicalSpecificationRetrieveOutputModelTechnicalSpecificationInstanceAnalysis;
import org.bian.dto.BQTechnicalSpecificationRetrieveOutputModelTechnicalSpecificationInstanceRecord;
import org.bian.dto.BQTechnicalSpecificationRetrieveOutputModelTechnicalSpecificationInstanceReport;
import org.bian.dto.CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTechnicalSpecificationRetrieveOutputModel
 */
public class BQTechnicalSpecificationRetrieveOutputModel   {
  private CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord iTSystemDevelopmentProjectInstanceRecord = null;

  private BQTechnicalSpecificationRetrieveOutputModelTechnicalSpecificationInstanceRecord technicalSpecificationInstanceRecord = null;

  private String technicalSpecificationRetrieveActionTaskReference = null;

  private Object technicalSpecificationRetrieveActionTaskRecord = null;

  private String technicalSpecificationRetrieveActionResponse = null;

  private BQTechnicalSpecificationRetrieveOutputModelTechnicalSpecificationInstanceReport technicalSpecificationInstanceReport = null;

  private BQTechnicalSpecificationRetrieveOutputModelTechnicalSpecificationInstanceAnalysis technicalSpecificationInstanceAnalysis = null;


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
   * Get technicalSpecificationInstanceRecord
   * @return technicalSpecificationInstanceRecord
  **/

  public BQTechnicalSpecificationRetrieveOutputModelTechnicalSpecificationInstanceRecord getTechnicalSpecificationInstanceRecord() {
    return technicalSpecificationInstanceRecord;
  }

  public void setTechnicalSpecificationInstanceRecord(BQTechnicalSpecificationRetrieveOutputModelTechnicalSpecificationInstanceRecord technicalSpecificationInstanceRecord) {
    this.technicalSpecificationInstanceRecord = technicalSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Technical Specification instance retrieve service call 
   * @return technicalSpecificationRetrieveActionTaskReference
  **/

  public String getTechnicalSpecificationRetrieveActionTaskReference() {
    return technicalSpecificationRetrieveActionTaskReference;
  }

  public void setTechnicalSpecificationRetrieveActionTaskReference(String technicalSpecificationRetrieveActionTaskReference) {
    this.technicalSpecificationRetrieveActionTaskReference = technicalSpecificationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return technicalSpecificationRetrieveActionTaskRecord
  **/

  public Object getTechnicalSpecificationRetrieveActionTaskRecord() {
    return technicalSpecificationRetrieveActionTaskRecord;
  }

  public void setTechnicalSpecificationRetrieveActionTaskRecord(Object technicalSpecificationRetrieveActionTaskRecord) {
    this.technicalSpecificationRetrieveActionTaskRecord = technicalSpecificationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return technicalSpecificationRetrieveActionResponse
  **/

  public String getTechnicalSpecificationRetrieveActionResponse() {
    return technicalSpecificationRetrieveActionResponse;
  }

  public void setTechnicalSpecificationRetrieveActionResponse(String technicalSpecificationRetrieveActionResponse) {
    this.technicalSpecificationRetrieveActionResponse = technicalSpecificationRetrieveActionResponse;
  }


  /**
   * Get technicalSpecificationInstanceReport
   * @return technicalSpecificationInstanceReport
  **/

  public BQTechnicalSpecificationRetrieveOutputModelTechnicalSpecificationInstanceReport getTechnicalSpecificationInstanceReport() {
    return technicalSpecificationInstanceReport;
  }

  public void setTechnicalSpecificationInstanceReport(BQTechnicalSpecificationRetrieveOutputModelTechnicalSpecificationInstanceReport technicalSpecificationInstanceReport) {
    this.technicalSpecificationInstanceReport = technicalSpecificationInstanceReport;
  }


  /**
   * Get technicalSpecificationInstanceAnalysis
   * @return technicalSpecificationInstanceAnalysis
  **/

  public BQTechnicalSpecificationRetrieveOutputModelTechnicalSpecificationInstanceAnalysis getTechnicalSpecificationInstanceAnalysis() {
    return technicalSpecificationInstanceAnalysis;
  }

  public void setTechnicalSpecificationInstanceAnalysis(BQTechnicalSpecificationRetrieveOutputModelTechnicalSpecificationInstanceAnalysis technicalSpecificationInstanceAnalysis) {
    this.technicalSpecificationInstanceAnalysis = technicalSpecificationInstanceAnalysis;
  }


}

