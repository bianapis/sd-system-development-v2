package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSoftwareandDataspecificationRetrieveOutputModelSoftwareandDataSpecificationInstanceRecord;
import org.bian.dto.BQSoftwareandDataspecificationRetrieveOutputModelSoftwareandDataspecificationInstanceAnalysis;
import org.bian.dto.BQSoftwareandDataspecificationRetrieveOutputModelSoftwareandDataspecificationInstanceReport;
import org.bian.dto.CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSoftwareandDataspecificationRetrieveOutputModel
 */
public class BQSoftwareandDataspecificationRetrieveOutputModel   {
  private CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord iTSystemDevelopmentProjectInstanceRecord = null;

  private BQSoftwareandDataspecificationRetrieveOutputModelSoftwareandDataSpecificationInstanceRecord softwareandDataSpecificationInstanceRecord = null;

  private String softwareandDataspecificationRetrieveActionTaskReference = null;

  private Object softwareandDataspecificationRetrieveActionTaskRecord = null;

  private String softwareandDataspecificationRetrieveActionResponse = null;

  private BQSoftwareandDataspecificationRetrieveOutputModelSoftwareandDataspecificationInstanceReport softwareandDataspecificationInstanceReport = null;

  private BQSoftwareandDataspecificationRetrieveOutputModelSoftwareandDataspecificationInstanceAnalysis softwareandDataspecificationInstanceAnalysis = null;


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
   * Get softwareandDataSpecificationInstanceRecord
   * @return softwareandDataSpecificationInstanceRecord
  **/

  public BQSoftwareandDataspecificationRetrieveOutputModelSoftwareandDataSpecificationInstanceRecord getSoftwareandDataSpecificationInstanceRecord() {
    return softwareandDataSpecificationInstanceRecord;
  }

  public void setSoftwareandDataSpecificationInstanceRecord(BQSoftwareandDataspecificationRetrieveOutputModelSoftwareandDataSpecificationInstanceRecord softwareandDataSpecificationInstanceRecord) {
    this.softwareandDataSpecificationInstanceRecord = softwareandDataSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Software and Data specification instance retrieve service call 
   * @return softwareandDataspecificationRetrieveActionTaskReference
  **/

  public String getSoftwareandDataspecificationRetrieveActionTaskReference() {
    return softwareandDataspecificationRetrieveActionTaskReference;
  }

  public void setSoftwareandDataspecificationRetrieveActionTaskReference(String softwareandDataspecificationRetrieveActionTaskReference) {
    this.softwareandDataspecificationRetrieveActionTaskReference = softwareandDataspecificationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return softwareandDataspecificationRetrieveActionTaskRecord
  **/

  public Object getSoftwareandDataspecificationRetrieveActionTaskRecord() {
    return softwareandDataspecificationRetrieveActionTaskRecord;
  }

  public void setSoftwareandDataspecificationRetrieveActionTaskRecord(Object softwareandDataspecificationRetrieveActionTaskRecord) {
    this.softwareandDataspecificationRetrieveActionTaskRecord = softwareandDataspecificationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return softwareandDataspecificationRetrieveActionResponse
  **/

  public String getSoftwareandDataspecificationRetrieveActionResponse() {
    return softwareandDataspecificationRetrieveActionResponse;
  }

  public void setSoftwareandDataspecificationRetrieveActionResponse(String softwareandDataspecificationRetrieveActionResponse) {
    this.softwareandDataspecificationRetrieveActionResponse = softwareandDataspecificationRetrieveActionResponse;
  }


  /**
   * Get softwareandDataspecificationInstanceReport
   * @return softwareandDataspecificationInstanceReport
  **/

  public BQSoftwareandDataspecificationRetrieveOutputModelSoftwareandDataspecificationInstanceReport getSoftwareandDataspecificationInstanceReport() {
    return softwareandDataspecificationInstanceReport;
  }

  public void setSoftwareandDataspecificationInstanceReport(BQSoftwareandDataspecificationRetrieveOutputModelSoftwareandDataspecificationInstanceReport softwareandDataspecificationInstanceReport) {
    this.softwareandDataspecificationInstanceReport = softwareandDataspecificationInstanceReport;
  }


  /**
   * Get softwareandDataspecificationInstanceAnalysis
   * @return softwareandDataspecificationInstanceAnalysis
  **/

  public BQSoftwareandDataspecificationRetrieveOutputModelSoftwareandDataspecificationInstanceAnalysis getSoftwareandDataspecificationInstanceAnalysis() {
    return softwareandDataspecificationInstanceAnalysis;
  }

  public void setSoftwareandDataspecificationInstanceAnalysis(BQSoftwareandDataspecificationRetrieveOutputModelSoftwareandDataspecificationInstanceAnalysis softwareandDataspecificationInstanceAnalysis) {
    this.softwareandDataspecificationInstanceAnalysis = softwareandDataspecificationInstanceAnalysis;
  }


}

