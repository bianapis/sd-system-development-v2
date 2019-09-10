package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQUsageSpecificationRetrieveInputModelUsageSpecificationInstanceAnalysis;
import org.bian.dto.BQUsageSpecificationRetrieveInputModelUsageSpecificationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQUsageSpecificationRetrieveInputModel
 */
public class BQUsageSpecificationRetrieveInputModel   {
  private Object usageSpecificationRetrieveActionTaskRecord = null;

  private String usageSpecificationRetrieveActionRequest = null;

  private BQUsageSpecificationRetrieveInputModelUsageSpecificationInstanceReport usageSpecificationInstanceReport = null;

  private BQUsageSpecificationRetrieveInputModelUsageSpecificationInstanceAnalysis usageSpecificationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return usageSpecificationRetrieveActionRequest
  **/

  public String getUsageSpecificationRetrieveActionRequest() {
    return usageSpecificationRetrieveActionRequest;
  }

  public void setUsageSpecificationRetrieveActionRequest(String usageSpecificationRetrieveActionRequest) {
    this.usageSpecificationRetrieveActionRequest = usageSpecificationRetrieveActionRequest;
  }


  /**
   * Get usageSpecificationInstanceReport
   * @return usageSpecificationInstanceReport
  **/

  public BQUsageSpecificationRetrieveInputModelUsageSpecificationInstanceReport getUsageSpecificationInstanceReport() {
    return usageSpecificationInstanceReport;
  }

  public void setUsageSpecificationInstanceReport(BQUsageSpecificationRetrieveInputModelUsageSpecificationInstanceReport usageSpecificationInstanceReport) {
    this.usageSpecificationInstanceReport = usageSpecificationInstanceReport;
  }


  /**
   * Get usageSpecificationInstanceAnalysis
   * @return usageSpecificationInstanceAnalysis
  **/

  public BQUsageSpecificationRetrieveInputModelUsageSpecificationInstanceAnalysis getUsageSpecificationInstanceAnalysis() {
    return usageSpecificationInstanceAnalysis;
  }

  public void setUsageSpecificationInstanceAnalysis(BQUsageSpecificationRetrieveInputModelUsageSpecificationInstanceAnalysis usageSpecificationInstanceAnalysis) {
    this.usageSpecificationInstanceAnalysis = usageSpecificationInstanceAnalysis;
  }


}

