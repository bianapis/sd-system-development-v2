package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSoftwareandDataspecificationRetrieveInputModelSoftwareandDataspecificationInstanceReport
 */
public class BQSoftwareandDataspecificationRetrieveInputModelSoftwareandDataspecificationInstanceReport   {
  private String softwareandDataspecificationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return softwareandDataspecificationInstanceReportReference
  **/

  public String getSoftwareandDataspecificationInstanceReportReference() {
    return softwareandDataspecificationInstanceReportReference;
  }

  public void setSoftwareandDataspecificationInstanceReportReference(String softwareandDataspecificationInstanceReportReference) {
    this.softwareandDataspecificationInstanceReportReference = softwareandDataspecificationInstanceReportReference;
  }


}

