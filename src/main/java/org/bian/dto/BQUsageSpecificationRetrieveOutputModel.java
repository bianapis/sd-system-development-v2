package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQUsageSpecificationRetrieveOutputModelUsageSpecificationInstanceAnalysis;
import org.bian.dto.BQUsageSpecificationRetrieveOutputModelUsageSpecificationInstanceRecord;
import org.bian.dto.BQUsageSpecificationRetrieveOutputModelUsageSpecificationInstanceReport;
import org.bian.dto.CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQUsageSpecificationRetrieveOutputModel
 */
public class BQUsageSpecificationRetrieveOutputModel   {
  private CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord iTSystemDevelopmentProjectInstanceRecord = null;

  private BQUsageSpecificationRetrieveOutputModelUsageSpecificationInstanceRecord usageSpecificationInstanceRecord = null;

  private String usageSpecificationRetrieveActionTaskReference = null;

  private Object usageSpecificationRetrieveActionTaskRecord = null;

  private String usageSpecificationRetrieveActionResponse = null;

  private BQUsageSpecificationRetrieveOutputModelUsageSpecificationInstanceReport usageSpecificationInstanceReport = null;

  private BQUsageSpecificationRetrieveOutputModelUsageSpecificationInstanceAnalysis usageSpecificationInstanceAnalysis = null;


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
   * Get usageSpecificationInstanceRecord
   * @return usageSpecificationInstanceRecord
  **/

  public BQUsageSpecificationRetrieveOutputModelUsageSpecificationInstanceRecord getUsageSpecificationInstanceRecord() {
    return usageSpecificationInstanceRecord;
  }

  public void setUsageSpecificationInstanceRecord(BQUsageSpecificationRetrieveOutputModelUsageSpecificationInstanceRecord usageSpecificationInstanceRecord) {
    this.usageSpecificationInstanceRecord = usageSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Usage Specification instance retrieve service call 
   * @return usageSpecificationRetrieveActionTaskReference
  **/

  public String getUsageSpecificationRetrieveActionTaskReference() {
    return usageSpecificationRetrieveActionTaskReference;
  }

  public void setUsageSpecificationRetrieveActionTaskReference(String usageSpecificationRetrieveActionTaskReference) {
    this.usageSpecificationRetrieveActionTaskReference = usageSpecificationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return usageSpecificationRetrieveActionTaskRecord
  **/

  public Object getUsageSpecificationRetrieveActionTaskRecord() {
    return usageSpecificationRetrieveActionTaskRecord;
  }

  public void setUsageSpecificationRetrieveActionTaskRecord(Object usageSpecificationRetrieveActionTaskRecord) {
    this.usageSpecificationRetrieveActionTaskRecord = usageSpecificationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return usageSpecificationRetrieveActionResponse
  **/

  public String getUsageSpecificationRetrieveActionResponse() {
    return usageSpecificationRetrieveActionResponse;
  }

  public void setUsageSpecificationRetrieveActionResponse(String usageSpecificationRetrieveActionResponse) {
    this.usageSpecificationRetrieveActionResponse = usageSpecificationRetrieveActionResponse;
  }


  /**
   * Get usageSpecificationInstanceReport
   * @return usageSpecificationInstanceReport
  **/

  public BQUsageSpecificationRetrieveOutputModelUsageSpecificationInstanceReport getUsageSpecificationInstanceReport() {
    return usageSpecificationInstanceReport;
  }

  public void setUsageSpecificationInstanceReport(BQUsageSpecificationRetrieveOutputModelUsageSpecificationInstanceReport usageSpecificationInstanceReport) {
    this.usageSpecificationInstanceReport = usageSpecificationInstanceReport;
  }


  /**
   * Get usageSpecificationInstanceAnalysis
   * @return usageSpecificationInstanceAnalysis
  **/

  public BQUsageSpecificationRetrieveOutputModelUsageSpecificationInstanceAnalysis getUsageSpecificationInstanceAnalysis() {
    return usageSpecificationInstanceAnalysis;
  }

  public void setUsageSpecificationInstanceAnalysis(BQUsageSpecificationRetrieveOutputModelUsageSpecificationInstanceAnalysis usageSpecificationInstanceAnalysis) {
    this.usageSpecificationInstanceAnalysis = usageSpecificationInstanceAnalysis;
  }


}

