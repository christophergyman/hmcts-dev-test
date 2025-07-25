package uk.gov.hmcts.reform.dev.services;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Service;
import uk.gov.hmcts.reform.dev.models.CaseWorker;

@Service
public class CaseWorkerService {

    // establish map service object
    private Map<Integer, CaseWorker> caseWorkerService = new ConcurrentHashMap<>();

    // add caseworker to service
    public void addCaseWorker(CaseWorker caseWorker) {
        caseWorkerService.put(caseWorker.getId(), caseWorker);
    }

    // get specific caseworker from service
    public CaseWorker getCaseWorker(int id) {
        return caseWorkerService.get(id);
    }

    // get caseworkers service
    public Map<Integer, CaseWorker> getCaseWorkerService() {
        return caseWorkerService;
    }

    // remove caseworker from service
    public void removeCaseWorkerFromService(int id) {
        caseWorkerService.remove(id);
    }

}
