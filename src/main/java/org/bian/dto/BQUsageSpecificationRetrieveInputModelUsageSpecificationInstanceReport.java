package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQUsageSpecificationRetrieveInputModelUsageSpecificationInstanceReport
 */
public class BQUsageSpecificationRetrieveInputModelUsageSpecificationInstanceReport   {
  private String usageSpecificationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return usageSpecificationInstanceReportReference
  **/

  public String getUsageSpecificationInstanceReportReference() {
    return usageSpecificationInstanceReportReference;
  }

  public void setUsageSpecificationInstanceReportReference(String usageSpecificationInstanceReportReference) {
    this.usageSpecificationInstanceReportReference = usageSpecificationInstanceReportReference;
  }


}

