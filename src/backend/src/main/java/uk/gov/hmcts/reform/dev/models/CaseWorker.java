package uk.gov.hmcts.reform.dev.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CaseWorker {
    private int id;
    private String name;
    private String tasks;
}
