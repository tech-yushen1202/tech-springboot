package org.tech.jpa.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DeptEnum implements EnumCommonApi<DeptEnum> {

    TECH_DEPT("TECH_DEPT", "Technology Department"),
    HR_DEPT("HR_DEPT", "Hr Department"),
    MARKET_DEPT("MARKET_DEPT", "Market Department"),
    SALES_DEPT("SALES_DEPT", "Sales Department");

    @JsonValue
    private String deptCode;
    private String deptName;

    @Override
    public String getEnumField() {
        return this.deptCode;
    }
}
