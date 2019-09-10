package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSoftwareandDataspecificationRetrieveInputModelSoftwareandDataspecificationInstanceAnalysis;
import org.bian.dto.BQSoftwareandDataspecificationRetrieveInputModelSoftwareandDataspecificationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQSoftwareandDataspecificationRetrieveInputModel
 */
public class BQSoftwareandDataspecificationRetrieveInputModel   {
  private Object softwareandDataspecificationRetrieveActionTaskRecord = null;

  private String softwareandDataspecificationRetrieveActionRequest = null;

  private BQSoftwareandDataspecificationRetrieveInputModelSoftwareandDataspecificationInstanceReport softwareandDataspecificationInstanceReport = null;

  private BQSoftwareandDataspecificationRetrieveInputModelSoftwareandDataspecificationInstanceAnalysis softwareandDataspecificationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return softwareandDataspecificationRetrieveActionRequest
  **/

  public String getSoftwareandDataspecificationRetrieveActionRequest() {
    return softwareandDataspecificationRetrieveActionRequest;
  }

  public void setSoftwareandDataspecificationRetrieveActionRequest(String softwareandDataspecificationRetrieveActionRequest) {
    this.softwareandDataspecificationRetrieveActionRequest = softwareandDataspecificationRetrieveActionRequest;
  }


  /**
   * Get softwareandDataspecificationInstanceReport
   * @return softwareandDataspecificationInstanceReport
  **/

  public BQSoftwareandDataspecificationRetrieveInputModelSoftwareandDataspecificationInstanceReport getSoftwareandDataspecificationInstanceReport() {
    return softwareandDataspecificationInstanceReport;
  }

  public void setSoftwareandDataspecificationInstanceReport(BQSoftwareandDataspecificationRetrieveInputModelSoftwareandDataspecificationInstanceReport softwareandDataspecificationInstanceReport) {
    this.softwareandDataspecificationInstanceReport = softwareandDataspecificationInstanceReport;
  }


  /**
   * Get softwareandDataspecificationInstanceAnalysis
   * @return softwareandDataspecificationInstanceAnalysis
  **/

  public BQSoftwareandDataspecificationRetrieveInputModelSoftwareandDataspecificationInstanceAnalysis getSoftwareandDataspecificationInstanceAnalysis() {
    return softwareandDataspecificationInstanceAnalysis;
  }

  public void setSoftwareandDataspecificationInstanceAnalysis(BQSoftwareandDataspecificationRetrieveInputModelSoftwareandDataspecificationInstanceAnalysis softwareandDataspecificationInstanceAnalysis) {
    this.softwareandDataspecificationInstanceAnalysis = softwareandDataspecificationInstanceAnalysis;
  }


}

