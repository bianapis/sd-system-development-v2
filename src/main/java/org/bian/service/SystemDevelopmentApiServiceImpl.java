/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class SystemDevelopmentApiServiceImpl implements SystemDevelopmentApiService {

	public SDSystemDevelopmentActivateOutputModel activate(SDSystemDevelopmentActivateInputModel request){
		return JsonReader.read("activate-SDSystemDevelopmentActivateOutputModel.json",new TypeReference<SDSystemDevelopmentActivateOutputModel>(){});
	}
	
	public BQFunctionalSpecificationCaptureOutputModel captureFunctionalspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalSpecificationCaptureInputModel request){
		return JsonReader.read("capture-BQFunctionalSpecificationCaptureOutputModel.json",new TypeReference<BQFunctionalSpecificationCaptureOutputModel>(){});
	}
	
	public BQSoftwareandDataspecificationCaptureOutputModel captureSoftwareanddataspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSoftwareandDataspecificationCaptureInputModel request){
		return JsonReader.read("capture-BQSoftwareandDataspecificationCaptureOutputModel.json",new TypeReference<BQSoftwareandDataspecificationCaptureOutputModel>(){});
	}
	
	public BQTechnicalSpecificationCaptureOutputModel captureTechnicalspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTechnicalSpecificationCaptureInputModel request){
		return JsonReader.read("capture-BQTechnicalSpecificationCaptureOutputModel.json",new TypeReference<BQTechnicalSpecificationCaptureOutputModel>(){});
	}
	
	public BQTestingSpecificationCaptureOutputModel captureTestingspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingSpecificationCaptureInputModel request){
		return JsonReader.read("capture-BQTestingSpecificationCaptureOutputModel.json",new TypeReference<BQTestingSpecificationCaptureOutputModel>(){});
	}
	
	public BQUsageSpecificationCaptureOutputModel captureUsagespecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQUsageSpecificationCaptureInputModel request){
		return JsonReader.read("capture-BQUsageSpecificationCaptureOutputModel.json",new TypeReference<BQUsageSpecificationCaptureOutputModel>(){});
	}
	
	public SDSystemDevelopmentConfigureOutputModel configure(String sdReferenceId, SDSystemDevelopmentConfigureInputModel request){
		return JsonReader.read("configure-SDSystemDevelopmentConfigureOutputModel.json",new TypeReference<SDSystemDevelopmentConfigureOutputModel>(){});
	}
	
	public CRITSystemDevelopmentProjectControlOutputModel control(String sdReferenceId, String crReferenceId, CRITSystemDevelopmentProjectControlInputModel request){
		return JsonReader.read("control-CRITSystemDevelopmentProjectControlOutputModel.json",new TypeReference<CRITSystemDevelopmentProjectControlOutputModel>(){});
	}
	
	public CRITSystemDevelopmentProjectCreateOutputModel create(String sdReferenceId, CRITSystemDevelopmentProjectCreateInputModel request){
		return JsonReader.read("create-CRITSystemDevelopmentProjectCreateOutputModel.json",new TypeReference<CRITSystemDevelopmentProjectCreateOutputModel>(){});
	}
	
	public BQFunctionalSpecificationExchangeOutputModel exchangeFunctionalspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalSpecificationExchangeInputModel request){
		return JsonReader.read("exchange-BQFunctionalSpecificationExchangeOutputModel.json",new TypeReference<BQFunctionalSpecificationExchangeOutputModel>(){});
	}
	
	public BQSoftwareandDataspecificationExchangeOutputModel exchangeSoftwareanddataspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSoftwareandDataspecificationExchangeInputModel request){
		return JsonReader.read("exchange-BQSoftwareandDataspecificationExchangeOutputModel.json",new TypeReference<BQSoftwareandDataspecificationExchangeOutputModel>(){});
	}
	
	public BQTechnicalSpecificationExchangeOutputModel exchangeTechnicalspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTechnicalSpecificationExchangeInputModel request){
		return JsonReader.read("exchange-BQTechnicalSpecificationExchangeOutputModel.json",new TypeReference<BQTechnicalSpecificationExchangeOutputModel>(){});
	}
	
	public BQTestingSpecificationExchangeOutputModel exchangeTestingspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingSpecificationExchangeInputModel request){
		return JsonReader.read("exchange-BQTestingSpecificationExchangeOutputModel.json",new TypeReference<BQTestingSpecificationExchangeOutputModel>(){});
	}
	
	public CRITSystemDevelopmentProjectExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRITSystemDevelopmentProjectExchangeInputModel request){
		return JsonReader.read("exchange-CRITSystemDevelopmentProjectExchangeOutputModel.json",new TypeReference<CRITSystemDevelopmentProjectExchangeOutputModel>(){});
	}
	
	public BQUsageSpecificationExchangeOutputModel exchangeUsagespecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQUsageSpecificationExchangeInputModel request){
		return JsonReader.read("exchange-BQUsageSpecificationExchangeOutputModel.json",new TypeReference<BQUsageSpecificationExchangeOutputModel>(){});
	}
	
	public SDSystemDevelopmentFeedbackOutputModel feedback(String sdReferenceId, SDSystemDevelopmentFeedbackInputModel request){
		return JsonReader.read("feedback-SDSystemDevelopmentFeedbackOutputModel.json",new TypeReference<SDSystemDevelopmentFeedbackOutputModel>(){});
	}
	
	public BQFunctionalSpecificationRequestOutputModel requestFunctionalspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalSpecificationRequestInputModel request){
		return JsonReader.read("request-BQFunctionalSpecificationRequestOutputModel.json",new TypeReference<BQFunctionalSpecificationRequestOutputModel>(){});
	}
	
	public BQSoftwareandDataspecificationRequestOutputModel requestSoftwareanddataspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSoftwareandDataspecificationRequestInputModel request){
		return JsonReader.read("request-BQSoftwareandDataspecificationRequestOutputModel.json",new TypeReference<BQSoftwareandDataspecificationRequestOutputModel>(){});
	}
	
	public BQTechnicalSpecificationRequestOutputModel requestTechnicalspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTechnicalSpecificationRequestInputModel request){
		return JsonReader.read("request-BQTechnicalSpecificationRequestOutputModel.json",new TypeReference<BQTechnicalSpecificationRequestOutputModel>(){});
	}
	
	public BQTestingSpecificationRequestOutputModel requestTestingspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingSpecificationRequestInputModel request){
		return JsonReader.read("request-BQTestingSpecificationRequestOutputModel.json",new TypeReference<BQTestingSpecificationRequestOutputModel>(){});
	}
	
	public CRITSystemDevelopmentProjectRequestOutputModel request(String sdReferenceId, String crReferenceId, CRITSystemDevelopmentProjectRequestInputModel request){
		return JsonReader.read("request-CRITSystemDevelopmentProjectRequestOutputModel.json",new TypeReference<CRITSystemDevelopmentProjectRequestOutputModel>(){});
	}
	
	public BQUsageSpecificationRequestOutputModel requestUsagespecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQUsageSpecificationRequestInputModel request){
		return JsonReader.read("request-BQUsageSpecificationRequestOutputModel.json",new TypeReference<BQUsageSpecificationRequestOutputModel>(){});
	}
	
	public BQFunctionalSpecificationRetrieveOutputModel retrieveFunctionalspecification(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFunctionalSpecificationRetrieveOutputModel.json",new TypeReference<BQFunctionalSpecificationRetrieveOutputModel>(){});
	}
	
	public BQSoftwareandDataspecificationRetrieveOutputModel retrieveSoftwareanddataspecification(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQSoftwareandDataspecificationRetrieveOutputModel.json",new TypeReference<BQSoftwareandDataspecificationRetrieveOutputModel>(){});
	}
	
	public BQTechnicalSpecificationRetrieveOutputModel retrieveTechnicalspecification(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTechnicalSpecificationRetrieveOutputModel.json",new TypeReference<BQTechnicalSpecificationRetrieveOutputModel>(){});
	}
	
	public BQTestingSpecificationRetrieveOutputModel retrieveTestingspecification(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTestingSpecificationRetrieveOutputModel.json",new TypeReference<BQTestingSpecificationRetrieveOutputModel>(){});
	}
	
	public BQUsageSpecificationRetrieveOutputModel retrieveUsagespecification(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQUsageSpecificationRetrieveOutputModel.json",new TypeReference<BQUsageSpecificationRetrieveOutputModel>(){});
	}
	
	public SDSystemDevelopmentRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDSystemDevelopmentRetrieveOutputModel.json",new TypeReference<SDSystemDevelopmentRetrieveOutputModel>(){});
	}
	
	public CRITSystemDevelopmentProjectRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRITSystemDevelopmentProjectRetrieveOutputModel.json",new TypeReference<CRITSystemDevelopmentProjectRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CRITSystemDevelopmentProjectUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRITSystemDevelopmentProjectUpdateInputModel request){
		return JsonReader.read("update-CRITSystemDevelopmentProjectUpdateOutputModel.json",new TypeReference<CRITSystemDevelopmentProjectUpdateOutputModel>(){});
	}
	
	public BQFunctionalSpecificationUpdateOutputModel updateFunctionalspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalSpecificationUpdateInputModel request){
		return JsonReader.read("update-BQFunctionalSpecificationUpdateOutputModel.json",new TypeReference<BQFunctionalSpecificationUpdateOutputModel>(){});
	}
	
	public BQSoftwareandDataspecificationUpdateOutputModel updateSoftwareanddataspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSoftwareandDataspecificationUpdateInputModel request){
		return JsonReader.read("update-BQSoftwareandDataspecificationUpdateOutputModel.json",new TypeReference<BQSoftwareandDataspecificationUpdateOutputModel>(){});
	}
	
	public BQTechnicalSpecificationUpdateOutputModel updateTechnicalspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTechnicalSpecificationUpdateInputModel request){
		return JsonReader.read("update-BQTechnicalSpecificationUpdateOutputModel.json",new TypeReference<BQTechnicalSpecificationUpdateOutputModel>(){});
	}
	
	public BQTestingSpecificationUpdateOutputModel updateTestingspecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingSpecificationUpdateInputModel request){
		return JsonReader.read("update-BQTestingSpecificationUpdateOutputModel.json",new TypeReference<BQTestingSpecificationUpdateOutputModel>(){});
	}
	
	public BQUsageSpecificationUpdateOutputModel updateUsagespecification(String sdReferenceId, String crReferenceId, String bqReferenceId, BQUsageSpecificationUpdateInputModel request){
		return JsonReader.read("update-BQUsageSpecificationUpdateOutputModel.json",new TypeReference<BQUsageSpecificationUpdateOutputModel>(){});
	}
	
}
