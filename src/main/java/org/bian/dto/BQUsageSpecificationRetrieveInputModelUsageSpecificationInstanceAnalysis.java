package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQUsageSpecificationRetrieveInputModelUsageSpecificationInstanceAnalysis
 */
public class BQUsageSpecificationRetrieveInputModelUsageSpecificationInstanceAnalysis   {
  private String usageSpecificationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return usageSpecificationInstanceAnalysisReference
  **/

  public String getUsageSpecificationInstanceAnalysisReference() {
    return usageSpecificationInstanceAnalysisReference;
  }

  public void setUsageSpecificationInstanceAnalysisReference(String usageSpecificationInstanceAnalysisReference) {
    this.usageSpecificationInstanceAnalysisReference = usageSpecificationInstanceAnalysisReference;
  }


}

