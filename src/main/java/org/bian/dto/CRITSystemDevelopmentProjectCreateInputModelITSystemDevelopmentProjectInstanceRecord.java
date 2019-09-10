package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecordSystemDevelopmentImplementationPlan;

import javax.validation.Valid;
  
/**
 * CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord
 */
public class CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecord   {
  private String systemDevelopmentProjectName = null;

  private String systemDevelopmentProjectType = null;

  private String systemDevelopmentProjectDescription = null;

  private CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecordSystemDevelopmentImplementationPlan systemDevelopmentImplementationPlan = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The reference to and descriptive name of the deployment project 
   * @return systemDevelopmentProjectName
  **/

  public String getSystemDevelopmentProjectName() {
    return systemDevelopmentProjectName;
  }

  public void setSystemDevelopmentProjectName(String systemDevelopmentProjectName) {
    this.systemDevelopmentProjectName = systemDevelopmentProjectName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of deployment project (e.g. service update, new product release) 
   * @return systemDevelopmentProjectType
  **/

  public String getSystemDevelopmentProjectType() {
    return systemDevelopmentProjectType;
  }

  public void setSystemDevelopmentProjectType(String systemDevelopmentProjectType) {
    this.systemDevelopmentProjectType = systemDevelopmentProjectType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the scope, goal and make-up of the product deployment project 
   * @return systemDevelopmentProjectDescription
  **/

  public String getSystemDevelopmentProjectDescription() {
    return systemDevelopmentProjectDescription;
  }

  public void setSystemDevelopmentProjectDescription(String systemDevelopmentProjectDescription) {
    this.systemDevelopmentProjectDescription = systemDevelopmentProjectDescription;
  }


  /**
   * Get systemDevelopmentImplementationPlan
   * @return systemDevelopmentImplementationPlan
  **/

  public CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecordSystemDevelopmentImplementationPlan getSystemDevelopmentImplementationPlan() {
    return systemDevelopmentImplementationPlan;
  }

  public void setSystemDevelopmentImplementationPlan(CRITSystemDevelopmentProjectCreateInputModelITSystemDevelopmentProjectInstanceRecordSystemDevelopmentImplementationPlan systemDevelopmentImplementationPlan) {
    this.systemDevelopmentImplementationPlan = systemDevelopmentImplementationPlan;
  }


}

